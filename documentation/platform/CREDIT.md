



##### [Back to Platform docs](./README.md)

## Credit Methods
Transaction Service
* [getOrderStatus](#getorderstatus)
* [getEligiblePlans](#geteligibleplans)
* [getTransactions](#gettransactions)



## Methods with example and description


### getOrderStatus
check status of the order




```java
credit.getOrderStatus( orderId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organization ID |   
| orderId | String | yes | This is order ID |  



Use this API to check status the order.

*Returned Response:*




[OrderStatus](#OrderStatus)

Success. Returns a JSON object as shown below. Refer `OrderStatus` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; orderId</i></summary>

```json
"FY12345"
```
</details>

<details>
<summary><i>&nbsp; transactionId</i></summary>

```json
"TXN123567890"
```
</details>

<details>
<summary><i>&nbsp; status</i></summary>

```json
"PAYMENT_CAPTURED"
```
</details>

<details>
<summary><i>&nbsp; message</i></summary>

```json
"Payment Accepted"
```
</details>

</details>









---


### getEligiblePlans
Get eligible plans




```java
credit.getEligiblePlans( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organization id |   
| lenderSlug | String | yes | This is lender slug |  
| body | [EligiblePlansRequest](#EligiblePlansRequest) | yes | Request body |


Use this API to Get eligible plans.

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


### getTransactions
Get list of user transactions




```java
credit.getTransactions( page,  type,  status,  limit,  countryCode,  mobile,  orderId,  transactionId,  onlySelf) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | The unique identifier of the organization |   
| page | Integer? | no | The page number of the transaction list |   
| type | Object? | no | The transaction type |   
| status | Object? | no | The transaction status |   
| limit | Integer? | no | The number of transactions to fetch |   
| countryCode | String? | no | The country code of the user's mobile number. |   
| mobile | String | yes | The mobile number of the user |   
| orderId | String? | no | The order ID |   
| transactionId | String? | no | The transaction ID |   
| onlySelf | Boolean? | no | Set this flag to true to fetch transactions exclusively for your organization, excluding other organizations. |  



Retrieves a paginated list of transactions associated with a specific organization, sorted from the latest to the oldest. This endpoint allows filtering transactions based on various criteria and supports pagination.

*Returned Response:*




[GetTransactionsResponse](#GetTransactionsResponse)

Success. The request has been processed successfully and the response contains the requested data.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; IntegrationGetTransactionsExample</i></summary>

```json
{
  "value": {
    "message": "The request has been processed successfully.",
    "data": {
      "transactions": [
        {
          "id": "TXN1234PKoGu",
          "amount": 5000,
          "type": "DEBIT",
          "status": "SUCCESS",
          "settlementUtr": null,
          "createdAt": "2024-06-10T12:56:46.396Z",
          "merchant": {
            "name": "J Company",
            "logo": "https://cdn.pixelbin.io/v2/muddy-glitter-1091e5/original/public/logos/j.png"
          },
          "order": {
            "id": "ORD1234",
            "amount": 5000
          },
          "loan": {
            "number": "LN123456",
            "amount": 5000,
            "type": "EMI"
          },
          "lender": {
            "name": "Bank of J Limited",
            "slug": "j-bank",
            "logo": "https://cdn.pixelbin.io/v2/muddy-glitter-1091e5/original/public/logos/j.png",
            "shortName": "J Bank"
          },
          "isMasked": false
        },
        {
          "id": "XXXXXPKoGu",
          "amount": 500,
          "type": "DEBIT",
          "status": "SUCCESS",
          "settlementUtr": null,
          "createdAt": "2024-07-01T11:56:46.396Z",
          "merchant": {
            "name": "Other Merchant",
            "logo": "https://cdn.pixelbin.io/v2/potlee/t.grey()/public/logos/settle/square-dark.png"
          },
          "isMasked": true
        }
      ],
      "page": {
        "type": "number",
        "current": 1,
        "hasPrevious": false,
        "hasNext": false,
        "size": 25,
        "itemTotal": 1
      }
    },
    "meta": {
      "timestamp": "2024-07-10T13:56:46.396Z",
      "version": "v1.0",
      "product": "Settle Checkout"
    }
  }
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
 | errors | ArrayList<[IntegrationResponseError](#IntegrationResponseError)>? |  yes  |  |

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
 | intent | String? |  yes  |  |

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



