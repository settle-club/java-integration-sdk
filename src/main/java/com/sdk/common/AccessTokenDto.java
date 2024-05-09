package com.sdk.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AccessTokenDto {

    @JsonProperty("accessToken")
    String accessToken;

    @JsonProperty("access_mode")
    String accessMode;

    @JsonProperty("current_user")
    Map<String, Object> currentUser;

    @JsonProperty("expires")
    String expires;

    @JsonProperty("refreshToken")
    String refreshToken;

    @JsonProperty("access_token_validity")
    Long accessTokenValidity;

    @JsonProperty("tokenExpiryIn")
    Long expiresIn;

    @JsonProperty("id")
    String id;

    @JsonProperty("expire")
    Date expire;
    
    @JsonProperty("extension_Id")
    String extensionId;

    @JsonProperty("state")
    String state;

    private List<String> scope;

    @JsonProperty("tokenExpireAt")
    Long expiresAt;


}