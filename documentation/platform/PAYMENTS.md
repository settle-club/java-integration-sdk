



##### [Back to Platform docs](./README.md)

## Payments Methods
KYC Service
* [getOutStandingDetails](#getoutstandingdetails)



## Methods with example and description


### getOutStandingDetails
Get user outstanding details.




```java
payments.getOutStandingDetails( mobile,  lenderSlugs) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| mobile | String | yes | mobile number of the user |   
| organizationId | String | yes | organization id of the merchant. |   
| lenderSlugs | String? | no | This is comma seperated list of lender slugs. eg. 'cashe','liquiloans' |  



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
  "overallDueSummary": {
    "totalDue": 0,
    "totalDueWithInterest": 0,
    "totalDuePenalty": 0
  },
  "overallOutstandingSummary": {
    "totalOutstanding": 0,
    "totalOutstandingWithInterest": 0,
    "totalOutstandingPenalty": 0
  },
  "outstandingDetails": [
    {
      "lender": {
        "slug": "cashe",
        "id": "f162ae3e-cc7c-4b96-85d1-19c3e0f7e780",
        "name": "Bhanix"
      },
      "entityMapId": "2e6ff5e8-5153-4a3f-9a6b-3f73d2f3c6d4",
      "message": {
        "backgroundColor": "#f8e6b7",
        "textColor": "#ffffff",
        "isFlexiRepayEnabled": false
      },
      "credit": {
        "availableLimit": 40000,
        "approvedLimit": 40000,
        "isEligibleToDrawdown": true
      },
      "dueSummary": {
        "totalDue": 0,
        "totalDueWithInterest": 0,
        "totalDuePenalty": 0,
        "dueTransactions": null,
        "minAmntDue": 0
      },
      "outstandingSummary": {
        "totalOutstanding": 0,
        "totalOutstandingWithInterest": 0,
        "totalOutstandingPenalty": 0,
        "availableLimit": 40000,
        "isOverdue": false,
        "dueFromDate": null,
        "repaymentSummary": null
      }
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


 
 
 #### [RepaymentUsingNetbanking](#RepaymentUsingNetbanking)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double |  no  |  |
 | bankId | String |  no  |  |
 | bankName | String |  no  |  |
 | chargeToken | String? |  yes  |  |
 | transactionId | String? |  yes  |  |

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
 | totalOutstanding | Integer? |  yes  |  |
 | totalOutstandingWithInterest | Integer? |  yes  |  |
 | totalOutstandingPenalty | Double? |  yes  |  |
 | availableLimit | Integer? |  yes  |  |
 | isOverdue | Boolean? |  yes  |  |
 | dueFromDate | String? |  yes  |  |
 | repaymentSummary | ArrayList<[RepaymentSummaryOutstanding](#RepaymentSummaryOutstanding)>? |  yes  |  |

---


 
 
 #### [DueSummaryOutstanding](#DueSummaryOutstanding)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dueDate | String? |  yes  |  |
 | totalDue | Integer? |  yes  |  |
 | totalDueWithInterest | Integer? |  yes  |  |
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
 | availableLimit | Integer? |  yes  |  |
 | approvedLimit | Integer? |  yes  |  |
 | isEligibleToDrawdown | Boolean? |  yes  |  |

---


 
 
 #### [DueTransactionsOutstanding](#DueTransactionsOutstanding)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loanRequestNo | String? |  yes  |  |
 | merchantCategory | String? |  yes  |  |
 | installmentAmountWithInterest | Integer? |  yes  |  |
 | installmentAmount | Integer? |  yes  |  |
 | dueAmount | Integer? |  yes  |  |
 | loanType | String? |  yes  |  |
 | installmentNo | String? |  yes  |  |
 | installmentDueDate | String? |  yes  |  |
 | isPastDue | Boolean? |  yes  |  |
 | isPenaltyCharged | Boolean? |  yes  |  |
 | penaltyAmount | Integer? |  yes  |  |
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
 | installmentAmountWithInterest | Integer? |  yes  |  |
 | installmentAmount | Integer? |  yes  |  |
 | dueAmount | Integer? |  yes  |  |
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


 
 
 #### [OutstandingDetailsResponse](#OutstandingDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | outstandingDetails | ArrayList<[OutstandingDetail](#OutstandingDetail)>? |  yes  |  |
 | overallDueSummary | [DueSummaryOutstanding](#DueSummaryOutstanding)? |  yes  |  |
 | overallOutstandingSummary | [OutstandingSummary](#OutstandingSummary)? |  yes  |  |
 | userId | String? |  yes  |  |
 | entityId | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---



