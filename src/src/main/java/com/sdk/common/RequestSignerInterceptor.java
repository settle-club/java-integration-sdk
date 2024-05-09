package com.sdk.common;

import java.io.IOException;

import lombok.NoArgsConstructor;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@NoArgsConstructor
public class RequestSignerInterceptor implements Interceptor {

    boolean signQuery;

    public RequestSignerInterceptor(boolean signQuery) {
        this.signQuery = signQuery;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = new RequestSigner(chain.request()).sign(signQuery);
        return chain.proceed(request);
    }
}