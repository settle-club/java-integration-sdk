



##### [Back to Public docs](./README.md)

## MultiKyc Methods
Will deprecate Hawkeye
* [getAlllenders](#getalllenders)
* [getLenderMetaSchema](#getlendermetaschema)
* [addLenderMetaSchema](#addlendermetaschema)
* [getAllUserLendersByEnityId](#getalluserlendersbyenityid)
* [getAvailableLimit](#getavailablelimit)
* [getUserKycDetails](#getuserkycdetails)
* [createPixelbinSignedUrl](#createpixelbinsignedurl)



## Methods with example and description


### getAlllenders
Get alllenders




```java
multikyc.getAlllenders( lenderId,  lenderSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderId | String? | no |  |   
| lenderSlug | String? | no |  |  





*Returned Response:*




[Lender](#Lender)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getLenderMetaSchema
Get lender meta schema




```java
multikyc.getLenderMetaSchema( lenderSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |  





*Returned Response:*




[MetaSchema](#MetaSchema)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### addLenderMetaSchema
Add lender meta schema




```java
multikyc.addLenderMetaSchema( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |  
| body | [AddMetaSchemaRequest](#AddMetaSchemaRequest) | yes | Request body |




*Returned Response:*




[AddMetaSchema](#AddMetaSchema)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getAllUserLendersByEnityId
Get all user lenders by enity id




```java
multikyc.getAllUserLendersByEnityId( entityId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | Object | yes |  |   
| entityId | String | yes |  |  





*Returned Response:*




[GetUserLendersResponse](#GetUserLendersResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getAvailableLimit
Get available limit




```java
multikyc.getAvailableLimit( lenderSlug,  entityId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |   
| entityId | String | yes |  |  





*Returned Response:*




[CreditLimitResponse](#CreditLimitResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getUserKycDetails
Get user kyc details




```java
multikyc.getUserKycDetails( enitityMap,  entityId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes |  |   
| enitityMap | String | yes |  |   
| entityId | String | yes |  |  





*Returned Response:*




[CustomerKycDetailsReponse](#CustomerKycDetailsReponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createPixelbinSignedUrl
Create pixelbin signed url




```java
multikyc.createPixelbinSignedUrl( documentName,  purpose,  extention) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| documentName | String | yes |  |   
| purpose | String? | no |  |   
| extention | String? | no |  |  





*Returned Response:*




[SignedUrlResponse](#SignedUrlResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [Lender](#Lender)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | imageUrl | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | theme | Object? |  yes  |  |
 | b2B | Boolean? |  yes  |  |
 | b2C | Boolean? |  yes  |  |
 | merchantConfigSchema | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | meta | Object? |  yes  |  |
 | metaSchema | Object? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [UserKycDetail](#UserKycDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | status | String |  no  |  |
 | type | String |  no  |  |
 | remark | String |  no  |  |
 | profileType | String |  no  |  |
 | active | Boolean |  no  |  |
 | expiryDate | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | lenderId | String |  no  |  |
 | lender | [Lender](#Lender)? |  yes  |  |
 | entityMapId | String? |  yes  |  |
 | entityId | String? |  yes  |  |

---


 
 
 #### [Form](#Form)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | title | String? |  yes  |  |
 | subtitle | String? |  yes  |  |
 | action | String? |  yes  |  |
 | form | Object? |  yes  |  |
 | uiSchema | Object? |  yes  |  |
 | workflowId | String? |  yes  |  |

---


 
 
 #### [LenderKycStepMap](#LenderKycStepMap)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | step | String |  no  |  |
 | stepIndex | Double |  no  |  |
 | lenderId | String |  no  |  |
 | active | Boolean |  no  |  |
 | rules | Object |  no  |  |
 | profileType | String |  no  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | name | String |  no  |  |
 | description | String |  no  |  |
 | iconUrl | String |  no  |  |
 | isInteractive | Boolean |  no  |  |
 | formId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | form | [Form](#Form) |  no  |  |
 | docSchema | Object |  no  |  |

---


 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | imageUrl | String |  no  |  |
 | number | String |  no  |  |
 | detail | Object |  no  |  |
 | valid | Boolean |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | deletedAt | String? |  yes  |  |
 | entityId | String? |  yes  |  |

---


 
 
 #### [UserKycLenderStepMap](#UserKycLenderStepMap)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | lenderKycStepMapId | String |  no  |  |
 | userKycDetailId | String |  no  |  |
 | lenderId | String |  no  |  |
 | ruleState | Object |  no  |  |
 | active | Boolean |  no  |  |
 | status | String |  no  |  |
 | documentId | String? |  yes  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | deletedAt | String? |  yes  |  |
 | lenderKycStepMap | [LenderKycStepMap](#LenderKycStepMap)? |  yes  |  |
 | entityMapId | String? |  yes  |  |
 | entityId | String? |  yes  |  |
 | updatedBy | String? |  yes  |  |

---


 
 
 #### [UserLender](#UserLender)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | lenderId | String |  no  |  |
 | active | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | deletedAt | String? |  yes  |  |
 | approvedLimit | Double |  no  |  |
 | entityId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [ProofOfIdentity](#ProofOfIdentity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dob | String |  no  |  |
 | hashedEmail | String |  no  |  |
 | gender | String |  no  |  |
 | hashedMobileNumber | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ProofOfAddress](#ProofOfAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | careOf | String |  no  |  |
 | country | String |  no  |  |
 | district | String |  no  |  |
 | house | String |  no  |  |
 | landmark | String |  no  |  |
 | locality | String |  no  |  |
 | pincode | String |  no  |  |
 | postOffice | String |  no  |  |
 | state | String |  no  |  |
 | street | String |  no  |  |
 | subDistrict | String |  no  |  |
 | vtc | String |  no  |  |

---


 
 
 #### [EAadhaarData](#EAadhaarData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aadhaarReferenceNumber | String |  no  |  |
 | aadhaarUid | String |  no  |  |
 | image | String |  no  |  |
 | proofOfIdentity | [ProofOfIdentity](#ProofOfIdentity) |  no  |  |
 | proofOfAddress | [ProofOfAddress](#ProofOfAddress) |  no  |  |
 | xml | String? |  yes  |  |
 | pdf | String? |  yes  |  |
 | address | String? |  yes  |  |

---


 
 
 #### [EntityMapDto](#EntityMapDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | merchantId | String? |  yes  |  |
 | status | String? |  yes  |  |
 | lenderId | String |  no  |  |
 | limit | Double? |  yes  |  |
 | creditType | String? |  yes  |  |
 | userId | String |  no  |  |
 | entityId | String |  no  |  |

---


 
 
 #### [EntityDto](#EntityDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | type | String? |  yes  |  |
 | address | String? |  yes  |  |
 | name | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | dob | String? |  yes  |  |
 | userId | String |  no  |  |

---


 
 
 #### [MerchantSchema](#MerchantSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | website | String? |  yes  |  |
 | apiHook | String? |  yes  |  |
 | epikId | String? |  yes  |  |
 | disbursementAccountHolderName | String? |  yes  |  |
 | disbursementAccountNumber | String? |  yes  |  |
 | disbursementIfsc | String? |  yes  |  |
 | createdBy | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | category | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | businessName | String? |  yes  |  |
 | email | String? |  yes  |  |
 | businessAddress | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | b2B | Boolean? |  yes  |  |
 | b2C | Boolean? |  yes  |  |

---


 
 
 #### [Consent](#Consent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ValidatePanRequest](#ValidatePanRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pan | String |  no  |  |
 | consents | ArrayList<[Consent](#Consent)> |  no  |  |

---


 
 
 #### [BankDetails](#BankDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | accountType | String |  no  |  |
 | bankName | String |  no  |  |
 | ifsc | String |  no  |  |
 | accountNumber | String |  no  |  |
 | accountHolderName | String |  no  |  |

---


 
 
 #### [DocumentData](#DocumentData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | selfie | String? |  yes  |  |
 | video | String? |  yes  |  |
 | digilockerCode | String? |  yes  |  |
 | bankDetails | [BankDetails](#BankDetails)? |  yes  |  |

---


 
 
 #### [ConfirmPanRequest](#ConfirmPanRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pan | String |  no  |  |
 | name | String |  no  |  |
 | entity | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | onboardingToken | String? |  yes  |  |

---


 
 
 #### [LivelinessDetails](#LivelinessDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | selfie | String |  no  |  |
 | video | String |  no  |  |

---


 
 
 #### [UploadDocumentRequest](#UploadDocumentRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | Object? |  yes  |  |
 | documentData | Object? |  yes  |  |
 | lenderSlug | String |  no  |  |
 | kycStep | String |  no  |  |
 | merchantId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [UploadDocumentRequestV1](#UploadDocumentRequestV1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kycStep | String |  no  |  |
 | entityMapId | String |  no  |  |
 | documentData | Object |  no  |  |

---


 
 
 #### [UploadDocumentRequestV3](#UploadDocumentRequestV3)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kycStep | String |  no  |  |
 | entityMapId | String |  no  |  |
 | documentData | Object |  no  |  |

---


 
 
 #### [AadhaarRequest](#AadhaarRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | digilockerCode | String? |  yes  |  |

---


 
 
 #### [UploadAadhaarRequest](#UploadAadhaarRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [AadhaarRequest](#AadhaarRequest)? |  yes  |  |
 | user | Object? |  yes  |  |
 | lenderSlug | String |  no  |  |
 | kycStep | String |  no  |  |
 | merchantId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [UploadLivelinessRequest](#UploadLivelinessRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [LivelinessDetails](#LivelinessDetails)? |  yes  |  |
 | user | Object? |  yes  |  |
 | lenderSlug | String |  no  |  |
 | kycStep | String |  no  |  |
 | merchantId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [UploadAadhaarRequestV1](#UploadAadhaarRequestV1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [AadhaarRequest](#AadhaarRequest) |  no  |  |
 | kycStep | String |  no  |  |
 | entityMapId | String |  no  |  |

---


 
 
 #### [UploadLivelinessRequestV1](#UploadLivelinessRequestV1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [LivelinessDetails](#LivelinessDetails) |  no  |  |
 | kycStep | String |  no  |  |
 | entityMapId | String |  no  |  |

---


 
 
 #### [UploadAadhaarRequestV2](#UploadAadhaarRequestV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [AadhaarRequest](#AadhaarRequest)? |  yes  |  |
 | user | Object? |  yes  |  |
 | lenderSlug | String |  no  |  |
 | kycStep | String |  no  |  |
 | merchantId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [UploadLivelinessRequestV2](#UploadLivelinessRequestV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [LivelinessDetails](#LivelinessDetails)? |  yes  |  |
 | user | Object? |  yes  |  |
 | lenderSlug | String |  no  |  |
 | kycStep | String |  no  |  |
 | merchantId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [UploadAadhaarRequestV3](#UploadAadhaarRequestV3)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [AadhaarRequest](#AadhaarRequest) |  no  |  |
 | kycStep | String |  no  |  |
 | entityMapId | String |  no  |  |

---


 
 
 #### [UploadLivelinessRequestV3](#UploadLivelinessRequestV3)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [LivelinessDetails](#LivelinessDetails) |  no  |  |
 | kycStep | String |  no  |  |
 | entityMapId | String |  no  |  |

---


 
 
 #### [UploadBankDetailsRequest](#UploadBankDetailsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentData | [BankDetails](#BankDetails)? |  yes  |  |
 | user | Object? |  yes  |  |
 | lenderSlug | String |  no  |  |
 | kycStep | String |  no  |  |
 | merchantId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [InitiateKycRequest](#InitiateKycRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kycType | String |  no  |  |
 | kycId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |

---


 
 
 #### [InitiateKycRequestV1](#InitiateKycRequestV1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityMapId | String |  no  |  |
 | kycType | String |  no  |  |
 | kycId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |

---


 
 
 #### [LenderOnboardRequest](#LenderOnboardRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ack | String? |  yes  |  |
 | data | Object |  no  |  |
 | merchantId | String? |  yes  |  |

---


 
 
 #### [LenderOnboardRequestV1](#LenderOnboardRequestV1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityMapId | String |  no  |  |
 | ack | String? |  yes  |  |
 | data | Object |  no  |  |
 | merchantId | String? |  yes  |  |

---


 
 
 #### [UpdateLenderStatusRequest](#UpdateLenderStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | payload | Object |  no  |  |
 | data | Object |  no  |  |
 | action | Boolean |  no  |  |

---


 
 
 #### [UpdateProfileRequest](#UpdateProfileRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | dob | String? |  yes  |  |
 | userId | String |  no  |  |
 | isOnboarded | Boolean? |  yes  |  |
 | address | String? |  yes  |  |

---


 
 
 #### [UpdateEntityRequest](#UpdateEntityRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | dob | String? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | address | [ProofOfAddress](#ProofOfAddress)? |  yes  |  |

---


 
 
 #### [CreateKycStepsRequest](#CreateKycStepsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |

---


 
 
 #### [CreateLenderPgConfigRequest](#CreateLenderPgConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mid | String |  no  |  |
 | clientId | String |  no  |  |
 | secret | String |  no  |  |
 | active | Boolean |  no  |  |
 | pgId | String |  no  |  |
 | lenderId | String |  no  |  |

---


 
 
 #### [CreateLenderStateRequest](#CreateLenderStateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |

---


 
 
 #### [UpdateLenderRequest](#UpdateLenderRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |
 | lenderId | String |  no  |  |

---


 
 
 #### [OtherPolicyFilters](#OtherPolicyFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderBy | ArrayList<Object>? |  yes  |  |

---


 
 
 #### [GetPolicyFilters](#GetPolicyFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | policyType | String? |  yes  |  |
 | lenderIds | ArrayList<Object>? |  yes  |  |
 | merchantIds | ArrayList<Object>? |  yes  |  |
 | orderBy | ArrayList<Object>? |  yes  |  |

---


 
 
 #### [GetPolicyFilters2](#GetPolicyFilters2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | breType | String? |  yes  |  |
 | lenderId | ArrayList<Object>? |  yes  |  |
 | merchantId | ArrayList<Object>? |  yes  |  |
 | loanType | String? |  yes  |  |
 | journeyType | String? |  yes  |  |
 | subType | String? |  yes  |  |

---


 
 
 #### [MerchantConfigRequest](#MerchantConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | merchantConfigSchema | Object |  no  |  |

---


 
 
 #### [PanDetails](#PanDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | idNumber | String |  no  |  |

---


 
 
 #### [FilterByDate](#FilterByDate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [AvailableLendersRequest](#AvailableLendersRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | chargeToken | String |  no  |  |

---


 
 
 #### [InitialData](#InitialData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String |  no  |  |
 | entityId | String |  no  |  |

---


 
 
 #### [ExecutePolicyRequest](#ExecutePolicyRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | policyFilters | [GetPolicyFilters](#GetPolicyFilters)? |  yes  |  |
 | initialData | [InitialData](#InitialData) |  no  |  |

---


 
 
 #### [ExecutePolicyRequest2](#ExecutePolicyRequest2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | policyFilters | [GetPolicyFilters2](#GetPolicyFilters2)? |  yes  |  |
 | initialData | [InitialData](#InitialData) |  no  |  |

---


 
 
 #### [RegisterGstRequest](#RegisterGstRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstin | String |  no  |  |
 | skipGst | Boolean? |  yes  |  |
 | onboardingToken | String? |  yes  |  |

---


 
 
 #### [PopulateFormRequest](#PopulateFormRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | form | Object |  no  |  |
 | lenderId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |

---


 
 
 #### [ValidateFormFieldRequest](#ValidateFormFieldRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | workflowName | String |  no  |  |
 | userId | String? |  yes  |  |
 | entityId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | fields | Object |  no  |  |

---


 
 
 #### [MerchantMetricFilter](#MerchantMetricFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | display | String |  no  |  |
 | value | ArrayList<Object> |  no  |  |
 | isSelected | Boolean? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [LenderCustomerMetricsRequest](#LenderCustomerMetricsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort | ArrayList<[MerchantMetricFilter](#MerchantMetricFilter)>? |  yes  |  |
 | filters | ArrayList<[MerchantMetricFilter](#MerchantMetricFilter)>? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | pivotPoints | Double? |  yes  |  |

---


 
 
 #### [StonewallCustomer](#StonewallCustomer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [GetLimitRequest](#GetLimitRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenderSlugs | ArrayList<Object>? |  yes  |  |
 | onlyDefaultLender | Boolean? |  yes  |  |
 | customer | [StonewallCustomer](#StonewallCustomer) |  no  |  |

---


 
 
 #### [DocumentObject](#DocumentObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | name | String? |  yes  |  |
 | imageUrl | String? |  yes  |  |
 | number | String |  no  |  |
 | detail | Object |  no  |  |
 | valid | Boolean? |  yes  |  |
 | entityId | String? |  yes  |  |

---


 
 
 #### [ManualKycRequest](#ManualKycRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | remark | Object |  no  |  |
 | status | String |  no  |  |
 | stepId | String |  no  |  |
 | entityMapId | String |  no  |  |
 | documentData | [DocumentObject](#DocumentObject)? |  yes  |  |

---


 
 
 #### [RetriggerLenderOnboardRequest](#RetriggerLenderOnboardRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stepId | String |  no  |  |
 | data | Object |  no  |  |

---


 
 
 #### [RetriggerLenderOnboardRequestV2](#RetriggerLenderOnboardRequestV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenderUserId | String |  no  |  |
 | stepName | String |  no  |  |
 | data | Object |  no  |  |
 | entityMapId | String |  no  |  |

---


 
 
 #### [BusinessDetail](#BusinessDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | String |  no  |  |
 | shopName | String? |  yes  |  |
 | legalName | String |  no  |  |
 | address | String? |  yes  |  |
 | type | String? |  yes  |  |
 | pincode | String? |  yes  |  |

---


 
 
 #### [VintageData](#VintageData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | month | Double |  no  |  |
 | year | Double |  no  |  |
 | totalTransactions | Double |  no  |  |
 | totalTransactionAmount | Double |  no  |  |
 | totalCancellations | Double? |  yes  |  |
 | totalCancellationAmount | Double? |  yes  |  |

---


 
 
 #### [DocumentObjects](#DocumentObjects)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String |  no  |  |
 | category | String |  no  |  |
 | type | String |  no  |  |
 | name | String? |  yes  |  |
 | issuedOn | String? |  yes  |  |
 | issuedAt | String? |  yes  |  |
 | issuedBy | String? |  yes  |  |
 | expiryOn | String? |  yes  |  |

---


 
 
 #### [AddVintageRequest](#AddVintageRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | Object |  no  |  |
 | businessDetails | [BusinessDetail](#BusinessDetail) |  no  |  |
 | vintageData | [VintageData](#VintageData) |  no  |  |
 | documents | [DocumentObjects](#DocumentObjects) |  no  |  |
 | merchant | [MerchantSchema](#MerchantSchema) |  no  |  |

---


 
 
 #### [CheckEligibilityRequest](#CheckEligibilityRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entity | [EntityDto](#EntityDto)? |  yes  |  |
 | isPreApproved | Boolean |  no  |  |
 | fetchLimit | Boolean? |  yes  |  |
 | user | Object |  no  |  |
 | businessDetails | [BusinessDetail](#BusinessDetail) |  no  |  |
 | vintageData | [VintageData](#VintageData) |  no  |  |
 | documents | [DocumentObjects](#DocumentObjects) |  no  |  |
 | merchant | [MerchantSchema](#MerchantSchema) |  no  |  |

---


 
 
 #### [KycCountByStatus](#KycCountByStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | lenderId | String? |  yes  |  |

---


 
 
 #### [FindDocResponse](#FindDocResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | info | String |  no  |  |
 | details | Object? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [LenderKycStatus](#LenderKycStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | lenderId | String? |  yes  |  |
 | lenderName | String? |  yes  |  |
 | kycType | String? |  yes  |  |

---


 
 
 #### [StateResponeDto](#StateResponeDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | step | [UserKycLenderStepMap](#UserKycLenderStepMap) |  no  |  |
 | isStepCompleted | Boolean |  no  |  |

---


 
 
 #### [KycStateMachineDto](#KycStateMachineDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kycResult | [UserKycDetail](#UserKycDetail) |  no  |  |
 | action | [UserKycLenderStepMap](#UserKycLenderStepMap)? |  yes  |  |

---


 
 
 #### [InitiateKycDto](#InitiateKycDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kycType | String |  no  |  |
 | lenderId | String |  no  |  |
 | user | Object |  no  |  |
 | kycId | String? |  yes  |  |
 | entityRelation | [EntityMapDto](#EntityMapDto)? |  yes  |  |

---


 
 
 #### [LenderOnboardDto](#LenderOnboardDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lender | [Lender](#Lender)? |  yes  |  |
 | user | Object |  no  |  |
 | userLenderDetail | [UserLender](#UserLender)? |  yes  |  |
 | payload | [LenderOnboardRequest](#LenderOnboardRequest) |  no  |  |
 | entityRelation | [EntityMapDto](#EntityMapDto)? |  yes  |  |
 | ipAddress | String |  no  |  |
 | overrideTtl | Boolean? |  yes  |  |

---


 
 
 #### [StepDetails](#StepDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | description | String? |  yes  |  |
 | iconUrl | String? |  yes  |  |
 | status | String |  no  |  |
 | step | String |  no  |  |
 | order | Double |  no  |  |

---


 
 
 #### [OnboardStatusDto](#OnboardStatusDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onboardStep | String |  no  |  |
 | onboardingId | String |  no  |  |
 | status | String |  no  |  |
 | action | String |  no  |  |
 | actionStatus | String |  no  |  |
 | lender | [Lender](#Lender) |  no  |  |
 | navigation | String? |  yes  |  |
 | approvedLimit | Double |  no  |  |
 | proposedLimit | Double |  no  |  |
 | actionData | Object? |  yes  |  |
 | steps | ArrayList<[StepDetails](#StepDetails)>? |  yes  |  |
 | entityId | String |  no  |  |
 | entityMapId | String |  no  |  |
 | actionIsForm | Boolean |  no  |  |
 | actionForm | [Form](#Form)? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | actionName | String? |  yes  |  |
 | actionDescription | String? |  yes  |  |

---


 
 
 #### [LenderFilters](#LenderFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includeStatus | ArrayList<Object>? |  yes  |  |
 | excludeStatus | ArrayList<Object>? |  yes  |  |
 | allowDisabledLender | Object? |  yes  |  |

---


 
 
 #### [Policy](#Policy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | url | String? |  yes  |  |
 | data | Object? |  yes  |  |
 | version | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | type | Object? |  yes  |  |
 | index | Integer? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | workflowId | String? |  yes  |  |
 | schemaRef | ArrayList<Object>? |  yes  |  |
 | masterVariableRef | ArrayList<Object>? |  yes  |  |
 | customVariable | Object? |  yes  |  |
 | subType | String? |  yes  |  |
 | createdAt | Object? |  yes  |  |
 | updatedAt | Object? |  yes  |  |
 | deletedAt | Object? |  yes  |  |

---


 
 
 #### [OrganizationLogosObject](#OrganizationLogosObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | logo | String |  no  |  |
 | active | Boolean |  no  |  |

---


 
 
 #### [MetricSubTypes](#MetricSubTypes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | date | String |  no  |  |
 | count | String? |  yes  |  |
 | sum | String? |  yes  |  |

---


 
 
 #### [MetricTypes](#MetricTypes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pivots | ArrayList<[MetricSubTypes](#MetricSubTypes)> |  no  |  |
 | total | String? |  yes  |  |
 | description | String |  no  |  |
 | title | String |  no  |  |
 | valueFormat | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [BreApprovedUsersResponse](#BreApprovedUsersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [MetricTypes](#MetricTypes) |  no  |  |

---


 
 
 #### [Metrics](#Metrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenderApprovedUsers | [MetricTypes](#MetricTypes) |  no  |  |
 | breApprovedUsers | [MetricTypes](#MetricTypes) |  no  |  |
 | totalCreditLine | [MetricTypes](#MetricTypes) |  no  |  |

---


 
 
 #### [MetricData](#MetricData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | metrics | [Metrics](#Metrics) |  no  |  |
 | filters | ArrayList<[MerchantMetricFilter](#MerchantMetricFilter)> |  no  |  |
 | sort | ArrayList<[MerchantMetricFilter](#MerchantMetricFilter)> |  no  |  |

---


 
 
 #### [GetAllUserLendersByEnityId](#GetAllUserLendersByEnityId)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityId | String |  no  |  |
 | entityMapId | String |  no  |  |
 | userId | String |  no  |  |
 | status | String |  no  |  |
 | lender | [Lender](#Lender)? |  yes  |  |
 | partnerId | String? |  yes  |  |
 | approvedLimit | Double? |  yes  |  |

---


 
 
 #### [ApprovedLenders](#ApprovedLenders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | lenders | ArrayList<[BreOutput](#BreOutput)> |  no  |  |

---


 
 
 #### [BreResultStatus](#BreResultStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | approvedLenders | ArrayList<[BreOutput](#BreOutput)>? |  yes  |  |

---


 
 
 #### [LenderState](#LenderState)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String |  no  |  |
 | lenderId | String |  no  |  |
 | index | Integer |  no  |  |
 | workflowName | String |  no  |  |
 | workflowUrl | String? |  yes  |  |
 | active | Boolean |  no  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | lender | [Lender](#Lender)? |  yes  |  |
 | parentStateId | String? |  yes  |  |
 | ttl | Double |  no  |  |
 | displayName | String? |  yes  |  |
 | description | String? |  yes  |  |
 | iconUrl | String? |  yes  |  |
 | isInteractive | Boolean |  no  |  |
 | schema | Object? |  yes  |  |

---


 
 
 #### [UserLenderState](#UserLenderState)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | lenderStateId | String |  no  |  |
 | lenderId | String |  no  |  |
 | userId | String |  no  |  |
 | status | String |  no  |  |
 | userLenderId | String |  no  |  |
 | remark | String |  no  |  |
 | active | Boolean |  no  |  |
 | lenderState | [LenderState](#LenderState)? |  yes  |  |
 | data | Object? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |
 | entityId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |
 | updatedBy | String? |  yes  |  |

---


 
 
 #### [LenderConfig](#LenderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | baseUrl | String |  no  |  |
 | accessToken | String? |  yes  |  |
 | secret | String? |  yes  |  |
 | data | Object |  no  |  |
 | lenderId | String |  no  |  |
 | active | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---


 
 
 #### [Pg](#Pg)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | active | Boolean |  no  |  |

---


 
 
 #### [LenderPgConfig](#LenderPgConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | mid | String |  no  |  |
 | clientId | String |  no  |  |
 | secret | String |  no  |  |
 | lenderId | String |  no  |  |
 | pgId | String |  no  |  |
 | active | Boolean |  no  |  |

---


 
 
 #### [FileUploadResponse](#FileUploadResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fileId | String |  no  |  |
 | name | String |  no  |  |
 | path | String |  no  |  |
 | format | String |  no  |  |
 | size | Double |  no  |  |
 | access | String |  no  |  |
 | tags | String |  no  |  |
 | metadata | String |  no  |  |
 | url | String |  no  |  |
 | thumbnail | String |  no  |  |

---


 
 
 #### [PresignedUrl](#PresignedUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | fields | Object |  no  |  |

---


 
 
 #### [PresignedUrlV2](#PresignedUrlV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | fields | Object |  no  |  |

---


 
 
 #### [LenderDocument](#LenderDocument)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | type | String? |  yes  |  |
 | document | Object? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---


 
 
 #### [SourceCreditReport](#SourceCreditReport)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | pan | String |  no  |  |
 | name | String |  no  |  |
 | mobile | String |  no  |  |
 | bureau | String |  no  |  |
 | score | String |  no  |  |
 | report | String |  no  |  |
 | createdAt | String? |  yes  |  |

---


 
 
 #### [Commercial](#Commercial)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | lenderId | String |  no  |  |
 | merchantId | String |  no  |  |
 | commercial | Object |  no  |  |
 | active | Boolean |  no  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [KycStatusResponse](#KycStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isKycInitiated | Boolean |  no  |  |
 | userId | String |  no  |  |
 | kycStatuses | ArrayList<[LenderKycStatus](#LenderKycStatus)> |  no  |  |

---


 
 
 #### [WorkflowResponse](#WorkflowResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object? |  yes  |  |

---


 
 
 #### [Action](#Action)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | step | String |  no  |  |
 | status | String |  no  |  |
 | index | Double |  no  |  |
 | isForm | Boolean? |  yes  |  |
 | form | [Form](#Form) |  no  |  |

---


 
 
 #### [InitiateKycResponse](#InitiateKycResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kycResult | [UserKycDetail](#UserKycDetail) |  no  |  |
 | action | [Action](#Action) |  no  |  |

---


 
 
 #### [UploadDocResponse](#UploadDocResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | data | Object? |  yes  |  |
 | remark | String? |  yes  |  |
 | reasons | String |  no  |  |
 | kycResult | [UserKycDetail](#UserKycDetail) |  no  |  |
 | action | [Action](#Action) |  no  |  |

---


 
 
 #### [LenderOnboardResponse](#LenderOnboardResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | [UserLender](#UserLender) |  no  |  |
 | action | [UserLenderState](#UserLenderState) |  no  |  |
 | data | Object |  no  |  |

---


 
 
 #### [OnboardingStatusResponse](#OnboardingStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onboardStatuses | ArrayList<[OnboardStatusDto](#OnboardStatusDto)> |  no  |  |

---


 
 
 #### [SignedUrlResponse](#SignedUrlResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | signedUrl | [PresignedUrl](#PresignedUrl) |  no  |  |
 | fileUrl | String |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [SignedUrlV2Response](#SignedUrlV2Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | signedUrl | [PresignedUrlV2](#PresignedUrlV2) |  no  |  |
 | fileUrl | String |  no  |  |

---


 
 
 #### [PresignedUrlV3](#PresignedUrlV3)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | signedUrl | String |  no  |  |
 | provider | Object |  no  |  |

---


 
 
 #### [SignedUrlV3Response](#SignedUrlV3Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | signedDetails | [PresignedUrlV3](#PresignedUrlV3) |  no  |  |
 | fileUrl | String |  no  |  |

---


 
 
 #### [DigilockerLinkResponse](#DigilockerLinkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | authorizationUrl | String |  no  |  |

---


 
 
 #### [GetDocumentsResponse](#GetDocumentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documents | ArrayList<[FindDocResponse](#FindDocResponse)> |  no  |  |

---


 
 
 #### [ApprovedLendersTransaction](#ApprovedLendersTransaction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | imageUrl | String |  no  |  |
 | status | String |  no  |  |
 | active | Boolean |  no  |  |
 | proposedLimit | Double |  no  |  |
 | createdAt | Object |  no  |  |
 | updatedAt | Object |  no  |  |
 | deletedAt | Object? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |

---


 
 
 #### [ApprovedPossibleLenders](#ApprovedPossibleLenders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | Double |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | active | Boolean |  no  |  |
 | id | String |  no  |  |
 | theme | Object? |  yes  |  |

---


 
 
 #### [AvailableLenders](#AvailableLenders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | approvedLenders | ArrayList<[ApprovedPossibleLenders](#ApprovedPossibleLenders)> |  no  |  |
 | possibleLenders | ArrayList<[ApprovedPossibleLenders](#ApprovedPossibleLenders)> |  no  |  |

---


 
 
 #### [CreditLimit](#CreditLimit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | availableLimit | Double |  no  |  |
 | approvedLimit | Double |  no  |  |

---


 
 
 #### [CreditLimitResponse](#CreditLimitResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | message | String |  no  |  |
 | action | Boolean |  no  |  |
 | credit | [CreditLimit](#CreditLimit) |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [LenderPgConfigResponse](#LenderPgConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | mid | String |  no  |  |
 | clientId | String |  no  |  |
 | secret | String |  no  |  |
 | lenderId | String |  no  |  |
 | pgId | String |  no  |  |
 | active | Boolean |  no  |  |
 | pgName | String |  no  |  |
 | pgActive | Boolean |  no  |  |

---


 
 
 #### [GetLendersResponse](#GetLendersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[Lender](#Lender)> |  no  |  |

---


 
 
 #### [LenderConfigurationResponse](#LenderConfigurationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lender | [Lender](#Lender) |  no  |  |
 | lenderPgConfig | [LenderPgConfig](#LenderPgConfig) |  no  |  |
 | lenderConfig | [LenderConfig](#LenderConfig) |  no  |  |
 | lenderState | ArrayList<[LenderState](#LenderState)> |  no  |  |
 | lenderKycStepMap | ArrayList<[LenderKycStepMap](#LenderKycStepMap)> |  no  |  |

---


 
 
 #### [UpsertLenderResponse](#UpsertLenderResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |

---


 
 
 #### [UpsertLenderConfigResponse](#UpsertLenderConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |

---


 
 
 #### [CreateKycStepsSchema](#CreateKycStepsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[LenderKycStepMap](#LenderKycStepMap)> |  no  |  |

---


 
 
 #### [CreatePaymentGatewaySchema](#CreatePaymentGatewaySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[LenderPgConfig](#LenderPgConfig)> |  no  |  |

---


 
 
 #### [CreateLenderStateSchema](#CreateLenderStateSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[LenderState](#LenderState)> |  no  |  |

---


 
 
 #### [GetAllPaymentGatewaysSchema](#GetAllPaymentGatewaysSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[Pg](#Pg)> |  no  |  |

---


 
 
 #### [PolicyResponse](#PolicyResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | policies | ArrayList<[Policy](#Policy)> |  no  |  |

---


 
 
 #### [CreditCheckBreResponse](#CreditCheckBreResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | newLenderAssigned | Boolean |  no  |  |
 | breStatus | String |  no  |  |

---


 
 
 #### [MerchantConfigResponse](#MerchantConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | merhantConfigSchema | String |  no  |  |

---


 
 
 #### [UserLenderByIdAndStatusResponse](#UserLenderByIdAndStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | lenderId | String |  no  |  |
 | active | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | deletedAt | String? |  yes  |  |
 | approvedLimit | Double |  no  |  |
 | slug | String? |  yes  |  |
 | theme | Object? |  yes  |  |
 | name | Object? |  yes  |  |

---


 
 
 #### [IntgrAvailableCreditLimit](#IntgrAvailableCreditLimit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | Double |  no  |  |
 | lenderName | String |  no  |  |
 | slug | String |  no  |  |
 | isDefault | Boolean |  no  |  |
 | logoUrl | String |  no  |  |

---


 
 
 #### [IngtrAvailableLimit](#IngtrAvailableLimit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | available | ArrayList<[IntgrAvailableCreditLimit](#IntgrAvailableCreditLimit)> |  no  |  |
 | possible | ArrayList<[IntgrAvailableCreditLimit](#IntgrAvailableCreditLimit)>? |  yes  |  |

---


 
 
 #### [IntgrCreditLimit](#IntgrCreditLimit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | [IngtrAvailableLimit](#IngtrAvailableLimit) |  no  |  |

---


 
 
 #### [PossibleLendersInternal](#PossibleLendersInternal)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | limit | Boolean |  no  |  |
 | lenderName | String |  no  |  |
 | slug | String |  no  |  |
 | isDefault | Boolean |  no  |  |
 | logo | String |  no  |  |
 | lenderId | String |  no  |  |

---


 
 
 #### [PossibleLendersInternalResponse](#PossibleLendersInternalResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenders | ArrayList<[PossibleLendersInternal](#PossibleLendersInternal)> |  no  |  |

---


 
 
 #### [GetTotalKycResponse](#GetTotalKycResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalKyc | String |  no  |  |

---


 
 
 #### [GetTotalKycCompletedUsersResponse](#GetTotalKycCompletedUsersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalKycCompletedUsers | String |  no  |  |

---


 
 
 #### [GetTotalPendingUsersResponse](#GetTotalPendingUsersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalPendingKyc | String |  no  |  |

---


 
 
 #### [GetTotalCreditProvidedResponse](#GetTotalCreditProvidedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalCreditLimit | String |  no  |  |

---


 
 
 #### [MetaSchemaResponse](#MetaSchemaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | name | String |  no  |  |
 | required | ArrayList<String> |  no  |  |
 | type | String |  no  |  |
 | properties | HashMap<String,Object> |  no  |  |

---


 
 
 #### [MetaSchema](#MetaSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | metaSchema | [MetaSchemaResponse](#MetaSchemaResponse) |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AddMetaSchema](#AddMetaSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenderSlug | String |  no  |  |
 | merchantId | String |  no  |  |
 | schema | Object |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AddMetaSchemaRequest](#AddMetaSchemaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | merchantId | String |  no  |  |
 | schema | Object |  no  |  |

---


 
 
 #### [ValidatePanResponse](#ValidatePanResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | panName | String |  no  |  |
 | isPanValid | String |  no  |  |
 | pan | String |  no  |  |
 | isProprietor | Boolean |  no  |  |
 | panType | String |  no  |  |
 | errorCode | String? |  yes  |  |
 | status | String? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [ConfirmPanResonse](#ConfirmPanResonse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | statusCode | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [LenderCountResponse](#LenderCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Double |  no  |  |
 | inActive | Double |  no  |  |

---


 
 
 #### [OnboardStepsDto](#OnboardStepsDto)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | steps | ArrayList<[StepDetails](#StepDetails)> |  no  |  |
 | lender | [Lender](#Lender) |  no  |  |

---


 
 
 #### [OnboardStepsResponse](#OnboardStepsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stepDetails | ArrayList<[OnboardStepsDto](#OnboardStepsDto)> |  no  |  |

---


 
 
 #### [LenderDocumentResponse](#LenderDocumentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [LenderDocument](#LenderDocument) |  no  |  |

---


 
 
 #### [GetUserLendersResponse](#GetUserLendersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[UserLender](#UserLender)> |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CreditReportResponse](#CreditReportResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [SourceCreditReport](#SourceCreditReport) |  no  |  |

---


 
 
 #### [KycDetailsReponse](#KycDetailsReponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [UserKycLenderStepMap](#UserKycLenderStepMap) |  no  |  |

---


 
 
 #### [GetDocumentByIdResponse](#GetDocumentByIdResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [Document](#Document) |  no  |  |

---


 
 
 #### [GetAllFormsResponse](#GetAllFormsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |

---


 
 
 #### [UpsertFormResponse](#UpsertFormResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |

---


 
 
 #### [GstDetails](#GstDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstin | String |  no  |  |
 | businessName | String |  no  |  |

---


 
 
 #### [GstDetailsResponse](#GstDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstDetails | ArrayList<[GstDetails](#GstDetails)> |  no  |  |

---


 
 
 #### [RegisterGstResponse](#RegisterGstResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstDocDetails | [Document](#Document) |  no  |  |
 | status | String |  no  |  |

---


 
 
 #### [PopulateFormResponse](#PopulateFormResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | form | Object |  no  |  |

---


 
 
 #### [ValidateFormFieldResponse](#ValidateFormFieldResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | message | String |  no  |  |
 | data | Object |  no  |  |

---


 
 
 #### [LenderCustomerMetricsResponse](#LenderCustomerMetricsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | message | String |  no  |  |
 | data | [MetricData](#MetricData) |  no  |  |

---


 
 
 #### [BreOutput](#BreOutput)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | entityId | String |  no  |  |
 | lenderId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | policyName | String |  no  |  |
 | category | String |  no  |  |
 | type | String |  no  |  |
 | output | Object |  no  |  |
 | status | String |  no  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | deletedAt | String |  no  |  |

---


 
 
 #### [ManualKycResponse](#ManualKycResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | step | [UserKycLenderStepMap](#UserKycLenderStepMap) |  no  |  |

---


 
 
 #### [CustomerKycDetailsReponse](#CustomerKycDetailsReponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [UserKycLenderStepMap](#UserKycLenderStepMap) |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [PlatformFees](#PlatformFees)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customerAcquisitionFee | Double |  no  |  |
 | transactionFee | Double |  no  |  |

---


 
 
 #### [CommercialResponse](#CommercialResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [Commercial](#Commercial) |  no  |  |

---


 
 
 #### [LenderMerchantConf](#LenderMerchantConf)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | lenderId | String |  no  |  |
 | merchantId | String |  no  |  |
 | schema | String |  no  |  |

---



