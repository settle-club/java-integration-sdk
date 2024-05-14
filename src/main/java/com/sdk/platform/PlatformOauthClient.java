package com.sdk.platform;

import com.sdk.common.*;
import com.sdk.common.AccessResponse;
import com.sdk.common.AccessTokenDto;
import com.sdk.common.FDKError;
import com.sdk.common.FDKTokenIssueError;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

interface TokenApiList {
    @FormUrlEncoded
    @POST
    Call<AccessResponse> getAccessToken(@Url String slug, @FieldMap HashMap<String, String> map);
}

@Getter
@Setter
@Slf4j
public class PlatformOauthClient {

    private static final String URI = "/service/integration/staff/authentication/oauth/";

    PlatformConfig config;

    RetrofitServiceFactory retrofitServiceFactory;

    String token;

    String refreshToken;

    AccessTokenDto rawToken;

    long tokenExpiresIn;

    long tokenExpiresAt;

    Boolean useAutoRenewTimer;

    PlatformOauthClient(PlatformConfig config) {
        this.config = config;
        this.refreshToken = "";
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.tokenExpiresAt = 0;
        this.useAutoRenewTimer = Objects.nonNull(
                config.getUseAutoRenewTimer()) ? config.getUseAutoRenewTimer() : Boolean.TRUE;
    }

    private void getAccessToken() {
        if (this.useAutoRenewTimer.equals(Boolean.FALSE) && StringUtils.isNotEmpty(this.refreshToken)
                && isTokenExpired(120)) {
            try {
                // Check if token is about to expire in less than 2 mins.
                // Renew if to be expired and auto renew timer is not enabled.
                renewAccesstoken();
            } catch (Exception e) {
                log.error("Exception in renewing Access Token", e);
            }
        }
    }

    // default TTL checked 0 seconds
    public boolean isTokenExpired(int ttl) {
        long currentTimestamp = (new Date()).getTime();
        // Check if token is about to expire in less than 2 mins
        return ((tokenExpiresAt - currentTimestamp) / 1000) < ttl;
    }

    public void setToken(AccessTokenDto accessTokenDto) {
        this.rawToken = accessTokenDto;
        this.tokenExpiresIn = accessTokenDto.getExpiresIn();
        this.token = accessTokenDto.getAccessToken();
        this.refreshToken = ObjectUtils.isEmpty(
                accessTokenDto.getRefreshToken()) ? "" : accessTokenDto.getRefreshToken();
        if (!ObjectUtils.isEmpty(this.refreshToken) && this.useAutoRenewTimer.equals(Boolean.TRUE)) {
            this.retryOAuthTokenTimer(accessTokenDto.getExpiresIn());
        }
    }

    private void retryOAuthTokenTimer(long expiresIn) {
        try {
            if (expiresIn > 60) {
                this.renewAccesstoken();
            }
        } catch (Exception e) {
            throw new FDKError(e.getMessage());
        }
    }

    public String getAuthorizationURL(List<String> scope, String redirectUri, String state, boolean isOnline) {
        String apiKey = config.getApiKey();
        if (ObjectUtils.isEmpty(apiKey)) {
            throw new FDKError("API Key missing in config");
        }
        state = StringUtils.isNotEmpty(state) ? state : getRandomState();
        String accessMode = isOnline ? "online" : "offline";
        String query = "client_id=" + apiKey + "&scope=" + String.join(",", scope)
                + "&redirect_uri=" + redirectUri + "&state=" + state + "&access_mode=" + accessMode
                + "&response_type=code";

        var queryString = config.getDomain() + URI + config.getApiKey() + "/authorize?" + query;
        Request request = new Request.Builder().url(queryString)
                .get()
                .build();
        request = new RequestSigner(request).sign(true);
        return request.url()
                .toString();
    }

    private String getRandomState() {
        return RandomStringUtils.randomAlphanumeric(15)
                .toUpperCase();
    }

