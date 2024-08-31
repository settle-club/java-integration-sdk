



##### [Back to Public docs](./README.md)

## Merchant Methods
Authentication Service
* [sendOTPOnMobile](#sendotponmobile)
* [reSendOTPOnMobile](#resendotponmobile)
* [verifyMobileOTP](#verifymobileotp)
* [logout](#logout)
* [getLoggedInUser](#getloggedinuser)
* [getListOfActiveSessions](#getlistofactivesessions)
* [refund](#refund)
* [getOrganizations](#getorganizations)
* [createOrganization](#createorganization)
* [getOrganizationDetails](#getorganizationdetails)
* [getOrganizationFinanceDetails](#getorganizationfinancedetails)
* [updateFinancialDetails](#updatefinancialdetails)
* [getTeamMembers](#getteammembers)
* [addTeamMemberToOrganization](#addteammembertoorganization)
* [removeTeamMemberFromOrganization](#removeteammemberfromorganization)
* [updateMemberRole](#updatememberrole)
* [getOrganizationApiKeyAndSecret](#getorganizationapikeyandsecret)
* [updateTransactionApiHookOfOrganization](#updatetransactionapihookoforganization)
* [getOrganizationApiHookDetails](#getorganizationapihookdetails)
* [getOrganizationIpDetails](#getorganizationipdetails)
* [addOrUpdateIpToWhiteListOfOrganization](#addorupdateiptowhitelistoforganization)
* [updateOrganizationLogo](#updateorganizationlogo)
* [addRestrictedSku](#addrestrictedsku)
* [getRestrictedSku](#getrestrictedsku)
* [addReport](#addreport)
* [getCsvReport](#getcsvreport)
* [addBusinessDetails](#addbusinessdetails)
* [getBusinessDetails](#getbusinessdetails)
* [getVintageData](#getvintagedata)
* [addLenderMetaSchema](#addlendermetaschema)
* [getLenderMetaSchema](#getlendermetaschema)
* [updateLenderStatus](#updatelenderstatus)
* [generatePaymentLink](#generatepaymentlink)
* [updateProfile](#updateprofile)
* [getOutStandingDetails](#getoutstandingdetails)



## Methods with example and description


### sendOTPOnMobile
Send OTP on mobile




```java
merchant.sendOTPOnMobile(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [SendMobileOtpRequest](#SendMobileOtpRequest) | yes | Request body |


Use this API to send an OTP to a mobile number.

*Returned Response:*




[OtpSuccess](#OtpSuccess)

Success. Returns a JSON object as shown below. Refer `OtpSuccess` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "requestId": "01503005aeab87cbed93d40f46cc2749",
  "message": "OTP sent",
  "mobile": "8652523958",
  "countryCode": "91",
  "resendTimer": 30,
  "resendToken": "18fc3d60-66e5-11eb-9399-0312fbf2c2a6"
}
```
</details>









---


### reSendOTPOnMobile
Send OTP on mobile




```java
merchant.reSendOTPOnMobile(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ReSendMobileOtpRequestSchema](#ReSendMobileOtpRequestSchema) | yes | Request body |


Use this API to send an OTP to a mobile number.

*Returned Response:*




[OtpSuccess](#OtpSuccess)

Success. Returns a JSON object as shown below. Refer `OtpSuccess` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "requestId": "01503005aeab87cbed93d40f46cc2749",
  "message": "OTP sent",
  "mobile": "8652523958",
  "countryCode": "91",
  "resendTimer": 30,
  "resendToken": "18fc3d60-66e5-11eb-9399-0312fbf2c2a6"
}
```
</details>









---


### verifyMobileOTP
Verify OTP on mobile




```java
merchant.verifyMobileOTP(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [VerifyOtpRequest](#VerifyOtpRequest) | yes | Request body |


Use this API to verify the OTP received on a mobile number.

*Returned Response:*




[VerifyOtpSuccess](#VerifyOtpSuccess)

Success. Returns a JSON object as shown below. Refer `VerifyOtpSuccess` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "verifyMobileLink": true,
    "user": {
      "debug": {
        "source": "enclose",
        "platform": "000000000000000000000001"
      },
      "gender": "male",
      "active": true,
      "profilePicUrl": "https://d2co8r51m5ca2d.cloudfront.net/inapp_banners/default_profile_img.png",
      "id": "5e68af49cfa09bf7233022f1",
      "firstName": "Akash",
      "lastName": "Mane",
      "username": "akashmane_gofynd_com_10039",
      "mobile": "8652523958",
      "countryCode": "91",
      "email": "akashmane@gofynd.com",
      "createdAt": "2020-03-11T09:28:41.982Z",
      "updatedAt": "2021-02-04T10:10:44.981Z"
    }
  }
}
```
</details>

</details>









---


### logout
Logs out currently logged in user




```java
merchant.logout() {
  //use response
}
```




Use this API to check to logout a user from the app.

*Returned Response:*




[LogoutSuccess](#LogoutSuccess)

Success. Returns a success message as shown below. Refer `LogoutSuccess` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getLoggedInUser
Get logged in user




```java
merchant.getLoggedInUser() {
  //use response
}
```




Use this API  to get the details of a logged in user.

*Returned Response:*




[UserObjectSchema](#UserObjectSchema)

Success. Returns a JSON object with user details. Refer `UserObjectSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "user": {
      "gender": "male",
      "active": true,
      "profilePicUrl": "https://d2co8r51m5ca2d.cloudfront.net/inapp_banners/default_profile_img.png",
      "id": "5e68af49cfa09bf7233022f1",
      "firstName": "Akash",
      "lastName": "Mane",
      "username": "akashmane_gofynd_com_10039",
      "mobile": "8652523958",
      "countryCode": "91",
      "email": "akashmane@gofynd.com",
      "createdAt": "2020-03-11T09:28:41.982Z",
      "updatedAt": "2021-02-04T10:10:44.981Z",
      "uid": "61"
    }
  }
}
```
</details>

</details>









---


### getListOfActiveSessions
Get list of sessions




```java
merchant.getListOfActiveSessions() {
  //use response
}
```




Use this API to retrieve all active sessions of a user.

*Returned Response:*




[SessionListSuccess](#SessionListSuccess)

Success. Returns a JSON object containing an array of sessions. Refer `SessionListSuccess` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "sessions": [
    "session_1",
    "session_2"
  ]
}
```
</details>









---


### refund
Refund customer order amount




```java
merchant.refund( orderId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organizationId |   
| orderId | String | yes | This is orderId |  
| body | [Refund](#Refund) | yes | Request body |


Use this API to refund partial or full order amount to the customer

*Returned Response:*




[RefundSuccess](#RefundSuccess)

Success. Returns a JSON object as shown below. Refer `RefundSuccess` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; status</i></summary>

```json
"Completed"
```
</details>

<details>
<summary><i>&nbsp; message</i></summary>

```json
"Refund completed"
```
</details>

<details>
<summary><i>&nbsp; transactionId</i></summary>

```json
"TXNbvL44WskCc5deF9XtTvYcBQoU"
```
</details>

<details>
<summary><i>&nbsp; refundId</i></summary>

```json
"R1FY7"
```
</details>

</details>









---


### getOrganizations
Get Organization Details




```java
merchant.getOrganizations() {
  //use response
}
```




Use this API to get organization details belongs to logged in user

*Returned Response:*




[OrganizationDetails](#OrganizationDetails)

Success. Returns a JSON object as shown below. Refer `OrganizationDetails` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "isAdmin": false,
  "organizationId": "c97348ad-a5fe-4640-b98b-afb455187fe8",
  "name": "Potlee",
  "createdAt": "2022-05-25T08:02:54.772Z",
  "updatedAt": "2022-05-25T08:02:54.772Z",
  "isActive": true
}
```
</details>









---


### createOrganization
create organization




```java
merchant.createOrganization(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateOrganization](#CreateOrganization) | yes | Request body |


Use this API to create new organization.

*Returned Response:*




[GetOrganization](#GetOrganization)

Success. Returns a JSON object as shown below. Refer `GetOrganization` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "5fa209a9-cbdb-4c55-98f6-e0a26b9f004a",
  "userId": "5cd5d84d-4caf-44e0-8183-73a97e4720e2",
  "organizationId": "edc21c75-0226-49a7-8dd5-02db865cde11",
  "isAdmin": "true",
  "createdAt": "2022-05-11T05:08:12.918Z",
  "updatedAt": "2022-05-11T05:08:12.919Z",
  "deletedAt": null,
  "organization": {
    "id": "edc21c75-0226-49a7-8dd5-02db865cde11",
    "name": "Potlee",
    "active": true,
    "createdAt": "2022-05-11T05:08:12.898Z",
    "updatedAt": "2022-05-11T05:08:12.898Z",
    "deletedAt": null
  }
}
```
</details>









---


### getOrganizationDetails
Get Organization Details




```java
merchant.getOrganizationDetails() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get organization details belongs to logged in user

*Returned Response:*




[GetOrganization](#GetOrganization)

Success. Returns a JSON object as shown below. Refer `GetOrganization` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "isAdmin": false,
  "organizationId": "c97348ad-a5fe-4640-b98b-afb455187fe8",
  "name": "Potlee",
  "createdAt": "2022-05-25T08:02:54.772Z",
  "updatedAt": "2022-05-25T08:02:54.772Z",
  "isActive": true
}
```
</details>









---


### getOrganizationFinanceDetails
Get Organization Finance Details




```java
merchant.getOrganizationFinanceDetails() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get organization finance details belongs to logged in user..

*Returned Response:*




[FinancialDetails](#FinancialDetails)

Success. Returns a JSON object as shown below. Refer `FinancialDetails` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "disbursementAccountHolderName": "Potlee",
  "disbursementAccountNumber": "99",
  "disbursementIfsc": "POTLEE-1234",
  "b2b": false,
  "b2c": true,
  "businessName": "businessname example",
  "email": "raunaksingh@gofynd.com",
  "businessAddress": "address example 1",
  "pincode": "400051",
  "documents": [
    {
      "docType": "pan",
      "docNumber": "LSCPX7788F"
    }
  ]
}
```
</details>









---


### updateFinancialDetails
update financial details of organization




```java
merchant.updateFinancialDetails(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [UpdateFinancials](#UpdateFinancials) | yes | Request body |


Use this API to update financial details of organization.

*Returned Response:*




[FinancialDetails](#FinancialDetails)

Success. Returns a JSON object as shown below. Refer `FinancialDetails` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "disbursementAccountHolderName": "Potlee",
  "disbursementAccountNumber": "99",
  "disbursementIfsc": "POTLEE-1234"
}
```
</details>









---


### getTeamMembers
Get Organization Team Members Details




```java
merchant.getTeamMembers() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get team members belongs organization of logged in user

*Returned Response:*




[TeamMembers](#TeamMembers)

Success. Returns a JSON object as shown below. Refer `TeamMembers` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "[\n  {\n      \"id\": \"5cd5d84d-4caf-44e0-8183-73a97e4720e2\",\n      \"firstName\": \"AK\",\n      \"lastName\": \"G\",\n      \"gender\": \"male\",\n      \"dob\": \"1993-05-13\",\n      \"email\": \"gaykar.akshay@gmail.com\",\n      \"countryCode\": \"91\",\n      \"mobile\": \"7738670789\",\n      \"profilePictureUrl\": null,\n      \"isEmailVerified\": false,\n      \"active\": true,\n      \"createdAt\": \"2022-05-11T05:07:45.478Z\",\n      \"updatedAt\": \"2022-05-11T05:08:20.107Z\"\n    }\n]": null
}
```
</details>









---


### addTeamMemberToOrganization
Add Team Member to Organization




```java
merchant.addTeamMemberToOrganization(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [AddTeamMember](#AddTeamMember) | yes | Request body |


Use this API to add  new team members to  organization.

*Returned Response:*




[AddTeamMemberResponse](#AddTeamMemberResponse)

Success. Returns a JSON object as shown below. Refer `AddTeamMemberResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "userId": "d3bda3f7-2bd0-4ad5-ab32-eeb24987aaed",
  "organizationId": "edc21c75-0226-49a7-8dd5-02db865cde11",
  "createdAt": "2022-05-11T05:10:30.266Z",
  "updatedAt": "2022-05-11T05:10:30.266Z",
  "id": "78ead1da-22ce-4367-90ef-22c388a15db3",
  "isAdmin": null,
  "deletedAt": null
}
```
</details>









---


### removeTeamMemberFromOrganization
Remove Team Member from Organization




```java
merchant.removeTeamMemberFromOrganization( userId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |   
| userId | String | yes | This is the user ID |  



Use this API to remove a team member from the organization.

*Returned Response:*




[RemoveTeamMemberResponse](#RemoveTeamMemberResponse)

Success. Returns a JSON object as shown below. Refer `RemoveTeamMemberResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": "true"
}
```
</details>









---


### updateMemberRole
Update Team Member Role in Organization




```java
merchant.updateMemberRole(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [UpdateTeamMemberRole](#UpdateTeamMemberRole) | yes | Request body |


Use this API to update team members role in organization.

*Returned Response:*




[AddTeamMemberResponse](#AddTeamMemberResponse)

Success. Returns a JSON object as shown below. Refer `AddTeamMemberResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{}
```
</details>









---


### getOrganizationApiKeyAndSecret
Get Organization API key and secret




```java
merchant.getOrganizationApiKeyAndSecret() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get API key and secret of the organization

*Returned Response:*




[ApiKey](#ApiKey)

Success. Returns a JSON object as shown below. Refer `ApiKey` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "key": "6489dc79-ecf1-4f65-add7-f580504482d7",
  "secret": "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
}
```
</details>









---


### updateTransactionApiHookOfOrganization
add or update  api details of organization for transaction status update




```java
merchant.updateTransactionApiHookOfOrganization(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [UpdateApiHook](#UpdateApiHook) | yes | Request body |


Use this API to update api hook of organization.

*Returned Response:*




[UpdateApiHookResponse](#UpdateApiHookResponse)

Success. Returns a JSON object as shown below. Refer `UpdateApiHookResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true
}
```
</details>









---


### getOrganizationApiHookDetails
Get Organization API hook details




```java
merchant.getOrganizationApiHookDetails() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get API hook details of Organization

*Returned Response:*




[ApiHookDetails](#ApiHookDetails)

Success. Returns a JSON object as shown below. Refer `ApiHookDetails` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "url": "http://google.com",
  "customHeaders": {
    "x-id": "123"
  },
  "apiKey": "12345",
  "createdAt": "2022-07-01T11:35:20.251Z",
  "updatedAt": "2022-07-01T11:35:20.251Z"
}
```
</details>









---


### getOrganizationIpDetails
Get Organization's ip whitelist details




```java
merchant.getOrganizationIpDetails() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get list of ips related to organization

*Returned Response:*




[OrganizationIpDetails](#OrganizationIpDetails)

Success. Returns a JSON object as shown below. Refer `OrganizationIpDetails` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "organizationIps": [
    {
      "id": "ba13ee97-5029-4ec9-91c2-f6388fd06298",
      "organizationId": "f0ed1368-e3d5-4e9b-8de6-c7d97d62f339",
      "ip": "127.0.0.3",
      "active": true,
      "createdAt": "2022-07-04T08:15:59.145Z",
      "updatedAt": "2022-07-04T08:15:59.145Z"
    }
  ]
}
```
</details>









---


### addOrUpdateIpToWhiteListOfOrganization
Add or Update ip to be whitelisted for Organization




```java
merchant.addOrUpdateIpToWhiteListOfOrganization(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [AddOrganizationIpDetails](#AddOrganizationIpDetails) | yes | Request body |


Use this API to add or update ip to whitelist of organization.

*Returned Response:*




[OrganizationIpDetails](#OrganizationIpDetails)

Success. Returns a JSON object as shown below. Refer `OrganizationIpDetails` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "organizationIps": [
    {
      "organizationId": "f0ed1368-e3d5-4e9b-8de6-c7d97d62f339",
      "ip": "127.0.0.1",
      "active": true,
      "createdAt": "2022-07-04T08:15:59.145Z",
      "updatedAt": "2022-07-04T08:15:59.145Z",
      "id": "ba13ee97-5029-4ec9-91c2-f6388fd06298"
    }
  ]
}
```
</details>









---


### updateOrganizationLogo
Update Organization logo




```java
merchant.updateOrganizationLogo( logo) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |   
| logo | String | yes | This is the logo url |  



Use this API to Update Organization logo.

*Returned Response:*




[UpdateLogo](#UpdateLogo)

Success. Returns a JSON object as shown below. Refer `UpdateLogo` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "logo:\"https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png\"": null
}
```
</details>









---


### addRestrictedSku
Add or Update csv for Organization




```java
merchant.addRestrictedSku(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [AddSkuRequest](#AddSkuRequest) | yes | Request body |


Use this api to Add or Update csv for Organization.

*Returned Response:*




[AddSkuResponse](#AddSkuResponse)

Success. Returns a JSON object as shown below. Refer `AddSkuResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "csv added successfully"
}
```
</details>









---


### getRestrictedSku
Get Organization retricted SKU data




```java
merchant.getRestrictedSku() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get organization csv file.

*Returned Response:*




[RestrictedSkuSchema](#RestrictedSkuSchema)

Success. Returns a JSON object as shown below. Refer `RestrictedSkuSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{}
```
</details>









---


### addReport
Add Report csv pixelbinUrl for Organization




```java
merchant.addReport(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [AddReportCsvFileRequest](#AddReportCsvFileRequest) | yes | Request body |


Use this api to Add Report csv for Organization.

*Returned Response:*




[AddReportCsvFileResponse](#AddReportCsvFileResponse)

Success. Returns a JSON object as shown below. Refer `AddReportCsvFileResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "csv added successfully"
}
```
</details>









---


### getCsvReport
Get Organization Report file pixelbinUrl




```java
merchant.getCsvReport( type) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |   
| type | String | yes | This is the type of report |  



Use this API to get organization report csv file.

*Returned Response:*




[ReportCsvFileResponse](#ReportCsvFileResponse)

Success. Returns a JSON object as shown below. Refer `ReportCsvFileResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "csv": "this is csv data"
}
```
</details>









---


### addBusinessDetails
Add Report JSON data for Organization




```java
merchant.addBusinessDetails(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  
| body | [AddReportRequest](#AddReportRequest) | yes | Request body |


Use this api to Add Report csv for Organization.

*Returned Response:*




[AddReportResponse](#AddReportResponse)

Success. Returns a JSON object as shown below. Refer `AddReportResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "report added successfully"
}
```
</details>









---


### getBusinessDetails
Get Business Details from sharing center




```java
merchant.getBusinessDetails() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |  



Use this API to get organization business details.

*Returned Response:*




[AddReportResponse](#AddReportResponse)

Success. Returns a JSON object as shown below. Refer `AddReportResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "csv": "this is csv data"
}
```
</details>









---


### getVintageData
Get Vintage Details from sharing center




```java
merchant.getVintageData( businessId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |   
| businessId | String | yes | businessId for vintageDat |  



Use this API to get organization vintage details.

*Returned Response:*




[VintageDataResponse](#VintageDataResponse)

Success. Returns a JSON object as shown below. Refer `VintageDataResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "csv": "this is csv data"
}
```
</details>









---


### addLenderMetaSchema
add lender schema




```java
merchant.addLenderMetaSchema( lenderId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderId | String | yes | lenderId for lender merchant config |  
| body | [AddMetaSchemaRequest](#AddMetaSchemaRequest) | yes | Request body |


Use this API to add lender schema.

*Returned Response:*




[AddMetaSchemaResponse](#AddMetaSchemaResponse)

Success. Returns a JSON object as shown below. Refer `AddMetaSchemaResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "merchantId": "5fa209a9-cbdb-4c55-98f6-e0a26b9f004a",
  "lenderId": "5fa209a9-cbdb-4c55-98f6-e0a26b9f004a",
  "mid": "qwdx23dxq3xxqwx",
  "data": {
    "name": "test organization"
  }
}
```
</details>









---


### getLenderMetaSchema
Get lender meta schema




```java
merchant.getLenderMetaSchema( lenderId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |   
| lenderId | String | yes | lenderId for lender merchant config |  



Use this API toGet lender meta schema.

*Returned Response:*




[AddMetaSchemaResponse](#AddMetaSchemaResponse)

Success. Returns a JSON object as shown below. Refer `AddMetaSchemaResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "15b643e9-a63d-4749-90d4-a0bdbdeccd9c",
  "merchantId": "b2ac2bfb-8d9a-4a18-b245-e632b7048163",
  "lenderId": "315f60f4-1238-462c-8108-cfff9fbc400f",
  "mid": "b2ac2bfb-8d9a-4a18-b245-e632b7048163",
  "data": {
    "mid": "RaunakSingh",
    "secret": "Raunak",
    "schemes": {
      "1": "wx",
      "2": "xqwx",
      "3": "xqwxq",
      "4": "wxqwxqwxqwx",
      "5": "qwxqw",
      "6": "xqxqwxqw",
      "7": "kn",
      "8": "lkn",
      "9": "qk",
      "10": "k",
      "11": "lk"
    }
  },
  "createdAt": "2023-08-24T10:15:07.067Z",
  "updatedAt": "2023-08-24T10:15:07.067Z",
  "deletedAt": null
}
```
</details>









---


### updateLenderStatus
update lender enable status




```java
merchant.updateLenderStatus( lenderId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderId | String | yes | lenderId for lender merchant config |  
| body | [UpdateLenderStatusSchemaRequest](#UpdateLenderStatusSchemaRequest) | yes | Request body |


Use this API to update the status of a lender by updating enable flag value.

*Returned Response:*




[UpdateLenderStatusSchemaResponse](#UpdateLenderStatusSchemaResponse)

Success. Returns a JSON object as shown below. Refer `UpdateLenderStatusSchemaResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "merchantId": "5fa209a9-cbdb-4c55-98f6-e0a26b9f004a",
  "lenderId": "5fa209a9-cbdb-4c55-98f6-e0a26b9f004a",
  "mid": "qwdx23dxq3xxqwx",
  "data": {
    "name": "test organization"
  }
}
```
</details>









---


### generatePaymentLink
Generate a payment link




```java
merchant.generatePaymentLink(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organizationId |  
| body | [PaymentLinkRequest](#PaymentLinkRequest) | yes | Request body |


This api is for ASP flow where merchant share the payment link with the user.

*Returned Response:*




[PaymentLinkResponse](#PaymentLinkResponse)

Success. Returns a JSON object as shown below. Refer `PaymentLinkResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; status</i></summary>

```json
"SUCCESS"
```
</details>

<details>
<summary><i>&nbsp; paymentLink</i></summary>

```json
"https://account.potlee.co.in?token=nqnkdnwdnwkcnjcnejcnj"
```
</details>

</details>









---


### updateProfile
Update user profile




```java
merchant.updateProfile(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [EditProfileRequestSchema](#EditProfileRequestSchema) | yes | Request body |


Use this API to update the user profile

*Returned Response:*




[ProfileEditSuccess](#ProfileEditSuccess)

Success. Check the example shown below or refer `LoginSuccess` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "value": {
    "user": {
      "gender": "male",
      "active": true,
      "profilePicUrl": "https://d2co8r51m5ca2d.cloudfront.net/inapp_banners/default_profile_img.png",
      "id": "5e68af49cfa09bf7233022f1",
      "firstName": "Akash",
      "lastName": "Mane",
      "username": "akashmane_gofynd_com_10039",
      "mobile": "8652523958",
      "countryCode": "91",
      "email": "akashmane@gofynd.com",
      "createdAt": "2020-03-11T09:28:41.982Z",
      "updatedAt": "2021-02-04T10:10:44.981Z",
      "uid": "61"
    }
  }
}
```
</details>

</details>









---


### getOutStandingDetails
Get user outstanding details.




```java
merchant.getOutStandingDetails( userId,  lenderSlugs) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organizationId |   
| userId | String | yes | This is userId |   
| lenderSlugs | List<String>? | no | This list of lender slugs. eg. ['cashe','liquiloans'] |  



This api is for getting outstanding details for the user with all the lenders.

*Returned Response:*




[OutstandingDetailsResponse](#OutstandingDetailsResponse)

Success. Returns a JSON object as shown below. Refer `PaymentLinkResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; default</i></summary>

```json
{
  "outstandingDetails": [
    {
      "lenderDetails": {
        "slug": "cashe",
        "id": "f162ae3e-cc7c-4b96-85d1-19c3e0f7e780",
        "name": "Bhanix",
        "theme": {
          "logoUrl": "",
          "iconUrl": ""
        }
      },
      "availableLimit": 40000,
      "crediLimit": 40000,
      "dueAmount": 0,
      "outstandingAmount": 0,
      "dueDate": null
    }
  ]
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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | supportEmail | String? |  yes  |  |
 | description | String? |  yes  |  |
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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | supportEmail | String? |  yes  |  |
 | description | String? |  yes  |  |
 | businessAddress | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | documents | ArrayList<[Documents](#Documents)>? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ApiKey](#ApiKey)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | secret | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [UpdateApiHookResponse](#UpdateApiHookResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [RestrictedSkuSchema](#RestrictedSkuSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | skuDetails | ArrayList<Object>? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | location | String? |  yes  | The location of the field, such as 'query', 'param' or 'body'. |

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

---


 
 
 #### [PaymentLinkResponse](#PaymentLinkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | message | String? |  yes  |  |
 | paymentLink | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [LenderTheme](#LenderTheme)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | iconUrl | String? |  yes  |  |
 | logoUrl | String? |  yes  |  |

---


 
 
 #### [LenderDetails](#LenderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String? |  yes  |  |
 | name | String? |  yes  |  |
 | id | String? |  yes  |  |
 | theme | [LenderTheme](#LenderTheme)? |  yes  |  |

---


 
 
 #### [OutstandingData](#OutstandingData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenderDetails | [LenderDetails](#LenderDetails)? |  yes  |  |
 | availableLimit | Double? |  yes  |  |
 | creditLimit | Double? |  yes  |  |
 | dueAmount | Double? |  yes  |  |
 | outstandingAmount | Double? |  yes  |  |
 | dueDate | String? |  yes  |  |

---


 
 
 #### [OutstandingDetailsResponse](#OutstandingDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | outstandingDetails | ArrayList<[OutstandingData](#OutstandingData)>? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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



