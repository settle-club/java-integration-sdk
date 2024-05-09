package com.sdk.platform;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatformClient {

    private PlatformConfig config;

    
    public PlatformService.CustomerService customer;
    
    public PlatformService.CreditService credit;
    
    public PlatformService.MultiKycService multiKyc;
    

    public PlatformClient(PlatformConfig config)   
    {
        this.config = config;
        
        this.customer = new PlatformService.CustomerService(config);
        
        this.credit = new PlatformService.CreditService(config);
        
        this.multiKyc = new PlatformService.MultiKycService(config);
        
    }

}