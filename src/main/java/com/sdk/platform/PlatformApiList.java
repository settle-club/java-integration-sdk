package com.sdk.platform;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;


interface CustomerApiList {
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/validate-customer")
    Call<PlatformModels.VerifyCustomerSuccess> verify(@Path("organizationId") String  organizationId ,@Body PlatformModels.VerifyCustomer payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/transaction/resend")
    Call<PlatformModels.CreateTransactionSuccess> resendPaymentRequest(@Path("organizationId") String  organizationId ,@Body PlatformModels.ResendPaymentRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/integration/user/authentication/{organizationId}/transaction")
    Call<PlatformModels.CreateTransactionSuccess> createOrder(@Path("organizationId") String  organizationId ,@Body PlatformModels.CreateTransaction payload);
    
    
    
    
    
    
    
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
    
}

interface CreditApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/integration/credit/credit/{organizationId}/orders/{orderId}/status")
    Call<PlatformModels.OrderStatus> getOrderStatus(@Path("organizationId") String  organizationId , @Path("orderId") String  orderId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/integration/credit/credit/{organizationId}/{lenderSlug}/plans")
    Call<PlatformModels.EligiblePlansResponse> getEligiblePlans(@Path("organizationId") String  organizationId , @Path("lenderSlug") String  lenderSlug ,@Body PlatformModels.EligiblePlansRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/integration/credit/summary/organization/{organizationId}/transactions")
    Call<PlatformModels.GetTransactionsResponse> getTransactions(@Path("organizationId") String  organizationId , @Query("page") Integer  page ,  @Query("type") Object  type ,  @Query("status") Object  status ,  @Query("limit") Integer  limit ,  @Query("countryCode") String  countryCode ,  @Query("mobile") String  mobile ,  @Query("orderId") String  orderId ,  @Query("transactionId") String  transactionId ,  @Query("onlySelf") Boolean  onlySelf );
    
}

interface MultiKycApiList {
    
    
    
    
    
    
    
    @GET ("/service/integration/kyc-onboarding/bre/{organizationId}/approved-lenders")
    Call<PlatformModels.ApprovedLendersTransaction> approvedLenders(@Path("organizationId") Object  organizationId );
    
    
    
    
    
    
    
    @POST ("/service/integration/kyc-onboarding/credit/{organizationId}/limit")
    Call<PlatformModels.IntgrCreditLimit> getLimit(@Path("organizationId") String  organizationId ,@Body PlatformModels.GetLimitRequest payload);
    
}

interface MerchantApiList {
    
    
    
    
    
    
    
    @POST ("/service/integration/staff/authentication/oauth/{organizationId}/authorize")
    Call<PlatformModels.GetAccessTokenResponse> getAccessToken(@Path("organizationId") String  organizationId );
    
    
    
    
    
    
    
    @POST ("/service/integration/staff/authentication/oauth/{organizationId}/token")
    Call<PlatformModels.RefreshTokenResponse> renewAccessToken(@Path("organizationId") String  organizationId ,@Body PlatformModels.RefreshTokenRequest payload);
    
}
