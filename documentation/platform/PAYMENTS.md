



##### [Back to Platform docs](./README.md)

## Payments Methods
KYC Service
* [getUserCreditSummary](#getusercreditsummary)



## Methods with example and description


### getUserCreditSummary
Get user outstanding details.




```java
payments.getUserCreditSummary( mobile,  lenderSlugs) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| mobile | String | yes | mobile number of the user |   
| organizationId | String | yes | organization id of the merchant. |   
| lenderSlugs | List<String>? | no | This is list of lender slugs. eg. ['cashe','liquiloans'] |  



This api is for getting outstanding details for the user with all the lenders.

*Returned Response:*




[OutstandingDetailsResponse](#OutstandingDetailsResponse)

Success. Returns a JSON object as shown below. Refer `PaymentLinkResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; OutstandingDetailsResponse</i></summary>

```json
{
  "value": {
    "message": "The request has been processed successfully.",
    "data": {
      "outstandingDetails": [
        {
          "lender": {
            "id": "315f60f4-1238-462c-8108-cfff9fbc400f",
            "name": "Bhanix Finance and Investment Limited",
            "slug": "cashe",
            "theme": {
              "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/v2/512h-logo/cashe-icon.png",
              "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/v2/512h-logo/cashe-logo.png"
            }
          },
          "availableLimit": 40000,
          "creditLimit": 40000,
          "dueAmount": 0,
          "outstandingAmount": 0,
          "dueDate": null
        }
      ]
    },
    "meta": {
      "timestamp": "2024-07-26T08:01:02.592Z",
      "version": "v1.0",
      "product": "Settle Checkout",
      "requestId": "048dcf5c1d4ab39a9f39e1d07c584983"
    }
  }
}
```
</details>

</details>









---



### Schemas

 
 
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


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | info | String? |  yes  |  |
 | code | String? |  yes  |  |
 | requestId | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [RepaymentUsingNetbanking](#RepaymentUsingNetbanking)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double |  no  |  |
 | bankId | String |  no  |  |
 | bankName | String |  no  |  |
 | chargeToken | String? |  yes  |  |
 | transactionId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [RepaymentUsingNetbankingResponse](#RepaymentUsingNetbankingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | form | String? |  yes  |  |
 | isDifferent | Boolean? |  yes  |  |
 | outstanding | String? |  yes  |  |

---


 
 
 #### [RepaymentUsingUPI](#RepaymentUsingUPI)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double |  no  |  |
 | vpa | String |  no  |  |
 | chargeToken | String? |  yes  |  |
 | transactionId | String? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [RepaymentUsingUPIResponse](#RepaymentUsingUPIResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDifferent | Boolean? |  yes  |  |
 | outstanding | String? |  yes  |  |
 | status | String? |  yes  |  |
 | intentId | String? |  yes  |  |
 | transactionId | String? |  yes  |  |
 | expiry | Double? |  yes  |  |
 | interval | Double? |  yes  |  |

---


 
 
 #### [RegisterUPIMandateRequest](#RegisterUPIMandateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | vpa | String? |  yes  |  |

---


 
 
 #### [RegisterUPIMandateResponse](#RegisterUPIMandateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactionId | String? |  yes  |  |
 | expiry | Double? |  yes  |  |
 | interval | Double? |  yes  |  |

---


 
 
 #### [RegisterUPIMandateStatusCheckRequest](#RegisterUPIMandateStatusCheckRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactionId | String? |  yes  |  |

---


 
 
 #### [RegisterMandateStatusCheckResponse](#RegisterMandateStatusCheckResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |

---


 
 
 #### [TransactionStatusRequest](#TransactionStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | intentId | String |  no  |  |
 | transactionId | String |  no  |  |

---


 
 
 #### [TransactionStatusResponse](#TransactionStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | methodType | String? |  yes  |  |
 | methodSubType | String? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [BankList](#BankList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bankId | String? |  yes  |  |
 | bankName | String? |  yes  |  |
 | rank | Double? |  yes  |  |
 | popular | Boolean? |  yes  |  |
 | imageUrl | String? |  yes  |  |

---


 
 
 #### [PaymentOptions](#PaymentOptions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | shortTitle | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | imageUrl | String? |  yes  |  |

---


 
 
 #### [PaymentsObject](#PaymentsObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | kind | String? |  yes  |  |
 | options | ArrayList<[PaymentOptions](#PaymentOptions)>? |  yes  |  |

---


 
 
 #### [LenderTheme](#LenderTheme)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | iconUrl | String |  no  |  |
 | logoUrl | String |  no  |  |

---


 
 
 #### [LenderDetails](#LenderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | id | String |  no  |  |
 | theme | [LenderTheme](#LenderTheme) |  no  |  |

---


 
 
 #### [OutstandingDetail](#OutstandingDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | action | Boolean? |  yes  |  |
 | message | [OutstandingMessage](#OutstandingMessage)? |  yes  |  |
 | credit | [UserCredit](#UserCredit)? |  yes  |  |
 | dueSummary | [DueSummaryOutstanding](#DueSummaryOutstanding)? |  yes  |  |
 | outstandingSummary | [OutstandingSummary](#OutstandingSummary)? |  yes  |  |
 | entityMapId | String? |  yes  |  |

---


 
 
 #### [OutstandingSummary](#OutstandingSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalOutstanding | Double? |  yes  |  |
 | totalOutstandingWithInterest | Double? |  yes  |  |
 | totalOutstandingPenalty | Double? |  yes  |  |
 | availableLimit | Double? |  yes  |  |
 | isOverdue | Boolean? |  yes  |  |
 | dueFromDate | String? |  yes  |  |
 | repaymentSummary | ArrayList<[RepaymentSummaryOutstanding](#RepaymentSummaryOutstanding)>? |  yes  |  |

---


 
 
 #### [DueSummaryOutstanding](#DueSummaryOutstanding)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dueDate | String? |  yes  |  |
 | totalDue | Double? |  yes  |  |
 | totalDueWithInterest | Double? |  yes  |  |
 | totalDuePenalty | Double? |  yes  |  |
 | dueTransactions | ArrayList<[DueTransactionsOutstanding](#DueTransactionsOutstanding)>? |  yes  |  |
 | minAmntDue | Double? |  yes  |  |

---


 
 
 #### [OutstandingMessage](#OutstandingMessage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dueMessage | String? |  yes  |  |
 | backgroundColor | String? |  yes  |  |
 | textColor | String? |  yes  |  |
 | isFlexiRepayEnabled | Boolean? |  yes  |  |

---


 
 
 #### [UserCredit](#UserCredit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | availableLimit | Double? |  yes  |  |
 | approvedLimit | Double? |  yes  |  |
 | isEligibleToDrawdown | Boolean? |  yes  |  |

---


 
 
 #### [DueTransactionsOutstanding](#DueTransactionsOutstanding)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loanRequestNo | String? |  yes  |  |
 | merchantCategory | String? |  yes  |  |
 | installmentAmountWithInterest | Double? |  yes  |  |
 | installmentAmount | Double? |  yes  |  |
 | dueAmount | Double? |  yes  |  |
 | loanType | String? |  yes  |  |
 | installmentNo | String? |  yes  |  |
 | installmentDueDate | String? |  yes  |  |
 | isPastDue | Boolean? |  yes  |  |
 | isPenaltyCharged | Boolean? |  yes  |  |
 | penaltyAmount | Double? |  yes  |  |
 | noOfDaysPenaltyCharged | Integer? |  yes  |  |
 | daysDifference | Integer? |  yes  |  |
 | lenderTransactionId | String? |  yes  |  |

---


 
 
 #### [RepaymentSummaryOutstanding](#RepaymentSummaryOutstanding)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loanRequestNo | String? |  yes  |  |
 | loanType | String? |  yes  |  |
 | merchantCategory | String? |  yes  |  |
 | isBbillingTransaction | Boolean? |  yes  |  |
 | totalInstallmentAmount | Integer? |  yes  |  |
 | totalInstallmentAmountWithInterest | Integer? |  yes  |  |
 | outstandingDetails | ArrayList<[OutstandingDetailsRepayment](#OutstandingDetailsRepayment)>? |  yes  |  |

---


 
 
 #### [OutstandingDetailsRepayment](#OutstandingDetailsRepayment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | installmentAmountWithInterest | Double? |  yes  |  |
 | installmentAmount | Double? |  yes  |  |
 | dueAmount | Double? |  yes  |  |
 | installmentNo | String? |  yes  |  |
 | installmentDueDate | String? |  yes  |  |
 | isPastDue | Boolean? |  yes  |  |
 | loanType | String? |  yes  |  |
 | isPenaltyCharged | Boolean? |  yes  |  |
 | penaltyAmount | Integer? |  yes  |  |
 | noOfDaysPenaltyCharged | Integer? |  yes  |  |
 | lenderTransactionId | String? |  yes  |  |

---


 
 
 #### [PaymentOptionsResponse](#PaymentOptionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentOptions | ArrayList<[PaymentsObject](#PaymentsObject)>? |  yes  |  |

---


 
 
 #### [CheckEMandateStatusRequest](#CheckEMandateStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String? |  yes  |  |
 | paymentId | String? |  yes  |  |
 | scheduledEnd | String? |  yes  |  |
 | ruleAmountValue | String? |  yes  |  |

---


 
 
 #### [AutoPayStatusResponse](#AutoPayStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |

---


 
 
 #### [OutstandingData](#OutstandingData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenderDetails | [LenderDetails](#LenderDetails)? |  yes  |  |
 | availableLimit | Double |  no  |  |
 | creditLimit | Double |  no  |  |
 | dueAmount | Double? |  yes  |  |
 | outstandingAmount | Double? |  yes  |  |
 | dueDate | String? |  yes  |  |

---


 
 
 #### [OutstandingDetailsData](#OutstandingDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | outstandingDetails | ArrayList<[OutstandingData](#OutstandingData)> |  no  |  |

---


 
 
 #### [OutstandingDetailsResponse](#OutstandingDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | meta | [IntegrationResponseMeta](#IntegrationResponseMeta) |  no  |  |
 | data | [OutstandingDetailsData](#OutstandingDetailsData) |  no  |  |

---


 
 
 #### [VerifyUPIRequest](#VerifyUPIRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | vpa | String |  no  | The Virtual Payment Address (VPA) for UPI. |
 | lenderSlug | String? |  yes  | The lender slug associated with the request. Optional parameter. |

---


 
 
 #### [UPIValidationSuccessResponse](#UPIValidationSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | name | String? |  yes  |  |

---



