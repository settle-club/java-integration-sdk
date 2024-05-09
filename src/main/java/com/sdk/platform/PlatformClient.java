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

    public ApplicationClient application(String applicationId) {
        return new ApplicationClient(config, applicationId);
    }

    @Getter
    public class ApplicationClient{

        
        public PlatformService.CustomerService.ApplicationClient customer;
        
        public PlatformService.CreditService.ApplicationClient credit;
        
        public PlatformService.MultiKycService.ApplicationClient multiKyc;
        

        public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
            
            this.customer = new PlatformService.CustomerService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.credit = new PlatformService.CreditService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.multiKyc = new PlatformService.MultiKycService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
        }

    }
}