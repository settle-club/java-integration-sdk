



##### [Back to Public docs](./README.md)

## Transaction Methods
Transaction Service
* [getTransactions](#gettransactions)
* [getAllTransactionsCSV](#getalltransactionscsv)
* [getTransactionDetails](#gettransactiondetails)
* [getTransactionCount](#gettransactioncount)
* [getRefundCount](#getrefundcount)
* [getSumOfTransactions](#getsumoftransactions)
* [getCustomerCount](#getcustomercount)
* [getDayTotal](#getdaytotal)
* [getTransactionUtrCount](#gettransactionutrcount)



## Methods with example and description


### getTransactions
Get List of transactions




```java
transaction.getTransactions( page,  type,  limit,  id,  orderId,  name,  mobile,  entityId,  utr,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| page | Double | yes | This is page number |   
| type | List<String>? | no | This is transaction type |   
| limit | Double | yes | This is no of transaction |   
| organizationId | String | yes | This is the organization ID |   
| id | String? | no | This is the search term |   
| orderId | String? | no | This is the search term |   
| name | String? | no | This is the search term |   
| mobile | String? | no | This is the search term |   
| entityId | String? | no | This is the entity id |   
| utr | String? | no | This is the UTR number |   
| startDate | String? | no | This is used to filter from date |   
| endDate | String? | no | This is used to filter till date |  



Use this API to get list of user's transaction.

*Returned Response:*




[OrganizationTransactionResponse](#OrganizationTransactionResponse)

Success. Returns a JSON object as shown below. Refer `OrganizationTransactionResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
[
  {
    "id": 1,
    "type": "credit",
    "amount": "10000",
    "remark": "Potlee credit"
  }
]
```
</details>









---


### getAllTransactionsCSV
Get List of transactions




```java
transaction.getAllTransactionsCSV( page,  type,  limit,  id,  orderId,  name,  mobile,  userId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| page | Double | yes | This is page number |   
| type | List<String>? | no | This is transaction type |   
| limit | Double | yes | This is no of transaction |   
| organizationId | String | yes | This is the organization ID |   
| id | String? | no | This is the search term |   
| orderId | String? | no | This is the search term |   
| name | String? | no | This is the search term |   
| mobile | String? | no | This is the search term |   
| userId | String? | no | This is the user id |  



Use this API to get list of user's transaction.

*Returned Response:*




[OrganizationTransactionResponse](#OrganizationTransactionResponse)

Success. Returns a JSON object as shown below. Refer `OrganizationTransactionResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
[
  {
    "id": 1,
    "type": "credit",
    "amount": "10000",
    "remark": "Potlee credit"
  }
]
```
</details>









---


### getTransactionDetails
Get List of transactions




```java
transaction.getTransactionDetails( transactionId,  userId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is the organization ID |   
| transactionId | String | yes | This is the transactionId |   
| userId | String? | no | This is the user id |  



Use this API to get list of user's transaction.

*Returned Response:*




[OrgTransactions](#OrgTransactions)

Success. Returns a JSON object as shown below. Refer `OrgTransactions` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
[
  {
    "id": 1,
    "type": "credit",
    "amount": "10000",
    "remark": "Potlee credit"
  }
]
```
</details>









---


### getTransactionCount
Get Count of transactions




```java
transaction.getTransactionCount( startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is Organization id |   
| startDate | String? | no | startDate of filter |   
| endDate | String? | no | endDate of filter |  



Use this API to get count of user's transaction.

*Returned Response:*




[OrganizationTransactionsCount](#OrganizationTransactionsCount)

Success. Returns a JSON object as shown below. Refer `OrganizationTransactionsCount` for more details..




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "count": 1
}
```
</details>









---


### getRefundCount
Get Count of refunds




```java
transaction.getRefundCount( startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is Organization id |   
| startDate | String? | no | startDate of filter |   
| endDate | String? | no | endDate of filter |  



Use this API to get count of user's refunds.

*Returned Response:*




[RefundCount](#RefundCount)

Success. Returns a JSON object as shown below. Refer `RefundCount` for more details..




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "count": 1
}
```
</details>









---


### getSumOfTransactions
Get Sum of transactions




```java
transaction.getSumOfTransactions( startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is Organization id |   
| startDate | String? | no | startDate of filter |   
| endDate | String? | no | endDate of filter |  



Use this API to get Sum of all credited user's transaction.

*Returned Response:*




[OrganizationTransactionsSum](#OrganizationTransactionsSum)

Success. Returns a JSON object as shown below. Refer `OrganizationTransactionsSum` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "sum": 1
}
```
</details>









---


### getCustomerCount
Get Total Unique Count of Customers




```java
transaction.getCustomerCount( startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is Organization id |   
| startDate | String? | no | startDate of filter |   
| endDate | String? | no | endDate of filter |  



Use this API to get Count of all Customers.

*Returned Response:*




[UniqueCustomersInOrg](#UniqueCustomersInOrg)

Success. Returns a JSON object as shown below. Refer `UniqueCustomersInOrg` for more details..




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "count": 1
}
```
</details>









---


### getDayTotal
Get sum of day total




```java
transaction.getDayTotal( startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is Organization id |   
| startDate | String | yes | startDate of filter |   
| endDate | String? | no | endDate of filter |  



Use this API to get total amoun of all transaction in a day

*Returned Response:*




[SumofOneDayTransactions](#SumofOneDayTransactions)

Success. Returns a JSON object as shown below. Refer `SumofOneDayTransactions` for more details..




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
[
  {
    "orgId:\"efbf45ac-f015-48e5-a11f-1053922876b7\" createdAt:\"2020-01-01\" count:\"1\" sum:500": null,
    "refund:500": null,
    "difference:500": null
  }
]
```
</details>









---


### getTransactionUtrCount
Get Total amount acc to a day




```java
transaction.getTransactionUtrCount( startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is Organization id |   
| startDate | String | yes | startDate of filter |   
| endDate | String? | no | endDate of filter |  



Use this API to get total amoun of all transaction in a day

*Returned Response:*




[UniqueCustomersInOrg](#UniqueCustomersInOrg)

Success. Returns a JSON object as shown below. Refer `UniqueCustomersInOrg` for more details..




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
[
  {
    "orgId:\"efbf45ac-f015-48e5-a11f-1053922876b7\" createdAt:\"2020-01-01\" sum:500": null,
    "count:\"1\"": null
  }
]
```
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


 
 
 #### [IntegrationSuccessResponse](#IntegrationSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | A message indicating the success of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | HashMap<String,Object> |  no  | The data payload of the response. The structure of this object will vary depending on the specific API endpoint. |

---


 
 
 #### [IntegrationErrorResponse](#IntegrationErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | A message indicating the failure of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | error | [IntegrationResponseError](#IntegrationResponseError) |  no  |  |

---


 
 
 #### [DisbursalRequest](#DisbursalRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fingerprint | String? |  yes  |  |
 | chargeToken | String |  no  |  |
 | loanTypeId | Double? |  yes  |  |
 | emiTenure | Double? |  yes  |  |
 | isDownpaymentRequired | Boolean? |  yes  |  |
 | downpaymentAmount | Double? |  yes  |  |
 | loanAmount | Double? |  yes  |  |
 | data | HashMap<String,Object>? |  yes  |  |
 | transactionId | String? |  yes  |  |
 | lenderSlug | String? |  yes  |  |

---


 
 
 #### [WorkflowUser](#WorkflowUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String? |  yes  |  |

---


 
 
 #### [EligiblePlansRequest](#EligiblePlansRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | chargeToken | String? |  yes  |  |

---


 
 
 #### [EligiblePlans](#EligiblePlans)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | description | String? |  yes  |  |
 | brokenInterest | Double? |  yes  |  |
 | noOfEmi | Double? |  yes  |  |
 | emiAmount | Double? |  yes  |  |
 | processingFee | Double? |  yes  |  |
 | installmentInterestRate | Double? |  yes  |  |

---


 
 
 #### [EligiblePlansResponse](#EligiblePlansResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eligiblePlans | ArrayList<[EligiblePlans](#EligiblePlans)>? |  yes  |  |

---


 
 
 #### [DisbursalResponse](#DisbursalResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactionId | String? |  yes  |  |
 | status | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [OrderStatus](#OrderStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  |  |
 | transactionId | String? |  yes  |  |
 | status | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [DisbursalStatusRequest](#DisbursalStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fingerprint | String? |  yes  |  |
 | transactionId | String |  no  |  |

---


 
 
 #### [Transactions](#Transactions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | partnerId | String? |  yes  |  |
 | partner | String? |  yes  |  |
 | partnerLogo | String? |  yes  |  |
 | status | String |  no  |  |
 | type | String? |  yes  |  |
 | remark | String? |  yes  |  |
 | amount | Double |  no  |  |
 | loanAccountNumber | String? |  yes  |  |
 | kfs | String? |  yes  |  |
 | utr | String? |  yes  |  |
 | sanctionLetter | String? |  yes  |  |
 | orderId | String? |  yes  |  |
 | refundId | String? |  yes  |  |
 | createdAt | String |  no  |  |
 | lenderId | String? |  yes  |  |
 | lenderName | String? |  yes  |  |
 | lenderLogo | String? |  yes  |  |
 | loanType | String? |  yes  |  |
 | repaymentTransactionId | String? |  yes  |  |
 | nextDueDate | String? |  yes  |  |
 | paidPercent | Double? |  yes  |  |
 | lenderDetail | [LenderDetail](#LenderDetail)? |  yes  |  |
 | emis | ArrayList<[Emi](#Emi)>? |  yes  |  |

---


 
 
 #### [LenderDetail](#LenderDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | imageUrl | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | b2B | Boolean? |  yes  |  |
 | b2C | Boolean? |  yes  |  |
 | theme | [Theme](#Theme)? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---


 
 
 #### [FilterKeys](#FilterKeys)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | name | String? |  yes  |  |
 | kind | String? |  yes  |  |

---


 
 
 #### [FilterValues](#FilterValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | isSelected | Boolean? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [Filters](#Filters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | [FilterKeys](#FilterKeys)? |  yes  |  |
 | values | ArrayList<[FilterValues](#FilterValues)>? |  yes  |  |

---


 
 
 #### [PageResponse](#PageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | current | Integer |  no  |  |
 | hasPrevious | Boolean |  no  |  |
 | hasNext | Boolean |  no  |  |
 | size | Integer |  no  |  |
 | itemTotal | Integer |  no  |  |

---


 
 
 #### [FilterByDate](#FilterByDate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [TransactionResponse](#TransactionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[Filters](#Filters)> |  no  |  |
 | page | [PageResponse](#PageResponse) |  no  |  |
 | transactions | ArrayList<[Transactions](#Transactions)> |  no  |  |

---


 
 
 #### [MerchantTransactions](#MerchantTransactions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | outstandingAmount | String? |  yes  |  |

---


 
 
 #### [MerchantTransactionSummary](#MerchantTransactionSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | merchantOutstandingSummary | [MerchantTransactions](#MerchantTransactions)? |  yes  |  |

---


 
 
 #### [GetReconciliationFileResponse](#GetReconciliationFileResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | files | ArrayList<[ReconFile](#ReconFile)> |  no  |  |

---


 
 
 #### [ReconFile](#ReconFile)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | base64 | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [UploadReconciliationFileRequest](#UploadReconciliationFileRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | base64File | String |  no  |  |
 | format | String? |  yes  |  |
 | lenderId | String? |  yes  |  |

---


 
 
 #### [UploadReconciliationFileResponse](#UploadReconciliationFileResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [TransactionCount](#TransactionCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalTransactions | String? |  yes  |  |

---


 
 
 #### [RefundCount](#RefundCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundTransactions | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OrganizationTransactionsCount](#OrganizationTransactionsCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Double? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OrganizationTransactionsSum](#OrganizationTransactionsSum)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sum | Double? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [UniqueCustomersInOrg](#UniqueCustomersInOrg)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Double? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [TransactionAmount](#TransactionAmount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalTransactionAmount | String? |  yes  |  |

---


 
 
 #### [SchemaForOneDayTotal](#SchemaForOneDayTotal)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orgId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | count | Double? |  yes  |  |
 | sum | String? |  yes  |  |
 | refund | String? |  yes  |  |
 | difference | String? |  yes  |  |

---


 
 
 #### [SumofOneDayTransactions](#SumofOneDayTransactions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dayTotal | ArrayList<[SchemaForOneDayTotal](#SchemaForOneDayTotal)>? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AverageTransaction](#AverageTransaction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | average | Double? |  yes  |  |

---


 
 
 #### [AllTransactionsResponse](#AllTransactionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | partnerId | String? |  yes  |  |
 | status | String? |  yes  |  |
 | type | String? |  yes  |  |
 | remark | String? |  yes  |  |
 | amount | Double? |  yes  |  |
 | loanAccountNumber | String? |  yes  |  |
 | createdAt | String? |  yes  |  |

---


 
 
 #### [TotalRefund](#TotalRefund)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalRefund | String? |  yes  |  |

---


 
 
 #### [TotalRepayment](#TotalRepayment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalRepayment | String? |  yes  |  |

---


 
 
 #### [TotalOverDue](#TotalOverDue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalDue | String? |  yes  |  |

---


 
 
 #### [TotalLoansDisbursed](#TotalLoansDisbursed)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalLoansDisbursed | String? |  yes  |  |

---


 
 
 #### [OrganizationTransactionResponse](#OrganizationTransactionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[TrFilters](#TrFilters)> |  no  |  |
 | page | [TrPageResponse](#TrPageResponse) |  no  |  |
 | transactions | ArrayList<[OrgTransactions](#OrgTransactions)> |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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


 
 
 #### [OrgTransactions](#OrgTransactions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | userName | String? |  yes  |  |
 | partnerId | String? |  yes  |  |
 | partner | String? |  yes  |  |
 | partnerLogo | String? |  yes  |  |
 | status | String |  no  |  |
 | type | String? |  yes  |  |
 | remark | String? |  yes  |  |
 | amount | Double |  no  |  |
 | orderId | String? |  yes  |  |
 | loanAccountNumber | String? |  yes  |  |
 | kfs | String? |  yes  |  |
 | sanctionLetter | String? |  yes  |  |
 | createdAt | String |  no  |  |
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


 
 
 #### [KfsRequest](#KfsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loanTypeId | Double? |  yes  |  |
 | chargeToken | String? |  yes  |  |

---


 
 
 #### [KfsResponse](#KfsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kfsTable | String? |  yes  |  |

---


 
 
 #### [LenderTransactionState](#LenderTransactionState)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | stepIndex | Double? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | workflowId | String? |  yes  |  |
 | workflowName | String? |  yes  |  |
 | parentStateId | String? |  yes  |  |
 | workflowUrl | String? |  yes  |  |
 | isInternal | Boolean? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | ttl | Double? |  yes  |  |
 | name | String? |  yes  |  |
 | type | String? |  yes  |  |
 | inputData | HashMap<String,Object>? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | deletedAt | String? |  yes  |  |

---


 
 
 #### [TransactionStateResponse](#TransactionStateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactionState | ArrayList<[LenderTransactionState](#LenderTransactionState)>? |  yes  |  |

---


 
 
 #### [Theme](#Theme)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logoUrl | String? |  yes  |  |
 | iconUrl | String? |  yes  |  |
 | landscapeBgUrl | String? |  yes  |  |
 | portraitBgUrl | String? |  yes  |  |
 | shortName | String? |  yes  |  |

---


 
 
 #### [Emi](#Emi)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | installmentno | Double? |  yes  |  |
 | loanAccountNumber | String? |  yes  |  |
 | amount | Double? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | referenceTransactionId | String? |  yes  |  |
 | remark | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | entityId | String? |  yes  |  |
 | paid | Boolean? |  yes  |  |
 | overdue | Boolean? |  yes  |  |
 | repaymentDate | String? |  yes  |  |

---


 
 
 #### [MetricPivots](#MetricPivots)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | date | String? |  yes  |  |
 | sum | Double? |  yes  |  |

---


 
 
 #### [TransactionMetricSubResponse](#TransactionMetricSubResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | total | String? |  yes  |  |
 | pivots | ArrayList<[MetricPivots](#MetricPivots)>? |  yes  |  |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |
 | valueFormat | String? |  yes  |  |
 | logo | String? |  yes  |  |

---


 
 
 #### [TransactionMetrics](#TransactionMetrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalDisbursement | [TransactionMetricSubResponse](#TransactionMetricSubResponse)? |  yes  |  |
 | totalOverdue | [TransactionMetricSubResponse](#TransactionMetricSubResponse)? |  yes  |  |
 | totalRepayment | [TransactionMetricSubResponse](#TransactionMetricSubResponse)? |  yes  |  |

---


 
 
 #### [LenderCustomerTransactionMetricsFilters](#LenderCustomerTransactionMetricsFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | display | String |  no  |  |
 | value | ArrayList<String> |  no  |  |
 | isSelected | Boolean? |  yes  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [LenderCustomerTransactionMetrics](#LenderCustomerTransactionMetrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | metrics | [TransactionMetrics](#TransactionMetrics)? |  yes  |  |
 | filters | ArrayList<[LenderCustomerTransactionMetricsFilters](#LenderCustomerTransactionMetricsFilters)>? |  yes  |  |
 | sort | ArrayList<[LenderCustomerTransactionMetricsFilters](#LenderCustomerTransactionMetricsFilters)>? |  yes  |  |

---


 
 
 #### [LenderCustomerTransactionMetricsResponse](#LenderCustomerTransactionMetricsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [LenderCustomerTransactionMetricsRequest](#LenderCustomerTransactionMetricsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[LenderCustomerTransactionMetricsFilters](#LenderCustomerTransactionMetricsFilters)>? |  yes  |  |
 | sort | ArrayList<[LenderCustomerTransactionMetricsFilters](#LenderCustomerTransactionMetricsFilters)>? |  yes  |  |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | lenderId | String? |  yes  |  |
 | pivotPoints | Double? |  yes  |  |

---


 
 
 #### [TransactionOrder](#TransactionOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  | Unique identifier of the order. |
 | amount | Double |  no  | Total amount of the order. |

---


 
 
 #### [TransactionMerchant](#TransactionMerchant)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  | Name of the merchant. |
 | logo | String |  no  | URL to the merchant's logo. |

---


 
 
 #### [TransactionLoan](#TransactionLoan)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String |  no  | Loan account number. |
 | amount | Double |  no  | Loan amount. |
 | type | String |  no  | Type of loan. |

---


 
 
 #### [TransactionLender](#TransactionLender)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  | Name of the lender. |
 | slug | String |  no  | A slug representing the lender. |
 | logo | String |  no  | URL to the lender's logo. |
 | shortName | String |  no  | Short name of the lender. |

---


 
 
 #### [UserTransaction](#UserTransaction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  | Unique identifier of the transaction. |
 | amount | Double |  no  | Amount of the transaction. |
 | type | String |  no  | Type of the transaction. |
 | status | String |  no  | Status of the transaction. |
 | settlementUtr | String? |  yes  | Settlement UTR for the transaction. |
 | refundId | String? |  yes  | Refund ID if the transaction is a refund. |
 | createdAt | String |  no  | Timestamp when the transaction was created. |
 | isMasked | Boolean |  no  | Indicates if the transaction details are masked. This field is true of the transaction if done on some other merchant |
 | order | [TransactionOrder](#TransactionOrder)? |  yes  |  |
 | merchant | [TransactionMerchant](#TransactionMerchant) |  no  |  |
 | loan | [TransactionLoan](#TransactionLoan)? |  yes  |  |
 | lender | [TransactionLender](#TransactionLender)? |  yes  |  |

---


 
 
 #### [Pagination](#Pagination)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  | The type of pagination. |
 | current | Integer |  no  | The current page number. |
 | hasPrevious | Boolean |  no  | Indicates if there is a previous page. |
 | hasNext | Boolean |  no  | Indicates if there is a next page. |
 | size | Integer |  no  | The number of items per page. |
 | itemTotal | Integer |  no  | The total number of items across all pages. |

---


 
 
 #### [GetTransactionsData](#GetTransactionsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactions | ArrayList<[UserTransaction](#UserTransaction)> |  no  |  |
 | page | [Pagination](#Pagination) |  no  |  |

---


 
 
 #### [GetTransactionsResponse](#GetTransactionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Response message indicating the result of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | [GetTransactionsData](#GetTransactionsData) |  no  |  |

---


 
 
 #### [SummaryRequest](#SummaryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [OrderShipmentAddressGeoLocation](#OrderShipmentAddressGeoLocation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | latitude | Double |  no  | The latitude of the location. |
 | longitude | Double |  no  | The longitude of the location. |

---


 
 
 #### [OrderShipmentAddress](#OrderShipmentAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | line1 | String? |  yes  | The first line of the address. |
 | line2 | String? |  yes  | The second line of the address. |
 | city | String? |  yes  | The city of the address. |
 | state | String? |  yes  | The state of the address. |
 | country | String? |  yes  | The country of the address. |
 | pincode | String? |  yes  | The postal code of the address. |
 | type | String? |  yes  | The type of address (e.g., residential, business). |
 | geoLocation | [OrderShipmentAddressGeoLocation](#OrderShipmentAddressGeoLocation)? |  yes  | The geographical location of the address. |

---


 
 
 #### [OrderShipmentItem](#OrderShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | String? |  yes  | The category of the item. |
 | sku | String? |  yes  | The stock keeping unit for the item. |
 | rate | Double? |  yes  | The price of a single item. |
 | quantity | Double? |  yes  | The quantity of the item. |

---


 
 
 #### [OrderShipment](#OrderShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  | The identifier for the shipment. |
 | urn | String? |  yes  | A unique reference number for the shipment. This is optional; the system will generate a URN if not provided. There can be multiple shipment objects with the same shipment ID, making the URN a unique identifier within the system. |
 | amount | Double |  no  | The amount corresponding to the shipment that is subject to the status update. |
 | timestamp | String |  no  | The timestamp when the status of the shipment was updated. |
 | status | String |  no  | The current status of the shipment. |
 | remark | String? |  yes  | Any remarks regarding the shipment. |
 | items | ArrayList<[OrderShipmentItem](#OrderShipmentItem)>? |  yes  | The list of items in the shipment. |
 | shippingAddress | [OrderShipmentAddress](#OrderShipmentAddress)? |  yes  | The shipping address for the shipment. |
 | billingAddress | [OrderShipmentAddress](#OrderShipmentAddress)? |  yes  | The billing address for the shipment. |

---


 
 
 #### [OrderDeliveryUpdatesBody](#OrderDeliveryUpdatesBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String? |  yes  | The unique identifier for the order. |
 | transactionId | String? |  yes  | The unique identifier for the transaction. |
 | shipments | ArrayList<[OrderShipment](#OrderShipment)> |  no  | The list of shipments for which the status needs to be updated. Only include shipments requiring a status change. |

---


 
 
 #### [OrderShipmentResponse](#OrderShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  | The unique identifier of the shipment. |
 | urn | String? |  yes  | A unique resource identifier for the shipment. |
 | shipmentStatus | String |  no  | The status of the shipment. |
 | shipmentAmount | Double |  no  | The total amount associated with the shipment. |
 | processingStatus | String |  no  | The processing status of the order shipment. |

---


 
 
 #### [OrderDeliveryUpdatesData](#OrderDeliveryUpdatesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  | The unique identifier for the order. |
 | transactionId | String |  no  | The unique identifier for the order. |
 | shipments | ArrayList<[OrderShipmentResponse](#OrderShipmentResponse)> |  no  | The list of shipments for which the status was updated. |

---


 
 
 #### [OrderDeliveryUpdatesResponse](#OrderDeliveryUpdatesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Response message indicating the result of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | [OrderDeliveryUpdatesData](#OrderDeliveryUpdatesData) |  no  |  |
 | errors | ArrayList<[IntegrationResponseError](#IntegrationResponseError)>? |  yes  |  |

---



