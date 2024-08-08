

package com.sdk.platform;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.*;

public class PlatformModels {


/*
    Model: IntegrationResponseMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationResponseMeta {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("product")
    private String product;
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
}

/*
    Model: IntegrationResponseError
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationResponseError {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("field")
    private String field;
    
    
    
    
    @JsonProperty("location")
    private String location;
    
    
    
    
}

/*
    Model: IntegrationSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationSuccessResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private IntegrationResponseMeta meta;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: IntegrationErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private IntegrationResponseMeta meta;
    
    
    
    
    @JsonProperty("errors")
    private List<IntegrationResponseError> errors;
    
    
    
    
}

/*
    Model: RefundResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("refundId")
    private String refundId;
    
    
    
    
}

/*
    Model: UserSource
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSource {
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sourceId")
    private String sourceId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("userMerchants")
    private List<Object> userMerchants;
    
    
    
    
}

/*
    Model: UserSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSchema {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("profilePicUrl")
    private String profilePicUrl;
    
    
    
    
    @JsonProperty("isEmailVerified")
    private Boolean isEmailVerified;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: count
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class count {
    
    
    
    
    @JsonProperty("totalUsers")
    private String totalUsers;
    
    
    
    
}

/*
    Model: FilterByDate
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterByDate {
    
    
    
    
    @JsonProperty("startDate")
    private String startDate;
    
    
    
    
    @JsonProperty("endDate")
    private String endDate;
    
    
    
    
}

/*
    Model: LenderCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCount {
    
    
    
    
    @JsonProperty("totalLenders")
    private String totalLenders;
    
    
    
    
}

/*
    Model: LenderSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderSchema {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: TotalUsersPerLender
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TotalUsersPerLender {
    
    
    
    
    @JsonProperty("filters")
    private List<Filters> filters;
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
    @JsonProperty("lenderList")
    private List<TotalUsersPerLenderData> lenderList;
    
    
    
    
}

/*
    Model: TotalUsersPerLenderData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TotalUsersPerLenderData {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("totalUsers")
    private String totalUsers;
    
    
    
    
}

/*
    Model: TotalUserByLender
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TotalUserByLender {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("count")
    private String count;
    
    
    
    
}

/*
    Model: UsersByLender
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsersByLender {
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: ErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: EditProfileRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditProfileRequest {
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("registrationToken")
    private String registrationToken;
    
    
    
    
}

/*
    Model: VerifyOtpRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpRequest {
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
    @JsonProperty("captchaCode")
    private String captchaCode;
    
    
    
    
    @JsonProperty("androidHash")
    private String androidHash;
    
    
    
    
    @JsonProperty("referralCode")
    private String referralCode;
    
    
    
    
    @JsonProperty("onboardingToken")
    private String onboardingToken;
    
    
    
    
}

/*
    Model: SendMobileOtpRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendMobileOtpRequest {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("captchaCode")
    private String captchaCode;
    
    
    
    
    @JsonProperty("androidHash")
    private String androidHash;
    
    
    
    
    @JsonProperty("force")
    private String force;
    
    
    
    
}

/*
    Model: ReSendMobileOtpRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReSendMobileOtpRequest {
    
    
    
    
    @JsonProperty("captchaCode")
    private String captchaCode;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("androidHash")
    private String androidHash;
    
    
    
    
}

/*
    Model: SendOtpRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpRequest {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("captchaCode")
    private String captchaCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: ApplicationUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationUser {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: SendOtpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpResponse {
    
    
    
    
    @JsonProperty("resendTimer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resendToken")
    private String resendToken;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("resendEmailToken")
    private String resendEmailToken;
    
    
    
    
    @JsonProperty("registerToken")
    private String registerToken;
    
    
    
    
    @JsonProperty("verifyEmailOtp")
    private Boolean verifyEmailOtp;
    
    
    
    
    @JsonProperty("verifyMobileOtp")
    private Boolean verifyMobileOtp;
    
    
    
    
    @JsonProperty("userExists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: EmailUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailUpdate {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: UserUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserUpdateRequest {
    
    
    
    
    @JsonProperty("firstName")
    private Object firstName;
    
    
    
    
    @JsonProperty("lastName")
    private Object lastName;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private Object email;
    
    
    
    
    @JsonProperty("gender")
    private Object gender;
    
    
    
    
    @JsonProperty("dob")
    private Object dob;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("profilePictureUrl")
    private Object profilePictureUrl;
    
    
    
    
    @JsonProperty("isEmailVerified")
    private Boolean isEmailVerified;
    
    
    
    
}

/*
    Model: LenderUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderUpdateRequest {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: ProfileEditSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProfileEditSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("registerToken")
    private String registerToken;
    
    
    
    
    @JsonProperty("resendEmailToken")
    private String resendEmailToken;
    
    
    
    
    @JsonProperty("userExists")
    private Boolean userExists;
    
    
    
    
    @JsonProperty("verifyEmailLink")
    private Boolean verifyEmailLink;
    
    
    
    
    @JsonProperty("verifyEmailOtp")
    private Boolean verifyEmailOtp;
    
    
    
    
    @JsonProperty("verifyMobileOtp")
    private Boolean verifyMobileOtp;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("resendTimer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resendToken")
    private String resendToken;
    
    
    
    
}

/*
    Model: LoginSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LoginSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
    @JsonProperty("registerToken")
    private String registerToken;
    
    
    
    
}

/*
    Model: VerifyOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("userExists")
    private Boolean userExists;
    
    
    
    
    @JsonProperty("isNew")
    private Boolean isNew;
    
    
    
    
}

/*
    Model: LogoutSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogoutSuccess {
    
    
    
    
    @JsonProperty("logout")
    private Boolean logout;
    
    
    
    
}

/*
    Model: OtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtpSuccess {
    
    
    
    
    @JsonProperty("resendTimer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resendToken")
    private String resendToken;
    
    
    
    
    @JsonProperty("registerToken")
    private String registerToken;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("isNew")
    private Boolean isNew;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("otpLength")
    private Double otpLength;
    
    
    
    
}

/*
    Model: SessionListSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SessionListSuccess {
    
    
    
    
    @JsonProperty("sessions")
    private List<String> sessions;
    
    
    
    
}

/*
    Model: VerifyMobileOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyMobileOTPSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: Location
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Location {
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
}

/*
    Model: OrderAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderAddress {
    
    
    
    
    @JsonProperty("line1")
    private String line1;
    
    
    
    
    @JsonProperty("line2")
    private String line2;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("geoLocation")
    private Location geoLocation;
    
    
    
    
}

/*
    Model: CustomerObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerObject {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("firstname")
    private String firstname;
    
    
    
    
    @JsonProperty("middleName")
    private String middleName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
}

/*
    Model: Order
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Order {
    
    
    
    
    @JsonProperty("valueInPaise")
    private Integer valueInPaise;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("items")
    private List<Items> items;
    
    
    
    
    @JsonProperty("shippingAddress")
    private OrderAddress shippingAddress;
    
    
    
    
    @JsonProperty("billingAddress")
    private OrderAddress billingAddress;
    
    
    
    
}

/*
    Model: VerifyOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOrder {
    
    
    
    
    @JsonProperty("valueInPaise")
    private Integer valueInPaise;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("items")
    private List<Items> items;
    
    
    
    
    @JsonProperty("shippingAddress")
    private OrderAddress shippingAddress;
    
    
    
    
    @JsonProperty("billingAddress")
    private OrderAddress billingAddress;
    
    
    
    
}

/*
    Model: OrderUid
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderUid {
    
    
    
    
    @JsonProperty("valueInPaise")
    private Integer valueInPaise;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("items")
    private List<Items> items;
    
    
    
    
    @JsonProperty("shippingAddress")
    private OrderAddress shippingAddress;
    
    
    
    
    @JsonProperty("billingAddress")
    private OrderAddress billingAddress;
    
    
    
    
}

/*
    Model: CustomerMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMeta {
    
    
    
    
    @JsonProperty("ip")
    private String ip;
    
    
    
    
    @JsonProperty("appVersion")
    private String appVersion;
    
    
    
    
    @JsonProperty("appIdentifier")
    private String appIdentifier;
    
    
    
    
    @JsonProperty("customerUserAgent")
    private String customerUserAgent;
    
    
    
    
    @JsonProperty("deviceId")
    private String deviceId;
    
    
    
    
}

/*
    Model: Device
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Device {
    
    
    
    
    @JsonProperty("ipAddress")
    private String ipAddress;
    
    
    
    
    @JsonProperty("userAgent")
    private String userAgent;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
}

/*
    Model: VerifyCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyCustomer {
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("order")
    private VerifyOrder order;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("fetchLimitOptions")
    private Boolean fetchLimitOptions;
    
    
    
    
    @JsonProperty("fetchPlans")
    private Boolean fetchPlans;
    
    
    
    
}

/*
    Model: CreateTransaction
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateTransaction {
    
    
    
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("order")
    private Order order;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("emiTenure")
    private Integer emiTenure;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("consents")
    private List<Consents> consents;
    
    
    
    
}

/*
    Model: ResendPaymentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendPaymentRequest {
    
    
    
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("order")
    private OrderUid order;
    
    
    
    
}

/*
    Model: VerifyCustomerSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyCustomerSuccess {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("userStatus")
    private String userStatus;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("schemes")
    private List<SchemeResponse> schemes;
    
    
    
    
    @JsonProperty("limit")
    private LimitResponse limit;
    
    
    
    
}

/*
    Model: CreateTransactionSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateTransactionSuccess {
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("userStatus")
    private String userStatus;
    
    
    
    
}

/*
    Model: SupportDocuments
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SupportDocuments {
    
    
    
    
    @JsonProperty("fileName")
    private String fileName;
    
    
    
    
    @JsonProperty("fileUrl")
    private String fileUrl;
    
    
    
    
}

/*
    Model: CreateTicketResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateTicketResponse {
    
    
    
    
    @JsonProperty("serviceRequestId")
    private String serviceRequestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: CreateTicket
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateTicket {
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("documents")
    private List<SupportDocuments> documents;
    
    
    
    
}

/*
    Model: InitiateTransactions
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InitiateTransactions {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: GetMobileFromToken
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetMobileFromToken {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: GetDataFromToken
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetDataFromToken {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: MerchantDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MerchantDetails {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("website")
    private String website;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: InitiateTransactionsSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InitiateTransactionsSuccess {
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
    @JsonProperty("session")
    private String session;
    
    
    
    
    @JsonProperty("expiry")
    private String expiry;
    
    
    
    
    @JsonProperty("hash")
    private String hash;
    
    
    
    
    @JsonProperty("order")
    private Order order;
    
    
    
    
    @JsonProperty("isAsp")
    private Boolean isAsp;
    
    
    
    
    @JsonProperty("merchant")
    private MerchantDetails merchant;
    
    
    
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    
    
    
}

/*
    Model: RetrieveMobileFromToken
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RetrieveMobileFromToken {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: CreateDashboardTemplateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateDashboardTemplateRequest {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("sections")
    private List<TemplateSections> sections;
    
    
    
    
}

/*
    Model: TemplateSections
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplateSections {
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
    @JsonProperty("isAvailableInMobile")
    private Boolean isAvailableInMobile;
    
    
    
    
    @JsonProperty("isAvailableInDesktop")
    private Boolean isAvailableInDesktop;
    
    
    
    
    @JsonProperty("component")
    private TemplateComponent component;
    
    
    
    
}

/*
    Model: TemplateComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplateComponent {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("isAvailableInDesktop")
    private Boolean isAvailableInDesktop;
    
    
    
    
    @JsonProperty("partnerApplications")
    private List<PartnerApplications> partnerApplications;
    
    
    
    
    @JsonProperty("banners")
    private List<Banners> banners;
    
    
    
    
    @JsonProperty("tips")
    private List<Tips> tips;
    
    
    
    
}

/*
    Model: PartnerApplications
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PartnerApplications {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("urlPath")
    private String urlPath;
    
    
    
    
    @JsonProperty("urlTarget")
    private String urlTarget;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
}

/*
    Model: Offerings
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Offerings {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("urlPath")
    private String urlPath;
    
    
    
    
    @JsonProperty("urlTarget")
    private String urlTarget;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
    @JsonProperty("gradient")
    private List<String> gradient;
    
    
    
    
}

/*
    Model: Banners
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Banners {
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
}

/*
    Model: Tips
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tips {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("urlPath")
    private String urlPath;
    
    
    
    
    @JsonProperty("urlTarget")
    private String urlTarget;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
}

/*
    Model: DashboardTemplateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DashboardTemplateResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("sections")
    private List<SectionSchema> sections;
    
    
    
    
}

/*
    Model: SectionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SectionSchema {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("partners")
    private List<PartnerApplicationsResponse> partners;
    
    
    
    
    @JsonProperty("banners")
    private List<BannersResponse> banners;
    
    
    
    
    @JsonProperty("tips")
    private List<TipsResponse> tips;
    
    
    
    
}

/*
    Model: PartnerApplicationsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PartnerApplicationsResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
}

/*
    Model: OfferingsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OfferingsResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("gradient")
    private List<String> gradient;
    
    
    
    
}

/*
    Model: BannersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BannersResponse {
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
}

/*
    Model: TipsSection
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TipsSection {
    
    
    
    
    @JsonProperty("tips")
    private List<TipsResponse> tips;
    
    
    
    
    @JsonProperty("categories")
    private List<TipsCategories> categories;
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
}

/*
    Model: TipsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TipsResponse {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
}

/*
    Model: TipsCategories
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TipsCategories {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: ActionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActionSchema {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("page")
    private PageSchema page;
    
    
    
    
    @JsonProperty("popup")
    private PageSchema popup;
    
    
    
    
}

/*
    Model: UpdateDashboardTemplateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateDashboardTemplateRequest {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("sections")
    private List<UpdateTemplateSections> sections;
    
    
    
    
}

/*
    Model: UpdateTemplateSections
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateTemplateSections {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
    @JsonProperty("isAvailableInMobile")
    private Boolean isAvailableInMobile;
    
    
    
    
    @JsonProperty("isAvailableInDesktop")
    private Boolean isAvailableInDesktop;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("component")
    private UpdateTemplateComponent component;
    
    
    
    
}

/*
    Model: UpdateTemplateComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateTemplateComponent {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("isAvailableInDesktop")
    private Boolean isAvailableInDesktop;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("partners")
    private List<UpdatePartnerApplications> partners;
    
    
    
    
    @JsonProperty("banners")
    private List<UpdateBanners> banners;
    
    
    
    
    @JsonProperty("tips")
    private List<UpdateTips> tips;
    
    
    
    
}

/*
    Model: UpdatePartnerApplications
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePartnerApplications {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("action")
    private Object action;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: UpdateOfferings
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateOfferings {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("urlPath")
    private String urlPath;
    
    
    
    
    @JsonProperty("urlTarget")
    private String urlTarget;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
    @JsonProperty("gradient")
    private List<String> gradient;
    
    
    
    
}

/*
    Model: UpdateBanners
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateBanners {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("action")
    private Object action;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: UpdateTips
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateTips {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("action")
    private Object action;
    
    
    
    
    @JsonProperty("sequence")
    private Integer sequence;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: NavigationsMobileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationsMobileResponse {
    
    
    
    
    @JsonProperty("tabs")
    private List<TabsSchema> tabs;
    
    
    
    
    @JsonProperty("profileSections")
    private List<ProfileSectionSchema> profileSections;
    
    
    
    
}

/*
    Model: TabsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TabsSchema {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
    @JsonProperty("page")
    private PageSchema page;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("activeIcon")
    private String activeIcon;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: PageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSchema {
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("type")
    private PageType type;
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,List<String>> params;
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,String> query;
    
    
    
    
}

/*
    Model: ProfileSectionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProfileSectionSchema {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("navigations")
    private List<ProfileNavigationSchema> navigations;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: ProfileNavigationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProfileNavigationSchema {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("action")
    private ActionSchema action;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: SendPNSRegisterRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendPNSRegisterRequest {
    
    
    
    
    @JsonProperty("deviceId")
    private String deviceId;
    
    
    
    
    @JsonProperty("deviceType")
    private String deviceType;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: PNSRegisterResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PNSRegisterResponse {
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: FaqResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FaqResponse {
    
    
    
    
    @JsonProperty("categories")
    private List<CategorySchema> categories;
    
    
    
    
}

/*
    Model: CategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategorySchema {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("questions")
    private List<QuestionSchema> questions;
    
    
    
    
}

/*
    Model: QuestionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QuestionSchema {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("displayOrder")
    private Integer displayOrder;
    
    
    
    
    @JsonProperty("canRaiseRequest")
    private Boolean canRaiseRequest;
    
    
    
    
}

/*
    Model: SupportCategories
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SupportCategories {
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: SupportCategoriesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SupportCategoriesResponse {
    
    
    
    
    @JsonProperty("categories")
    private List<SupportCategories> categories;
    
    
    
    
}

/*
    Model: SanctionLetterResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SanctionLetterResponse {
    
    
    
    
    @JsonProperty("sanctionedLetterFileUrl")
    private String sanctionedLetterFileUrl;
    
    
    
    
}

/*
    Model: KfsDocumentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KfsDocumentResponse {
    
    
    
    
    @JsonProperty("kfsFileUrl")
    private String kfsFileUrl;
    
    
    
    
}

/*
    Model: UserWhiteListedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserWhiteListedResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: UserConsentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserConsentRequest {
    
    
    
    
    @JsonProperty("consents")
    private List<String> consents;
    
    
    
    
}

/*
    Model: Consents
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Consents {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("purpose")
    private String purpose;
    
    
    
    
}

/*
    Model: UserConsentRequestV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserConsentRequestV2 {
    
    
    
    
    @JsonProperty("consents")
    private List<Consents> consents;
    
    
    
    
}

/*
    Model: UserConsentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserConsentResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: UserKycSteps
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserKycSteps {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("index")
    private String index;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("rules")
    private Object rules;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: CreateKycStepRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateKycStepRequest {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("index")
    private String index;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("rules")
    private Object rules;
    
    
    
    
}

/*
    Model: RemoveKycStepRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RemoveKycStepRequest {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("index")
    private String index;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("rules")
    private Object rules;
    
    
    
    
}

/*
    Model: KycUpdateMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KycUpdateMessage {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: MobileFromLinkingRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MobileFromLinkingRequest {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: MobileFromLinkingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MobileFromLinkingResponse {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: SessionFromLinkingRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SessionFromLinkingRequest {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: SessionFromLinkingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SessionFromLinkingResponse {
    
    
    
    
    @JsonProperty("session")
    private String session;
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
}

/*
    Model: LinkAccount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LinkAccount {
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
}

/*
    Model: LinkAccountSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LinkAccountSuccess {
    
    
    
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("statusCode")
    private Double statusCode;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errorCode")
    private String errorCode;
    
    
    
    
}

/*
    Model: UnlinkAccount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnlinkAccount {
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
}

/*
    Model: UnlinkAccountSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnlinkAccountSuccess {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("statusCode")
    private Double statusCode;
    
    
    
    
    @JsonProperty("userStatus")
    private String userStatus;
    
    
    
    
    @JsonProperty("errorCode")
    private String errorCode;
    
    
    
    
}

/*
    Model: Refund
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Refund {
    
    
    
    
    @JsonProperty("fingerprint")
    private String fingerprint;
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("refundItems")
    private List<Items> refundItems;
    
    
    
    
    @JsonProperty("orderId")
    private String orderId;
    
    
    
    
    @JsonProperty("refundId")
    private String refundId;
    
    
    
    
    @JsonProperty("refundAmount")
    private Double refundAmount;
    
    
    
    
    @JsonProperty("redirectionUrl")
    private String redirectionUrl;
    
    
    
    
}

/*
    Model: Translation
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Translation {
    
    
    
    
    @JsonProperty("content")
    private Object content;
    
    
    
    
}

/*
    Model: FilterKeys
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterKeys {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
}

/*
    Model: FilterValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterValues {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("isSelected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: Filters
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Filters {
    
    
    
    
    @JsonProperty("key")
    private FilterKeys key;
    
    
    
    
    @JsonProperty("values")
    private List<FilterValues> values;
    
    
    
    
}

/*
    Model: PageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageResponse {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("hasPrevious")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("hasNext")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("itemTotal")
    private Integer itemTotal;
    
    
    
    
}

/*
    Model: UserResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserResponse {
    
    
    
    
    @JsonProperty("filters")
    private List<Filters> filters;
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
    @JsonProperty("listOfUsers")
    private List<UserSchema> listOfUsers;
    
    
    
    
}

/*
    Model: UserDetailRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetailRequest {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: UserConsents
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserConsents {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("ipAddress")
    private String ipAddress;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: CreditScoreSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditScoreSchema {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("cibil")
    private Double cibil;
    
    
    
    
    @JsonProperty("finbox")
    private String finbox;
    
    
    
    
    @JsonProperty("systemAwarded")
    private String systemAwarded;
    
    
    
    
    @JsonProperty("isActive")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
}

/*
    Model: CreditLimitSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditLimitSchema {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("creditLimit")
    private String creditLimit;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: Screen
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Screen {
    
    
    
    
    @JsonProperty("screenType")
    private String screenType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: UserStateSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserStateSchema {
    
    
    
    
    @JsonProperty("screen")
    private Screen screen;
    
    
    
    
}

/*
    Model: GetAccessTokenResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAccessTokenResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("accessToken")
    private String accessToken;
    
    
    
    
    @JsonProperty("refreshToken")
    private String refreshToken;
    
    
    
    
    @JsonProperty("tokenExpireAt")
    private String tokenExpireAt;
    
    
    
    
    @JsonProperty("tokenExpiryIn")
    private String tokenExpiryIn;
    
    
    
    
    @JsonProperty("refreshTokenExpiryAt")
    private String refreshTokenExpiryAt;
    
    
    
    
    @JsonProperty("refreshTokenExpiryIn")
    private String refreshTokenExpiryIn;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
}

/*
    Model: RefreshTokenResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefreshTokenResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("accessToken")
    private String accessToken;
    
    
    
    
    @JsonProperty("tokenExpireAt")
    private String tokenExpireAt;
    
    
    
    
    @JsonProperty("tokenExpiryIn")
    private String tokenExpiryIn;
    
    
    
    
}

/*
    Model: RefreshTokenRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefreshTokenRequest {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: Items
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Items {
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
}

/*
    Model: RefundStatusList
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundStatusList {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("orderItems")
    private List<Items> orderItems;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("processedDate")
    private String processedDate;
    
    
    
    
}

/*
    Model: RefundStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundStatus {
    
    
    
    
    @JsonProperty("orderId")
    private String orderId;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("loanAccountNumber")
    private String loanAccountNumber;
    
    
    
    
    @JsonProperty("refund")
    private List<RefundStatusList> refund;
    
    
    
    
}

/*
    Model: GetSchemesSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSchemesSuccess {
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("lenders")
    private List<SchemeResponse> lenders;
    
    
    
    
}

/*
    Model: CustomerMetricsPivots
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMetricsPivots {
    
    
    
    
    @JsonProperty("date")
    private String date;
    
    
    
    
    @JsonProperty("sum")
    private Double sum;
    
    
    
    
}

/*
    Model: CustomerMetricsSubResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMetricsSubResponse {
    
    
    
    
    @JsonProperty("total")
    private String total;
    
    
    
    
    @JsonProperty("pivots")
    private List<CustomerMetricsPivots> pivots;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("valueFormat")
    private String valueFormat;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: CustomerMetricsAnalytics
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMetricsAnalytics {
    
    
    
    
    @JsonProperty("totalCustomers")
    private CustomerMetricsSubResponse totalCustomers;
    
    
    
    
    @JsonProperty("source")
    private CustomerMetricsSubResponse source;
    
    
    
    
}

/*
    Model: CustomerMetricsFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMetricsFilters {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private List<String> value;
    
    
    
    
    @JsonProperty("isSelected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("isActive")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: CustomerMetrics
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMetrics {
    
    
    
    
    @JsonProperty("metrics")
    private CustomerMetricsAnalytics metrics;
    
    
    
    
    @JsonProperty("filters")
    private List<CustomerMetricsFilters> filters;
    
    
    
    
    @JsonProperty("sort")
    private List<CustomerMetricsFilters> sort;
    
    
    
    
}

/*
    Model: SchemeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemeResponse {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("logoUrl")
    private String logoUrl;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("paymentOptions")
    private SchemePaymentOptionsResponse paymentOptions;
    
    
    
    
}

/*
    Model: SchemePaymentOptionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemePaymentOptionsResponse {
    
    
    
    
    @JsonProperty("emis")
    private List<SchemeEmiPaymentOptionResponse> emis;
    
    
    
    
    @JsonProperty("payLater")
    private SchemePayLaterPaymentOptionResponse payLater;
    
    
    
    
}

/*
    Model: SchemeEmiPaymentOptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemeEmiPaymentOptionResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("interest")
    private Double interest;
    
    
    
    
    @JsonProperty("processingFee")
    private Double processingFee;
    
    
    
    
    @JsonProperty("tenure")
    private Double tenure;
    
    
    
    
    @JsonProperty("emiSchedule")
    private List<SchemeEmiScheduleResponse> emiSchedule;
    
    
    
    
}

/*
    Model: SchemeEmiScheduleResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemeEmiScheduleResponse {
    
    
    
    
    @JsonProperty("installmentNo")
    private Integer installmentNo;
    
    
    
    
    @JsonProperty("installmentAmount")
    private Double installmentAmount;
    
    
    
    
    @JsonProperty("dueDate")
    private String dueDate;
    
    
    
    
}

/*
    Model: SchemePayLaterPaymentOptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemePayLaterPaymentOptionResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tenure")
    private Integer tenure;
    
    
    
    
    @JsonProperty("interest")
    private Integer interest;
    
    
    
    
    @JsonProperty("processingFee")
    private Integer processingFee;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: LimitResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LimitResponse {
    
    
    
    
    @JsonProperty("available")
    private List<AvailableOrPossibleLender> available;
    
    
    
    
    @JsonProperty("possible")
    private List<AvailableOrPossibleLender> possible;
    
    
    
    
}

/*
    Model: AvailableOrPossibleLender
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailableOrPossibleLender {
    
    
    
    
    @JsonProperty("limit")
    private Double limit;
    
    
    
    
    @JsonProperty("lenderName")
    private String lenderName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: GetSchemesRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSchemesRequest {
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("order")
    private Order order;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: CustomerMetricsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMetricsResponse {
    
    
    
    
    @JsonProperty("data")
    private CustomerMetrics data;
    
    
    
    
}

/*
    Model: CustomerMetricsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerMetricsRequest {
    
    
    
    
    @JsonProperty("filters")
    private List<CustomerMetricsFilters> filters;
    
    
    
    
    @JsonProperty("sort")
    private List<CustomerMetricsFilters> sort;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("pivotPoints")
    private Double pivotPoints;
    
    
    
    
}

/*
    Model: SourceAnalyticsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SourceAnalyticsRequest {
    
    
    
    
    @JsonProperty("filters")
    private List<CustomerMetricsFilters> filters;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
}

/*
    Model: LenderResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderResponse {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: CreditLimitObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditLimitObject {
    
    
    
    
    @JsonProperty("availableLimit")
    private Double availableLimit;
    
    
    
    
    @JsonProperty("possibleLimit")
    private Double possibleLimit;
    
    
    
    
    @JsonProperty("lender")
    private LenderResponse lender;
    
    
    
    
}

/*
    Model: BusinessDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessDetails {
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("shopName")
    private String shopName;
    
    
    
    
    @JsonProperty("legalName")
    private String legalName;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
}

/*
    Model: DocumentItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentItems {
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("issuedOn")
    private String issuedOn;
    
    
    
    
    @JsonProperty("issuedAt")
    private String issuedAt;
    
    
    
    
    @JsonProperty("issuedBy")
    private String issuedBy;
    
    
    
    
    @JsonProperty("expiryOn")
    private String expiryOn;
    
    
    
    
}

/*
    Model: VintageItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VintageItems {
    
    
    
    
    @JsonProperty("month")
    private Integer month;
    
    
    
    
    @JsonProperty("year")
    private Integer year;
    
    
    
    
    @JsonProperty("totalTransactions")
    private Integer totalTransactions;
    
    
    
    
    @JsonProperty("totalTransactionAmount")
    private Double totalTransactionAmount;
    
    
    
    
    @JsonProperty("totalCancellations")
    private Integer totalCancellations;
    
    
    
    
    @JsonProperty("totalCancellationAmount")
    private Double totalCancellationAmount;
    
    
    
    
}

/*
    Model: EligibilitySuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EligibilitySuccess {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("creditLimits")
    private List<CreditLimitObject> creditLimits;
    
    
    
    
}

/*
    Model: CheckEligibilityRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckEligibilityRequest {
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("order")
    private Order order;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("fetchLimitOptions")
    private Boolean fetchLimitOptions;
    
    
    
    
}

/*
    Model: EmiSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmiSchedule {
    
    
    
    
    @JsonProperty("installmentNo")
    private Integer installmentNo;
    
    
    
    
    @JsonProperty("installmentAmount")
    private Integer installmentAmount;
    
    
    
    
    @JsonProperty("dueDate")
    private String dueDate;
    
    
    
    
}

/*
    Model: PaymentOption
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOption {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tenure")
    private Integer tenure;
    
    
    
    
    @JsonProperty("processingFee")
    private Integer processingFee;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("emiSchedule")
    private List<EmiSchedule> emiSchedule;
    
    
    
    
}

/*
    Model: PaymentOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptions {
    
    
    
    
    @JsonProperty("payLater")
    private PaymentOption payLater;
    
    
    
    
    @JsonProperty("emis")
    private List<PaymentOption> emis;
    
    
    
    
}

/*
    Model: LenderAndPaymentOption
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderAndPaymentOption {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("logoUrl")
    private String logoUrl;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("paymentOptions")
    private PaymentOptions paymentOptions;
    
    
    
    
}

/*
    Model: GetSchemesSuccessOld
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSchemesSuccessOld {
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("lenders")
    private List<LenderAndPaymentOption> lenders;
    
    
    
    
}

/*
    Model: PageSchemaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSchemaResponse {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("sections")
    private Object sections;
    
    
    
    
    @JsonProperty("settings")
    private Object settings;
    
    
    
    
}

/*
    Model: userCountRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class userCountRequest {
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("startDate")
    private String startDate;
    
    
    
    
    @JsonProperty("endDate")
    private String endDate;
    
    
    
    
}

/*
    Model: RepaymentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentRequest {
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("target")
    private String target;
    
    
    
    
    @JsonProperty("callbackUrl")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
}

/*
    Model: RepaymentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private IntegrationResponseMeta meta;
    
    
    
    
    @JsonProperty("data")
    private RepaymentResponseData data;
    
    
    
    
}

/*
    Model: RepaymentResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentResponseData {
    
    
    
    
    @JsonProperty("repaymentUrl")
    private String repaymentUrl;
    
    
    
    
}

/*
    Model: VerifyMagicLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyMagicLinkResponse {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
    @JsonProperty("redirectPath")
    private String redirectPath;
    
    
    
    
    @JsonProperty("callbackUrl")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
}

/*
    Model: VerifyMagicLinkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyMagicLinkRequest {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: VintageData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VintageData {
    
    
    
    
    @JsonProperty("customer")
    private CustomerObject customer;
    
    
    
    
    @JsonProperty("businessDetails")
    private BusinessDetails businessDetails;
    
    
    
    
    @JsonProperty("documents")
    private List<DocumentItems> documents;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
    @JsonProperty("vintage")
    private List<VintageItems> vintage;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
}

/*
    Model: AddVintageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddVintageResponse {
    
    
    
    
    @JsonProperty("mesasge")
    private String mesasge;
    
    
    
    
    @JsonProperty("meta")
    private IntegrationResponseMeta meta;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}


    
    /*
        Enum: PageType
        Used By: Customer
    */
    @Getter
    public enum PageType {

        
        externalLink("external"), 
        
