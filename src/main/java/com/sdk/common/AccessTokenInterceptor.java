package com.sdk.common;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import com.sdk.platform.*;

import java.io.IOException;
import java.util.Base64;

public class AccessTokenInterceptor implements Interceptor {

    private PlatformConfig platformConfig;

    public AccessTokenInterceptor(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        okhttp3.Request original = chain.request();
         String bearerToken = Base64.getEncoder().encodeToString((platformConfig.getApiKey()+":"+ platformConfig.getApiSecret()).getBytes());
        okhttp3.Request.Builder builder = original.newBuilder()
                .addHeader("Authorization", "Bearer "+ platformConfig.getPlatformOauthClient().getToken())
                .addHeader("Content-Type", "application/json")
                .addHeader("x-merchant-secret", platformConfig.getTopSecret());
        okhttp3.Request request = builder.build();
        return chain.proceed(request);
    }



}