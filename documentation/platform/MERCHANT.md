



##### [Back to Platform docs](./README.md)

## Merchant Methods
Authentication Service
* [getAccessToken](#getaccesstoken)
* [renewAccessToken](#renewaccesstoken)
* [validateCredentials](#validatecredentials)



## Methods with example and description


### getAccessToken
Get Access Token




```java
merchant.getAccessToken() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organizationId |  



Use this API to get access token

*Returned Response:*




[GetAccessTokenResponse](#GetAccessTokenResponse)

Success. Returns a JSON object as shown below. Refer `GetAccessTokenResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
true
```
</details>

<details>
<summary><i>&nbsp; accessToken</i></summary>

```json
"oa-0a7a064dd15ef22fe002946f90c1e7b22eea47de"
```
</details>

<details>
<summary><i>&nbsp; refreshToken</i></summary>

```json
"oa-d2f33b6be9957050386be051501b84b008f5ef6f"
```
</details>

<details>
<summary><i>&nbsp; tokenExpireAt</i></summary>

```json
"2023-06-27T09:43:07.818Z"
```
</details>

<details>
<summary><i>&nbsp; tokenExpiryIn</i></summary>

```json
"600"
```
</details>

<details>
<summary><i>&nbsp; refreshTokenExpiryAt</i></summary>

```json
"2023-06-27T10:33:07.822Z"
```
</details>

<details>
<summary><i>&nbsp; refreshTokenExpiryIn</i></summary>

```json
"3600"
```
</details>

<details>
<summary><i>&nbsp; scope</i></summary>

```json
[
  "transaction"
]
```
</details>

</details>









---


### renewAccessToken
Renew Access Token




```java
merchant.renewAccessToken(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organizationId |  
| body | [RefreshTokenRequest](#RefreshTokenRequest) | yes | Request body |


Use this API to renew access token

*Returned Response:*




[RefreshTokenResponse](#RefreshTokenResponse)

Success. Returns a JSON object as shown below. Refer `RefreshTokenResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
true
```
</details>

<details>
<summary><i>&nbsp; accessToken</i></summary>

```json
"oa-de1496c16c91c45396ba87a888eed20fb223995d"
```
</details>

<details>
<summary><i>&nbsp; tokenExpireAt</i></summary>

```json
"2023-06-26T19:23:46.977Z"
```
</details>

<details>
<summary><i>&nbsp; tokenExpiryIn</i></summary>

```json
"600"
```
</details>

</details>









---


### validateCredentials
Validate organization's credentials




```java
merchant.validateCredentials() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organizationId |  



Use this API to validate organization's credentials

*Returned Response:*




[ValidateCredentialsResponse](#ValidateCredentialsResponse)

Success. Returns a JSON object as shown below. Refer `ValidateCredentialsResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; message</i></summary>

```json
"The request has been processed successfully."
```
</details>

<details>
<summary><i>&nbsp; data</i></summary>

```json
{
  "success": true,
  "organizationId": "d5a2db76-499d-45fc-af67-435481af9a87",
  "organizationName": "Priti Org"
}
```
</details>

<details>
<summary><i>&nbsp; meta</i></summary>

```json
{
  "timestamp": "2024-07-15T12:57:06.818Z",
  "version": "v1.0",
  "product": "Settle Checkout"
}
```
</details>

</details>









---



### Schemas

 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | info | String? |  yes  |  |
 | code | String? |  yes  |  |
 | requestId | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [BlockUserRequestSchema](#BlockUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Boolean? |  yes  |  |
 | userid | ArrayList<String>? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [EditEmailRequestSchema](#EditEmailRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |

---


 
 
 #### [SendVerificationLinkMobileRequestSchema](#SendVerificationLinkMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | primary | Boolean? |  yes  |  |

---


 
 
 #### [EditMobileRequestSchema](#EditMobileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | phone | String? |  yes  |  |

---


 
 
 #### [UpdateEmail](#UpdateEmail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | additionalProperties | Object? |  yes  |  |

---


 
 
 #### [EditProfileRequestSchema](#EditProfileRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | lastName | String |  no  |  |
 | countryCode | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | email | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | registrationToken | String? |  yes  |  |

---


 
 
 #### [EditProfileMobileSchema](#EditProfileMobileSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [SendEmailOtpRequestSchema](#SendEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | action | String? |  yes  |  |
 | token | String? |  yes  |  |
 | registerToken | String? |  yes  |  |

---


 
 
 #### [VerifyEmailOtpRequestSchema](#VerifyEmailOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | action | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | otp | String? |  yes  |  |

---


 
 
 #### [VerifyOtpRequest](#VerifyOtpRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | requestId | String |  no  |  |
 | otp | String |  no  |  |
 | captchaCode | String? |  yes  |  |
 | androidHash | String? |  yes  |  |

---


 
 
 #### [SendMobileOtpRequest](#SendMobileOtpRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String |  no  |  |
 | mobile | String |  no  |  |
 | captchaCode | String? |  yes  |  |
 | androidHash | String? |  yes  |  |
 | force | String? |  yes  |  |

---


 
 
 #### [ReSendMobileOtpRequestSchema](#ReSendMobileOtpRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | captchaCode | String? |  yes  |  |
 | token | String |  no  |  |
 | androidHash | String? |  yes  |  |

---


 
 
 #### [LoginSuccess](#LoginSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | requestId | String? |  yes  |  |
 | registerToken | String? |  yes  |  |

---


 
 
 #### [VerifyOtpSuccess](#VerifyOtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | userExists | Boolean? |  yes  |  |
 | registerToken | String? |  yes  |  |

---


 
 
 #### [ResetPasswordSuccess](#ResetPasswordSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |

---


 
 
 #### [RegisterFormSuccess](#RegisterFormSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | resendTimer | Integer? |  yes  |  |
 | resendToken | String? |  yes  |  |
 | resendEmailToken | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | requestId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | verifyEmailOtp | Boolean? |  yes  |  |
 | verifyMobileOtp | Boolean? |  yes  |  |
 | userExists | Boolean? |  yes  |  |

---


 
 
 #### [VerifyEmailSuccess](#VerifyEmailSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [LogoutSuccess](#LogoutSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logout | Boolean? |  yes  |  |

---


 
 
 #### [BlockUserSuccess](#BlockUserSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ProfileEditSuccess](#ProfileEditSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | resendEmailToken | String? |  yes  |  |
 | userExists | Boolean? |  yes  |  |
 | verifyEmailLink | Boolean? |  yes  |  |
 | verifyEmailOtp | Boolean? |  yes  |  |
 | verifyMobileOtp | Boolean? |  yes  |  |
 | email | String? |  yes  |  |
 | requestId | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | resendTimer | Integer? |  yes  |  |
 | resendToken | String? |  yes  |  |

---


 
 
 #### [OtpSuccess](#OtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | resendTimer | Integer? |  yes  |  |
 | resendToken | String? |  yes  |  |
 | registerToken | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | requestId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [EmailOtpSuccess](#EmailOtpSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SessionListSuccess](#SessionListSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sessions | ArrayList<String>? |  yes  |  |

---


 
 
 #### [VerifyMobileOTPSuccess](#VerifyMobileOTPSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | verifyMobileLink | Boolean? |  yes  |  |

---


 
 
 #### [VerifyEmailOTPSuccess](#VerifyEmailOTPSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |
 | verifyEmailLink | Boolean? |  yes  |  |

---


 
 
 #### [SendMobileVerifyLinkSuccess](#SendMobileVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verifyMobileLink | Boolean? |  yes  |  |

---


 
 
 #### [SendEmailVerifyLinkSuccess](#SendEmailVerifyLinkSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verifyEmailLink | Boolean? |  yes  |  |

---


 
 
 #### [UserSearchResponseSchema](#UserSearchResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | users | ArrayList<[UserSchema](#UserSchema)>? |  yes  |  |

---


 
 
 #### [CustomerListResponseSchema](#CustomerListResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[UserSchema](#UserSchema)>? |  yes  |  |
 | page | [PaginationSchema](#PaginationSchema)? |  yes  |  |

---


 
 
 #### [PaginationSchema](#PaginationSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Integer? |  yes  |  |
 | itemTotal | Integer? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | type | String? |  yes  |  |
 | current | Integer? |  yes  |  |

---


 
 
 #### [UserObjectSchema](#UserObjectSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |

---


 
 
 #### [CreateOrganization](#CreateOrganization)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | website | String? |  yes  |  |
 | disbursementAccountHolderName | String? |  yes  |  |
 | disbursementAccountNumber | String? |  yes  |  |
 | disbursementIfsc | String? |  yes  |  |
 | businessName | String? |  yes  |  |
 | email | String? |  yes  |  |
 | businessAddress | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | b2B | Boolean? |  yes  |  |
 | b2C | Boolean? |  yes  |  |
 | docType | String? |  yes  |  |
 | docNumber | String? |  yes  |  |
 | organizationId | String? |  yes  |  |

---


 
 
 #### [UpdateLogo](#UpdateLogo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String? |  yes  |  |

---


 
 
 #### [AddMetaSchemaRequest](#AddMetaSchemaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | merchantId | String? |  yes  |  |
 | schema | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AddMetaSchemaResponse](#AddMetaSchemaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | merchantId | String? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | mid | String? |  yes  |  |
 | data | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [UpdateOrganization](#UpdateOrganization)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | Object? |  yes  |  |
 | logo | Object? |  yes  |  |
 | website | Object? |  yes  |  |
 | disbursementAccountHolderName | Object? |  yes  |  |
 | disbursementAccountNumber | Object? |  yes  |  |
 | disbursementIfsc | Object? |  yes  |  |
 | active | Boolean? |  yes  |  |

---


 
 
 #### [UpdateFinancials](#UpdateFinancials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | disbursementAccountHolderName | String |  no  |  |
 | disbursementAccountNumber | String |  no  |  |
 | disbursementIfsc | String |  no  |  |

---


 
 
 #### [Documents](#Documents)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | docType | String |  no  |  |
 | docNumber | String |  no  |  |

---


 
 
 #### [FinancialDetails](#FinancialDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | disbursementAccountHolderName | String? |  yes  |  |
 | disbursementAccountNumber | String? |  yes  |  |
 | disbursementIfsc | String? |  yes  |  |
 | b2B | Boolean? |  yes  |  |
 | b2C | Boolean? |  yes  |  |
 | businessName | String? |  yes  |  |
 | email | String? |  yes  |  |
 | businessAddress | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | documents | ArrayList<[Documents](#Documents)>? |  yes  |  |

---


 
 
 #### [GetOrganization](#GetOrganization)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | organizationId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | isAdmin | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [OrganizationDetails](#OrganizationDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | organizationId | String? |  yes  |  |
 | isAdmin | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | logo | String? |  yes  |  |
 | website | String? |  yes  |  |
 | disbursementAccountHolderName | String? |  yes  |  |
 | disbursementAccountNumber | String? |  yes  |  |
 | disbursementIfsc | String? |  yes  |  |

---


 
 
 #### [Organization](#Organization)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---


 
 
 #### [OrganizationList](#OrganizationList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | id | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | epikId | String? |  yes  |  |
 | website | String? |  yes  |  |
 | disbursementAccountHolderName | String? |  yes  |  |
 | disbursementAccountNumber | String? |  yes  |  |
 | disbursementIfsc | String? |  yes  |  |

---


 
 
 #### [OrganizationCount](#OrganizationCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | String? |  yes  |  |

---


 
 
 #### [TeamMembers](#TeamMembers)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | members | ArrayList<[Member](#Member)>? |  yes  |  |

---


 
 
 #### [Member](#Member)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | organizationId | String? |  yes  |  |
 | isAdmin | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | profile | [Profile](#Profile)? |  yes  |  |

---


 
 
 #### [Profile](#Profile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | organizationId | String? |  yes  |  |
 | isAdmin | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---


 
 
 #### [AddTeamMember](#AddTeamMember)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | email | String? |  yes  |  |
 | userIsAdmin | Boolean? |  yes  |  |

---


 
 
 #### [UpdateTeamMemberRole](#UpdateTeamMemberRole)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userIsAdmin | Boolean? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [RemoveTeamMemberResponse](#RemoveTeamMemberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [AddTeamMemberResponse](#AddTeamMemberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | organizationId | String? |  yes  |  |
 | isAdmin | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---


 
 
 #### [ApiKey](#ApiKey)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | secret | String? |  yes  |  |

---


 
 
 #### [UpdateApiHook](#UpdateApiHook)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | apiKey | String |  no  |  |
 | url | String |  no  |  |
 | customHeaders | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ApiHookDetails](#ApiHookDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | apiKey | String |  no  |  |
 | url | String |  no  |  |
 | customHeaders | HashMap<String,Object>? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [UpdateApiHookResponse](#UpdateApiHookResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [OrganizationIp](#OrganizationIp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | ip | String |  no  |  |

---


 
 
 #### [AddOrganizationIpDetails](#AddOrganizationIpDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | organizationIps | ArrayList<[OrganizationIp](#OrganizationIp)>? |  yes  |  |
 | delete | String? |  yes  |  |

---


 
 
 #### [AddUpdateCsvFileResponse](#AddUpdateCsvFileResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [AddUpdateCsvFileRequest](#AddUpdateCsvFileRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | csv | String? |  yes  |  |
 | organizationId | String? |  yes  |  |

---


 
 
 #### [CsvFile](#CsvFile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | csv | String? |  yes  |  |

---


 
 
 #### [AddReportCsvFileResponse](#AddReportCsvFileResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [AddReportCsvFileRequest](#AddReportCsvFileRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | csv | String? |  yes  |  |
 | organizationId | String? |  yes  |  |
 | name | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ReportCsvFileResponse](#ReportCsvFileResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | csv | String? |  yes  |  |

---


 
 
 #### [AddReportRequestArray](#AddReportRequestArray)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | category | String? |  yes  |  |
 | shopName | String? |  yes  |  |
 | legalName | String? |  yes  |  |
 | firstName | String? |  yes  |  |
 | middleName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | aadhaar | String? |  yes  |  |
 | nameOnPan | String? |  yes  |  |
 | gstNumber | String? |  yes  |  |
 | gstBusinessName | String? |  yes  |  |
 | panNumber | String? |  yes  |  |
 | udyam | String? |  yes  |  |
 | ownershipType | String? |  yes  |  |
 | address | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | license1Type | String? |  yes  |  |
 | license1 | String? |  yes  |  |
 | license2Type | String? |  yes  |  |
 | license2 | String? |  yes  |  |

---


 
 
 #### [AddReportRequest](#AddReportRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | businessDetails | ArrayList<Object>? |  yes  |  |

---


 
 
 #### [AddReportResponseArray](#AddReportResponseArray)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | anchorId | String? |  yes  |  |
 | category | String? |  yes  |  |
 | shopName | String? |  yes  |  |
 | legalName | String? |  yes  |  |
 | firstName | String? |  yes  |  |
 | middleName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | aadhaar | String? |  yes  |  |
 | nameOnPan | String? |  yes  |  |
 | gstNumber | String? |  yes  |  |
 | gstBusinessName | String? |  yes  |  |
 | panNumber | String? |  yes  |  |
 | udyam | String? |  yes  |  |
 | ownershipType | String? |  yes  |  |
 | address | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | license1Type | String? |  yes  |  |
 | license1 | String? |  yes  |  |
 | license2Type | String? |  yes  |  |
 | license2 | String? |  yes  |  |

---


 
 
 #### [AddReportResponse](#AddReportResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | businessDetails | ArrayList<[AddReportResponseArray](#AddReportResponseArray)>? |  yes  |  |

---


 
 
 #### [VintageDataResponseObject](#VintageDataResponseObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | month | String? |  yes  |  |
 | year | Integer? |  yes  |  |
 | revenue | String? |  yes  |  |
 | businessId | String? |  yes  |  |
 | createdBy | String? |  yes  |  |
 | id | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedBy | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [VintageDataResponse](#VintageDataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | vintageData | ArrayList<[VintageDataResponseObject](#VintageDataResponseObject)>? |  yes  |  |

---


 
 
 #### [AddSkuRequestArray](#AddSkuRequestArray)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sku | String |  no  |  |
 | productName | String |  no  |  |
 | creditPurchaseOptionFlag | String |  no  |  |
 | effectiveDates | String |  no  |  |
 | organizationId | String |  no  |  |

---


 
 
 #### [AddSkuRequest](#AddSkuRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | skuDetails | ArrayList<[AddSkuRequestArray](#AddSkuRequestArray)>? |  yes  |  |

---


 
 
 #### [AddSkuResponse](#AddSkuResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [RestrictedSkuSchema](#RestrictedSkuSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | skuDetails | ArrayList<Object>? |  yes  |  |

---


 
 
 #### [OrganizationIpResponse](#OrganizationIpResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | organizationId | String |  no  |  |
 | ip | String |  no  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | id | String |  no  |  |

---


 
 
 #### [OrganizationIpDetails](#OrganizationIpDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | organizationIps | ArrayList<[OrganizationIpResponse](#OrganizationIpResponse)>? |  yes  |  |

---


 
 
 #### [TrFilterKeys](#TrFilterKeys)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | name | String? |  yes  |  |
 | kind | String? |  yes  |  |

---


 
 
 #### [TrFilterValues](#TrFilterValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | isSelected | Boolean? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [TrFilters](#TrFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | [TrFilterKeys](#TrFilterKeys)? |  yes  |  |
 | values | ArrayList<[TrFilterValues](#TrFilterValues)>? |  yes  |  |

---


 
 
 #### [TrPageResponse](#TrPageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | current | Double |  no  |  |
 | hasPrevious | Boolean |  no  |  |
 | hasNext | Boolean |  no  |  |
 | size | Double |  no  |  |
 | itemTotal | Double |  no  |  |

---


 
 
 #### [RefundSuccess](#RefundSuccess)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | message | Double |  no  |  |
 | transactionId | String |  no  |  |
 | refundId | String |  no  |  |

---


 
 
 #### [RefundItem](#RefundItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<Object> |  no  |  |

---


 
 
 #### [FilterByDate](#FilterByDate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [Refund](#Refund)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundItems | [RefundItem](#RefundItem)? |  yes  |  |
 | refundId | String |  no  |  |
 | refundAmount | Double |  no  |  |

---


 
 
 #### [GetAccessTokenResponse](#GetAccessTokenResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | accessToken | String? |  yes  |  |
 | refreshToken | String? |  yes  |  |
 | tokenExpireAt | String? |  yes  |  |
 | tokenExpiryIn | String? |  yes  |  |
 | refreshTokenExpiryAt | String? |  yes  |  |
 | refreshTokenExpiryIn | String? |  yes  |  |
 | scope | ArrayList<String>? |  yes  |  |

---


 
 
 #### [RefreshTokenResponse](#RefreshTokenResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | accessToken | String? |  yes  |  |
 | tokenExpireAt | String? |  yes  |  |
 | tokenExpiryIn | String? |  yes  |  |

---


 
 
 #### [RefreshTokenRequest](#RefreshTokenRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String |  no  |  |

---


 
 
 #### [IntegrationResponseMeta](#IntegrationResponseMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String |  no  | The timestamp when the response was generated. |
 | version | String |  no  | The version of the API. |
 | product | String |  no  | The name of the product or service. |
 | requestId | String? |  yes  | An optional request identifier. |

---


 
 
 #### [IntegrationResponseError](#IntegrationResponseError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  | Error code representing the type of error. |
 | message | String |  no  | A human-readable message providing more details about the error. |
 | exception | String |  no  | The exception name or type. |
 | field | String? |  yes  | The field associated with the error, if applicable. |
 | in | String? |  yes  | The location of the field, such as 'query', 'param' or 'body'. |

---


 
 
 #### [IntegrationErrorResponse](#IntegrationErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | A message indicating the failure of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | error | [IntegrationResponseError](#IntegrationResponseError) |  no  |  |

---


 
 
 #### [ValidateCredentialsData](#ValidateCredentialsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | organizationId | String |  no  |  |
 | organizationName | String? |  yes  |  |

---


 
 
 #### [ValidateCredentialsResponse](#ValidateCredentialsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Response message indicating the result of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | [ValidateCredentialsData](#ValidateCredentialsData) |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [PaymentLinkResponse](#PaymentLinkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | message | String? |  yes  |  |
 | paymentLink | String? |  yes  |  |

---


 
 
 #### [ApplicationCutomer](#ApplicationCutomer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | mobile | String |  no  |  |
 | uid | String? |  yes  |  |
 | email | String? |  yes  |  |

---


 
 
 #### [GeoLocation](#GeoLocation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | latitude | Double |  no  |  |
 | longitude | Double |  no  |  |

---


 
 
 #### [Address](#Address)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | line1 | String? |  yes  |  |
 | line2 | String? |  yes  |  |
 | city | String? |  yes  |  |
 | state | String? |  yes  |  |
 | country | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | type | String? |  yes  |  |
 | geoLocation | [GeoLocation](#GeoLocation)? |  yes  |  |

---


 
 
 #### [OrderItems](#OrderItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | String? |  yes  |  |
 | sku | String? |  yes  |  |
 | rate | Double? |  yes  |  |
 | quantity | Double? |  yes  |  |

---


 
 
 #### [Order](#Order)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valueInPaise | Integer |  no  |  |
 | uid | String |  no  |  |
 | items | ArrayList<[OrderItems](#OrderItems)>? |  yes  |  |
 | shippingAddress | [Address](#Address)? |  yes  |  |
 | billingAddress | [Address](#Address)? |  yes  |  |

---


 
 
 #### [Device](#Device)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ipAddress | String |  no  |  |
 | userAgent | String |  no  |  |
 | latitude | Double? |  yes  |  |
 | longitude | Double? |  yes  |  |

---


 
 
 #### [PaymentLinkRequest](#PaymentLinkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | autoCapture | Boolean? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | emiTenure | Double? |  yes  |  |
 | customer | [ApplicationCutomer](#ApplicationCutomer) |  no  |  |
 | order | [Order](#Order) |  no  |  |
 | device | [Device](#Device)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [UpdateLenderStatusSchemaRequest](#UpdateLenderStatusSchemaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | merchantId | String? |  yes  |  |
 | enable | Boolean? |  yes  |  |

---


 
 
 #### [UpdateLenderStatusSchemaResponse](#UpdateLenderStatusSchemaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | merchantId | String? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | mid | String? |  yes  |  |
 | enable | Boolean? |  yes  |  |
 | data | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CreateUserRequestSchema](#CreateUserRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String |  no  |  |
 | email | String? |  yes  |  |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | gender | String? |  yes  |  |

---


 
 
 #### [CreateUserResponseSchema](#CreateUserResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserSchema](#UserSchema)? |  yes  |  |

---


 
 
 #### [UserSchema](#UserSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | email | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | dob | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | profilePicUrl | String? |  yes  |  |
 | isEmailVerified | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---



