



##### [Back to Application docs](./README.md)

## Transaction Methods
Transaction Service
* [disburse](#disburse)
* [plans](#plans)
* [kfs](#kfs)
* [listOfTransactions](#listoftransactions)
* [loadTransactionById](#loadtransactionbyid)
* [getMerchantSummary](#getmerchantsummary)



## Methods with example and description


### disburse
Disburse the credit




```java
transaction.disburse( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [DisbursalRequest](#DisbursalRequest) | yes | Request body |


Use this API to disburse the credit.

*Returned Response:*




[DisbursalResponse](#DisbursalResponse)

Success. Returns a JSON object as shown below. Refer `DisbursalResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
true
```
</details>

</details>









---


### plans
Disburse the credit




```java
transaction.plans( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [EligiblePlansRequest](#EligiblePlansRequest) | yes | Request body |


Use this API to disburse the credit.

*Returned Response:*




[EligiblePlansResponse](#EligiblePlansResponse)

Success. Returns a JSON object as shown below. Refer `EligiblePlansResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
true
```
</details>

</details>









---


### kfs
Fetch KFS




```java
transaction.kfs( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [KfsRequest](#KfsRequest) | yes | Request body |


Use this API to get kfs.

*Returned Response:*




[KfsResponse](#KfsResponse)

Success. Returns a JSON object as shown below. Refer `Kfs` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
true
```
</details>

</details>









---


### listOfTransactions
Get List of transactions




```java
transaction.listOfTransactions( page,  type,  lender,  startDate,  endDate,  loanType,  limit,  partnerId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| page | Integer | yes | This is page number |   
| type | List<String>? | no | This is transaction type |   
| lender | String? | no | This is lenderSlug |   
| startDate | String? | no | This is date range start date |   
| endDate | String? | no | This is date range end date |   
| loanType | String? | no | This is loanType EMI/BNPL |   
| limit | Integer | yes | This is no of transaction |   
| partnerId | String? | no | This is partnerId (merchant id) |  



Use this API to get list of user's transaction.

*Returned Response:*




[TransactionResponse](#TransactionResponse)

Success. Returns a JSON object as shown below. Refer `TransactionResponse` for more details.




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


### loadTransactionById
Get List of transactions




```java
transaction.loadTransactionById( transactionId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| transactionId | String | yes | This is transaction id |  



Use this API to get list of user's transaction.

*Returned Response:*




[Transactions](#Transactions)

Success. Returns a JSON object as shown below. Refer `Transactions` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
[
  {
    "id": 1,
    "userId": "123 \"type\":\"credit\"",
    "amount": "10000",
    "remark": "Potlee credit"
  }
]
```
</details>









---


### getMerchantSummary
Get sum of list of transactions of merchant




```java
transaction.getMerchantSummary( partnerId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| partnerId | String | yes | This is partner id |  



Use this API to get sum of list of transactions of merchan.

*Returned Response:*




[MerchantTransactionSummary](#MerchantTransactionSummary)

Success. Returns a JSON object as shown below. Refer `MerchantTransactionSummary` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DisbursalResponse](#DisbursalResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactionId | String? |  yes  |  |
 | status | String? |  yes  |  |
 | message | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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

---


 
 
 #### [OrganizationTransactionsCount](#OrganizationTransactionsCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Double? |  yes  |  |

---


 
 
 #### [OrganizationTransactionsSum](#OrganizationTransactionsSum)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sum | Double? |  yes  |  |

---


 
 
 #### [UniqueCustomersInOrg](#UniqueCustomersInOrg)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Double? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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


 
 
 #### [SummaryRequest](#SummaryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | merchantId | String? |  yes  |  |

---



