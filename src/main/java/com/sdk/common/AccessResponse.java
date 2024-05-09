package com.sdk.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessResponse {
    @JsonProperty("accessToken")
    String accessToken;

    @JsonProperty("token_type")
    String tokenType;

    @JsonProperty("tokenExpiryIn")
    Long expiresIn;

    @JsonProperty("scope")
    List<String> scope;

    @JsonProperty("current_user")
    Map<String, Object> currentUser;

    @JsonProperty("refreshToken")
    String refreshToken;

}

 