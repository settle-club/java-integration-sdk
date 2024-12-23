package com.sdk.platform;

import com.sdk.common.*;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

public class PlatformService {




public static class CustomerService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private CustomerApiList customerApiList;

    public CustomerService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.platformConfig.getOrganizationId();
        this.customerApiList = generateCustomerApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CustomerApiList generateCustomerApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CustomerApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ValidateCustomerSuccess validate(String organizationId ,PlatformModels.ValidateCustomer body) throws IOException {
            Response<PlatformModels.ValidateCustomerSuccess> response = customerApiList.validate(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateTransactionSuccess createTransaction(String session , String organizationId ,PlatformModels.CreateTransaction body) throws IOException {
            Response<PlatformModels.CreateTransactionSuccess> response = customerApiList.createTransaction(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.LinkAccountSuccess link(String organizationId ,PlatformModels.LinkAccount body) throws IOException {
            Response<PlatformModels.LinkAccountSuccess> response = customerApiList.link(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UnlinkAccountSuccess unlink(String organizationId ,PlatformModels.UnlinkAccount body) throws IOException {
            Response<PlatformModels.UnlinkAccountSuccess> response = customerApiList.unlink(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.RefundResponse refund(String organizationId ,PlatformModels.Refund body) throws IOException {
            Response<PlatformModels.RefundResponse> response = customerApiList.refund(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.RefundStatus refundStatus(String organizationId , String refundId , String orderId ) throws IOException {
            Response<PlatformModels.RefundStatus> response = customerApiList.refundStatus(organizationId  ,refundId , orderId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetSchemesSuccess getSchemes(String organizationId ,PlatformModels.GetSchemesRequest body) throws IOException {
            Response<PlatformModels.GetSchemesSuccess> response = customerApiList.getSchemes(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EligibilitySuccess checkEligibility(String organizationId ,PlatformModels.CheckEligibilityRequest body) throws IOException {
            Response<PlatformModels.EligibilitySuccess> response = customerApiList.checkEligibility(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.RepaymentResponse getRepaymentLink(String organizationId ,PlatformModels.RepaymentRequest body) throws IOException {
            Response<PlatformModels.RepaymentResponse> response = customerApiList.getRepaymentLink(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UserResponse getAllCustomers(String organizationId , Integer page , Integer limit , String name , String mobile ) throws IOException {
            Response<PlatformModels.UserResponse> response = customerApiList.getAllCustomers(organizationId  ,page , limit , name , mobile ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AddVintageResponse addVintageData(String organizationId ,PlatformModels.VintageData body) throws IOException {
            Response<PlatformModels.AddVintageResponse> response = customerApiList.addVintageData(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String organizationId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.organizationId = this.platformConfig.getOrganizationId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class CreditService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private CreditApiList creditApiList;

    public CreditService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.platformConfig.getOrganizationId();
        this.creditApiList = generateCreditApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CreditApiList generateCreditApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CreditApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderStatus getOrderStatus(String organizationId , String orderId ) throws IOException {
            Response<PlatformModels.OrderStatus> response = creditApiList.getOrderStatus(organizationId  , orderId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EligiblePlansResponse getEligiblePlans(String organizationId , String lenderSlug ,PlatformModels.EligiblePlansRequest body) throws IOException {
            Response<PlatformModels.EligiblePlansResponse> response = creditApiList.getEligiblePlans(organizationId  , lenderSlug  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderDeliveryUpdatesResponse updateOrderDeliveryStatus(String organizationId ,PlatformModels.OrderDeliveryUpdatesBody body) throws IOException {
            Response<PlatformModels.OrderDeliveryUpdatesResponse> response = creditApiList.updateOrderDeliveryStatus(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetTransactionsResponse getTransactions(String organizationId , String mobile , String countryCode , Integer page , Integer limit , String orderId , String transactionId , Object type , Object status , Boolean onlySelf , String granularity ) throws IOException {
            Response<PlatformModels.GetTransactionsResponse> response = creditApiList.getTransactions(organizationId  ,mobile , countryCode , page , limit , orderId , transactionId , type , status , onlySelf , granularity ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetSettlementTransactionsResponse getSettledTransactions(String organizationId , Integer page , Integer limit , String orderId , String transactionId , String startDate , String endDate ) throws IOException {
            Response<PlatformModels.GetSettlementTransactionsResponse> response = creditApiList.getSettledTransactions(organizationId  ,page , limit , orderId , transactionId , startDate , endDate ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String organizationId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.organizationId = this.platformConfig.getOrganizationId();
    }

    
    
    
    
    
    
    
    
    
    
    

}

}

public static class MultiKycService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private MultiKycApiList multikycApiList;

    public MultiKycService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.platformConfig.getOrganizationId();
        this.multikycApiList = generateMultikycApiList(this.platformConfig.getPersistentCookieStore());
    }

    private MultiKycApiList generateMultikycApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),MultiKycApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApprovedLendersTransaction approvedLenders(Object organizationId ) throws IOException {
            Response<PlatformModels.ApprovedLendersTransaction> response = multikycApiList.approvedLenders(organizationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String organizationId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.organizationId = this.platformConfig.getOrganizationId();
    }

    
    
    

}

}

public static class MerchantService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private MerchantApiList merchantApiList;

    public MerchantService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.platformConfig.getOrganizationId();
        this.merchantApiList = generateMerchantApiList(this.platformConfig.getPersistentCookieStore());
    }

    private MerchantApiList generateMerchantApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),MerchantApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAccessTokenResponse getAccessToken(String organizationId ) throws IOException {
            Response<PlatformModels.GetAccessTokenResponse> response = merchantApiList.getAccessToken(organizationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.RefreshTokenResponse renewAccessToken(String organizationId ,PlatformModels.RefreshTokenRequest body) throws IOException {
            Response<PlatformModels.RefreshTokenResponse> response = merchantApiList.renewAccessToken(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ValidateCredentialsResponse validateCredentials(String organizationId ) throws IOException {
            Response<PlatformModels.ValidateCredentialsResponse> response = merchantApiList.validateCredentials(organizationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateApiHookResponse updateWebhook(String organizationId ,PlatformModels.UpdateApiHook body) throws IOException {
            Response<PlatformModels.UpdateApiHookResponse> response = merchantApiList.updateWebhook(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApiHookDetailsResponse getWebhook(String organizationId ) throws IOException {
            Response<PlatformModels.ApiHookDetailsResponse> response = merchantApiList.getWebhook(organizationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.WebhookCategoriesResponse getAllWebhookCategoriesAndEvents(String organizationId , Double size , Double page , String name , List<String> slug ) throws IOException {
            Response<PlatformModels.WebhookCategoriesResponse> response = merchantApiList.getAllWebhookCategoriesAndEvents(organizationId  ,size , page , name , slug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrganizationIpDetailsResponse getWhitelistedIp(String organizationId ) throws IOException {
            Response<PlatformModels.OrganizationIpDetailsResponse> response = merchantApiList.getWhitelistedIp(organizationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrganizationIpDetailsResponse whitelistIp(String organizationId ,PlatformModels.AddOrganizationIpDetails body) throws IOException {
            Response<PlatformModels.OrganizationIpDetailsResponse> response = merchantApiList.whitelistIp(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DeleteOrganizationIpResponse removeWhitelistedIp(String organizationId ,PlatformModels.DeleteOrganizationIpDetails body) throws IOException {
            Response<PlatformModels.DeleteOrganizationIpResponse> response = merchantApiList.removeWhitelistedIp(organizationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String organizationId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.organizationId = this.platformConfig.getOrganizationId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class PaymentsService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private PaymentsApiList paymentsApiList;

    public PaymentsService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.platformConfig.getOrganizationId();
        this.paymentsApiList = generatePaymentsApiList(this.platformConfig.getPersistentCookieStore());
    }

    private PaymentsApiList generatePaymentsApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),PaymentsApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OutstandingDetailsResponse getUserCreditSummary(String mobile , String organizationId , List<String> lenderSlugs ) throws IOException {
            Response<PlatformModels.OutstandingDetailsResponse> response = paymentsApiList.getUserCreditSummary(mobile  , organizationId  ,lenderSlugs ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String organizationId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.organizationId = this.platformConfig.getOrganizationId();
    }

    
    
    

}

}

private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}
}