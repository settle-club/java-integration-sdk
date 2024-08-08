package com.sdk.platform;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;


interface CustomerApiList {
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/validate-customer")
    Call<PlatformModels.ValidateCustomerSuccess> validate(@Path("organizationId") String  organizationId ,@Body PlatformModels.ValidateCustomer payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/transaction")
    Call<PlatformModels.CreateTransactionSuccess> createTransaction(@Path("organizationId") String  organizationId ,@Body PlatformModels.CreateTransaction payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/account/link")
    Call<PlatformModels.LinkAccountSuccess> link(@Path("organizationId") String  organizationId ,@Body PlatformModels.LinkAccount payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/account/unlink")
    Call<PlatformModels.UnlinkAccountSuccess> unlink(@Path("organizationId") String  organizationId ,@Body PlatformModels.UnlinkAccount payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/refund")
    Call<PlatformModels.RefundResponse> refund(@Path("organizationId") String  organizationId ,@Body PlatformModels.Refund payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/integration/user/authentication/{organizationId}/refund/status")
    Call<PlatformModels.RefundStatus> refundStatus(@Path("organizationId") String  organizationId , @Query("refundId") String  refundId ,  @Query("orderId") String  orderId );
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/schemes")
    Call<PlatformModels.GetSchemesSuccess> getSchemes(@Path("organizationId") String  organizationId ,@Body PlatformModels.GetSchemesRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/eligibility")
    Call<PlatformModels.EligibilitySuccess> checkEligibility(@Path("organizationId") String  organizationId ,@Body PlatformModels.CheckEligibilityRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/repayment-link")
    Call<PlatformModels.RepaymentResponse> getRepaymentLink(@Path("organizationId") String  organizationId ,@Body PlatformModels.RepaymentRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/integration/user/authentication/{organizationId}/users")
    Call<PlatformModels.UserResponse> getAllCustomer(@Path("organizationId") String  organizationId , @Query("page") Integer  page ,  @Query("limit") Integer  limit ,  @Query("name") String  name ,  @Query("mobile") String  mobile );
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/vintage")
    Call<PlatformModels.AddVintageResponse> addVintageData(@Path("organizationId") String  organizationId ,@Body PlatformModels.VintageData payload);
    
}

interface CreditApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/integration/credit/credit/{organizationId}/orders/{orderId}/status")
    Call<PlatformModels.OrderStatus> getOrderStatus(@Path("organizationId") String  organizationId , @Path("orderId") String  orderId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/integration/credit/credit/{organizationId}/{lenderSlug}/plans")
    Call<PlatformModels.EligiblePlansResponse> getEligiblePlans(@Path("organizationId") String  organizationId , @Path("lenderSlug") String  lenderSlug ,@Body PlatformModels.EligiblePlansRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/integration/credit/summary/organization/{organizationId}/transactions")
    Call<PlatformModels.GetTransactionsResponse> getTransactions(@Path("organizationId") String  organizationId , @Query("mobile") String  mobile ,  @Query("countryCode") String  countryCode ,  @Query("page") Integer  page ,  @Query("limit") Integer  limit ,  @Query("orderId") String  orderId ,  @Query("transactionId") String  transactionId ,  @Query("type") Object  type ,  @Query("status") Object  status ,  @Query("onlySelf") Boolean  onlySelf ,  @Query("granularity") String  granularity );
    
}

interface MultiKycApiList {
    
    
    
    
    
    
    
    @GET ("/service/integration/kyc-onboarding/bre/{organizationId}/approved-lenders")
    Call<PlatformModels.ApprovedLendersTransaction> approvedLenders(@Path("organizationId") Object  organizationId );
    
}

interface MerchantApiList {
    
    
    
    
    
    
    
    @POST ("/service/integration/staff/authentication/oauth/{organizationId}/authorize")
    Call<PlatformModels.GetAccessTokenResponse> getAccessToken(@Path("organizationId") String  organizationId );
    
    
    
    
    
    
    
    @POST ("/service/integration/staff/authentication/oauth/{organizationId}/token")
    Call<PlatformModels.RefreshTokenResponse> renewAccessToken(@Path("organizationId") String  organizationId ,@Body PlatformModels.RefreshTokenRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/staff/authentication/oauth/{organizationId}/validate-credentials")
    Call<PlatformModels.ValidateCredentialsResponse> validateCredentials(@Path("organizationId") String  organizationId );
    
}

interface PaymentsApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/integration/payments/repayment/{mobile}/{organizationId}/outstanding")
    Call<PlatformModels.OutstandingDetailsResponse> getUserCreditSummary(@Path("mobile") String  mobile , @Path("organizationId") String  organizationId , @Query("lenderSlugs") List<String>  lenderSlugs );
    
}