        login("login"), 
        
        home("home"), 
        
        transactions("transactions"), 
        
        transactionDetails("transactionDetails"), 
        
        rewards("rewards"), 
        
        referAndEarn("referAndEarn"), 
        
        profile("profile"), 
        
        setupAutopay("setupAutopay"), 
        
        updateEmail("updateEmail"), 
        
        reportIssue("reportIssue"), 
        
        creditScore("creditScore"), 
        
        autoPay("autoPay"), 
        
        helpCenter("helpCenter"), 
        
        kycInit("kycInit"), 
        
        accessDigilocker("accessDigilocker"), 
        
        liveliness("liveliness"), 
        
        lenderOnboard("lenderOnboard"), 
        
        lender("lender"), 
        
        kycDocs("kycDocs"), 
        
        kycSelfie("kycSelfie"), 
        
        kycStatus("kycStatus"), 
        
        kycError("kycError"), 
        
        kycDigilockerResponse("kycDigilockerResponse"), 
        
        kycInitResponse("kycInitResponse"), 
        
        repayment("repayment"), 
        
        netBankingRepayment("netBankingRepayment"), 
        
        upiRepayment("upiRepayment"), 
        
        sanctionLetter("sanctionLetter"), 
        
        kfs("kfs"), 
        
        dynamicPage("dynamicPage");
        

