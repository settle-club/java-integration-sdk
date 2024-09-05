



##### [Back to Platform docs](./README.md)

## Credit Methods
Transaction Service
* [getOrderStatus](#getorderstatus)
* [getEligiblePlans](#geteligibleplans)
* [updateOrderDeliveryStatus](#updateorderdeliverystatus)
* [getTransactions](#gettransactions)
* [getSettledTransactions](#getsettledtransactions)



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


### updateOrderDeliveryStatus
Update delivery status for an order




```java
credit.updateOrderDeliveryStatus(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | This is organization id |  
| body | [OrderDeliveryUpdatesBody](#OrderDeliveryUpdatesBody) | yes | Request body |


This API updates an order's delivery status using the order ID or transaction ID and manages loan disbursal or cancellation following delivery. It is utilized when the system configuration is set to delay loan disbursal until after delivery, indicated by the 'DELAYED' type and 'DELIVERY' event. If 'delayDays' is set to 0, disbursal occurs within an hour after delivery. Additionally, this API facilitates loan cancellation through specific shipment statuses, offering a precise method for loan management based on delivery outcomes.

*Returned Response:*




[OrderDeliveryUpdatesResponse](#OrderDeliveryUpdatesResponse)

Success. Returns a JSON object as shown below. Refer `OrderDeliveryUpdatesResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; OrderDeliveryUpdatesResponseExample</i></summary>

```json
{
  "value": {
    "message": "The request has been processed successfully.",
    "data": {
      "orderId": "ORD1234",
      "transactionId": "TXN1234",
      "shipments": [
        {
          "id": "ship12345",
          "urn": "ship12345_0",
          "shipmentStatus": "CANCELLED",
          "shipmentAmount": 100,
          "processingStatus": "CAPTURED"
        },
        {
          "id": "ship12345",
          "urn": "ship12345_1",
          "shipmentStatus": "DELIVERED",
          "shipmentAmount": 500,
          "processingStatus": "CAPTURED"
        }
      ],
      "summary": {
        "orderAmount": 600,
        "capturedAmount": 600,
        "uncapturedAmount": 0,
        "capturedAmountForDisbursal": 500,
        "capturedAmountForCancellation": 100
      }
    },
    "meta": {
      "timestamp": "2024-07-16T12:07:26.979Z",
      "version": "v1.0",
      "product": "Settle Checkout"
    }
  }
}
```
</details>

</details>









[OrderDeliveryUpdatesPartialResponse](#OrderDeliveryUpdatesPartialResponse)

Partial Success. The request was successfully processed for some shipments, but not for others. The response includes detailed information about which parts of the request were successful and which were not.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; OrderDeliveryUpdatesPartialExample</i></summary>

```json
{
  "$ref": "#/components/examples/OrderDeliveryUpdatesPartialExample"
}
```
</details>

</details>









---


### getTransactions
Get list of user transactions




```java
credit.getTransactions( mobile,  countryCode,  page,  limit,  orderId,  transactionId,  type,  status,  onlySelf,  granularity) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | The unique identifier of the organization |   
| mobile | String | yes | The mobile number of the user |   
| countryCode | String? | no | The country code of the user's mobile number. |   
| page | Integer? | no | The page number of the transaction list |   
| limit | Integer? | no | The number of transactions to fetch |   
| orderId | String? | no | The order ID |   
| transactionId | String? | no | The transaction ID |   
| type | Object? | no | The transaction type |   
| status | Object? | no | The transaction status |   
| onlySelf | Boolean? | no | Set this flag to true to fetch transactions exclusively for your organization, excluding other organizations. |   
| granularity | String? | no | Defines the granularity of transaction details. |  



Retrieves a paginated list of transactions associated with a specific organization, sorted from the latest to the oldest. This endpoint allows filtering transactions based on various criteria and supports pagination.

*Returned Response:*




[GetTransactionsResponse](#GetTransactionsResponse)

Success. The request has been processed successfully and the response contains the requested data.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; GetTransactionsExample</i></summary>

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
            "amount": 5000,
            "summary": {
              "uncapturedAmount": 2000,
              "capturedAmount": 3000,
              "capturedAmountForDisbursal": 1800,
              "capturedAmountForCancellation": 1200
            }
          },
          "loans": [
            {
              "number": "LN123456",
              "amount": 5000,
              "type": "EMI",
              "dueDate": "2024-09-04T18:30:00.000Z",
              "repaidAmount": 2600,
              "isSettled": false,
              "emis": [
                {
                  "amount": 2600,
                  "dueDate": "2024-08-04T18:30:00.000Z",
                  "installmentNo": 1,
                  "repaidAmount": 2600,
                  "isSettled": true
                },
                {
                  "amount": 2550,
                  "dueDate": "2024-09-04T18:30:00.000Z",
                  "installmentNo": 2,
                  "repaidAmount": 0,
                  "isSettled": false
                }
              ]
            }
          ],
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


### getSettledTransactions
Get list of settled transactions




```java
credit.getSettledTransactions( page,  limit,  orderId,  transactionId,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | The unique identifier of the organization |   
| page | Integer? | no | The page number of the transaction list |   
| limit | Integer? | no | The number of transactions to fetch |   
| orderId | String? | no | The order ID |   
| transactionId | String? | no | The transaction ID |   
| startDate | String? | no | This is used to filter from date |   
| endDate | String? | no | This is used to filter till date |  



Retrieves a paginated list of Settled transactions associated with a specific organization, sorted from the latest to the oldest. This endpoint allows filtering transactions based on various criteria and supports pagination.

*Returned Response:*




[GetSettlementTransactionsResponse](#GetSettlementTransactionsResponse)

Success. The request has been processed successfully and the response contains the requested data.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; GetSettlemetTransactionsExample</i></summary>

```json
{
  "value": {
    "message": "The request has been processed successfully.",
    "data": {
      "transactions": [
        {
          "id": "TXN",
          "amount": 10000,
          "createdAt": "2024-08-20T06:37:27.150Z",
          "orderId": "DEMO-TRANSACTIOn",
          "settlementStatus": "PENDING",
          "settlementTime": "2024-08-22T15:20:02.274Z"
        }
      ],
      "page": {
        "type": "number",
        "current": 1,
        "hasPrevious": false,
        "hasNext": false,
        "size": 100,
        "itemTotal": null
      }
    },
    "meta": {
      "timestamp": "2024-08-30T10:48:01.915Z",
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


 
 
 #### [GroupedEmiLoanAccount](#GroupedEmiLoanAccount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loanAccountNumber | String |  no  |  |
 | kfs | String? |  yes  |  |
 | sanctionLetter | String? |  yes  |  |
 | remark | String? |  yes  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |
 | amount | Double |  no  |  |
 | repaidAmount | Double |  no  |  |
 | paid | Boolean |  no  |  |
 | overdue | Boolean |  no  |  |
 | repaymentDate | String? |  yes  |  |
 | paidPercent | Double |  no  |  |
 | lenderDetail | [LenderDetail](#LenderDetail) |  no  |  |

---


 
 
 #### [GroupedEmi](#GroupedEmi)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | installmentno | Double? |  yes  |  |
 | amount | Double? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | referenceTransactionId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | paid | Boolean? |  yes  |  |
 | overdue | Boolean? |  yes  |  |
 | repaymentDate | String? |  yes  |  |
 | paidPercent | Double? |  yes  |  |
 | loanAccounts | ArrayList<[GroupedEmiLoanAccount](#GroupedEmiLoanAccount)>? |  yes  |  |

---


 
 
 #### [TransactionDetails](#TransactionDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | userId | String |  no  |  |
 | partnerId | String |  no  |  |
 | partner | String |  no  |  |
 | partnerLogo | String |  no  |  |
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
 | emis | ArrayList<[GroupedEmi](#GroupedEmi)>? |  yes  |  |

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
 | orderId | String? |  yes  | The unique identifier for the order. Required if transactionId is not provided. |
 | transactionId | String? |  yes  | The unique identifier for the transaction. Required if orderId is not provided. |
 | includeSummary | Boolean? |  yes  | A flag to include a summary object in the response, containing data like processed amount and unprocessed amount. |
 | shipments | ArrayList<[OrderShipment](#OrderShipment)> |  no  | The list of shipments for which the status needs to be updated. Only include shipments requiring a status change. |

---


 
 
 #### [OrderShipmentSummary](#OrderShipmentSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderAmount | Double |  no  | The total order amount. |
 | capturedAmount | Double |  no  | The total captured amount. This is the sum of the amounts of all captured shipments. |
 | uncapturedAmount | Double |  no  | The total uncaptured amount. This is calculated as totalAmount - capturedAmount. |
 | capturedAmountForDisbursal | Double |  no  | The total amount captured for disbursal. This represents the sum of amounts from all shipments marked for disbursal. |
 | capturedAmountForCancellation | Double |  no  | The total amount captured for cancellation. This aggregates the amounts from all shipments identified for cancellation. |

---


 
 
 #### [OrderShipmentResponse](#OrderShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  | The unique identifier of the shipment. |
 | urn | String |  no  | A unique resource identifier for the shipment. |
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
 | summary | [OrderShipmentSummary](#OrderShipmentSummary)? |  yes  | A summary object containing various amounts related to the order. |

---


 
 
 #### [OrderDeliveryUpdatesResponse](#OrderDeliveryUpdatesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Response message indicating the result of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | [OrderDeliveryUpdatesData](#OrderDeliveryUpdatesData) |  no  |  |

---


 
 
 #### [OrderDeliveryUpdatesPartialResponse](#OrderDeliveryUpdatesPartialResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Response message indicating the result of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | [OrderDeliveryUpdatesData](#OrderDeliveryUpdatesData) |  no  |  |
 | errors | ArrayList<[OrderDeliveryUpdatesError](#OrderDeliveryUpdatesError)>? |  yes  |  |

---


 
 
 #### [OrderDeliveryUpdatesError](#OrderDeliveryUpdatesError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  | Error code representing the type of error. |
 | message | String |  no  | A human-readable message providing more details about the error. |
 | exception | String |  no  | The exception name or type. |

---


 
 
 #### [TransactionOrderSummary](#TransactionOrderSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | capturedAmount | Double |  no  | The total captured amount. This is the sum of the amounts of all captured shipments. |
 | uncapturedAmount | Double |  no  | The total uncaptured amount. This is calculated as totalAmount - capturedAmount. |
 | capturedAmountForDisbursal | Double |  no  | The total amount captured for disbursal. This represents the sum of amounts from all shipments marked for disbursal. |
 | capturedAmountForCancellation | Double |  no  | The total amount captured for cancellation. This aggregates the amounts from all shipments identified for cancellation. |

---


 
 
 #### [TransactionOrder](#TransactionOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  | Unique identifier of the order. |
 | amount | Double |  no  | Total amount of the order. |
 | summary | [TransactionOrderSummary](#TransactionOrderSummary)? |  yes  |  |

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
 | dueDate | String |  no  | Due date in ISO format for the loan repayment. |
 | repaidAmount | Double |  no  | Amount that has been repaid. |
 | isSettled | Boolean |  no  | Indicates if the loan is fully settled. |
 | emis | ArrayList<[TransactionLoanEmi](#TransactionLoanEmi)>? |  yes  | EMIs associated with the loan. This information is available only if the granularity is set to 'detail' and an EMI schedule is available for this loan. |

---


 
 
 #### [TransactionLoanEmi](#TransactionLoanEmi)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double |  no  | EMI amount. |
 | dueDate | String |  no  | Due date in ISO format for the EMI payment. |
 | installmentNo | Integer |  no  | Installment number for the EMI. |
 | repaidAmount | Double |  no  | Amount that has been repaid towards the EMI. |
 | isSettled | Boolean |  no  | Indicates if the EMI is fully settled. |

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
 | createdAt | String |  no  | Timestamp in ISO format when the transaction was created. |
 | isMasked | Boolean |  no  | Indicates if the transaction details are masked. This field is true of the transaction if done on some other merchant |
 | order | [TransactionOrder](#TransactionOrder)? |  yes  |  |
 | merchant | [TransactionMerchant](#TransactionMerchant) |  no  |  |
 | loans | ArrayList<[TransactionLoan](#TransactionLoan)>? |  yes  |  |
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


 
 
 #### [SettlementTransactions](#SettlementTransactions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  | Unique identifier for the transaction. |
 | utr | String? |  yes  | Unique transaction reference number. |
 | amount | Double? |  yes  | The amount involved in the transaction. |
 | settlementStatus | String? |  yes  | Status of the transaction. |
 | orderId | String? |  yes  | Identifier for the associated order. |
 | createdAt | String? |  yes  | The time the transaction occurred |
 | settlementTime | String? |  yes  | The time the transaction settles and transaction status updated |

---


 
 
 #### [GetSettlementTransactionsData](#GetSettlementTransactionsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactions | ArrayList<[SettlementTransactions](#SettlementTransactions)> |  no  |  |
 | page | [Pagination](#Pagination) |  no  |  |

---


 
 
 #### [GetSettlementTransactionsResponse](#GetSettlementTransactionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  | Response message indicating the result of the operation. |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | [GetSettlementTransactionsData](#GetSettlementTransactionsData) |  no  |  |

---


 
 
 #### [SummaryRequest](#SummaryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [RegisterTransaction](#RegisterTransaction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | intent | String? |  yes  |  |
 | token | String |  no  |  |
 | remark | String? |  yes  |  |

---


 
 
 #### [RegisterTransactionResponseData](#RegisterTransactionResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isExistingOrder | Boolean? |  yes  | Indicates whether the order already exists. |
 | transaction | Object? |  yes  | The transaction details, which is unkown. |
 | action | Boolean? |  yes  |  |
 | status | String? |  yes  | The status of the transaction. |
 | message | String? |  yes  | A message related to the transaction status. |

---


 
 
 #### [RegisterTransactionResponseResult](#RegisterTransactionResponseResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | redirectUrl | String? |  yes  | URL to redirect the user to, if applicable. |

---


 
 
 #### [RegisterTransactionResponse](#RegisterTransactionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | [RegisterTransactionResponseResult](#RegisterTransactionResponseResult)? |  yes  |  |
 | action | HashMap<String,Object>? |  yes  | An object for future use, currently empty. |
 | data | [RegisterTransactionResponseData](#RegisterTransactionResponseData)? |  yes  |  |
 | transactionId | String? |  yes  | The unique identifier of the transaction. |
 | status | String? |  yes  | The status of the user related to the payment process. |
 | message | String? |  yes  | A message related to the user status. |

---


 
 
 #### [UpdateTransactionRequest](#UpdateTransactionRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | intent | String |  no  |  |
 | token | String |  no  |  |
 | remark | String? |  yes  |  |

---


 
 
 #### [UpdateTransactionResponse](#UpdateTransactionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | [RegisterTransactionResponseResult](#RegisterTransactionResponseResult)? |  yes  |  |
 | action | HashMap<String,Object>? |  yes  | An object for future use, currently empty. |
 | data | [RegisterTransactionResponseData](#RegisterTransactionResponseData)? |  yes  |  |
 | transactionId | String? |  yes  | The unique identifier of the transaction. |
 | status | String? |  yes  | The status of the user related to the payment process. |
 | message | String? |  yes  | A message related to the user status. |

---


 
 
 #### [SplitTransactionRequest](#SplitTransactionRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String |  no  | It contains all the mercahant and order details. |
 | emiTenure | Double |  no  | This will contain the EMI tenure |

---


 
 
 #### [SplitTransactionResponse](#SplitTransactionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parentTransactionId | String? |  yes  |  |
 | loanTransactionId | String? |  yes  |  |
 | downpaymentTransactionId | String? |  yes  |  |
 | loanAmount | Double? |  yes  |  |
 | downpaymentAmount | Double? |  yes  |  |

---



