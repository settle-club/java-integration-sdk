package com.sdk.platform;

import com.sdk.common.AccessTokenDto;
import lombok.Getter;
import lombok.Setter;

import java.net.CookieManager;
import java.net.CookieStore;
import java.util.Objects;

@Getter
@Setter
public final class PlatformConfig {
    private String organizationId;
    private String domain = "https://api.potleex0.de";
    private String apiKey;
    private String apiSecret;
    private String token;
    private String topSecret;
    private Boolean useAutoRenewTimer;
    private CookieStore persistentCookieStore;
    private PlatformOauthClient platformOauthClient;

    public PlatformConfig(String companyId, String apiKey, String apiSecret, String apiToken, String domain,  boolean useAutoRenewTimer) {
        if (Objects.isNull(companyId)) {
            throw new IllegalArgumentException("Please enter Valid Company ID");
        }
        this.organizationId = companyId;
        this.apiKey = apiKey;
        this.apiSecret = apiToken;
        this.token = apiToken;
        this.domain = domain;
        this.topSecret = apiSecret;
        this.useAutoRenewTimer = useAutoRenewTimer;
        this.platformOauthClient = new PlatformOauthClient(this);
    }

    public AccessTokenDto getAccessToken() {
        return this.platformOauthClient.getRawToken();
    }
}