        private String priority;
        PageType(String priority) {
            this.priority = priority;
        }
    }




/*
    Model: DisbursalRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisbursalRequest {
    
    
    
    
    @JsonProperty("fingerprint")
    private String fingerprint;
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
    @JsonProperty("loanTypeId")
    private Double loanTypeId;
    
    
    
    
    @JsonProperty("emiTenure")
    private Double emiTenure;
    
    
    
    
    @JsonProperty("isDownpaymentRequired")
    private Boolean isDownpaymentRequired;
    
    
    
    
    @JsonProperty("downpaymentAmount")
    private Double downpaymentAmount;
    
    
    
    
    @JsonProperty("loanAmount")
    private Double loanAmount;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("intent")
    private String intent;
    
    
    
    
}

/*
    Model: WorkflowUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WorkflowUser {
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: EligiblePlansRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EligiblePlansRequest {
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
}

/*
    Model: EligiblePlans
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EligiblePlans {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("displayName")
    private String displayName;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("brokenInterest")
    private Double brokenInterest;
    
    
    
    
    @JsonProperty("noOfEmi")
    private Double noOfEmi;
    
    
    
    
    @JsonProperty("emiAmount")
    private Double emiAmount;
    
    
    
    
    @JsonProperty("processingFee")
    private Double processingFee;
    
    
    
    
    @JsonProperty("installmentInterestRate")
    private Double installmentInterestRate;
    
    
    
    
}

/*
    Model: EligiblePlansResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EligiblePlansResponse {
    
    
    
    
    @JsonProperty("eligiblePlans")
    private List<EligiblePlans> eligiblePlans;
    
    
    
    
}

/*
    Model: DisbursalResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisbursalResponse {
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: OrderStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatus {
    
    
    
    
    @JsonProperty("orderId")
    private String orderId;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: DisbursalStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisbursalStatusRequest {
    
    
    
    
    @JsonProperty("fingerprint")
    private String fingerprint;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
}

/*
    Model: Transactions
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Transactions {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("partnerId")
    private String partnerId;
    
    
    
    
    @JsonProperty("partner")
    private String partner;
    
    
    
    
    @JsonProperty("partnerLogo")
    private String partnerLogo;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("remark")
    private String remark;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("loanAccountNumber")
    private String loanAccountNumber;
    
    
    
    
    @JsonProperty("kfs")
    private String kfs;
    
    
    
    
    @JsonProperty("utr")
    private String utr;
    
    
    
    
    @JsonProperty("sanctionLetter")
    private String sanctionLetter;
    
    
    
    
    @JsonProperty("orderId")
    private String orderId;
    
    
    
    
    @JsonProperty("refundId")
    private String refundId;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("lenderName")
    private String lenderName;
    
    
    
    
    @JsonProperty("lenderLogo")
    private String lenderLogo;
    
    
    
    
    @JsonProperty("loanType")
    private String loanType;
    
    
    
    
    @JsonProperty("nextDueDate")
    private String nextDueDate;
    
    
    
    
    @JsonProperty("paidPercent")
    private Double paidPercent;
    
    
    
    
    @JsonProperty("lenderDetail")
    private LenderDetail lenderDetail;
    
    
    
    
    @JsonProperty("emis")
    private List<Emi> emis;
    
    
    
    
}

/*
    Model: LenderDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderDetail {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("b2b")
    private Boolean b2B;
    
    
    
    
    @JsonProperty("b2c")
    private Boolean b2C;
    
    
    
    
    @JsonProperty("theme")
    private Theme theme;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: TransactionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionResponse {
    
    
    
    
    @JsonProperty("filters")
    private List<Filters> filters;
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
    @JsonProperty("transactions")
    private List<Transactions> transactions;
    
    
    
    
}

/*
    Model: GetReconciliationFileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReconciliationFileResponse {
    
    
    
    
    @JsonProperty("files")
    private List<ReconFile> files;
    
    
    
    
}

/*
    Model: ReconFile
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReconFile {
    
    
    
    
    @JsonProperty("base64")
    private String base64;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: UploadReconciliationFileRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadReconciliationFileRequest {
    
    
    
    
    @JsonProperty("base64File")
    private String base64File;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
}

/*
    Model: UploadReconciliationFileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadReconciliationFileResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: TransactionCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionCount {
    
    
    
    
    @JsonProperty("totalTransactions")
    private String totalTransactions;
    
    
    
    
}

/*
    Model: RefundCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundCount {
    
    
    
    
    @JsonProperty("refundTransactions")
    private String refundTransactions;
    
    
    
    
}

/*
    Model: OrganizationTransactionsCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationTransactionsCount {
    
    
    
    
    @JsonProperty("count")
    private Double count;
    
    
    
    
}

/*
    Model: OrganizationTransactionsSum
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationTransactionsSum {
    
    
    
    
    @JsonProperty("sum")
    private Double sum;
    
    
    
    
}

/*
    Model: UniqueCustomersInOrg
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UniqueCustomersInOrg {
    
    
    
    
    @JsonProperty("count")
    private Double count;
    
    
    
    
}

/*
    Model: TransactionAmount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionAmount {
    
    
    
    
    @JsonProperty("totalTransactionAmount")
    private String totalTransactionAmount;
    
    
    
    
}

/*
    Model: SchemaForOneDayTotal
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemaForOneDayTotal {
    
    
    
    
    @JsonProperty("orgId")
    private String orgId;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("count")
    private Double count;
    
    
    
    
    @JsonProperty("sum")
    private String sum;
    
    
    
    
    @JsonProperty("refund")
    private String refund;
    
    
    
    
    @JsonProperty("difference")
    private String difference;
    
    
    
    
}

/*
    Model: SumofOneDayTransactions
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SumofOneDayTransactions {
    
    
    
    
    @JsonProperty("dayTotal")
    private List<SchemaForOneDayTotal> dayTotal;
    
    
    
    
}

/*
    Model: AverageTransaction
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AverageTransaction {
    
    
    
    
    @JsonProperty("average")
    private Double average;
    
    
    
    
}

/*
    Model: AllTransactionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AllTransactionsResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("partnerId")
    private String partnerId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("remark")
    private String remark;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("loanAccountNumber")
    private String loanAccountNumber;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
}

/*
    Model: TotalRefund
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TotalRefund {
    
    
    
    
    @JsonProperty("totalRefund")
    private String totalRefund;
    
    
    
    
}

/*
    Model: TotalRepayment
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TotalRepayment {
    
    
    
    
    @JsonProperty("totalRepayment")
    private String totalRepayment;
    
    
    
    
}

/*
    Model: TotalOverDue
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TotalOverDue {
    
    
    
    
    @JsonProperty("totalDue")
    private String totalDue;
    
    
    
    
}

/*
    Model: TotalLoansDisbursed
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TotalLoansDisbursed {
    
    
    
    
    @JsonProperty("totalLoansDisbursed")
    private String totalLoansDisbursed;
    
    
    
    
}

/*
    Model: OrganizationTransactionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationTransactionResponse {
    
    
    
    
    @JsonProperty("filters")
    private List<TrFilters> filters;
    
    
    
    
    @JsonProperty("page")
    private TrPageResponse page;
    
    
    
    
    @JsonProperty("transactions")
    private List<OrgTransactions> transactions;
    
    
    
    
}

/*
    Model: TrFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TrFilters {
    
    
    
    
    @JsonProperty("key")
    private TrFilterKeys key;
    
    
    
    
    @JsonProperty("values")
    private List<TrFilterValues> values;
    
    
    
    
}

/*
    Model: TrPageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TrPageResponse {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Double current;
    
    
    
    
    @JsonProperty("hasPrevious")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("hasNext")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("size")
    private Double size;
    
    
    
    
    @JsonProperty("itemTotal")
    private Double itemTotal;
    
    
    
    
}

/*
    Model: OrgTransactions
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrgTransactions {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("userName")
    private String userName;
    
    
    
    
    @JsonProperty("partnerId")
    private String partnerId;
    
    
    
    
    @JsonProperty("partner")
    private String partner;
    
    
    
    
    @JsonProperty("partnerLogo")
    private String partnerLogo;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("remark")
    private String remark;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("orderId")
    private String orderId;
    
    
    
    
    @JsonProperty("loanAccountNumber")
    private String loanAccountNumber;
    
    
    
    
    @JsonProperty("kfs")
    private String kfs;
    
    
    
    
    @JsonProperty("sanctionLetter")
    private String sanctionLetter;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
}

/*
    Model: TrFilterKeys
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TrFilterKeys {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
}

/*
    Model: TrFilterValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TrFilterValues {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("isSelected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: KfsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KfsRequest {
    
    
    
    
    @JsonProperty("loanTypeId")
    private Double loanTypeId;
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
}

/*
    Model: KfsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KfsResponse {
    
    
    
    
    @JsonProperty("kfsTable")
    private String kfsTable;
    
    
    
    
}

/*
    Model: LenderTransactionState
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderTransactionState {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("stepIndex")
    private Double stepIndex;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("workflowId")
    private String workflowId;
    
    
    
    
    @JsonProperty("workflowName")
    private String workflowName;
    
    
    
    
    @JsonProperty("parentStateId")
    private String parentStateId;
    
    
    
    
    @JsonProperty("workflowUrl")
    private String workflowUrl;
    
    
    
    
    @JsonProperty("isInternal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("ttl")
    private Double ttl;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("inputData")
    private Object inputData;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: TransactionStateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionStateResponse {
    
    
    
    
    @JsonProperty("transactionState")
    private List<LenderTransactionState> transactionState;
    
    
    
    
}

/*
    Model: Theme
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Theme {
    
    
    
    
    @JsonProperty("logoUrl")
    private String logoUrl;
    
    
    
    
    @JsonProperty("iconUrl")
    private String iconUrl;
    
    
    
    
    @JsonProperty("landscapeBgUrl")
    private String landscapeBgUrl;
    
    
    
    
    @JsonProperty("portraitBgUrl")
    private String portraitBgUrl;
    
    
    
    
    @JsonProperty("shortName")
    private String shortName;
    
    
    
    
}

/*
    Model: Emi
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Emi {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("installmentno")
    private Double installmentno;
    
    
    
    
    @JsonProperty("loanAccountNumber")
    private String loanAccountNumber;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("dueDate")
    private String dueDate;
    
    
    
    
    @JsonProperty("referenceTransactionId")
    private String referenceTransactionId;
    
    
    
    
    @JsonProperty("remark")
    private String remark;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("paid")
    private Boolean paid;
    
    
    
    
    @JsonProperty("overdue")
    private Boolean overdue;
    
    
    
    
    @JsonProperty("repaymentDate")
    private String repaymentDate;
    
    
    
    
}

/*
    Model: MetricPivots
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricPivots {
    
    
    
    
    @JsonProperty("date")
    private String date;
    
    
    
    
    @JsonProperty("sum")
    private Double sum;
    
    
    
    
}

/*
    Model: TransactionMetricSubResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionMetricSubResponse {
    
    
    
    
    @JsonProperty("total")
    private String total;
    
    
    
    
    @JsonProperty("pivots")
    private List<MetricPivots> pivots;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("valueFormat")
    private String valueFormat;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: TransactionMetrics
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionMetrics {
    
    
    
    
    @JsonProperty("totalDisbursement")
    private TransactionMetricSubResponse totalDisbursement;
    
    
    
    
    @JsonProperty("totalOverdue")
    private TransactionMetricSubResponse totalOverdue;
    
    
    
    
    @JsonProperty("totalRepayment")
    private TransactionMetricSubResponse totalRepayment;
    
    
    
    
}

/*
    Model: LenderCustomerTransactionMetricsFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCustomerTransactionMetricsFilters {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private List<String> value;
    
    
    
    
    @JsonProperty("isSelected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("isActive")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: LenderCustomerTransactionMetrics
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCustomerTransactionMetrics {
    
    
    
    
    @JsonProperty("metrics")
    private TransactionMetrics metrics;
    
    
    
    
    @JsonProperty("filters")
    private List<LenderCustomerTransactionMetricsFilters> filters;
    
    
    
    
    @JsonProperty("sort")
    private List<LenderCustomerTransactionMetricsFilters> sort;
    
    
    
    
}

/*
    Model: LenderCustomerTransactionMetricsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCustomerTransactionMetricsResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: LenderCustomerTransactionMetricsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCustomerTransactionMetricsRequest {
    
    
    
    
    @JsonProperty("filters")
    private List<LenderCustomerTransactionMetricsFilters> filters;
    
    
    
    
    @JsonProperty("sort")
    private List<LenderCustomerTransactionMetricsFilters> sort;
    
    
    
    
    @JsonProperty("startDate")
    private String startDate;
    
    
    
    
    @JsonProperty("endDate")
    private String endDate;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("pivotPoints")
    private Double pivotPoints;
    
    
    
    
}

/*
    Model: TransactionOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionOrder {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
}

/*
    Model: TransactionMerchant
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionMerchant {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: TransactionLoan
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionLoan {
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("dueDate")
    private String dueDate;
    
    
    
    
    @JsonProperty("repaidAmount")
    private Double repaidAmount;
    
    
    
    
    @JsonProperty("isSettled")
    private Boolean isSettled;
    
    
    
    
    @JsonProperty("emis")
    private List<TransactionLoanEmi> emis;
    
    
    
    
}

/*
    Model: TransactionLoanEmi
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionLoanEmi {
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("dueDate")
    private String dueDate;
    
    
    
    
    @JsonProperty("installmentNo")
    private Integer installmentNo;
    
    
    
    
    @JsonProperty("repaidAmount")
    private Double repaidAmount;
    
    
    
    
    @JsonProperty("isSettled")
    private Boolean isSettled;
    
    
    
    
}

/*
    Model: TransactionLender
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionLender {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("shortName")
    private String shortName;
    
    
    
    
}

/*
    Model: UserTransaction
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserTransaction {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("settlementUtr")
    private String settlementUtr;
    
    
    
    
    @JsonProperty("refundId")
    private String refundId;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("isMasked")
    private Boolean isMasked;
    
    
    
    
    @JsonProperty("order")
    private TransactionOrder order;
    
    
    
    
    @JsonProperty("merchant")
    private TransactionMerchant merchant;
    
    
    
    
    @JsonProperty("loans")
    private List<TransactionLoan> loans;
    
    
    
    
    @JsonProperty("lender")
    private TransactionLender lender;
    
    
    
    
}

/*
    Model: Pagination
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Pagination {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("hasPrevious")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("hasNext")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("itemTotal")
    private Integer itemTotal;
    
    
    
    
}

/*
    Model: GetTransactionsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetTransactionsData {
    
    
    
    
    @JsonProperty("transactions")
    private List<UserTransaction> transactions;
    
    
    
    
    @JsonProperty("page")
    private Pagination page;
    
    
    
    
}

/*
    Model: GetTransactionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetTransactionsResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private IntegrationResponseMeta meta;
    
    
    
    
    @JsonProperty("data")
    private GetTransactionsData data;
    
    
    
    
}

/*
    Model: SummaryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SummaryRequest {
    
    
    
    
    @JsonProperty("startDate")
    private String startDate;
    
    
    
    
    @JsonProperty("endDate")
    private String endDate;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}




/*
    Model: Lender
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Lender {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("theme")
    private Object theme;
    
    
    
    
    @JsonProperty("b2b")
    private Boolean b2B;
    
    
    
    
    @JsonProperty("b2c")
    private Boolean b2C;
    
    
    
    
    @JsonProperty("merchantConfigSchema")
    private String merchantConfigSchema;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("metaSchema")
    private Object metaSchema;
    
    
    
    
}

/*
    Model: UserLender
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserLender {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("approvedLimit")
    private Double approvedLimit;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: SourceCreditReport
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SourceCreditReport {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("bureau")
    private String bureau;
    
    
    
    
    @JsonProperty("score")
    private String score;
    
    
    
    
    @JsonProperty("report")
    private String report;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
}

/*
    Model: Document
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Document {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("detail")
    private Object detail;
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
}

/*
    Model: UserKycDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserKycDetail {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("remark")
    private String remark;
    
    
    
    
    @JsonProperty("profileType")
    private String profileType;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("expiryDate")
    private String expiryDate;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("lender")
    private Lender lender;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
}

/*
    Model: Form
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Form {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("form")
    private Object form;
    
    
    
    
    @JsonProperty("uiSchema")
    private Object uiSchema;
    
    
    
    
    @JsonProperty("workflowId")
    private String workflowId;
    
    
    
    
}

/*
    Model: LenderKycStepMap
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderKycStepMap {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("step")
    private String step;
    
    
    
    
    @JsonProperty("stepIndex")
    private Double stepIndex;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("rules")
    private Object rules;
    
    
    
    
    @JsonProperty("profileType")
    private String profileType;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("iconUrl")
    private String iconUrl;
    
    
    
    
    @JsonProperty("isInteractive")
    private Boolean isInteractive;
    
    
    
    
    @JsonProperty("formId")
    private String formId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("form")
    private Form form;
    
    
    
    
    @JsonProperty("docSchema")
    private Object docSchema;
    
    
    
    
}

/*
    Model: UserKycLenderStepMap
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserKycLenderStepMap {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("lenderKycStepMapId")
    private String lenderKycStepMapId;
    
    
    
    
    @JsonProperty("userKycDetailId")
    private String userKycDetailId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("ruleState")
    private Object ruleState;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("documentId")
    private String documentId;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("lenderKycStepMap")
    private LenderKycStepMap lenderKycStepMap;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("updatedBy")
    private String updatedBy;
    
    
    
    
}

/*
    Model: ProofOfIdentity
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProofOfIdentity {
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("hashedEmail")
    private String hashedEmail;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("hashedMobileNumber")
    private String hashedMobileNumber;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: ProofOfAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProofOfAddress {
    
    
    
    
    @JsonProperty("careOf")
    private String careOf;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("district")
    private String district;
    
    
    
    
    @JsonProperty("house")
    private String house;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("locality")
    private String locality;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("postOffice")
    private String postOffice;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("street")
    private String street;
    
    
    
    
    @JsonProperty("subDistrict")
    private String subDistrict;
    
    
    
    
    @JsonProperty("vtc")
    private String vtc;
    
    
    
    
}

/*
    Model: EAadhaarData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EAadhaarData {
    
    
    
    
    @JsonProperty("aadhaarReferenceNumber")
    private String aadhaarReferenceNumber;
    
    
    
    
    @JsonProperty("aadhaarUid")
    private String aadhaarUid;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("proofOfIdentity")
    private ProofOfIdentity proofOfIdentity;
    
    
    
    
    @JsonProperty("proofOfAddress")
    private ProofOfAddress proofOfAddress;
    
    
    
    
    @JsonProperty("xml")
    private String xml;
    
    
    
    
    @JsonProperty("pdf")
    private String pdf;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
}

/*
    Model: EntityMapDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityMapDto {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("limit")
    private Double limit;
    
    
    
    
    @JsonProperty("creditType")
    private String creditType;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
}

/*
    Model: EntityDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityDto {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
}

/*
    Model: MerchantSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MerchantSchema {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("website")
    private String website;
    
    
    
    
    @JsonProperty("apiHook")
    private String apiHook;
    
    
    
    
    @JsonProperty("epikId")
    private String epikId;
    
    
    
    
    @JsonProperty("disbursementAccountHolderName")
    private String disbursementAccountHolderName;
    
    
    
    
    @JsonProperty("disbursementAccountNumber")
    private String disbursementAccountNumber;
    
    
    
    
    @JsonProperty("disbursementIfsc")
    private String disbursementIfsc;
    
    
    
    
    @JsonProperty("createdBy")
    private String createdBy;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("businessName")
    private String businessName;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("businessAddress")
    private String businessAddress;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("b2b")
    private Boolean b2B;
    
    
    
    
    @JsonProperty("b2c")
    private Boolean b2C;
    
    
    
    
}

/*
    Model: Consent
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Consent {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ValidatePanRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidatePanRequest {
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("consents")
    private List<Consent> consents;
    
    
    
    
}

/*
    Model: BankDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BankDetails {
    
    
    
    
    @JsonProperty("accountType")
    private String accountType;
    
    
    
    
    @JsonProperty("bankName")
    private String bankName;
    
    
    
    
    @JsonProperty("ifsc")
    private String ifsc;
    
    
    
    
    @JsonProperty("accountNumber")
    private String accountNumber;
    
    
    
    
    @JsonProperty("accountHolderName")
    private String accountHolderName;
    
    
    
    
}

/*
    Model: DocumentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentData {
    
    
    
    
    @JsonProperty("selfie")
    private String selfie;
    
    
    
    
    @JsonProperty("video")
    private String video;
    
    
    
    
    @JsonProperty("digilockerCode")
    private String digilockerCode;
    
    
    
    
    @JsonProperty("bankDetails")
    private BankDetails bankDetails;
    
    
    
    
}

/*
    Model: ConfirmPanRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfirmPanRequest {
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("onboardingToken")
    private String onboardingToken;
    
    
    
    
}

/*
    Model: LivelinessDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LivelinessDetails {
    
    
    
    
    @JsonProperty("selfie")
    private String selfie;
    
    
    
    
    @JsonProperty("video")
    private String video;
    
    
    
    
}

/*
    Model: UploadDocumentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadDocumentRequest {
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("documentData")
    private Object documentData;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadDocumentRequestV1
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadDocumentRequestV1 {
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("documentData")
    private Object documentData;
    
    
    
    
}

/*
    Model: UploadDocumentRequestV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadDocumentRequestV3 {
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("documentData")
    private Object documentData;
    
    
    
    
}

/*
    Model: AadhaarRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AadhaarRequest {
    
    
    
    
    @JsonProperty("digilockerCode")
    private String digilockerCode;
    
    
    
    
}

/*
    Model: UploadAadhaarRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadAadhaarRequest {
    
    
    
    
    @JsonProperty("documentData")
    private AadhaarRequest documentData;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadLivelinessRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadLivelinessRequest {
    
    
    
    
    @JsonProperty("documentData")
    private LivelinessDetails documentData;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadAadhaarRequestV1
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadAadhaarRequestV1 {
    
    
    
    
    @JsonProperty("documentData")
    private AadhaarRequest documentData;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadLivelinessRequestV1
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadLivelinessRequestV1 {
    
    
    
    
    @JsonProperty("documentData")
    private LivelinessDetails documentData;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadAadhaarRequestV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadAadhaarRequestV2 {
    
    
    
    
    @JsonProperty("documentData")
    private AadhaarRequest documentData;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadLivelinessRequestV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadLivelinessRequestV2 {
    
    
    
    
    @JsonProperty("documentData")
    private LivelinessDetails documentData;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadAadhaarRequestV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadAadhaarRequestV3 {
    
    
    
    
    @JsonProperty("documentData")
    private AadhaarRequest documentData;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadLivelinessRequestV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadLivelinessRequestV3 {
    
    
    
    
    @JsonProperty("documentData")
    private LivelinessDetails documentData;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: UploadBankDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadBankDetailsRequest {
    
    
    
    
    @JsonProperty("documentData")
    private BankDetails documentData;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("kycStep")
    private String kycStep;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: InitiateKycRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InitiateKycRequest {
    
    
    
    
    @JsonProperty("kycType")
    private String kycType;
    
    
    
    
    @JsonProperty("kycId")
    private String kycId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
}

/*
    Model: InitiateKycRequestV1
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InitiateKycRequestV1 {
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("kycType")
    private String kycType;
    
    
    
    
    @JsonProperty("kycId")
    private String kycId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
}

/*
    Model: LenderOnboardRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderOnboardRequest {
    
    
    
    
    @JsonProperty("ack")
    private String ack;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
}

/*
    Model: LenderOnboardRequestV1
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderOnboardRequestV1 {
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("ack")
    private String ack;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
}

/*
    Model: UpdateLenderStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateLenderStatusRequest {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("payload")
    private Object payload;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("action")
    private Boolean action;
    
    
    
    
}

/*
    Model: UpdateProfileRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateProfileRequest {
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("isOnboarded")
    private Boolean isOnboarded;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
}

/*
    Model: UpdateEntityRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateEntityRequest {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("address")
    private ProofOfAddress address;
    
    
    
    
}

/*
    Model: CreateKycStepsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateKycStepsRequest {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: CreateLenderPgConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateLenderPgConfigRequest {
    
    
    
    
    @JsonProperty("mid")
    private String mid;
    
    
    
    
    @JsonProperty("clientId")
    private String clientId;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("pgId")
    private String pgId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
}

/*
    Model: CreateLenderStateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateLenderStateRequest {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: UpdateLenderRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateLenderRequest {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
}

/*
    Model: OtherPolicyFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherPolicyFilters {
    
    
    
    
    @JsonProperty("orderBy")
    private List<Object> orderBy;
    
    
    
    
}

/*
    Model: GetPolicyFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPolicyFilters {
    
    
    
    
    @JsonProperty("policyType")
    private String policyType;
    
    
    
    
    @JsonProperty("lenderIds")
    private List<Object> lenderIds;
    
    
    
    
    @JsonProperty("merchantIds")
    private List<Object> merchantIds;
    
    
    
    
    @JsonProperty("orderBy")
    private List<Object> orderBy;
    
    
    
    
}

/*
    Model: GetPolicyFilters2
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPolicyFilters2 {
    
    
    
    
    @JsonProperty("breType")
    private String breType;
    
    
    
    
    @JsonProperty("lenderId")
    private List<Object> lenderId;
    
    
    
    
    @JsonProperty("merchantId")
    private List<Object> merchantId;
    
    
    
    
    @JsonProperty("loanType")
    private String loanType;
    
    
    
    
    @JsonProperty("journeyType")
    private String journeyType;
    
    
    
    
    @JsonProperty("subType")
    private String subType;
    
    
    
    
}

/*
    Model: MerchantConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MerchantConfigRequest {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("merchantConfigSchema")
    private Object merchantConfigSchema;
    
    
    
    
}

/*
    Model: PanDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PanDetails {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("idNumber")
    private String idNumber;
    
    
    
    
}

/*
    Model: AvailableLendersRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailableLendersRequest {
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
}

/*
    Model: InitialData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InitialData {
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
}

/*
    Model: ExecutePolicyRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExecutePolicyRequest {
    
    
    
    
    @JsonProperty("policyFilters")
    private GetPolicyFilters policyFilters;
    
    
    
    
    @JsonProperty("initialData")
    private InitialData initialData;
    
    
    
    
}

/*
    Model: ExecutePolicyRequest2
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExecutePolicyRequest2 {
    
    
    
    
    @JsonProperty("policyFilters")
    private GetPolicyFilters2 policyFilters;
    
    
    
    
    @JsonProperty("initialData")
    private InitialData initialData;
    
    
    
    
}

/*
    Model: RegisterGstRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterGstRequest {
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("skipGst")
    private Boolean skipGst;
    
    
    
    
    @JsonProperty("onboardingToken")
    private String onboardingToken;
    
    
    
    
}

/*
    Model: PopulateFormRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PopulateFormRequest {
    
    
    
    
    @JsonProperty("form")
    private Object form;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
}

/*
    Model: ValidateFormFieldRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateFormFieldRequest {
    
    
    
    
    @JsonProperty("workflowName")
    private String workflowName;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("fields")
    private Object fields;
    
    
    
    
}

/*
    Model: MerchantMetricFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MerchantMetricFilter {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private List<Object> value;
    
    
    
    
    @JsonProperty("isSelected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("isActive")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: LenderCustomerMetricsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCustomerMetricsRequest {
    
    
    
    
    @JsonProperty("sort")
    private List<MerchantMetricFilter> sort;
    
    
    
    
    @JsonProperty("filters")
    private List<MerchantMetricFilter> filters;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("pivotPoints")
    private Double pivotPoints;
    
    
    
    
}

/*
    Model: StonewallCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StonewallCustomer {
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: GetLimitRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLimitRequest {
    
    
    
    
    @JsonProperty("lenderSlugs")
    private List<Object> lenderSlugs;
    
    
    
    
    @JsonProperty("onlyDefaultLender")
    private Boolean onlyDefaultLender;
    
    
    
    
    @JsonProperty("customer")
    private StonewallCustomer customer;
    
    
    
    
}

/*
    Model: DocumentObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentObject {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("detail")
    private Object detail;
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
}

/*
    Model: ManualKycRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManualKycRequest {
    
    
    
    
    @JsonProperty("remark")
    private Object remark;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("stepId")
    private String stepId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("documentData")
    private DocumentObject documentData;
    
    
    
    
}

/*
    Model: RetriggerLenderOnboardRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RetriggerLenderOnboardRequest {
    
    
    
    
    @JsonProperty("stepId")
    private String stepId;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: BusinessDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessDetail {
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("shopName")
    private String shopName;
    
    
    
    
    @JsonProperty("legalName")
    private String legalName;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
}

/*
    Model: DocumentObjects
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentObjects {
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("issuedOn")
    private String issuedOn;
    
    
    
    
    @JsonProperty("issuedAt")
    private String issuedAt;
    
    
    
    
    @JsonProperty("issuedBy")
    private String issuedBy;
    
    
    
    
    @JsonProperty("expiryOn")
    private String expiryOn;
    
    
    
    
}

/*
    Model: AddVintageRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddVintageRequest {
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("businessDetails")
    private BusinessDetail businessDetails;
    
    
    
    
    @JsonProperty("vintageData")
    private VintageData vintageData;
    
    
    
    
    @JsonProperty("documents")
    private DocumentObjects documents;
    
    
    
    
    @JsonProperty("merchant")
    private MerchantSchema merchant;
    
    
    
    
}

/*
    Model: KycCountByStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KycCountByStatus {
    
    
    
    
    @JsonProperty("startDate")
    private String startDate;
    
    
    
    
    @JsonProperty("endDate")
    private String endDate;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
}

/*
    Model: FindDocResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FindDocResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("details")
    private Object details;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: LenderKycStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderKycStatus {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("lenderName")
    private String lenderName;
    
    
    
    
    @JsonProperty("kycType")
    private String kycType;
    
    
    
    
}

/*
    Model: StateResponeDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StateResponeDto {
    
    
    
    
    @JsonProperty("step")
    private UserKycLenderStepMap step;
    
    
    
    
    @JsonProperty("isStepCompleted")
    private Boolean isStepCompleted;
    
    
    
    
}

/*
    Model: KycStateMachineDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KycStateMachineDto {
    
    
    
    
    @JsonProperty("kycResult")
    private UserKycDetail kycResult;
    
    
    
    
    @JsonProperty("action")
    private UserKycLenderStepMap action;
    
    
    
    
}

/*
    Model: InitiateKycDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InitiateKycDto {
    
    
    
    
    @JsonProperty("kycType")
    private String kycType;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("kycId")
    private String kycId;
    
    
    
    
    @JsonProperty("entityRelation")
    private EntityMapDto entityRelation;
    
    
    
    
}

/*
    Model: LenderOnboardDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderOnboardDto {
    
    
    
    
    @JsonProperty("lender")
    private Lender lender;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("userLenderDetail")
    private UserLender userLenderDetail;
    
    
    
    
    @JsonProperty("payload")
    private LenderOnboardRequest payload;
    
    
    
    
    @JsonProperty("entityRelation")
    private EntityMapDto entityRelation;
    
    
    
    
    @JsonProperty("ipAddress")
    private String ipAddress;
    
    
    
    
    @JsonProperty("overrideTtl")
    private Boolean overrideTtl;
    
    
    
    
}

/*
    Model: StepDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StepDetails {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("iconUrl")
    private String iconUrl;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("step")
    private String step;
    
    
    
    
    @JsonProperty("order")
    private Double order;
    
    
    
    
}

/*
    Model: OnboardStatusDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OnboardStatusDto {
    
    
    
    
    @JsonProperty("onboardStep")
    private String onboardStep;
    
    
    
    
    @JsonProperty("onboardingId")
    private String onboardingId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("actionStatus")
    private String actionStatus;
    
    
    
    
    @JsonProperty("lender")
    private Lender lender;
    
    
    
    
    @JsonProperty("navigation")
    private String navigation;
    
    
    
    
    @JsonProperty("approvedLimit")
    private Double approvedLimit;
    
    
    
    
    @JsonProperty("proposedLimit")
    private Double proposedLimit;
    
    
    
    
    @JsonProperty("actionData")
    private Object actionData;
    
    
    
    
    @JsonProperty("steps")
    private List<StepDetails> steps;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("actionIsForm")
    private Boolean actionIsForm;
    
    
    
    
    @JsonProperty("actionForm")
    private Form actionForm;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("actionName")
    private String actionName;
    
    
    
    
    @JsonProperty("actionDescription")
    private String actionDescription;
    
    
    
    
}

/*
    Model: LenderFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderFilters {
    
    
    
    
    @JsonProperty("includeStatus")
    private List<Object> includeStatus;
    
    
    
    
    @JsonProperty("excludeStatus")
    private List<Object> excludeStatus;
    
    
    
    
    @JsonProperty("allowDisabledLender")
    private Object allowDisabledLender;
    
    
    
    
}

/*
    Model: Policy
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Policy {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("type")
    private Object type;
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("workflowId")
    private String workflowId;
    
    
    
    
    @JsonProperty("schemaRef")
    private List<Object> schemaRef;
    
    
    
    
    @JsonProperty("masterVariableRef")
    private List<Object> masterVariableRef;
    
    
    
    
    @JsonProperty("customVariable")
    private Object customVariable;
    
    
    
    
    @JsonProperty("subType")
    private String subType;
    
    
    
    
    @JsonProperty("createdAt")
    private Object createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private Object updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private Object deletedAt;
    
    
    
    
}

/*
    Model: OrganizationLogosObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationLogosObject {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: MetricSubTypes
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricSubTypes {
    
    
    
    
    @JsonProperty("date")
    private String date;
    
    
    
    
    @JsonProperty("count")
    private String count;
    
    
    
    
    @JsonProperty("sum")
    private String sum;
    
    
    
    
}

/*
    Model: MetricTypes
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricTypes {
    
    
    
    
    @JsonProperty("pivots")
    private List<MetricSubTypes> pivots;
    
    
    
    
    @JsonProperty("total")
    private String total;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("valueFormat")
    private String valueFormat;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: BreApprovedUsersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BreApprovedUsersResponse {
    
    
    
    
    @JsonProperty("data")
    private MetricTypes data;
    
    
    
    
}

/*
    Model: Metrics
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Metrics {
    
    
    
    
    @JsonProperty("lenderApprovedUsers")
    private MetricTypes lenderApprovedUsers;
    
    
    
    
    @JsonProperty("breApprovedUsers")
    private MetricTypes breApprovedUsers;
    
    
    
    
    @JsonProperty("totalCreditLine")
    private MetricTypes totalCreditLine;
    
    
    
    
}

/*
    Model: MetricData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricData {
    
    
    
    
    @JsonProperty("metrics")
    private Metrics metrics;
    
    
    
    
    @JsonProperty("filters")
    private List<MerchantMetricFilter> filters;
    
    
    
    
    @JsonProperty("sort")
    private List<MerchantMetricFilter> sort;
    
    
    
    
}

/*
    Model: GetAllUserLendersByEnityId
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAllUserLendersByEnityId {
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("lender")
    private Lender lender;
    
    
    
    
    @JsonProperty("partnerId")
    private String partnerId;
    
    
    
    
    @JsonProperty("approvedLimit")
    private Double approvedLimit;
    
    
    
    
}

/*
    Model: ApprovedLenders
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApprovedLenders {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("lenders")
    private List<BreOutput> lenders;
    
    
    
    
}

/*
    Model: BreResultStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BreResultStatus {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("approvedLenders")
    private List<BreOutput> approvedLenders;
    
    
    
    
}

/*
    Model: LenderState
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderState {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("workflowName")
    private String workflowName;
    
    
    
    
    @JsonProperty("workflowUrl")
    private String workflowUrl;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("lender")
    private Lender lender;
    
    
    
    
    @JsonProperty("parentStateId")
    private String parentStateId;
    
    
    
    
    @JsonProperty("ttl")
    private Double ttl;
    
    
    
    
    @JsonProperty("displayName")
    private String displayName;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("iconUrl")
    private String iconUrl;
    
    
    
    
    @JsonProperty("isInteractive")
    private Boolean isInteractive;
    
    
    
    
    @JsonProperty("schema")
    private Object schema;
    
    
    
    
}

/*
    Model: UserLenderState
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserLenderState {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("lenderStateId")
    private String lenderStateId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("userLenderId")
    private String userLenderId;
    
    
    
    
    @JsonProperty("remark")
    private String remark;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("lenderState")
    private LenderState lenderState;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
    @JsonProperty("updatedBy")
    private String updatedBy;
    
    
    
    
}

/*
    Model: LenderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderConfig {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("baseUrl")
    private String baseUrl;
    
    
    
    
    @JsonProperty("accessToken")
    private String accessToken;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: Pg
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Pg {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: LenderPgConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderPgConfig {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("mid")
    private String mid;
    
    
    
    
    @JsonProperty("clientId")
    private String clientId;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("pgId")
    private String pgId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: FileUploadResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileUploadResponse {
    
    
    
    
    @JsonProperty("fileId")
    private String fileId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("size")
    private Double size;
    
    
    
    
    @JsonProperty("access")
    private String access;
    
    
    
    
    @JsonProperty("tags")
    private String tags;
    
    
    
    
    @JsonProperty("metadata")
    private String metadata;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("thumbnail")
    private String thumbnail;
    
    
    
    
}

/*
    Model: PresignedUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PresignedUrl {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("fields")
    private Object fields;
    
    
    
    
}

/*
    Model: PresignedUrlV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PresignedUrlV2 {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("fields")
    private Object fields;
    
    
    
    
}

/*
    Model: LenderDocument
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderDocument {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("document")
    private Object document;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: Commercial
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Commercial {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("commercial")
    private Object commercial;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
}

/*
    Model: KycStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KycStatusResponse {
    
    
    
    
    @JsonProperty("isKycInitiated")
    private Boolean isKycInitiated;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("kycStatuses")
    private List<LenderKycStatus> kycStatuses;
    
    
    
    
}

/*
    Model: WorkflowResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WorkflowResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: Action
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Action {
    
    
    
    
    @JsonProperty("step")
    private String step;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("index")
    private Double index;
    
    
    
    
    @JsonProperty("isForm")
    private Boolean isForm;
    
    
    
    
    @JsonProperty("form")
    private Form form;
    
    
    
    
}

/*
    Model: InitiateKycResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InitiateKycResponse {
    
    
    
    
    @JsonProperty("kycResult")
    private UserKycDetail kycResult;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: UploadDocResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadDocResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("remark")
    private String remark;
    
    
    
    
    @JsonProperty("reasons")
    private String reasons;
    
    
    
    
    @JsonProperty("kycResult")
    private UserKycDetail kycResult;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: LenderOnboardResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderOnboardResponse {
    
    
    
    
    @JsonProperty("result")
    private UserLender result;
    
    
    
    
    @JsonProperty("action")
    private UserLenderState action;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: OnboardingStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OnboardingStatusResponse {
    
    
    
    
    @JsonProperty("onboardStatuses")
    private List<OnboardStatusDto> onboardStatuses;
    
    
    
    
}

/*
    Model: SignedUrlResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedUrlResponse {
    
    
    
    
    @JsonProperty("signedUrl")
    private PresignedUrl signedUrl;
    
    
    
    
    @JsonProperty("fileUrl")
    private String fileUrl;
    
    
    
    
}

/*
    Model: SignedUrlV2Response
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedUrlV2Response {
    
    
    
    
    @JsonProperty("signedUrl")
    private PresignedUrlV2 signedUrl;
    
    
    
    
    @JsonProperty("fileUrl")
    private String fileUrl;
    
    
    
    
}

/*
    Model: PresignedUrlV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PresignedUrlV3 {
    
    
    
    
    @JsonProperty("signedUrl")
    private String signedUrl;
    
    
    
    
    @JsonProperty("provider")
    private Object provider;
    
    
    
    
}

/*
    Model: SignedUrlV3Response
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedUrlV3Response {
    
    
    
    
    @JsonProperty("signedDetails")
    private PresignedUrlV3 signedDetails;
    
    
    
    
    @JsonProperty("fileUrl")
    private String fileUrl;
    
    
    
    
}

/*
    Model: DigilockerLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DigilockerLinkResponse {
    
    
    
    
    @JsonProperty("authorizationUrl")
    private String authorizationUrl;
    
    
    
    
}

/*
    Model: GetDocumentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetDocumentsResponse {
    
    
    
    
    @JsonProperty("documents")
    private List<FindDocResponse> documents;
    
    
    
    
}

/*
    Model: ApprovedLendersTransaction
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApprovedLendersTransaction {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("proposedLimit")
    private Double proposedLimit;
    
    
    
    
    @JsonProperty("createdAt")
    private Object createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private Object updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private Object deletedAt;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: ApprovedPossibleLenders
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApprovedPossibleLenders {
    
    
    
    
    @JsonProperty("limit")
    private Double limit;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("theme")
    private Object theme;
    
    
    
    
}

/*
    Model: AvailableLenders
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailableLenders {
    
    
    
    
    @JsonProperty("approvedLenders")
    private List<ApprovedPossibleLenders> approvedLenders;
    
    
    
    
    @JsonProperty("possibleLenders")
    private List<ApprovedPossibleLenders> possibleLenders;
    
    
    
    
}

/*
    Model: CreditLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditLimit {
    
    
    
    
    @JsonProperty("availableLimit")
    private Double availableLimit;
    
    
    
    
    @JsonProperty("approvedLimit")
    private Double approvedLimit;
    
    
    
    
}

/*
    Model: CreditLimitResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditLimitResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("action")
    private Boolean action;
    
    
    
    
    @JsonProperty("credit")
    private CreditLimit credit;
    
    
    
    
}

/*
    Model: LenderPgConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderPgConfigResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("mid")
    private String mid;
    
    
    
    
    @JsonProperty("clientId")
    private String clientId;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("pgId")
    private String pgId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("pgName")
    private String pgName;
    
    
    
    
    @JsonProperty("pgActive")
    private Boolean pgActive;
    
    
    
    
}

/*
    Model: GetLendersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLendersResponse {
    
    
    
    
    @JsonProperty("data")
    private List<Lender> data;
    
    
    
    
}

/*
    Model: LenderConfigurationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderConfigurationResponse {
    
    
    
    
    @JsonProperty("lender")
    private Lender lender;
    
    
    
    
    @JsonProperty("lenderPgConfig")
    private LenderPgConfig lenderPgConfig;
    
    
    
    
    @JsonProperty("lenderConfig")
    private LenderConfig lenderConfig;
    
    
    
    
    @JsonProperty("lenderState")
    private List<LenderState> lenderState;
    
    
    
    
    @JsonProperty("lenderKycStepMap")
    private List<LenderKycStepMap> lenderKycStepMap;
    
    
    
    
}

/*
    Model: UpsertLenderResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpsertLenderResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: UpsertLenderConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpsertLenderConfigResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: CreateKycStepsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateKycStepsSchema {
    
    
    
    
    @JsonProperty("data")
    private List<LenderKycStepMap> data;
    
    
    
    
}

/*
    Model: CreatePaymentGatewaySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatePaymentGatewaySchema {
    
    
    
    
    @JsonProperty("data")
    private List<LenderPgConfig> data;
    
    
    
    
}

/*
    Model: CreateLenderStateSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateLenderStateSchema {
    
    
    
    
    @JsonProperty("data")
    private List<LenderState> data;
    
    
    
    
}

/*
    Model: GetAllPaymentGatewaysSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAllPaymentGatewaysSchema {
    
    
    
    
    @JsonProperty("data")
    private List<Pg> data;
    
    
    
    
}

/*
    Model: PolicyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PolicyResponse {
    
    
    
    
    @JsonProperty("policies")
    private List<Policy> policies;
    
    
    
    
}

/*
    Model: CreditCheckBreResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditCheckBreResponse {
    
    
    
    
    @JsonProperty("newLenderAssigned")
    private Boolean newLenderAssigned;
    
    
    
    
    @JsonProperty("breStatus")
    private String breStatus;
    
    
    
    
}

/*
    Model: MerchantConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MerchantConfigResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("merhantConfigSchema")
    private String merhantConfigSchema;
    
    
    
    
}

/*
    Model: UserLenderByIdAndStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserLenderByIdAndStatusResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("approvedLimit")
    private Double approvedLimit;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("theme")
    private Object theme;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
}

/*
    Model: IntgrAvailableCreditLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntgrAvailableCreditLimit {
    
    
    
    
    @JsonProperty("limit")
    private Double limit;
    
    
    
    
    @JsonProperty("lenderName")
    private String lenderName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("logoUrl")
    private String logoUrl;
    
    
    
    
}

/*
    Model: IngtrAvailableLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IngtrAvailableLimit {
    
    
    
    
    @JsonProperty("available")
    private List<IntgrAvailableCreditLimit> available;
    
    
    
    
    @JsonProperty("possible")
    private List<IntgrAvailableCreditLimit> possible;
    
    
    
    
}

/*
    Model: IntgrCreditLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntgrCreditLimit {
    
    
    
    
    @JsonProperty("limit")
    private IngtrAvailableLimit limit;
    
    
    
    
}

/*
    Model: PossibleLendersInternal
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PossibleLendersInternal {
    
    
    
    
    @JsonProperty("limit")
    private Boolean limit;
    
    
    
    
    @JsonProperty("lenderName")
    private String lenderName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("isDefault")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
}

/*
    Model: PossibleLendersInternalResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PossibleLendersInternalResponse {
    
    
    
    
    @JsonProperty("lenders")
    private List<PossibleLendersInternal> lenders;
    
    
    
    
}

/*
    Model: GetTotalKycResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetTotalKycResponse {
    
    
    
    
    @JsonProperty("totalKyc")
    private String totalKyc;
    
    
    
    
}

/*
    Model: GetTotalKycCompletedUsersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetTotalKycCompletedUsersResponse {
    
    
    
    
    @JsonProperty("totalKycCompletedUsers")
    private String totalKycCompletedUsers;
    
    
    
    
}

/*
    Model: GetTotalPendingUsersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetTotalPendingUsersResponse {
    
    
    
    
    @JsonProperty("totalPendingKyc")
    private String totalPendingKyc;
    
    
    
    
}

/*
    Model: GetTotalCreditProvidedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetTotalCreditProvidedResponse {
    
    
    
    
    @JsonProperty("totalCreditLimit")
    private String totalCreditLimit;
    
    
    
    
}

/*
    Model: MetaSchemaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaSchemaResponse {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("required")
    private List<String> required;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("properties")
    private Object properties;
    
    
    
    
}

/*
    Model: MetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaSchema {
    
    
    
    
    @JsonProperty("metaSchema")
    private MetaSchemaResponse metaSchema;
    
    
    
    
}

/*
    Model: AddMetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddMetaSchema {
    
    
    
    
    @JsonProperty("lenderSlug")
    private String lenderSlug;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("schema")
    private Object schema;
    
    
    
    
}

/*
    Model: AddMetaSchemaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddMetaSchemaRequest {
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("schema")
    private Object schema;
    
    
    
    
}

/*
    Model: ValidatePanResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidatePanResponse {
    
    
    
    
    @JsonProperty("panName")
    private String panName;
    
    
    
    
    @JsonProperty("isPanValid")
    private String isPanValid;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("isProprietor")
    private Boolean isProprietor;
    
    
    
    
    @JsonProperty("panType")
    private String panType;
    
    
    
    
    @JsonProperty("errorCode")
    private String errorCode;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("errorMessage")
    private String errorMessage;
    
    
    
    
}

/*
    Model: ConfirmPanResonse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfirmPanResonse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("statusCode")
    private String statusCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: LenderCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCountResponse {
    
    
    
    
    @JsonProperty("active")
    private Double active;
    
    
    
    
    @JsonProperty("inActive")
    private Double inActive;
    
    
    
    
}

/*
    Model: OnboardStepsDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OnboardStepsDto {
    
    
    
    
    @JsonProperty("steps")
    private List<StepDetails> steps;
    
    
    
    
    @JsonProperty("lender")
    private Lender lender;
    
    
    
    
}

/*
    Model: OnboardStepsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OnboardStepsResponse {
    
    
    
    
    @JsonProperty("stepDetails")
    private List<OnboardStepsDto> stepDetails;
    
    
    
    
}

/*
    Model: LenderDocumentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderDocumentResponse {
    
    
    
    
    @JsonProperty("data")
    private LenderDocument data;
    
    
    
    
}

/*
    Model: GetUserLendersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetUserLendersResponse {
    
    
    
    
    @JsonProperty("data")
    private List<UserLender> data;
    
    
    
    
}

/*
    Model: CreditReportResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditReportResponse {
    
    
    
    
    @JsonProperty("data")
    private SourceCreditReport data;
    
    
    
    
}

/*
    Model: KycDetailsReponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KycDetailsReponse {
    
    
    
    
    @JsonProperty("data")
    private UserKycLenderStepMap data;
    
    
    
    
}

/*
    Model: GetDocumentByIdResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetDocumentByIdResponse {
    
    
    
    
    @JsonProperty("data")
    private Document data;
    
    
    
    
}

/*
    Model: GetAllFormsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAllFormsResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: UpsertFormResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpsertFormResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: GstDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GstDetails {
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("businessName")
    private String businessName;
    
    
    
    
}

/*
    Model: GstDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GstDetailsResponse {
    
    
    
    
    @JsonProperty("gstDetails")
    private List<GstDetails> gstDetails;
    
    
    
    
}

/*
    Model: RegisterGstResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterGstResponse {
    
    
    
    
    @JsonProperty("gstDocDetails")
    private Document gstDocDetails;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: PopulateFormResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PopulateFormResponse {
    
    
    
    
    @JsonProperty("form")
    private Object form;
    
    
    
    
}

/*
    Model: ValidateFormFieldResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateFormFieldResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: LenderCustomerMetricsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderCustomerMetricsResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private MetricData data;
    
    
    
    
}

/*
    Model: BreOutput
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BreOutput {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("entityId")
    private String entityId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("policyName")
    private String policyName;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("output")
    private Object output;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: ManualKycResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManualKycResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("step")
    private UserKycLenderStepMap step;
    
    
    
    
}

/*
    Model: CustomerKycDetailsReponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerKycDetailsReponse {
    
    
    
    
    @JsonProperty("data")
    private UserKycLenderStepMap data;
    
    
    
    
}

/*
    Model: PlatformFees
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformFees {
    
    
    
    
    @JsonProperty("customerAcquisitionFee")
    private Double customerAcquisitionFee;
    
    
    
    
    @JsonProperty("transactionFee")
    private Double transactionFee;
    
    
    
    
}

/*
    Model: CommercialResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommercialResponse {
    
    
    
    
    @JsonProperty("data")
    private Commercial data;
    
    
    
    
}




/*
    Model: BlockUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlockUserRequestSchema {
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("userid")
    private List<String> userid;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
}

/*
    Model: EditEmailRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditEmailRequestSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendVerificationLinkMobileRequestSchema {
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
}

/*
    Model: EditMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditMobileRequestSchema {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
}

/*
    Model: UpdateEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateEmail {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("additionalProperties")
    private Object additionalProperties;
    
    
    
    
}

/*
    Model: EditProfileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditProfileRequestSchema {
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("registrationToken")
    private String registrationToken;
    
    
    
    
}

/*
    Model: EditProfileMobileSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditProfileMobileSchema {
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
}

/*
    Model: SendEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendEmailOtpRequestSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("registerToken")
    private String registerToken;
    
    
    
    
}

/*
    Model: VerifyEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyEmailOtpRequestSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("registerToken")
    private String registerToken;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
}

/*
    Model: ReSendMobileOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReSendMobileOtpRequestSchema {
    
    
    
    
    @JsonProperty("captchaCode")
    private String captchaCode;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("androidHash")
    private String androidHash;
    
    
    
    
}

/*
    Model: ResetPasswordSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResetPasswordSuccess {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: RegisterFormSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterFormSuccess {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("resendTimer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resendToken")
    private String resendToken;
    
    
    
    
    @JsonProperty("resendEmailToken")
    private String resendEmailToken;
    
    
    
    
    @JsonProperty("registerToken")
    private String registerToken;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("requestId")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("verifyEmailOtp")
    private Boolean verifyEmailOtp;
    
    
    
    
    @JsonProperty("verifyMobileOtp")
    private Boolean verifyMobileOtp;
    
    
    
    
    @JsonProperty("userExists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: VerifyEmailSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyEmailSuccess {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BlockUserSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlockUserSuccess {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: EmailOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailOtpSuccess {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: VerifyEmailOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyEmailOTPSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("verifyEmailLink")
    private Boolean verifyEmailLink;
    
    
    
    
}

/*
    Model: SendMobileVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendMobileVerifyLinkSuccess {
    
    
    
    
    @JsonProperty("verifyMobileLink")
    private Boolean verifyMobileLink;
    
    
    
    
}

/*
    Model: SendEmailVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendEmailVerifyLinkSuccess {
    
    
    
    
    @JsonProperty("verifyEmailLink")
    private Boolean verifyEmailLink;
    
    
    
    
}

/*
    Model: UserSearchResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSearchResponseSchema {
    
    
    
    
    @JsonProperty("users")
    private List<UserSchema> users;
    
    
    
    
}

/*
    Model: CustomerListResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerListResponseSchema {
    
    
    
    
    @JsonProperty("items")
    private List<UserSchema> items;
    
    
    
    
    @JsonProperty("page")
    private PaginationSchema page;
    
    
    
    
}

/*
    Model: PaginationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaginationSchema {
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("itemTotal")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("hasNext")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
}

/*
    Model: UserObjectSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserObjectSchema {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: CreateOrganization
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrganization {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("website")
    private String website;
    
    
    
    
    @JsonProperty("disbursementAccountHolderName")
    private String disbursementAccountHolderName;
    
    
    
    
    @JsonProperty("disbursementAccountNumber")
    private String disbursementAccountNumber;
    
    
    
    
    @JsonProperty("disbursementIfsc")
    private String disbursementIfsc;
    
    
    
    
    @JsonProperty("businessName")
    private String businessName;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("businessAddress")
    private String businessAddress;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("b2b")
    private Boolean b2B;
    
    
    
    
    @JsonProperty("b2c")
    private Boolean b2C;
    
    
    
    
    @JsonProperty("docType")
    private String docType;
    
    
    
    
    @JsonProperty("docNumber")
    private String docNumber;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
}

/*
    Model: UpdateLogo
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateLogo {
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: AddMetaSchemaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddMetaSchemaResponse {
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("mid")
    private String mid;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: UpdateOrganization
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateOrganization {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("logo")
    private Object logo;
    
    
    
    
    @JsonProperty("website")
    private Object website;
    
    
    
    
    @JsonProperty("disbursementAccountHolderName")
    private Object disbursementAccountHolderName;
    
    
    
    
    @JsonProperty("disbursementAccountNumber")
    private Object disbursementAccountNumber;
    
    
    
    
    @JsonProperty("disbursementIfsc")
    private Object disbursementIfsc;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: UpdateFinancials
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateFinancials {
    
    
    
    
    @JsonProperty("disbursementAccountHolderName")
    private String disbursementAccountHolderName;
    
    
    
    
    @JsonProperty("disbursementAccountNumber")
    private String disbursementAccountNumber;
    
    
    
    
    @JsonProperty("disbursementIfsc")
    private String disbursementIfsc;
    
    
    
    
}

/*
    Model: Documents
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Documents {
    
    
    
    
    @JsonProperty("docType")
    private String docType;
    
    
    
    
    @JsonProperty("docNumber")
    private String docNumber;
    
    
    
    
}

/*
    Model: FinancialDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FinancialDetails {
    
    
    
    
    @JsonProperty("disbursementAccountHolderName")
    private String disbursementAccountHolderName;
    
    
    
    
    @JsonProperty("disbursementAccountNumber")
    private String disbursementAccountNumber;
    
    
    
    
    @JsonProperty("disbursementIfsc")
    private String disbursementIfsc;
    
    
    
    
    @JsonProperty("b2b")
    private Boolean b2B;
    
    
    
    
    @JsonProperty("b2c")
    private Boolean b2C;
    
    
    
    
    @JsonProperty("businessName")
    private String businessName;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("businessAddress")
    private String businessAddress;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("documents")
    private List<Documents> documents;
    
    
    
    
}

/*
    Model: GetOrganization
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOrganization {
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("isAdmin")
    private Boolean isAdmin;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("isActive")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: OrganizationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationDetails {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("isAdmin")
    private Boolean isAdmin;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("isActive")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("website")
    private String website;
    
    
    
    
    @JsonProperty("disbursementAccountHolderName")
    private String disbursementAccountHolderName;
    
    
    
    
    @JsonProperty("disbursementAccountNumber")
    private String disbursementAccountNumber;
    
    
    
    
    @JsonProperty("disbursementIfsc")
    private String disbursementIfsc;
    
    
    
    
}

/*
    Model: Organization
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Organization {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: OrganizationList
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationList {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("id")
    private Boolean id;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("isActive")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("epikId")
    private String epikId;
    
    
    
    
    @JsonProperty("website")
    private String website;
    
    
    
    
    @JsonProperty("disbursementAccountHolderName")
    private String disbursementAccountHolderName;
    
    
    
    
    @JsonProperty("disbursementAccountNumber")
    private String disbursementAccountNumber;
    
    
    
    
    @JsonProperty("disbursementIfsc")
    private String disbursementIfsc;
    
    
    
    
}

/*
    Model: OrganizationCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationCount {
    
    
    
    
    @JsonProperty("count")
    private String count;
    
    
    
    
}

/*
    Model: TeamMembers
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TeamMembers {
    
    
    
    
    @JsonProperty("members")
    private List<Member> members;
    
    
    
    
}

/*
    Model: Member
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Member {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("isAdmin")
    private Boolean isAdmin;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
    @JsonProperty("profile")
    private Profile profile;
    
    
    
    
}

/*
    Model: Profile
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Profile {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("isAdmin")
    private Boolean isAdmin;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: AddTeamMember
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddTeamMember {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("userIsAdmin")
    private Boolean userIsAdmin;
    
    
    
    
}

/*
    Model: UpdateTeamMemberRole
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateTeamMemberRole {
    
    
    
    
    @JsonProperty("userIsAdmin")
    private Boolean userIsAdmin;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
}

/*
    Model: RemoveTeamMemberResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RemoveTeamMemberResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: AddTeamMemberResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddTeamMemberResponse {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("userId")
    private String userId;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("isAdmin")
    private Boolean isAdmin;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("deletedAt")
    private String deletedAt;
    
    
    
    
}

/*
    Model: ApiKey
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApiKey {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
}

/*
    Model: UpdateApiHook
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateApiHook {
    
    
    
    
    @JsonProperty("apiKey")
    private String apiKey;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("customHeaders")
    private Object customHeaders;
    
    
    
    
}

/*
    Model: ApiHookDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApiHookDetails {
    
    
    
    
    @JsonProperty("apiKey")
    private String apiKey;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("customHeaders")
    private Object customHeaders;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
}

/*
    Model: UpdateApiHookResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateApiHookResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: OrganizationIp
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationIp {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("ip")
    private String ip;
    
    
    
    
}

/*
    Model: AddOrganizationIpDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddOrganizationIpDetails {
    
    
    
    
    @JsonProperty("organizationIps")
    private List<OrganizationIp> organizationIps;
    
    
    
    
    @JsonProperty("delete")
    private String delete;
    
    
    
    
}

/*
    Model: AddUpdateCsvFileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddUpdateCsvFileResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AddUpdateCsvFileRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddUpdateCsvFileRequest {
    
    
    
    
    @JsonProperty("csv")
    private String csv;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
}

/*
    Model: CsvFile
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CsvFile {
    
    
    
    
    @JsonProperty("csv")
    private String csv;
    
    
    
    
}

/*
    Model: AddReportCsvFileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddReportCsvFileResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AddReportCsvFileRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddReportCsvFileRequest {
    
    
    
    
    @JsonProperty("csv")
    private String csv;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ReportCsvFileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReportCsvFileResponse {
    
    
    
    
    @JsonProperty("csv")
    private String csv;
    
    
    
    
}

/*
    Model: AddReportRequestArray
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddReportRequestArray {
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("shopName")
    private String shopName;
    
    
    
    
    @JsonProperty("legalName")
    private String legalName;
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("middleName")
    private String middleName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("aadhaar")
    private String aadhaar;
    
    
    
    
    @JsonProperty("nameOnPan")
    private String nameOnPan;
    
    
    
    
    @JsonProperty("gstNumber")
    private String gstNumber;
    
    
    
    
    @JsonProperty("gstBusinessName")
    private String gstBusinessName;
    
    
    
    
    @JsonProperty("panNumber")
    private String panNumber;
    
    
    
    
    @JsonProperty("udyam")
    private String udyam;
    
    
    
    
    @JsonProperty("ownershipType")
    private String ownershipType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("license1Type")
    private String license1Type;
    
    
    
    
    @JsonProperty("license1")
    private String license1;
    
    
    
    
    @JsonProperty("license2Type")
    private String license2Type;
    
    
    
    
    @JsonProperty("license2")
    private String license2;
    
    
    
    
}

/*
    Model: AddReportRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddReportRequest {
    
    
    
    
    @JsonProperty("businessDetails")
    private List<Object> businessDetails;
    
    
    
    
}

/*
    Model: AddReportResponseArray
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddReportResponseArray {
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("anchorId")
    private String anchorId;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("shopName")
    private String shopName;
    
    
    
    
    @JsonProperty("legalName")
    private String legalName;
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("middleName")
    private String middleName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("aadhaar")
    private String aadhaar;
    
    
    
    
    @JsonProperty("nameOnPan")
    private String nameOnPan;
    
    
    
    
    @JsonProperty("gstNumber")
    private String gstNumber;
    
    
    
    
    @JsonProperty("gstBusinessName")
    private String gstBusinessName;
    
    
    
    
    @JsonProperty("panNumber")
    private String panNumber;
    
    
    
    
    @JsonProperty("udyam")
    private String udyam;
    
    
    
    
    @JsonProperty("ownershipType")
    private String ownershipType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("license1Type")
    private String license1Type;
    
    
    
    
    @JsonProperty("license1")
    private String license1;
    
    
    
    
    @JsonProperty("license2Type")
    private String license2Type;
    
    
    
    
    @JsonProperty("license2")
    private String license2;
    
    
    
    
}

/*
    Model: AddReportResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddReportResponse {
    
    
    
    
    @JsonProperty("businessDetails")
    private List<AddReportResponseArray> businessDetails;
    
    
    
    
}

/*
    Model: VintageDataResponseObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VintageDataResponseObject {
    
    
    
    
    @JsonProperty("month")
    private String month;
    
    
    
    
    @JsonProperty("year")
    private Integer year;
    
    
    
    
    @JsonProperty("revenue")
    private String revenue;
    
    
    
    
    @JsonProperty("businessId")
    private String businessId;
    
    
    
    
    @JsonProperty("createdBy")
    private String createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedBy")
    private String updatedBy;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
}

/*
    Model: VintageDataResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VintageDataResponse {
    
    
    
    
    @JsonProperty("vintageData")
    private List<VintageDataResponseObject> vintageData;
    
    
    
    
}

/*
    Model: AddSkuRequestArray
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddSkuRequestArray {
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("productName")
    private String productName;
    
    
    
    
    @JsonProperty("creditPurchaseOptionFlag")
    private String creditPurchaseOptionFlag;
    
    
    
    
    @JsonProperty("effectiveDates")
    private String effectiveDates;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
}

/*
    Model: AddSkuRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddSkuRequest {
    
    
    
    
    @JsonProperty("skuDetails")
    private List<AddSkuRequestArray> skuDetails;
    
    
    
    
}

/*
    Model: AddSkuResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddSkuResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: RestrictedSkuSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RestrictedSkuSchema {
    
    
    
    
    @JsonProperty("skuDetails")
    private List<Object> skuDetails;
    
    
    
    
}

/*
    Model: OrganizationIpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationIpResponse {
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("ip")
    private String ip;
    
    
    
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    
    
    
    @JsonProperty("updatedAt")
    private String updatedAt;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: OrganizationIpDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationIpDetails {
    
    
    
    
    @JsonProperty("organizationIps")
    private List<OrganizationIpResponse> organizationIps;
    
    
    
    
}

/*
    Model: RefundSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundSuccess {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private Double message;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("refundId")
    private String refundId;
    
    
    
    
}

/*
    Model: RefundItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundItem {
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
}

/*
    Model: ValidateCredentialsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCredentialsData {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("organizationId")
    private String organizationId;
    
    
    
    
    @JsonProperty("organizationName")
    private String organizationName;
    
    
    
    
}

/*
    Model: ValidateCredentialsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCredentialsResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private IntegrationResponseMeta meta;
    
    
    
    
    @JsonProperty("data")
    private ValidateCredentialsData data;
    
    
    
    
}

/*
    Model: PaymentLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentLinkResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("paymentLink")
    private String paymentLink;
    
    
    
    
}

/*
    Model: ApplicationCutomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationCutomer {
    
    
    
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: GeoLocation
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoLocation {
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
}

/*
    Model: Address
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Address {
    
    
    
    
    @JsonProperty("line1")
    private String line1;
    
    
    
    
    @JsonProperty("line2")
    private String line2;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("geoLocation")
    private GeoLocation geoLocation;
    
    
    
    
}

/*
    Model: OrderItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderItems {
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
}

/*
    Model: PaymentLinkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentLinkRequest {
    
    
    
    
    @JsonProperty("autoCapture")
    private Boolean autoCapture;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("emiTenure")
    private Double emiTenure;
    
    
    
    
    @JsonProperty("customer")
    private ApplicationCutomer customer;
    
    
    
    
    @JsonProperty("order")
    private Order order;
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
}

/*
    Model: UpdateLenderStatusSchemaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateLenderStatusSchemaRequest {
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
    
}

/*
    Model: UpdateLenderStatusSchemaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateLenderStatusSchemaResponse {
    
    
    
    
    @JsonProperty("merchantId")
    private String merchantId;
    
    
    
    
    @JsonProperty("lenderId")
    private String lenderId;
    
    
    
    
    @JsonProperty("mid")
    private String mid;
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: LenderTheme
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderTheme {
    
    
    
    
    @JsonProperty("iconUrl")
    private String iconUrl;
    
    
    
    
    @JsonProperty("logoUrl")
    private String logoUrl;
    
    
    
    
}

/*
    Model: LenderDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LenderDetails {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("theme")
    private LenderTheme theme;
    
    
    
    
}

/*
    Model: OutstandingData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingData {
    
    
    
    
    @JsonProperty("lenderDetails")
    private LenderDetails lenderDetails;
    
    
    
    
    @JsonProperty("availableLimit")
    private Double availableLimit;
    
    
    
    
    @JsonProperty("creditLimit")
    private Double creditLimit;
    
    
    
    
    @JsonProperty("dueAmount")
    private Double dueAmount;
    
    
    
    
    @JsonProperty("outstandingAmount")
    private Double outstandingAmount;
    
    
    
    
    @JsonProperty("dueDate")
    private String dueDate;
    
    
    
    
}

/*
    Model: OutstandingDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingDetailsResponse {
    
    
    
    
    @JsonProperty("outstandingDetails")
    private List<OutstandingData> outstandingDetails;
    
    
    
    
}

/*
    Model: CreateUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUserRequestSchema {
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("firstName")
    private String firstName;
    
    
    
    
    @JsonProperty("lastName")
    private String lastName;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
}

/*
    Model: CreateUserResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUserResponseSchema {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}




/*
    Model: RepaymentUsingNetbanking
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentUsingNetbanking {
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("bankId")
    private String bankId;
    
    
    
    
    @JsonProperty("bankName")
    private String bankName;
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
}

/*
    Model: RepaymentUsingNetbankingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentUsingNetbankingResponse {
    
    
    
    
    @JsonProperty("form")
    private String form;
    
    
    
    
    @JsonProperty("isDifferent")
    private Boolean isDifferent;
    
    
    
    
    @JsonProperty("outstanding")
    private String outstanding;
    
    
    
    
}

/*
    Model: RepaymentUsingUPI
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentUsingUPI {
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("chargeToken")
    private String chargeToken;
    
    
    
    
}

/*
    Model: RepaymentUsingUPIResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentUsingUPIResponse {
    
    
    
    
    @JsonProperty("isDifferent")
    private Boolean isDifferent;
    
    
    
    
    @JsonProperty("outstanding")
    private String outstanding;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("intentId")
    private String intentId;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("expiry")
    private Double expiry;
    
    
    
    
    @JsonProperty("interval")
    private Double interval;
    
    
    
    
}

/*
    Model: RegisterUPIMandateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterUPIMandateRequest {
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
}

/*
    Model: RegisterUPIMandateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterUPIMandateResponse {
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
    @JsonProperty("expiry")
    private Double expiry;
    
    
    
    
    @JsonProperty("interval")
    private Double interval;
    
    
    
    
}

/*
    Model: RegisterUPIMandateStatusCheckRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterUPIMandateStatusCheckRequest {
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
}

/*
    Model: RegisterMandateStatusCheckResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterMandateStatusCheckResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: TransactionStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionStatusRequest {
    
    
    
    
    @JsonProperty("intentId")
    private String intentId;
    
    
    
    
    @JsonProperty("transactionId")
    private String transactionId;
    
    
    
    
}

/*
    Model: TransactionStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionStatusResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("methodType")
    private String methodType;
    
    
    
    
    @JsonProperty("methodSubType")
    private String methodSubType;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: BankList
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BankList {
    
    
    
    
    @JsonProperty("bankId")
    private String bankId;
    
    
    
    
    @JsonProperty("bankName")
    private String bankName;
    
    
    
    
    @JsonProperty("rank")
    private Double rank;
    
    
    
    
    @JsonProperty("popular")
    private Boolean popular;
    
    
    
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    
    
    
}

/*
    Model: PaymentsObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentsObject {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("options")
    private List<PaymentOptions> options;
    
    
    
    
}

/*
    Model: OutstandingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingDetail {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("action")
    private Boolean action;
    
    
    
    
    @JsonProperty("message")
    private OutstandingMessage message;
    
    
    
    
    @JsonProperty("credit")
    private UserCredit credit;
    
    
    
    
    @JsonProperty("dueSummary")
    private DueSummaryOutstanding dueSummary;
    
    
    
    
    @JsonProperty("outstandingSummary")
    private OutstandingSummary outstandingSummary;
    
    
    
    
    @JsonProperty("entityMapId")
    private String entityMapId;
    
    
    
    
}

/*
    Model: OutstandingSummary
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingSummary {
    
    
    
    
    @JsonProperty("totalOutstanding")
    private Double totalOutstanding;
    
    
    
    
    @JsonProperty("totalOutstandingWithInterest")
    private Double totalOutstandingWithInterest;
    
    
    
    
    @JsonProperty("totalOutstandingPenalty")
    private Double totalOutstandingPenalty;
    
    
    
    
    @JsonProperty("availableLimit")
    private Double availableLimit;
    
    
    
    
    @JsonProperty("isOverdue")
    private Boolean isOverdue;
    
    
    
    
    @JsonProperty("dueFromDate")
    private String dueFromDate;
    
    
    
    
    @JsonProperty("repaymentSummary")
    private List<RepaymentSummaryOutstanding> repaymentSummary;
    
    
    
    
}

/*
    Model: DueSummaryOutstanding
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DueSummaryOutstanding {
    
    
    
    
    @JsonProperty("dueDate")
    private String dueDate;
    
    
    
    
    @JsonProperty("totalDue")
    private Double totalDue;
    
    
    
    
    @JsonProperty("totalDueWithInterest")
    private Double totalDueWithInterest;
    
    
    
    
    @JsonProperty("totalDuePenalty")
    private Double totalDuePenalty;
    
    
    
    
    @JsonProperty("dueTransactions")
    private List<DueTransactionsOutstanding> dueTransactions;
    
    
    
    
    @JsonProperty("minAmntDue")
    private Double minAmntDue;
    
    
    
    
}

/*
    Model: OutstandingMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingMessage {
    
    
    
    
    @JsonProperty("dueMessage")
    private String dueMessage;
    
    
    
    
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    
    
    
    
    @JsonProperty("textColor")
    private String textColor;
    
    
    
    
    @JsonProperty("isFlexiRepayEnabled")
    private Boolean isFlexiRepayEnabled;
    
    
    
    
}

/*
    Model: UserCredit
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserCredit {
    
    
    
    
    @JsonProperty("availableLimit")
    private Double availableLimit;
    
    
    
    
    @JsonProperty("approvedLimit")
    private Double approvedLimit;
    
    
    
    
    @JsonProperty("isEligibleToDrawdown")
    private Boolean isEligibleToDrawdown;
    
    
    
    
}

/*
    Model: DueTransactionsOutstanding
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DueTransactionsOutstanding {
    
    
    
    
    @JsonProperty("loanRequestNo")
    private String loanRequestNo;
    
    
    
    
    @JsonProperty("merchantCategory")
    private String merchantCategory;
    
    
    
    
    @JsonProperty("installmentAmountWithInterest")
    private Double installmentAmountWithInterest;
    
    
    
    
    @JsonProperty("installmentAmount")
    private Double installmentAmount;
    
    
    
    
    @JsonProperty("dueAmount")
    private Double dueAmount;
    
    
    
    
    @JsonProperty("loanType")
    private String loanType;
    
    
    
    
    @JsonProperty("installmentNo")
    private String installmentNo;
    
    
    
    
    @JsonProperty("installmentDueDate")
    private String installmentDueDate;
    
    
    
    
    @JsonProperty("isPastDue")
    private Boolean isPastDue;
    
    
    
    
    @JsonProperty("isPenaltyCharged")
    private Boolean isPenaltyCharged;
    
    
    
    
    @JsonProperty("penaltyAmount")
    private Double penaltyAmount;
    
    
    
    
    @JsonProperty("noOfDaysPenaltyCharged")
    private Integer noOfDaysPenaltyCharged;
    
    
    
    
    @JsonProperty("daysDifference")
    private Integer daysDifference;
    
    
    
    
    @JsonProperty("lenderTransactionId")
    private String lenderTransactionId;
    
    
    
    
}

/*
    Model: RepaymentSummaryOutstanding
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RepaymentSummaryOutstanding {
    
    
    
    
    @JsonProperty("loanRequestNo")
    private String loanRequestNo;
    
    
    
    
    @JsonProperty("loanType")
    private String loanType;
    
    
    
    
    @JsonProperty("merchantCategory")
    private String merchantCategory;
    
    
    
    
    @JsonProperty("isBbillingTransaction")
    private Boolean isBbillingTransaction;
    
    
    
    
    @JsonProperty("totalInstallmentAmount")
    private Integer totalInstallmentAmount;
    
    
    
    
    @JsonProperty("totalInstallmentAmountWithInterest")
    private Integer totalInstallmentAmountWithInterest;
    
    
    
    
    @JsonProperty("outstandingDetails")
    private List<OutstandingDetailsRepayment> outstandingDetails;
    
    
    
    
}

/*
    Model: OutstandingDetailsRepayment
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingDetailsRepayment {
    
    
    
    
    @JsonProperty("installmentAmountWithInterest")
    private Double installmentAmountWithInterest;
    
    
    
    
    @JsonProperty("installmentAmount")
    private Double installmentAmount;
    
    
    
    
    @JsonProperty("dueAmount")
    private Double dueAmount;
    
    
    
    
    @JsonProperty("installmentNo")
    private String installmentNo;
    
    
    
    
    @JsonProperty("installmentDueDate")
    private String installmentDueDate;
    
    
    
    
    @JsonProperty("isPastDue")
    private Boolean isPastDue;
    
    
    
    
    @JsonProperty("loanType")
    private String loanType;
    
    
    
    
    @JsonProperty("isPenaltyCharged")
    private Boolean isPenaltyCharged;
    
    
    
    
    @JsonProperty("penaltyAmount")
    private Integer penaltyAmount;
    
    
    
    
    @JsonProperty("noOfDaysPenaltyCharged")
    private Integer noOfDaysPenaltyCharged;
    
    
    
    
    @JsonProperty("lenderTransactionId")
    private String lenderTransactionId;
    
    
    
    
}

/*
    Model: PaymentOptionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptionsResponse {
    
    
    
    
    @JsonProperty("paymentOptions")
    private List<PaymentsObject> paymentOptions;
    
    
    
    
}

/*
    Model: AutoPayStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutoPayStatusResponse {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: OutstandingDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingDetailsData {
    
    
    
    
    @JsonProperty("outstandingDetails")
    private List<OutstandingData> outstandingDetails;
    
    
    
    
}



}