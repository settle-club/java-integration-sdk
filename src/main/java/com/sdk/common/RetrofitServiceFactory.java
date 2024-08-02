package com.sdk.common;

import okhttp3.*;
import okhttp3.internal.JavaNetCookieJar;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.security.cert.CertificateException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import com.moczul.ok2curl.CurlInterceptor;


/** Service Generator class for Retrofit communication Depends on baseUrl property */
public class RetrofitServiceFactory {

    private String baseURL;

    private Retrofit.Builder builder;

    private Retrofit retrofit;

    private OkHttpClient.Builder httpClient;

    private FDKLogger fdkLogger;

    private HttpLoggingInterceptor logging;

    private CurlInterceptor ok2CurlInterceptor;

    public RetrofitServiceFactory() {
        baseURL = "http://localhost:8080";
        builder =
                new Retrofit.Builder()
                        .baseUrl(baseURL)
                        .addConverterFactory(JacksonConverterFactory.create());
        retrofit = builder.build();
        fdkLogger = new FDKLogger();
        httpClient = new OkHttpClient.Builder();
        logging = new HttpLoggingInterceptor(fdkLogger).setLevel(HttpLoggingInterceptor.Level.BODY);
        ok2CurlInterceptor = new CurlInterceptor(s ->System.out.println(s));
    }

    public <S> S createService(String baseUrl, Class<S> serviceClass, List<Interceptor> interceptorList) {
        return createService(baseUrl, serviceClass, interceptorList, null);
    }

    /**
     * This method generates retrofit Service call object
     *
     * @param baseUrl the base url for retrofit
     * @param serviceClass the class call object which needs to be returned
     * @return the service class call object
     */
    public <S> S createService(String baseUrl, Class<S> serviceClass, List<Interceptor> interceptorList, CookieStore cookieStore) {
        setApiBaseUrl(baseUrl);
        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging);
        }
        if(!interceptorList.contains(ok2CurlInterceptor)){
            interceptorList.add(ok2CurlInterceptor);
        }
        builder.client(getUnsafeOkHttpClient(interceptorList, cookieStore));
        retrofit = builder.build();
        return retrofit.create(serviceClass);
    }

    private static OkHttpClient getUnsafeOkHttpClient(List<Interceptor> interceptorList, CookieStore cookieStore) {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts =
                    new TrustManager[] {
                            new X509TrustManager() {
                                @Override
                                public void checkClientTrusted(
                                        java.security.cert.X509Certificate[] chain, String authType)
                                        throws CertificateException {}

                                @Override
                                public void checkServerTrusted(
                                        java.security.cert.X509Certificate[] chain, String authType)
                                        throws CertificateException {}

                                @Override
                                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                                    return new java.security.cert.X509Certificate[] {};
                                }
                            }
                    };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
            builder.hostnameVerifier((hostname, session) -> true);
            if(!interceptorList.isEmpty()) {
                interceptorList.forEach(builder::addInterceptor);
            }
            CookieJar cookieJar = addCookie(cookieStore);
            if(Objects.nonNull(cookieJar)) {
                builder.cookieJar(cookieJar);
            }
            builder.readTimeout(Duration.ofMinutes(Constants.READ_TIMEOUT).toMinutes(), TimeUnit.MINUTES);
            builder.connectTimeout(Duration.ofSeconds(Constants.CONNECT_TIMEOUT).getSeconds(), TimeUnit.MINUTES);
            builder.writeTimeout(Duration.ofSeconds(Constants.WRITE_TIMEOUT).getSeconds(), TimeUnit.MINUTES);
            builder.connectionPool(
                    new ConnectionPool(Constants.IDLE_CONNECTION, Constants.KEEP_ALIVE, TimeUnit.MINUTES));
            return builder.build();
        } catch (Exception e) {
            throw new FDKError(e.getMessage());
        }
    }

    private static CookieJar addCookie(CookieStore cookieStore) {
        if(Objects.nonNull(cookieStore)) {
            CookieManager cookieManager = new CookieManager(cookieStore, CookiePolicy.ACCEPT_ALL);
            return new JavaNetCookieJar(cookieManager);
        }
        return null;
    }

    public <S> S getInstance(String baseUrl, Class<S> serviceClass) {
        return getInstance(baseUrl, serviceClass, null);
    }

      /**
     * This method generates retrofit Service call object
     *
     * @param baseUrl      the base url for retrofit
     * @param serviceClass the class call object which needs to be returned
     * @return the service class call object
     */
     public <S> S getInstance(String baseUrl, Class<S> serviceClass, CookieStore cookieStore) {
         setApiBaseUrl(baseUrl);
         List<Interceptor> interceptorList = new ArrayList<>();
         interceptorList.add(new RequestSignerInterceptor());
         if (!interceptorList.contains(logging)) {
             interceptorList.add(logging);
         }
         if(!interceptorList.contains(ok2CurlInterceptor)){
             interceptorList.add(ok2CurlInterceptor);
         }
         builder.client(getUnsafeOkHttpClient(interceptorList, cookieStore));
         retrofit = builder.build();
         return retrofit.create(serviceClass);
     }

    private void setApiBaseUrl(String baseUrl) {
        baseURL = baseUrl;
        builder =
                new Retrofit.Builder()
                        .addConverterFactory(JacksonConverterFactory.create())
                        .baseUrl(baseURL);
    }

    interface Constants {
        int READ_TIMEOUT = 15;
        int CONNECT_TIMEOUT = 15;
        int WRITE_TIMEOUT = 15;
        int KEEP_ALIVE = 10;
        int IDLE_CONNECTION = 0;
    }
}
