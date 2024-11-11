package com.sdk.common;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okio.Buffer;
import org.apache.commons.codec.binary.Hex;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import java.io.UnsupportedEncodingException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class RequestSigner {

    private Request request;
    private Request updatedReq;
    private String nowDateTime;
    private boolean signQuery;

    static final List<String> HEADERS_TO_IGNORE = Arrays.asList("authorization", "connection", "x-amzn-trace-id",
            "user-agent", "expect", "presigned-expires", "range");

    static final List<String> HEADERS_TO_INCLUDE = Arrays.asList("x-ptl-.*", "host");

    public RequestSigner(Request request) {
        this.request = request;
    }

    public Request sign(boolean signQuery) {
        this.signQuery = signQuery;
        updatedReq = prepareRequest();
        String topSecret = request.header("x-merchant-secret");
        System.out.println("Signing request:" + topSecret);
        String sign = signature(topSecret);
        try {
            if (this.signQuery) {
                HttpUrl httpUrl = updatedReq.url().newBuilder().addQueryParameter("x-ptl-signature", sign)
                .build();
                updatedReq = updatedReq.newBuilder().url(httpUrl).build();
            } else {
                updatedReq = updatedReq.newBuilder().header("x-ptl-signature", sign).build();
            }
            // Remove the "x-merchant-secret" header
            this.updatedReq = this.updatedReq.newBuilder().removeHeader("x-merchant-secret").build();

        } catch (Exception e) {
            e.getStackTrace();
        }
        return updatedReq;
    }

    private Request prepareRequest() {
        Builder newReqBuilder = request.newBuilder();
        if (signQuery) {
            HttpUrl httpUrl =
                    request.url().newBuilder().addQueryParameter("x-ptl-date", getDateTime()).build();
            newReqBuilder.url(httpUrl);
        }else {
            newReqBuilder.header("x-ptl-date", getDateTime());
        }
        newReqBuilder.header("host", request.url().host());
        return newReqBuilder.build();
    }

    private String getDateTime() {
        if (nowDateTime == null) {
            TimeZone tz = TimeZone.getTimeZone("UTC");
            // Quoted "Z" to indicate UTC, no timezone offset
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            df.setTimeZone(tz);
            String nowAsISO = df.format(new Date());
            nowDateTime = nowAsISO.replace("-", Fields.EMPTY_STRING).replace(Fields.COLON, Fields.EMPTY_STRING)
                    .replace("'", Fields.EMPTY_STRING);
        }
        return nowDateTime;
    }

    private String signature(String topSecret) {
        String kCredentials = topSecret;
        String strToSign = stringToSign();
        return "v1:" + hMac(kCredentials, strToSign);
    }

    private String stringToSign() {
        return getDateTime() + "\n" + hash(canonicalString());
    }

    private String hMac(String key, String strToSign) {
        try {
            Mac sha256Hmac = Mac.getInstance("HmacSHA256");
            sha256Hmac.init(new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            return Hex.encodeHexString(sha256Hmac.doFinal(strToSign.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            e.getStackTrace();
            throw new HttpServerErrorException(HttpStatus.EXPECTATION_FAILED, "Could not using Hmac SHA to convert");
        }
    }

    private String hash(String stringToDigest) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(stringToDigest.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            return String.format("%064x", new BigInteger(1, digest));
        } catch (Exception e) {
            e.printStackTrace();
            throw new HttpServerErrorException(HttpStatus.EXPECTATION_FAILED, "Could not using SHA to convert");
        }
    }

    private String canonicalString() {
        StringBuilder canonicalRequest = new StringBuilder();
        String canonicalQueryString = canonicalQueryString();
        canonicalRequest.append(updatedReq.method()).append("\n");
        canonicalRequest.append(canonicalPath()).append("\n");
        if (!ObjectUtils.isEmpty(canonicalQueryString)) {
            canonicalRequest.append(canonicalQueryString);
        }
        canonicalRequest.append("\n");
        canonicalRequest.append(canonicalHeaders()).append("\n").append("\n");
        canonicalRequest.append(signedHeaders()).append("\n");

        try (Buffer bodyBuffer = new Buffer()) {
            if (Objects.nonNull(updatedReq.body())) {
                updatedReq.body().writeTo(bodyBuffer);
                String body = bodyBuffer.readUtf8();
                canonicalRequest.append(hash(body));
            } else {
                canonicalRequest.append(hash(Fields.EMPTY_STRING));
            }
        } catch (IOException e) {
            throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "Could not append BODY");
        }
        return canonicalRequest.toString();
    }

    // Logic to create Query String
    private String canonicalQueryString() {
        String canonicalQueryString = Fields.EMPTY_STRING;
        if (updatedReq.url().querySize() > 0) {
            StringBuilder encodedQueryPieces = new StringBuilder(Fields.EMPTY_STRING);
            updatedReq.url().queryParameterNames().stream().filter(Objects::nonNull)
                    // .map(this::encode)
                    .sorted().forEach(params -> addQueryParam(params, encodedQueryPieces));
            return encodedQueryPieces.toString();
        }
        return canonicalQueryString;
    }

    // Logic to create Path String
    private String canonicalPath() {
        StringBuilder encodedPathPieces = new StringBuilder();
        updatedReq.url().encodedPathSegments().stream().map(this::encode)
                .forEach(path -> encodedPathPieces.append("/").append(path));
        return encodedPathPieces.toString();
    }

     private void addQueryParam(String encodedQueryName, StringBuilder encodedQueryPieces) {
            try {
                updatedReq.url().queryParameterValues(URLDecoder.decode(encodedQueryName, StandardCharsets.UTF_8.name())).stream()
                        .sorted().forEach(queryValue -> includeQueryValue(queryValue, encodedQueryName, encodedQueryPieces));
            } catch (UnsupportedEncodingException e) {
                log.error("Exception in adding query param", e);
            }
        }

    private void includeQueryValue(String queryValue, String encodedQueryName, StringBuilder encodedQueryPieces) {
        String query = encodedQueryName + "=" + queryValue;
        if (ObjectUtils.isEmpty(encodedQueryPieces)) {
            encodedQueryPieces.append(query);
        } else {
            encodedQueryPieces.append("&").append(query);
        }
    }

    private String encode(String parameter) {
            try {
                return URLEncoder.encode(parameter, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                // Log the exception if needed
                log.error("Error in encoding", e);
                return ""; // Return an empty string in case of an exception
            }
        }

    private void addHeaderValues(String headerName, StringBuilder canonicalHeader) {
        updatedReq.headers().values(headerName).forEach(headerValue -> {
            if (!ObjectUtils.isEmpty(canonicalHeader)) {
                canonicalHeader.append("\n");
            }
            canonicalHeader.append(headerName).append(Fields.COLON).append(headerValue.trim());
        });
    }

    private boolean filterHeaders(String headerName) {
        boolean notInIgnoreHeader = !HEADERS_TO_IGNORE.contains(headerName.toLowerCase());
        if (notInIgnoreHeader) {
            AtomicReference<Boolean> foundMatch = new AtomicReference<>(false);
            HEADERS_TO_INCLUDE.forEach(regExp -> {
                Pattern pattern = Pattern.compile(regExp, Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(headerName);
                boolean result = (foundMatch.get() || matcher.matches());
                foundMatch.set(result);
            });
            return foundMatch.get();
        } else {
            return false;
        }
    }

    private String canonicalHeaders() {
        StringBuilder canonicalHeader = new StringBuilder();
        updatedReq.headers().names().stream().filter(this::filterHeaders)
                .forEach(header -> addHeaderValues(header, canonicalHeader));
        return canonicalHeader.toString();
    }

    private String signedHeaders() {
        StringBuilder headerNames = new StringBuilder();
        updatedReq.headers().names().stream().filter(this::filterHeaders).sorted().forEach(headerName -> {
            if (!ObjectUtils.isEmpty(headerNames)) {
                headerNames.append(Fields.SEMI_COLON);
            }
            headerNames.append(headerName.trim());
        });
        return headerNames.toString();
    }

    private interface Fields {
        String SEMI_COLON = ";";
        String COLON = ":";
        String EMPTY_STRING = "";
    }
}