    public AccessTokenDto renewAccesstoken() throws IOException {

        HashMap<String, String> body = new HashMap<>();
        body.put(Fields.GRANT_TYPE, GrantType.REFRESH_TOKEN.toString()
                .toLowerCase());
        body.put(Fields.REFRESH_CODE, this.refreshToken);

        String url = config.getDomain() + URI + config.getApiKey() + "/token";
        AccessTokenDto newToken = getToken(body, url);
        setToken(newToken);
        if (Objects.nonNull(newToken.getExpiresAt())) {
            Long tokenExpires = newToken.getExpiresAt();
            newToken.setExpiresAt(tokenExpires);
            this.tokenExpiresAt = tokenExpires;
        } else {
            newToken.setExpiresAt((new Date()).getTime() + (this.tokenExpiresIn * 1000L));
            this.tokenExpiresAt = (new Date()).getTime() + (this.tokenExpiresIn * 1000L);
        }

        return newToken;
    }

    public void verifyCallback(String authorizationCode) throws IOException {
        HashMap<String, String> body = new HashMap<>();
        body.put(Fields.GRANT_TYPE, GrantType.AUTHORIZATION_CODE.toString()
                .toLowerCase());
        body.put(Fields.CODE, authorizationCode);
        String url = config.getDomain() + URI + config.getApiKey() + "/token";
        AccessTokenDto newToken = getToken(body, url);
        setToken(newToken);
        if (Objects.nonNull(newToken.getExpiresAt())) {
            Long tokenExpires = newToken.getExpiresAt();
            newToken.setExpiresAt(tokenExpires);
            this.tokenExpiresAt = tokenExpires;
        } else {
            newToken.setExpiresAt((new Date()).getTime() + (this.tokenExpiresIn * 1000L));
            this.tokenExpiresAt = (new Date()).getTime() + (this.tokenExpiresIn * 1000L);
        }

    }

    public boolean isAccessTokenValid() {
        return !ObjectUtils.isEmpty(this.token) && this.rawToken.getExpiresIn() > 0;
    }

    public AccessTokenDto getOfflineAccessToken(String scopes, String code) {
        try {
            HashMap<String, String> body = new HashMap<>();
            body.put(Fields.GRANT_TYPE, GrantType.AUTHORIZATION_CODE.toString()
                    .toLowerCase());
            body.put(Fields.CODE, code);
            body.put(Fields.CLIENT_ID, config.getApiKey());
            body.put(Fields.CLIENT_SECRET, config.getApiSecret());
            body.put(Fields.SCOPE, scopes);
            String url = config.getDomain() + URI + config.getApiKey() + "/offline-token";
            AccessTokenDto offlineToken = getOfflineToken(body, url);
            setToken(offlineToken);
            if (Objects.nonNull(offlineToken.getExpiresAt())) {
                Long tokenExpires = offlineToken.getExpiresAt();
                offlineToken.setExpiresAt(tokenExpires);
                this.tokenExpiresAt = tokenExpires;
            } else {
                offlineToken.setExpiresAt((new Date()).getTime() + (this.tokenExpiresIn * 1000L));
                this.tokenExpiresAt = (new Date()).getTime() + (this.tokenExpiresIn * 1000L);
            }

            return offlineToken;
        } catch (Exception e) {
            log.error("Exception in getting Offline Token", e);
            throw new FDKTokenIssueError(e.getMessage());
        }
    }

    private AccessTokenDto getOfflineToken(HashMap<String, String> body, String url) throws IOException {
        TokenApiList tokenApiList = generateOfflineTokenApiList();
        Response<AccessResponse> response = tokenApiList.getAccessToken(url, body)
                .execute();
        if (response.isSuccessful() && !ObjectUtils.isEmpty(response.body())) {
            return convertToDto(response.body());
        }
        return new AccessTokenDto();
    }

