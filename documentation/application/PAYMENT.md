



##### [Back to Application docs](./README.md)

## Payment Methods
KYC Service
* [downpaymentOptions](#downpaymentoptions)
* [downpaymentUsingNetbanking](#downpaymentusingnetbanking)
* [downpaymentUsingUPI](#downpaymentusingupi)
* [checkDownpaymentStatus](#checkdownpaymentstatus)
* [paymentOptions](#paymentoptions)
* [autoPayStatus](#autopaystatus)
* [repaymentUsingNetbanking](#repaymentusingnetbanking)
* [repaymentUsingUPI](#repaymentusingupi)
* [registerUPIMandate](#registerupimandate)
* [mandateStatusCheck](#mandatestatuscheck)
* [checkPaymentStatus](#checkpaymentstatus)
* [getOutstandingAmount](#getoutstandingamount)



## Methods with example and description


### downpaymentOptions
Get List of Payment Options Available




```java
payment.downpaymentOptions( merchantSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| merchantSlug | String | yes | This is merchant slug |  



Use this API to get list of payment options available

*Returned Response:*




[PaymentOptionsResponse](#PaymentOptionsResponse)

Success. Returns a JSON object as shown below. Refer `PaymentOptionsResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "paymentOptions": [
    {
      "title": "UPI ID",
      "kind": "upiID",
      "options": null
    },
    {
      "title": "UPI Apps",
      "kind": "upiApps",
      "options": [
        {
          "title": "Google PAY",
          "imageUrl": "",
          "uid": "GPAY"
        }
      ]
    },
    {
      "title": "Netbanking",
      "kind": "netBanking",
      "options": [
        {
          "title": "State Bank of India",
          "shortTitle": "SBI",
          "uid": "1038",
          "imageUrl": "https://pp-checkout.jiopay.com:8443/images/logos/StateBankofIndia.gif"
        }
      ]
    }
  ]
}
```
</details>









---


### downpaymentUsingNetbanking
Downpayment




```java
payment.downpaymentUsingNetbanking( merchantSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| merchantSlug | String | yes | This is merchant Slug  |  
| body | [RepaymentUsingNetbanking](#RepaymentUsingNetbanking) | yes | Request body |


Use this API to downpayment for user.

*Returned Response:*




[RepaymentUsingNetbankingResponse](#RepaymentUsingNetbankingResponse)

Success. Returns a html as shown below. for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "form": ""
}
```
</details>









---


### downpaymentUsingUPI
Downpayment




```java
payment.downpaymentUsingUPI( merchantSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| merchantSlug | String | yes | This is merchant slug |  
| body | [RepaymentUsingUPI](#RepaymentUsingUPI) | yes | Request body |


Use this API to Downpayment for user

*Returned Response:*




[RepaymentUsingUPIResponse](#RepaymentUsingUPIResponse)

Success. Returns a success message as shown below. Refer `RepaymentUsingUPIResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "status": "INITIATED"
}
```
</details>









---


### checkDownpaymentStatus
Check payment status




```java
payment.checkDownpaymentStatus( merchantSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| merchantSlug | String | yes | This is merchant slug |  
| body | [TransactionStatusRequest](#TransactionStatusRequest) | yes | Request body |


Use this API to check status of the downpayment.

*Returned Response:*




[TransactionStatusResponse](#TransactionStatusResponse)

Success. Returns a success message as shown below. Refer `TransactionStatusResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### paymentOptions
Get List of Payment Options Available




```java
payment.paymentOptions( lenderSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  



Use this API to get list of payment options available

*Returned Response:*




[PaymentOptionsResponse](#PaymentOptionsResponse)

Success. Returns a JSON object as shown below. Refer `PaymentOptionsResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "paymentOptions": [
    {
      "title": "UPI ID",
      "kind": "upiID",
      "options": null
    },
    {
      "title": "UPI Apps",
      "kind": "upiApps",
      "options": [
        {
          "title": "Google PAY",
          "imageUrl": "",
          "uid": "GPAY"
        }
      ]
    },
    {
      "title": "Netbanking",
      "kind": "netBanking",
      "options": [
        {
          "title": "State Bank of India",
          "shortTitle": "SBI",
          "uid": "1038",
          "imageUrl": "https://pp-checkout.jiopay.com:8443/images/logos/StateBankofIndia.gif"
        }
      ]
    }
  ]
}
```
</details>









---


### autoPayStatus
Get status of AutoPay




```java
payment.autoPayStatus() {
  //use response
}
```




Use this API to get status of AutoPay

*Returned Response:*




[AutoPayStatusResponse](#AutoPayStatusResponse)

Success. Returns a JSON object as shown below. Refer `AutoPayStatusResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "status": "PENDING"
}
```
</details>









---


### repaymentUsingNetbanking
Repayment




```java
payment.repaymentUsingNetbanking( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [RepaymentUsingNetbanking](#RepaymentUsingNetbanking) | yes | Request body |


Use this API to repayment for user.

*Returned Response:*




[RepaymentUsingNetbankingResponse](#RepaymentUsingNetbankingResponse)

Success. Returns a html as shown below. for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "form": ""
}
```
</details>









---


### repaymentUsingUPI
Repayment




```java
payment.repaymentUsingUPI( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [RepaymentUsingUPI](#RepaymentUsingUPI) | yes | Request body |


Use this API to repayment for user

*Returned Response:*




[RepaymentUsingUPIResponse](#RepaymentUsingUPIResponse)

Success. Returns a success message as shown below. Refer `RepaymentUsingUPIResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "status": "INITIATED"
}
```
</details>









---


### registerUPIMandate
MandateRegistration




```java
payment.registerUPIMandate( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [RegisterUPIMandateRequest](#RegisterUPIMandateRequest) | yes | Request body |


Use this API to register upi mandate for user.

*Returned Response:*




[RegisterUPIMandateResponse](#RegisterUPIMandateResponse)

Success. Returns a success message as shown below. Refer `RegisterUPIMandateResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "transactionId": "10322234354461670000",
  "expiry": 180,
  "interval": 5
}
```
</details>









---


### mandateStatusCheck
Repayment




```java
payment.mandateStatusCheck( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [RegisterUPIMandateStatusCheckRequest](#RegisterUPIMandateStatusCheckRequest) | yes | Request body |


Use this API to repayment for user.

*Returned Response:*




[RegisterMandateStatusCheckResponse](#RegisterMandateStatusCheckResponse)

Success. Returns a success message as shown below. Refer `RegisterMandateStatusCheckResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "status": "INITIATED"
}
```
</details>









---


### checkPaymentStatus
Check payment status




```java
payment.checkPaymentStatus( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |  
| body | [TransactionStatusRequest](#TransactionStatusRequest) | yes | Request body |


Use this API to check status of the transaction.

*Returned Response:*




[TransactionStatusResponse](#TransactionStatusResponse)

Success. Returns a success message as shown below. Refer `TransactionStatusResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOutstandingAmount
Get Outstanding amount for repayment




```java
payment.getOutstandingAmount( lenderSlug,  viewType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes | This is lender slug |   
| viewType | String | yes | This is lender slug |  



Use this API to get Outstanding amount for repayment

*Returned Response:*




[OutstandingDetail](#OutstandingDetail)

Success. Returns a JSON object as shown below. Refer `OutstandingDetail` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "outstanding": "100"
}
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


 
 
 #### [RepaymentUsingNetbanking](#RepaymentUsingNetbanking)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double |  no  |  |
 | bankId | String |  no  |  |
 | bankName | String |  no  |  |
 | chargeToken | String? |  yes  |  |

---


 
 
 #### [RepaymentUsingNetbankingResponse](#RepaymentUsingNetbankingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | form | String? |  yes  |  |
 | isDifferent | Boolean? |  yes  |  |
 | outstanding | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [RepaymentUsingUPI](#RepaymentUsingUPI)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | Double |  no  |  |
 | vpa | String |  no  |  |
 | chargeToken | String? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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


 
 
 #### [Payments](#Payments)

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OutstandingSummary](#OutstandingSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalOutstanding | Integer? |  yes  |  |
 | totalOutstandingWithInterest | Integer? |  yes  |  |
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
 | dueTransactions | ArrayList<[DueTransactionsOutstanding](#DueTransactionsOutstanding)>? |  yes  |  |

---


 
 
 #### [OutstandingMessage](#OutstandingMessage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dueMessage | String? |  yes  |  |
 | backgroundColor | String? |  yes  |  |
 | textColor | String? |  yes  |  |

---


 
 
 #### [UserCredit](#UserCredit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | availableLimit | Integer? |  yes  |  |
 | approvedLimit | Integer? |  yes  |  |

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
 | paymentOptions | ArrayList<[Payments](#Payments)>? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AutoPayStatusResponse](#AutoPayStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---