    private AccessTokenDto convertToDto(AccessResponse accessResponse) {
        AccessTokenDto accessTokenDto = new AccessTokenDto();
        accessTokenDto.setAccessToken(accessResponse.getAccessToken());
        accessTokenDto.setExpiresIn(accessResponse.getExpiresIn());
        accessTokenDto.setCurrentUser(accessResponse.getCurrentUser());
        accessTokenDto.setRefreshToken(accessResponse.getRefreshToken());
        return accessTokenDto;
    }

    private AccessTokenDto getToken(HashMap<String, String> body, String url) throws IOException {
        TokenApiList tokenApiList = generateTokenApiList();
        Response<AccessResponse> response = tokenApiList.getAccessToken(url, body)
                .execute();
        if (response.isSuccessful() && !ObjectUtils.isEmpty(response.body())) {
            return convertToDto(response.body());
        }
        return new AccessTokenDto();
    }

    private TokenApiList generateOfflineTokenApiList() {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PlatformHeaderInterceptor(config));
        interceptorList.add(new RequestSignerInterceptor());
        // interceptorList.add(new ExtensionLibInterceptor(config));
        return retrofitServiceFactory.createService(config.getDomain(), TokenApiList.class, interceptorList);
    }

    private TokenApiList generateTokenApiList() {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PlatformHeaderInterceptor(config));
        interceptorList.add(new RequestSignerInterceptor());

        return retrofitServiceFactory.createService(config.getDomain(), TokenApiList.class, interceptorList);
    }

    public AccessTokenDto getAccessTokenObj(String grant_type, String refresh_token, String code) throws IOException{
        HashMap<String, String> body = new HashMap<>();
        body.put(Fields.GRANT_TYPE, grant_type);
        if (grant_type.equalsIgnoreCase(GrantType.REFRESH_TOKEN.getMessage())) {
            body.put(Fields.REFRESH_CODE, refresh_token);
        } else if (grant_type.equalsIgnoreCase(GrantType.AUTHORIZATION_CODE.getMessage())) {
            // body.put(Fields.CODE, code);
        }
        return getAccessTokenDto(body);
    }

    public AccessTokenDto getAccessTokenObj(String grant_type) throws IOException{
       return getAccessTokenObj(grant_type, null,null);
    }

    public void setTokenNew(AccessTokenDto accessTokenDto) {
        this.rawToken = accessTokenDto;
        this.tokenExpiresIn = accessTokenDto.getExpiresIn();
        this.token = accessTokenDto.getAccessToken();
        this.refreshToken = ObjectUtils.isEmpty(
                accessTokenDto.getRefreshToken()) ? "" : accessTokenDto.getRefreshToken();
    }

    private AccessTokenDto getAccessTokenDto(HashMap<String, String> body) throws IOException {
        String url = config.getDomain() + URI + config.getApiKey() + "/authorize";
        AccessTokenDto newToken = getToken(body, url);
        if (Objects.nonNull(newToken.getExpiresAt())) {
            Long tokenExpires = newToken.getExpiresAt();
            newToken.setExpiresAt(tokenExpires);
            this.tokenExpiresAt = tokenExpires;
        } else {
            newToken.setExpiresAt((new Date()).getTime() + (this.tokenExpiresIn * 1000L));
            this.tokenExpiresAt = (new Date()).getTime() + (this.tokenExpiresIn * 1000L);
        }
        setTokenNew(newToken);
        return newToken;
    }

    @Getter
    enum GrantType {
        AUTHORIZATION_CODE("authorization_code"),
        REFRESH_TOKEN("refresh_token");

        private String message;

        GrantType(String message) {
            this.message = message;
        }

    }

    interface Fields {
        String GRANT_TYPE = "grant_type";
        String CODE = "code";
        String REFRESH_CODE = "refresh_token";
        String CLIENT_ID = "client_id";
        String CLIENT_SECRET = "client_secret";
        String SCOPE = "scope";
    }
}