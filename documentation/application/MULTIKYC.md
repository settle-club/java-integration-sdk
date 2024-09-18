



##### [Back to Application docs](./README.md)

## MultiKyc Methods
Will deprecate Hawkeye
* [breResult](#breresult)
* [runBre](#runbre)
* [getCreditInsights](#getcreditinsights)
* [getLimit](#getlimit)
* [validaFormField](#validaformfield)
* [getUserDoc](#getuserdoc)
* [validatePan](#validatepan)
* [confirmPan](#confirmpan)
* [uploadDocument](#uploaddocument)
* [processAadhaar](#processaadhaar)
* [processSelfie](#processselfie)
* [processBankDetails](#processbankdetails)
* [getDocuments](#getdocuments)
* [getGstDetails](#getgstdetails)
* [submitGstDetails](#submitgstdetails)
* [uploadDocumentV1](#uploaddocumentv1)
* [processAadhaarV1](#processaadhaarv1)
* [processSelfieV1](#processselfiev1)
* [getDocumentsV1](#getdocumentsv1)
* [processAadhaarV2](#processaadhaarv2)
* [processSelfieV2](#processselfiev2)
* [processAadhaarV3](#processaadhaarv3)
* [processSelfieV3](#processselfiev3)
* [initiateKyc](#initiatekyc)
* [getDigilockerLink](#getdigilockerlink)
* [initiateKycV1](#initiatekycv1)
* [lenderDetail](#lenderdetail)
* [initiateLenderOnboarding](#initiatelenderonboarding)
* [availableLenders](#availablelenders)
* [initiateLenderOnboardingV1](#initiatelenderonboardingv1)
* [getOnboardingStatus](#getonboardingstatus)
* [getOnboardingSteps](#getonboardingsteps)
* [getOnboardingStatusV1](#getonboardingstatusv1)
* [getLenderCards](#getlendercards)
* [getActiveOrganization](#getactiveorganization)
* [getLenderCardsV1](#getlendercardsv1)
* [createPixelbinSignedUrl](#createpixelbinsignedurl)
* [createPixelbinSignedUrlV2](#createpixelbinsignedurlv2)
* [createSignedUrlV3](#createsignedurlv3)



## Methods with example and description


### breResult
Bre result




```java
multikyc.breResult( merchantId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| merchantId | String? | no |  |  



API to get all the BRE output after BRE has run

*Returned Response:*




[ApprovedLenders](#ApprovedLenders)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "status": "SUCCESS",
    "lenders": [
      {
        "id": "c5c672c5-7b8e-4d68-9ca6-f8a5ce84a12f",
        "name": "Piramal Finance",
        "slug": "piramal-finance",
        "imageUrl": "https://example.com/lenders/piramal.png",
        "status": "APPROVED",
        "active": true,
        "proposedLimit": 15000,
        "createdAt": "2023-08-01T12:00:00.000Z",
        "updatedAt": "2023-08-02T10:30:00.000Z"
      },
      {
        "id": "d8f3a2b1-6e9c-4a0d-87c9-8b24b6fd94e7",
        "name": "CASHe",
        "slug": "cashe",
        "imageUrl": "https://example.com/lenders/cashe.png",
        "status": "APPROVED",
        "active": true,
        "proposedLimit": 20000,
        "createdAt": "2023-08-01T14:00:00.000Z",
        "updatedAt": "2023-08-02T11:45:00.000Z"
      }
    ]
  }
}
```
</details>

</details>









---


### runBre
Run bre




```java
multikyc.runBre() {
  //use response
}
```




API to execute bre. This api is supposed to be called when user lands on home page. If the response has newLenderAssigned =  true then call getLenderCards API.

*Returned Response:*




[CreditCheckBreResponse](#CreditCheckBreResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "newLenderAssigned": true,
    "breStatus": "SUCCESS"
  }
}
```
</details>

</details>









---


### getCreditInsights
Get credit insights




```java
multikyc.getCreditInsights(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreditReportRequest](#CreditReportRequest) | yes | Request body |


This API retruns the credit insight screen.

*Returned Response:*




[Report](#Report)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "type": "credit_insight_success",
    "score": "755",
    "summary": {
      "isNTC": false,
      "score": 755,
      "delinquency": 0,
      "totalInquiries": 0,
      "loanAccounts": 3,
      "creditCards": 1,
      "noOfPastDueAccounts": 0,
      "noOfWriteOffs": 0
    },
    "sections": [
      {
        "title": "Credit Report Score",
        "type": "credit_insight_score",
        "score": 755,
        "max": 850,
        "min": 300,
        "status": {
          "title": "EXCELLENT",
          "backgroundColor": "#438164"
        },
        "scoreColor": "#17BAA9",
        "statusbarColor": "#6C6069",
        "backgroundColor": "#E4F9EE",
        "name": "sharan ",
        "age": "29",
        "gender": "Male",
        "avatarUrl": "",
        "performance": {
          "title": "Your score is EXCELLENT ",
          "subtitle": "Your score will refresh after {{remainingDays}} days",
          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/excellent.svg",
          "isSubtitleHyperLink": false,
          "key": "{{remainingDays}}",
          "createdAt": "2023-06-20T07:27:09.699Z"
        }
      },
      {
        "title": "Credit Report Summary",
        "type": "credit_insight_sumary",
        "backgroundColor": "#CDF1D7",
        "description": "Review activity on your credit card and loans",
        "loanAccounts": 3,
        "loanAmount": "81050.00",
        "creditCards": 1,
        "creditBalance": 9481,
        "creditAge": "1y 6m",
        "creditLimit": "90000.0",
        "noOfPastDueAccounts": 0,
        "totalPastDueAmount": "0.00",
        "data": [
          {
            "title": "3 Active Loans",
            "subtitle": "₹81,050",
            "backgroundColor": "#FFFFFF"
          },
          {
            "title": "1 Active Credit Card",
            "subtitle": "₹9,481",
            "backgroundColor": "#FFFFFF"
          },
          {
            "title": "Age of Accounts",
            "subtitle": "1y 6m",
            "backgroundColor": "#FFFFFF"
          },
          {
            "title": "Overdue Payments",
            "subtitle": "No dues",
            "backgroundColor": "#FFFFFF"
          }
        ]
      },
      {
        "title": "Your Score History",
        "type": "credit_insight_history",
        "data": {
          "creditScore": 755,
          "projectedScore": 765,
          "scoreColor": "#438164",
          "projectionColor": "#C1B8BF",
          "scores": [
            -1,
            -1,
            -1,
            -1,
            755,
            765
          ],
          "xLabels": [
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul"
          ],
          "cLabel": {
            "min": 300,
            "max": 850
          },
          "step": 50
        }
      },
      {
        "title": "Credit Insights",
        "type": "credit_insight_depending_factors",
        "data": [
          {
            "title": "Ontime payment",
            "subtitle": "100%",
            "type": "credit_insights_card",
            "subType": "credit_insights_on_time_payments",
            "status": {
              "title": "EXCELLENT",
              "backgroundColor": "#438164"
            },
            "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/ontime.svg",
            "backgroundColor": "#FFFFFF",
            "statusColor": "#1E382C",
            "impact": "High Imapct",
            "hasClick": true,
            "detail": {
              "type": "credit_insights_detail",
              "subType": "credit_insights_on_time_payments",
              "title": "Credit Report",
              "backgroundColor": "#D3EFD7",
              "sections": [
                {
                  "backgroundColor": "#E8FAF1",
                  "type": "credit_insights_credit_detail_primary",
                  "data": [
                    {
                      "title": "On-time payments",
                      "type": "credit_insights_credit_detail_hero",
                      "subtitle": "100%",
                      "impact": "High Imapct",
                      "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/ontime.svg",
                      "status": {
                        "title": "EXCELLENT",
                        "backgroundColor": "#438164"
                      },
                      "backgroundColor": "#FFFFFF"
                    },
                    {
                      "title": "",
                      "type": "credit_insights_credit_detail_key_info",
                      "subtitle": "100%",
                      "backgroundColor": "#1E382C",
                      "data": [
                        {
                          "title": "17",
                          "subtitle": "Ontime payments",
                          "backgroundColor": "#FFFFFF"
                        },
                        {
                          "title": "17",
                          "subtitle": "Total  payment",
                          "backgroundColor": "#FFFFFF"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "",
                  "type": "credit_insights_credit_detail_banks",
                  "subtitle": "100%",
                  "backgroundColor": "#FFFFFF",
                  "data": [
                    {
                      "type": "Personal Loan",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0021",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "3m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹525",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹525",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "28 Feb 2023",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "28 Feb 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 1,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-02-28",
                          "age": "3m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "525",
                          "balance": "525",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0022",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "3m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹525",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹525",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "28 Feb 2023",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "28 Feb 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 1,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-02-28",
                          "age": "3m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "525",
                          "balance": "525",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0012",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "5m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "CLOSED",
                                  "stateColor": "#EB7070"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹541",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "17 Jan 2023",
                                    "subtitle": "Date closed"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 0,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "CLSD",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "CLOSED",
                            "stateColor": "#EB7070"
                          },
                          "onTimePaymentCount": 0,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-01-13",
                          "age": "5m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "541",
                          "balance": "0",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0013",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "5m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "CLOSED",
                                  "stateColor": "#EB7070"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹524",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "23 Jan 2023",
                                    "subtitle": "Date closed"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 0,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "CLSD",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "CLOSED",
                            "stateColor": "#EB7070"
                          },
                          "onTimePaymentCount": 0,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-01-18",
                          "age": "5m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "524",
                          "balance": "0",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    },
                    {
                      "type": "Other",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "Aditya Birla Finance",
                          "accountType": "Other",
                          "type": "LOAN",
                          "title": "Aditya Birla Finance",
                          "accountNumber": "**** 0567",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "11m",
                            "credit_insights_credit_profile": "Other",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Aditya Birla Finance",
                                "subtitle": "Other",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹17,777",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹80,000",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "04 Jul 2022",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "01 Mar 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 7,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2022-07-04",
                          "age": "11m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "80000",
                          "balance": "17777",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    },
                    {
                      "type": "Credit Card",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "ICICI BANK LIMITED",
                          "accountType": "Credit Card",
                          "type": "CREDIT",
                          "title": "ICICI BANK ",
                          "accountNumber": "**** 6579",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "11%",
                            "credit_insights_credit_age": "1y 6m",
                            "credit_insights_credit_profile": "Credit Card",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                                "title": "ICICI BANK ",
                                "subtitle": "Credit Card",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_progress",
                                "total": "₹90,000",
                                "utilized": "₹9,481",
                                "percentage": 11,
                                "title": "Credit limit utilisation 11%",
                                "showProgress": true
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "title": "Report an Issue",
                                "type": "credit_insights_credit_detail_report_issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 8,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2021-12-20",
                          "age": "1y 6m",
                          "isPaymentHistoryMonthlyView": true,
                          "showProgress": true,
                          "creditUtilization": "11%",
                          "percentage": 11,
                          "limit": 90000,
                          "utilized": 9481,
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "What is payment history?",
                  "type": "credit_insights_credit_detail_about",
                  "subtitle": "Make sure to pay your bills on time and avoid missed payments to maintain a good score",
                  "backgroundColor": "#FFFFFF"
                },
                {
                  "title": "Report an issue",
                  "type": "credit_insights_credit_detail_report_issue",
                  "subtitle": "Credit bureau may take up to 4 months to account for your most recent credit card activity data.",
                  "backgroundColor": "#FFFFFF"
                }
              ]
            }
          },
          {
            "title": "Cred utilisation",
            "subtitle": "11%",
            "type": "credit_insights_card",
            "subType": "credit_insights_credit_utilization",
            "status": {
              "title": "EXCELLENT",
              "backgroundColor": "#438164"
            },
            "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
            "backgroundColor": "#FFFFFF",
            "statusColor": "#1E382C",
            "impact": "High Imapct",
            "hasClick": true,
            "detail": {
              "title": "Credit Report",
              "backgroundColor": "#D3EFD7",
              "type": "credit_insights_detail",
              "subType": "credit_insights_credit_utilization",
              "sections": [
                {
                  "backgroundColor": "#E8FAF1",
                  "type": "credit_insights_credit_detail_primary",
                  "data": [
                    {
                      "title": "Cred utilisation",
                      "type": "credit_insights_credit_detail_hero",
                      "subtitle": "11%",
                      "impact": "High Imapct",
                      "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                      "status": {
                        "title": "EXCELLENT",
                        "backgroundColor": "#438164"
                      },
                      "backgroundColor": "#FFFFFF"
                    },
                    {
                      "title": "",
                      "type": "credit_insights_credit_detail_key_info",
                      "subtitle": "100%",
                      "backgroundColor": "#1E382C",
                      "data": [
                        {
                          "title": "90000",
                          "subtitle": "Total credit limit",
                          "backgroundColor": "#FFFFFF"
                        },
                        {
                          "title": "9481",
                          "subtitle": "Total utilized Credit",
                          "backgroundColor": "#FFFFFF"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "",
                  "type": "credit_insights_credit_detail_banks",
                  "subtitle": "100%",
                  "backgroundColor": "#FFFFFF",
                  "data": [
                    {
                      "type": "Credit Card",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "ICICI BANK LIMITED",
                          "accountType": "Credit Card",
                          "type": "CREDIT",
                          "title": "ICICI BANK ",
                          "accountNumber": "**** 6579",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "11%",
                            "credit_insights_credit_age": "1y 6m",
                            "credit_insights_credit_profile": "Credit Card",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                                "title": "ICICI BANK ",
                                "subtitle": "Credit Card",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_progress",
                                "total": "₹90,000",
                                "utilized": "₹9,481",
                                "percentage": 11,
                                "title": "Credit limit utilisation 11%",
                                "showProgress": true
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "title": "Report an Issue",
                                "type": "credit_insights_credit_detail_report_issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 8,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2021-12-20",
                          "age": "1y 6m",
                          "isPaymentHistoryMonthlyView": true,
                          "showProgress": true,
                          "creditUtilization": "11%",
                          "percentage": 11,
                          "limit": 90000,
                          "utilized": 9481,
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "What is cred utilisation?",
                  "type": "credit_insights_credit_detail_about",
                  "subtitle": "Keep your credit utilisation rate low by not using too much of your available credit.",
                  "backgroundColor": "#FFFFFF"
                },
                {
                  "title": "Report an issue",
                  "type": "credit_insights_credit_detail_report_issue",
                  "subtitle": "Credit bureau may take up to 4 months to account for your most recent credit card activity data.",
                  "backgroundColor": "#FFFFFF"
                }
              ]
            }
          },
          {
            "title": "Cred age",
            "subtitle": "1y 6m",
            "type": "credit_insights_card",
            "subType": "credit_insights_credit_age",
            "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/age.svg",
            "status": {
              "title": "BAD",
              "backgroundColor": "#EB7070"
            },
            "backgroundColor": "#FFFFFF",
            "statusColor": "#1E382C",
            "impact": "Medium Impact",
            "hasClick": true,
            "detail": {
              "title": "Credit Report",
              "backgroundColor": "#D3EFD7",
              "type": "credit_insights_detail",
              "subType": "credit_insights_credit_age",
              "sections": [
                {
                  "backgroundColor": "#E8FAF1",
                  "type": "credit_insights_credit_detail_primary",
                  "data": [
                    {
                      "title": "Credit age",
                      "type": "credit_insights_credit_detail_hero",
                      "subtitle": "1y 6m",
                      "impact": "Medium Impact",
                      "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/age.svg",
                      "status": {
                        "title": "BAD",
                        "backgroundColor": "#EB7070"
                      },
                      "backgroundColor": "#FFFFFF"
                    },
                    {
                      "title": "",
                      "type": "credit_insights_credit_detail_key_info",
                      "subtitle": "100%",
                      "backgroundColor": "#1E382C",
                      "data": [
                        {
                          "title": "3m",
                          "subtitle": "Latest account",
                          "backgroundColor": "#FFFFFF"
                        },
                        {
                          "title": "1y 6m",
                          "subtitle": "Oldest account",
                          "backgroundColor": "#FFFFFF"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "",
                  "type": "credit_insights_credit_detail_banks",
                  "subtitle": "100%",
                  "backgroundColor": "#FFFFFF",
                  "data": [
                    {
                      "type": "Personal Loan",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0021",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "3m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹525",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹525",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "28 Feb 2023",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "28 Feb 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 1,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-02-28",
                          "age": "3m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "525",
                          "balance": "525",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0022",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "3m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹525",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹525",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "28 Feb 2023",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "28 Feb 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 1,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-02-28",
                          "age": "3m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "525",
                          "balance": "525",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0012",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "5m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "CLOSED",
                                  "stateColor": "#EB7070"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹541",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "17 Jan 2023",
                                    "subtitle": "Date closed"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 0,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "CLSD",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "CLOSED",
                            "stateColor": "#EB7070"
                          },
                          "onTimePaymentCount": 0,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-01-13",
                          "age": "5m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "541",
                          "balance": "0",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0013",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "5m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "CLOSED",
                                  "stateColor": "#EB7070"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹524",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "23 Jan 2023",
                                    "subtitle": "Date closed"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 0,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "CLSD",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "CLOSED",
                            "stateColor": "#EB7070"
                          },
                          "onTimePaymentCount": 0,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-01-18",
                          "age": "5m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "524",
                          "balance": "0",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    },
                    {
                      "type": "Other",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "Aditya Birla Finance",
                          "accountType": "Other",
                          "type": "LOAN",
                          "title": "Aditya Birla Finance",
                          "accountNumber": "**** 0567",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "11m",
                            "credit_insights_credit_profile": "Other",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Aditya Birla Finance",
                                "subtitle": "Other",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹17,777",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹80,000",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "04 Jul 2022",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "01 Mar 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 7,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2022-07-04",
                          "age": "11m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "80000",
                          "balance": "17777",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    },
                    {
                      "type": "Credit Card",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "ICICI BANK LIMITED",
                          "accountType": "Credit Card",
                          "type": "CREDIT",
                          "title": "ICICI BANK ",
                          "accountNumber": "**** 6579",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "11%",
                            "credit_insights_credit_age": "1y 6m",
                            "credit_insights_credit_profile": "Credit Card",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                                "title": "ICICI BANK ",
                                "subtitle": "Credit Card",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_progress",
                                "total": "₹90,000",
                                "utilized": "₹9,481",
                                "percentage": 11,
                                "title": "Credit limit utilisation 11%",
                                "showProgress": true
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "title": "Report an Issue",
                                "type": "credit_insights_credit_detail_report_issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 8,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2021-12-20",
                          "age": "1y 6m",
                          "isPaymentHistoryMonthlyView": true,
                          "showProgress": true,
                          "creditUtilization": "11%",
                          "percentage": 11,
                          "limit": 90000,
                          "utilized": 9481,
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "What is credit age?",
                  "type": "credit_insights_credit_detail_about",
                  "subtitle": "The longer your credit history, the better it is for your credit score.",
                  "backgroundColor": "#FFFFFF"
                },
                {
                  "title": "Report an issue",
                  "type": "credit_insights_credit_detail_report_issue",
                  "subtitle": "Credit bureau may take up to 4 months to account for your most recent credit card activity data.",
                  "backgroundColor": "#FFFFFF"
                }
              ]
            }
          },
          {
            "title": "Profiles",
            "subtitle": "6",
            "type": "credit_insights_card",
            "subType": "credit_insights_credit_profile",
            "status": {
              "title": "AVERAGE",
              "backgroundColor": "#CE9B6B"
            },
            "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/profile.svg",
            "backgroundColor": "#FFFFFF",
            "statusColor": "#1E382C",
            "impact": "Low Impact",
            "hasClick": true,
            "detail": {
              "type": "credit_insights_detail",
              "subType": "credit_insights_credit_profile",
              "title": "Credit Report",
              "backgroundColor": "#D3EFD7",
              "sections": [
                {
                  "backgroundColor": "#D3EFD7",
                  "type": "credit_insights_credit_detail_primary",
                  "data": [
                    {
                      "title": "Profiles",
                      "type": "credit_insights_credit_detail_hero",
                      "subtitle": "6",
                      "impact": "Low Impact",
                      "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/profile.svg",
                      "status": {
                        "title": "AVERAGE",
                        "backgroundColor": "#CE9B6B"
                      },
                      "backgroundColor": "#FFFFFF"
                    },
                    {
                      "title": "",
                      "type": "credit_insights_credit_detail_key_info",
                      "subtitle": "100%",
                      "backgroundColor": "#1E382C",
                      "data": [
                        {
                          "title": "4",
                          "subtitle": "Active a/c",
                          "backgroundColor": "#FFFFFF"
                        },
                        {
                          "title": "0",
                          "subtitle": "Inactive a/c",
                          "backgroundColor": "#FFFFFF"
                        },
                        {
                          "title": "2",
                          "subtitle": "Closed a/c",
                          "backgroundColor": "#FFFFFF"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "",
                  "type": "credit_insights_credit_detail_banks",
                  "subtitle": "100%",
                  "backgroundColor": "#FFFFFF",
                  "data": [
                    {
                      "type": "ACTIVE",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0021",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "3m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹525",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹525",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "28 Feb 2023",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "28 Feb 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 1,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-02-28",
                          "age": "3m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "525",
                          "balance": "525",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0022",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "3m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹525",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹525",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "28 Feb 2023",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "28 Feb 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 1,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-02-28",
                          "age": "3m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "525",
                          "balance": "525",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Aditya Birla Finance",
                          "accountType": "Other",
                          "type": "LOAN",
                          "title": "Aditya Birla Finance",
                          "accountNumber": "**** 0567",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "11m",
                            "credit_insights_credit_profile": "Other",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Aditya Birla Finance",
                                "subtitle": "Other",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹17,777",
                                    "subtitle": "Amount to be paid"
                                  },
                                  {
                                    "title": "₹80,000",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "04 Jul 2022",
                                    "subtitle": "Issued on"
                                  },
                                  {
                                    "title": "Individual",
                                    "subtitle": "Ownership"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "NEW",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "01 Mar 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 7,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2022-07-04",
                          "age": "11m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "80000",
                          "balance": "17777",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "ICICI BANK LIMITED",
                          "accountType": "Credit Card",
                          "type": "CREDIT",
                          "title": "ICICI BANK ",
                          "accountNumber": "**** 6579",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "11%",
                            "credit_insights_credit_age": "1y 6m",
                            "credit_insights_credit_profile": "Credit Card",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                                "title": "ICICI BANK ",
                                "subtitle": "Credit Card",
                                "status": {
                                  "state": "ACTIVE",
                                  "stateColor": "#438164"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_progress",
                                "total": "₹90,000",
                                "utilized": "₹9,481",
                                "percentage": 11,
                                "title": "Credit limit utilisation 11%",
                                "showProgress": true
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 100,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "000",
                                        "paymentStatusUi": "ON_TIME"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "title": "Report an Issue",
                                "type": "credit_insights_credit_detail_report_issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/credit.svg",
                          "status": {
                            "state": "ACTIVE",
                            "stateColor": "#438164"
                          },
                          "onTimePaymentCount": 8,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2021-12-20",
                          "age": "1y 6m",
                          "isPaymentHistoryMonthlyView": true,
                          "showProgress": true,
                          "creditUtilization": "11%",
                          "percentage": 11,
                          "limit": 90000,
                          "utilized": 9481,
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    },
                    {
                      "type": "IN_ACTIVE",
                      "accounts": []
                    },
                    {
                      "type": "CLOSED",
                      "accounts": [
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0012",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "5m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "CLOSED",
                                  "stateColor": "#EB7070"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹541",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "17 Jan 2023",
                                    "subtitle": "Date closed"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 0,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "CLSD",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "CLOSED",
                            "stateColor": "#EB7070"
                          },
                          "onTimePaymentCount": 0,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-01-13",
                          "age": "5m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "541",
                          "balance": "0",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        },
                        {
                          "hasClick": true,
                          "institution": "Piramal Capital & Housing Finance Ltd",
                          "accountType": "Personal Loan",
                          "type": "LOAN",
                          "title": "Piramal Capital & Housing Finance ",
                          "accountNumber": "**** 0013",
                          "subtitle": {
                            "credit_insights_on_time_payments": "no late payments",
                            "credit_insights_credit_utilization": "undefined%",
                            "credit_insights_credit_age": "5m",
                            "credit_insights_credit_profile": "Personal Loan",
                            "credit_insights_credit_enquiries": null
                          },
                          "data": {
                            "sections": [
                              {
                                "type": "credit_insights_credit_account_hero",
                                "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                                "title": "Piramal Capital & Housing Finance ",
                                "subtitle": "Personal Loan",
                                "status": {
                                  "state": "CLOSED",
                                  "stateColor": "#EB7070"
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_card",
                                "data": [
                                  {
                                    "title": "₹524",
                                    "subtitle": "Sanctioned amount"
                                  },
                                  {
                                    "title": "23 Jan 2023",
                                    "subtitle": "Date closed"
                                  }
                                ]
                              },
                              {
                                "type": "credit_insights_credit_account_payment_history",
                                "onTimePercent": 0,
                                "paymentHistory": {
                                  "rLabels": [
                                    "jan",
                                    "feb",
                                    "mar",
                                    "apr",
                                    "may",
                                    "jun",
                                    "jul",
                                    "aug",
                                    "sep",
                                    "oct",
                                    "nov",
                                    "dec"
                                  ],
                                  "cLabels": [
                                    "2021",
                                    "2022",
                                    "2023"
                                  ],
                                  "data": [
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ],
                                    [
                                      {
                                        "paymentStatus": "CLSD",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      },
                                      {
                                        "paymentStatus": "*",
                                        "paymentStatusUi": "NO_HISTORY"
                                      }
                                    ]
                                  ]
                                }
                              },
                              {
                                "type": "credit_insights_credit_account_last_updated",
                                "title": "Last updated on",
                                "lastUpdatedText": "31 Jan 2023"
                              },
                              {
                                "type": "credit_insights_credit_detail_report_issue",
                                "title": "Report an Issue"
                              }
                            ]
                          },
                          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/loans.png",
                          "status": {
                            "state": "CLOSED",
                            "stateColor": "#EB7070"
                          },
                          "onTimePaymentCount": 0,
                          "latePaymentText": "no late payments",
                          "issuedOn": "2023-01-18",
                          "age": "5m",
                          "isPaymentHistoryMonthlyView": true,
                          "sanctionedAmount": "524",
                          "balance": "0",
                          "lastUpdatedText": "Last updated  on  Fri Jan 20 0023 00:00:00 GMT+0553"
                        }
                      ]
                    }
                  ]
                },
                {
                  "title": "What is profile?",
                  "type": "credit_insights_credit_detail_about",
                  "subtitle": "Having a diverse portfolio mix of credit accounts can improve your credit score. Including a mix of credit cards, loans, and mortgages can help demonstrate your ability to manage different types of credit.",
                  "backgroundColor": "#FFFFFF"
                },
                {
                  "title": "Report an issue",
                  "type": "credit_insights_credit_detail_report_issue",
                  "subtitle": "Credit bureau may take up to 4 months to account for your most recent credit card activity data.",
                  "backgroundColor": "#FFFFFF"
                }
              ]
            }
          },
          {
            "title": "Credit Enquiries",
            "subtitle": "0",
            "type": "credit_insights_card",
            "subType": "credit_insights_credit_enquiries",
            "status": {
              "title": "EXCELLENT",
              "backgroundColor": "#438164"
            },
            "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/enquiries.svg",
            "backgroundColor": "#FFFFFF",
            "statusColor": "#1E382C",
            "impact": "Low Impact",
            "hasClick": true,
            "detail": {
              "type": "credit_insights_detail",
              "subType": "credit_insights_credit_enquiries",
              "title": "Credit Report",
              "backgroundColor": "#E8FAF1",
              "sections": [
                {
                  "backgroundColor": "#E8FAF1",
                  "type": "credit_insights_credit_detail_primary",
                  "data": [
                    {
                      "title": "Enquries",
                      "type": "credit_insights_credit_detail_hero",
                      "subtitle": "0",
                      "impact": "Low Impact",
                      "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/icons/credit_insights/enquiries.svg",
                      "status": {
                        "title": "EXCELLENT",
                        "backgroundColor": "#438164"
                      },
                      "backgroundColor": "#FFFFFF"
                    }
                  ]
                },
                {
                  "title": "",
                  "type": "credit_insights_credit_detail_banks",
                  "subtitle": "100%",
                  "backgroundColor": "#FFFFFF",
                  "data": [
                    {
                      "type": "Enquiries",
                      "accounts": []
                    }
                  ]
                },
                {
                  "title": "What is enquiries?",
                  "type": "credit_insights_credit_detail_about",
                  "subtitle": "Limit the number of credit applications you make and try to space them out over time.",
                  "backgroundColor": "#FFFFFF"
                },
                {
                  "title": "Report an issue",
                  "type": "credit_insights_credit_detail_report_issue",
                  "subtitle": "Credit bureau may take up to 4 months to account for your most recent credit card activity data.",
                  "backgroundColor": "#FFFFFF"
                }
              ]
            }
          }
        ]
      },
      {
        "title": "Tips to improve your score",
        "type": "credit_insight_tips",
        "url": "https://settle.club/faq",
        "data": [
          {
            "title": "TIP #01",
            "subtitle": "Make sure to pay all your bills, EMIs, and credit card dues on time to avoid late payment fees and negative marks on your credit report."
          },
          {
            "title": "TIP #02",
            "subtitle": "Keep your credit utilization ratio below 30% of your credit limit to show lenders that you are responsible with credit and can manage your debts effectively."
          },
          {
            "title": "TIP #03",
            "subtitle": "Regularly check your credit report for accuracy and in case of any errors or inaccuracies in the credit report, raise a case with the credit bureau."
          },
          {
            "title": "TIP #04",
            "subtitle": "Avoid applying for too many loans or credit cards in a short period of time, as this can negatively impact your credit score and make you appear credit hungry."
          },
          {
            "title": "TIP #05",
            "subtitle": "Consider setting up automatic payments for your bills and EMIs to ensure that you never miss a payment and maintain a good credit score over time."
          }
        ]
      },
      {
        "title": "FAQs",
        "type": "credit_insight_faqs",
        "url": "https://settle.club/faq",
        "data": [
          {
            "title": "How can I get a free credit report?",
            "subtitle": "To obtain a free credit report, you can visit the website https://settle.club/credit-score. This website provides access to your credit report, which is a summary of your credit history and financial activities."
          },
          {
            "title": "What variables go into calculating credit scores?",
            "subtitle": "Credit history, Credit enquiries and Repayment record."
          },
          {
            "title": "Is a 750 credit score good?",
            "subtitle": "750 is an excellent credit score; you can also make your credit score outstanding by increasing it into the range of 800-850."
          },
          {
            "title": "Is it best to make a full repayment of credit card debt?",
            "subtitle": "Instead of carrying a balance on your credit card, you should pay off your debt in full. You will avoid paying additional interest on the balance if you pay credit card bill dues in whole."
          }
        ]
      },
      {
        "title": "Learn more",
        "type": "credit_insight_learn_more",
        "url": "https://settle.club/faq",
        "data": [
          {
            "title": "What happens if I pay more than the balance on my credit card?",
            "subtitle": "Overpaying your credit card will result in a negative balance, but it won’t hurt your credit score—and the overpayment will be returned to you."
          },
          {
            "title": "Can anyone see my credit rating?",
            "subtitle": "No, not just anyone is allowed to view your credit report. An organisation needs to have a \"permissible purpose\" in order to obtain credit records."
          },
          {
            "title": "Do my chances of obtaining a new loan or credit card depend on my CIBIL score?",
            "subtitle": "Yes, prior to granting an application for a loan or credit card, all banks and lenders look at the applicant's CIBIL score."
          },
          {
            "title": "What is the bare minimum CIBIL score needed for any loan type?",
            "subtitle": "A CIBIL credit score of 750 or more is typically regarded as good when applying for any types of loans."
          },
          {
            "title": "What credit score is required to qualify for personal loans?",
            "subtitle": "The minimum credit score required by banks and NBFCs to approve personal loans is a CIBIL credit score of 750 or above. As you have a lower risk of defaulting if your credit score is greater, banks and NBFCs will be more inclined to provide you personal loans."
          }
        ]
      }
    ]
  }
}
```
</details>

</details>









---


### getLimit
Get limit




```java
multikyc.getLimit( lenderSlug,  merchantId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |   
| merchantId | String? | no |  |  



This API is used to get the credit limit for the user.

*Returned Response:*




[CreditLimitResponse](#CreditLimitResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "status": "SUCCESS",
    "message": "Credit limit details retrieved successfully",
    "action": true,
    "credit": {
      "availableLimit": 15000,
      "approvedLimit": 20000
    }
  }
}
```
</details>

</details>









---


### validaFormField
Valida form field




```java
multikyc.validaFormField(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ValidateFormFieldRequest](#ValidateFormFieldRequest) | yes | Request body |




*Returned Response:*




[ValidateFormFieldResponse](#ValidateFormFieldResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getUserDoc
Get user doc




```java
multikyc.getUserDoc( docType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| docType | String | yes |  |  



This is used to check if given user doc exist or not.

*Returned Response:*




[FindDocResponse](#FindDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "status": "AVAILABLE",
    "info": "EHMQM9090L",
    "details": {
      "name": "ABC",
      "id": "EHMQM9090L"
    },
    "name": "PAN"
  }
}
```
</details>

</details>









---


### validatePan
Validate pan




```java
multikyc.validatePan(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ValidatePanRequest](#ValidatePanRequest) | yes | Request body |


This API is used to check if PAN entered by the user is valid or not. To be called as soon as user enter the PAN.

*Returned Response:*




[ValidatePanResponse](#ValidatePanResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "panName": "John Doe",
    "isPanValid": "VALID",
    "pan": "ABCDE1234F"
  }
}
```
</details>

</details>









---


### confirmPan
Confirm pan




```java
multikyc.confirmPan(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ConfirmPanRequest](#ConfirmPanRequest) | yes | Request body |


After user enter the PAN, details are shared with frontend, Those details with pan number are sent back in this API once user click on confirm.

*Returned Response:*




[ConfirmPanResonse](#ConfirmPanResonse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "status": "SUCCESS",
    "statusCode": 200,
    "message": "PAN confirmed successfully"
  }
}
```
</details>

</details>









---


### uploadDocument
Upload document




```java
multikyc.uploadDocument(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadDocumentRequest](#UploadDocumentRequest) | yes | Request body |


Once to process any document like AADHAAR_XML, LIVLINES, BANK_DETAIL etc. this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "AADHAAR_XML",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "key": "value"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processAadhaar
Process aadhaar




```java
multikyc.processAadhaar(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadAadhaarRequest](#UploadAadhaarRequest) | yes | Request body |


Once to process AADHAAR_XML this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "AADHAAR_XML",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "aadhaarReferenceNumber": "123456789012",
      "aadhaarUid": "9876543210",
      "image": "https://example.com/aadhaar-image.png",
      "proofOfIdentity": {
        "dob": "1990-01-01",
        "hashedEmail": "hash123456",
        "gender": "Male",
        "hashedMobileNumber": "hash789012",
        "name": "John Doe"
      },
      "proofOfAddress": {
        "careOf": "Care of Example",
        "country": "India",
        "district": "Example District",
        "house": "123",
        "landmark": "Near Example Landmark",
        "locality": "Example Locality",
        "pincode": "123456",
        "postOffice": "Example Post Office",
        "state": "Example State",
        "street": "Example Street",
        "subDistrict": "Example Sub District",
        "vtc": "Example VTC"
      },
      "xml": "https://example.com/aadhaar-xml.xml",
      "pdf": "https://example.com/aadhaar-pdf.pdf",
      "address": "123, Example Street, Example Locality, Example District, Example State - 123456"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processSelfie
Process selfie




```java
multikyc.processSelfie(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadLivelinessRequest](#UploadLivelinessRequest) | yes | Request body |


Once to process LIVLINESS this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "LIVLINESS",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "selfie": "https://cdn.pixelbin.in/selfie/image.jpg",
      "video": "https://cdn.pixelbin.in/selfie/video.mpv"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processBankDetails
Process bank details




```java
multikyc.processBankDetails(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadBankDetailsRequest](#UploadBankDetailsRequest) | yes | Request body |


Once to process BANKING_DETAILS this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "BANK_DETAILS",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "accountType": "Saving",
      "bankName": "Example Bank",
      "ifsc": "ABCD1234567",
      "accountNumber": "123456789012",
      "accountHolderName": "John Doe"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### getDocuments
Get documents




```java
multikyc.getDocuments( lenderSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |  



This API is called after the upload of aahdaar xml to show all the documents details on the screen.

*Returned Response:*




[GetDocumentsResponse](#GetDocumentsResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "documents": [
      {
        "status": "AVAILABLE",
        "info": "Document available",
        "details": {
          "documentId": "abc123",
          "documentType": "Passport"
        },
        "name": "Passport"
      },
      {
        "status": "NOT_AVAILABLE",
        "info": "Document not available"
      }
    ]
  }
}
```
</details>

</details>









---


### getGstDetails
Get gst details




```java
multikyc.getGstDetails() {
  //use response
}
```






*Returned Response:*




[GstDetailsResponse](#GstDetailsResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### submitGstDetails
Submit gst details




```java
multikyc.submitGstDetails(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [RegisterGstRequest](#RegisterGstRequest) | yes | Request body |




*Returned Response:*




[RegisterGstResponse](#RegisterGstResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### uploadDocumentV1
Upload document v 1




```java
multikyc.uploadDocumentV1(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadDocumentRequestV1](#UploadDocumentRequestV1) | yes | Request body |


Once to process any document like AADHAAR_XML_ LIVLINES, BANK_DETAIL etc. this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "AADHAAR_XML",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "key": "value"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processAadhaarV1
Process aadhaar v 1




```java
multikyc.processAadhaarV1(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadAadhaarRequestV1](#UploadAadhaarRequestV1) | yes | Request body |


Once to process AADHAAR_XML this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "AADHAAR_XML",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "aadhaarReferenceNumber": "123456789012",
      "aadhaarUid": "9876543210",
      "image": "https://example.com/aadhaar-image.png",
      "proofOfIdentity": {
        "dob": "1990-01-01",
        "hashedEmail": "hash123456",
        "gender": "Male",
        "hashedMobileNumber": "hash789012",
        "name": "John Doe"
      },
      "proofOfAddress": {
        "careOf": "Care of Example",
        "country": "India",
        "district": "Example District",
        "house": "123",
        "landmark": "Near Example Landmark",
        "locality": "Example Locality",
        "pincode": "123456",
        "postOffice": "Example Post Office",
        "state": "Example State",
        "street": "Example Street",
        "subDistrict": "Example Sub District",
        "vtc": "Example VTC"
      },
      "xml": "https://example.com/aadhaar-xml.xml",
      "pdf": "https://example.com/aadhaar-pdf.pdf",
      "address": "123, Example Street, Example Locality, Example District, Example State - 123456"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processSelfieV1
Process selfie v 1




```java
multikyc.processSelfieV1(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadLivelinessRequestV1](#UploadLivelinessRequestV1) | yes | Request body |


Once to process LIVLINESS this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "LIVLINESS",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "selfie": "https://cdn.pixelbin.in/selfie/image.jpg",
      "video": "https://cdn.pixelbin.in/selfie/video.mpv"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### getDocumentsV1
Get documents v 1




```java
multikyc.getDocumentsV1( entityMapId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| entityMapId | String | yes |  |  



This API is called after the upload of aahdaar xml to show all the documents details on the screen.

*Returned Response:*




[GetDocumentsResponse](#GetDocumentsResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "documents": [
      {
        "status": "AVAILABLE",
        "info": "Document available",
        "details": {
          "documentId": "abc123",
          "documentType": "Passport"
        },
        "name": "Passport"
      },
      {
        "status": "NOT_AVAILABLE",
        "info": "Document not available"
      }
    ]
  }
}
```
</details>

</details>









---


### processAadhaarV2
Process aadhaar v 2




```java
multikyc.processAadhaarV2(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadAadhaarRequestV2](#UploadAadhaarRequestV2) | yes | Request body |


Once to process AADHAAR_XML this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "AADHAAR_XML",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "aadhaarReferenceNumber": "123456789012",
      "aadhaarUid": "9876543210",
      "image": "https://example.com/aadhaar-image.png",
      "proofOfIdentity": {
        "dob": "1990-01-01",
        "hashedEmail": "hash123456",
        "gender": "Male",
        "hashedMobileNumber": "hash789012",
        "name": "John Doe"
      },
      "proofOfAddress": {
        "careOf": "Care of Example",
        "country": "India",
        "district": "Example District",
        "house": "123",
        "landmark": "Near Example Landmark",
        "locality": "Example Locality",
        "pincode": "123456",
        "postOffice": "Example Post Office",
        "state": "Example State",
        "street": "Example Street",
        "subDistrict": "Example Sub District",
        "vtc": "Example VTC"
      },
      "xml": "https://example.com/aadhaar-xml.xml",
      "pdf": "https://example.com/aadhaar-pdf.pdf",
      "address": "123, Example Street, Example Locality, Example District, Example State - 123456"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processSelfieV2
Process selfie v 2




```java
multikyc.processSelfieV2(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadLivelinessRequestV2](#UploadLivelinessRequestV2) | yes | Request body |


Once to process LIVLINESS this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "LIVLINESS",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "selfie": "https://cdn.pixelbin.in/selfie/image.jpg",
      "video": "https://cdn.pixelbin.in/selfie/video.mpv"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processAadhaarV3
Process aadhaar v 3




```java
multikyc.processAadhaarV3(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadAadhaarRequestV3](#UploadAadhaarRequestV3) | yes | Request body |


Once to process AADHAAR_XML this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "AADHAAR_XML",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "aadhaarReferenceNumber": "123456789012",
      "aadhaarUid": "9876543210",
      "image": "https://example.com/aadhaar-image.png",
      "proofOfIdentity": {
        "dob": "1990-01-01",
        "hashedEmail": "hash123456",
        "gender": "Male",
        "hashedMobileNumber": "hash789012",
        "name": "John Doe"
      },
      "proofOfAddress": {
        "careOf": "Care of Example",
        "country": "India",
        "district": "Example District",
        "house": "123",
        "landmark": "Near Example Landmark",
        "locality": "Example Locality",
        "pincode": "123456",
        "postOffice": "Example Post Office",
        "state": "Example State",
        "street": "Example Street",
        "subDistrict": "Example Sub District",
        "vtc": "Example VTC"
      },
      "xml": "https://example.com/aadhaar-xml.xml",
      "pdf": "https://example.com/aadhaar-pdf.pdf",
      "address": "123, Example Street, Example Locality, Example District, Example State - 123456"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### processSelfieV3
Process selfie v 3




```java
multikyc.processSelfieV3(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadLivelinessRequestV3](#UploadLivelinessRequestV3) | yes | Request body |


Once to process LIVLINESS this API is called with relevant document details in the request.

*Returned Response:*




[UploadDocResponse](#UploadDocResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "abc123",
      "userId": "user123",
      "status": "IN_PROGRESS",
      "type": "CKYC",
      "remark": "Document uploaded",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2023-12-31T23:59:59.000Z",
      "createdAt": "2023-08-03T10:00:00.000Z",
      "updatedAt": "2023-08-03T10:30:00.000Z",
      "deletedAt": null,
      "lenderId": "lender123",
      "lender": {
        "id": "lender123",
        "name": "Example Lender",
        "imageUrl": "https://example.com/lender-image.png",
        "slug": "example-lender",
        "active": true,
        "b2b": false,
        "b2c": true,
        "theme": {
          "portraitBgUrl": "https://example.com/lender-background.png",
          "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
          "iconUrl": "https://example.com/lender-icon.png",
          "logoUrl": "https://example.com/lender-logo.png"
        },
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "merchantConfigSchema": {},
        "meta": {},
        "metaSchema": {}
      }
    },
    "action": {
      "id": "xyz456",
      "userId": "user123",
      "lenderKycStepMapId": "map123",
      "userKycDetailId": "abc123",
      "lenderId": "lender123",
      "ruleState": "AADHAAR_XML",
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "doc123",
      "createdAt": "2023-08-03T10:15:00.000Z",
      "updatedAt": "2023-08-03T10:20:00.000Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "id": "map123",
        "name": "LIVLINESS",
        "lenderId": "lender123",
        "index": 1,
        "workflowName": "KycWorkflow",
        "workflowUrl": "https://example.com/workflow",
        "internal": false,
        "active": true,
        "createdAt": "2023-01-01T00:00:00.000Z",
        "updatedAt": "2023-01-02T00:00:00.000Z",
        "deletedAt": null,
        "lender": {
          "id": "lender123",
          "name": "Example Lender",
          "imageUrl": "https://example.com/lender-image.png",
          "slug": "example-lender",
          "active": true,
          "b2b": false,
          "b2c": true,
          "theme": {
            "portraitBgUrl": "https://example.com/lender-background.png",
            "landscapeBgUrl": "https://example.com/lender-background-landscape.png",
            "iconUrl": "https://example.com/lender-icon.png",
            "logoUrl": "https://example.com/lender-logo.png"
          },
          "createdAt": "2023-01-01T00:00:00.000Z",
          "updatedAt": "2023-01-02T00:00:00.000Z",
          "deletedAt": null,
          "merchantConfigSchema": {},
          "meta": {},
          "metaSchema": {}
        }
      }
    },
    "status": "IN_PROGRESS",
    "data": {
      "selfie": "https://cdn.pixelbin.in/selfie/image.jpg",
      "video": "https://cdn.pixelbin.in/selfie/video.mpv"
    },
    "remark": "Document uploaded"
  }
}
```
</details>

</details>









---


### initiateKyc
Initiate kyc




```java
multikyc.initiateKyc( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |  
| body | [InitiateKycRequest](#InitiateKycRequest) | yes | Request body |


In order to be able to complete the KYC, this API needs to be called in the start of KYC. Once it is called then one can avoid calling this API. Hence it is better to call this API whenever user resume or start KYC.

*Returned Response:*




[InitiateKycResponse](#InitiateKycResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "user_kyc_detail_id",
      "userId": "user_id",
      "status": "IN_PROGRESS",
      "type": "DIGILOCKER",
      "remark": "KYC verification is in progress",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2024-08-01T00:00:00Z",
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z",
      "deletedAt": null,
      "lenderId": "lender_id",
      "lender": {
        "id": "lender_id",
        "name": "Lender Name",
        "imageUrl": "https://example.com/lender_logo.png",
        "slug": "lender-slug",
        "active": true,
        "b2b": true,
        "b2c": false,
        "createdAt": "2023-08-01T12:34:56Z",
        "updatedAt": "2023-08-02T10:20:30Z",
        "approvedLimit": 100000
      }
    },
    "action": {
      "id": "user_kyc_lender_step_map_id",
      "userId": "user_id",
      "lenderKycStepMapId": "lender_kyc_step_map_id",
      "userKycDetailId": "user_kyc_detail_id",
      "lenderId": "lender_id",
      "ruleState": {
        "key": "value"
      },
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "document_id",
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "name": "AADHAAR_XML",
        "index": 0,
        "workflowName": "kyc_workflow",
        "workflowUrl": "https://example.com/kyc_workflow",
        "internal": true,
        "active": true,
        "ttl": 3600
      }
    }
  }
}
```
</details>

</details>









---


### getDigilockerLink
Get digilocker link




```java
multikyc.getDigilockerLink( redirectUrl) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| redirectUrl | String? | no |  |  



If kyc step is AADHAAR_XML and status is IN_PROGRESS then this API needs to be called to get the digilocker link to complete aadhaar_xml step

*Returned Response:*




[DigilockerLinkResponse](#DigilockerLinkResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "authorizationUrl": "https://www.digilocker.gov.in/oauth2/authorize?client_id=YOUR_CLIENT_ID&redirect_uri=YOUR_REDIRECT_URI&response_type=code"
  }
}
```
</details>

</details>









---


### initiateKycV1
Initiate kyc v 1




```java
multikyc.initiateKycV1(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InitiateKycRequestV1](#InitiateKycRequestV1) | yes | Request body |


In order to be able to complete the KYC, this API needs to be called in the start of KYC. Once it is called then one can avoid calling this API. Hence it is better to call this API whenever user resume or start KYC.

*Returned Response:*




[InitiateKycResponse](#InitiateKycResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "kycResult": {
      "id": "user_kyc_detail_id",
      "userId": "user_id",
      "status": "IN_PROGRESS",
      "type": "DIGILOCKER",
      "remark": "KYC verification is in progress",
      "profileType": "PERSONAL",
      "active": true,
      "expiryDate": "2024-08-01T00:00:00Z",
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z",
      "deletedAt": null,
      "lenderId": "lender_id",
      "lender": {
        "id": "lender_id",
        "name": "Lender Name",
        "imageUrl": "https://example.com/lender_logo.png",
        "slug": "lender-slug",
        "active": true,
        "b2b": true,
        "b2c": false,
        "createdAt": "2023-08-01T12:34:56Z",
        "updatedAt": "2023-08-02T10:20:30Z",
        "approvedLimit": 100000
      }
    },
    "action": {
      "id": "user_kyc_lender_step_map_id",
      "userId": "user_id",
      "lenderKycStepMapId": "lender_kyc_step_map_id",
      "userKycDetailId": "user_kyc_detail_id",
      "lenderId": "lender_id",
      "ruleState": {
        "key": "value"
      },
      "active": true,
      "status": "IN_PROGRESS",
      "documentId": "document_id",
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z",
      "deletedAt": null,
      "lenderKycStepMap": {
        "name": "AADHAAR_XML",
        "index": 0,
        "workflowName": "kyc_workflow",
        "workflowUrl": "https://example.com/kyc_workflow",
        "internal": true,
        "active": true,
        "ttl": 3600
      }
    }
  }
}
```
</details>

</details>









---


### lenderDetail
Lender detail




```java
multikyc.lenderDetail( lenderSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |  



API endpoint to get details of a lender.

*Returned Response:*




[Lender](#Lender)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "id": "491e46af-d6f7-478a-bceb-187e62e2cf78",
    "name": "Piramal Finance",
    "active": true,
    "imageUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png",
    "slug": "piramal-finance",
    "theme": {
      "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Chola_Background_min.png",
      "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Chola_Background.png",
      "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/piramal-icon.png",
      "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png"
    },
    "b2b": false,
    "b2c": true,
    "merchantConfigSchema": {},
    "createdAt": "2023-05-09T15:36:36.423Z",
    "updatedAt": "2023-05-09T15:36:36.423Z",
    "approvedLimit": 0,
    "deletedAt": null,
    "meta": null,
    "metaSchema": null
  }
}
```
</details>

</details>









---


### initiateLenderOnboarding
Initiate lender onboarding




```java
multikyc.initiateLenderOnboarding( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String | yes |  |  
| body | [LenderOnboardRequest](#LenderOnboardRequest) | yes | Request body |


This API is called whenever user start or resumes the Onboarding.
I order to call this API, onboardingStatus API should return onboardingStep = "USER_LENDER_ONBOARD". Note that it is mandatory to call this API whenever user resumes the onboarding.
Other conditions when this API needs to be called are 
1. if actionStatus = FAILED in onbaordingStatus api 
2. if actionStatus = USER_ACTION_NEEDED then this is API is supposed to be called with request body as { ack: "SUCCESS | FAILED", data: {redirectlUrl: "https://redirecturl.com", ...otherData} }

*Returned Response:*




[LenderOnboardResponse](#LenderOnboardResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "result": {
      "id": "user_lender_id",
      "userId": "user_id",
      "lenderId": "lender_id",
      "active": true,
      "default": false,
      "status": "SUCCESS",
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z",
      "approvedLimit": 10000
    },
    "action": {
      "id": "user_lender_state_id",
      "lenderStateId": "lender_state_id",
      "lenderId": "lender_id",
      "userId": "user_id",
      "status": "SUCCESS",
      "userLenderId": "user_lender_id",
      "remark": "Action completed successfully",
      "active": true,
      "lenderState": {
        "id": "lender_state_id",
        "name": "Lender State",
        "lenderId": "lender_id",
        "index": 2,
        "workflowName": "Onboarding Workflow",
        "workflowUrl": "https://example.com/onboarding",
        "internal": true,
        "active": true,
        "createdAt": "2023-08-01T12:34:56Z",
        "updatedAt": "2023-08-02T10:20:30Z",
        "ttl": 86400
      },
      "data": {},
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z"
    },
    "data": {
      "additionalInfo": "some_additional_info"
    }
  }
}
```
</details>

</details>









---


### availableLenders
Available lenders




```java
multikyc.availableLenders( includePossibleLenders, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| includePossibleLenders | Boolean? | no |  |  
| body | [AvailableLendersRequest](#AvailableLendersRequest) | yes | Request body |




*Returned Response:*




[AvailableLenders](#AvailableLenders)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### initiateLenderOnboardingV1
Initiate lender onboarding v 1




```java
multikyc.initiateLenderOnboardingV1(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [LenderOnboardRequestV1](#LenderOnboardRequestV1) | yes | Request body |


This API is called whenever user start or resumes the Onboarding.
I order to call this API, onboardingStatus API should return onboardingStep = "USER_LENDER_ONBOARD". Note that it is mandatory to call this API whenever user resumes the onboarding.
Other conditions when this API needs to be called are 
1. if actionStatus = FAILED in onbaordingStatus api 
2. if actionStatus = USER_ACTION_NEEDED then this is API is supposed to be called with request body as { ack: "SUCCESS | FAILED", data: {redirectlUrl: "https://redirecturl.com", ...otherData} }

*Returned Response:*




[LenderOnboardResponse](#LenderOnboardResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "result": {
      "id": "user_lender_id",
      "userId": "user_id",
      "lenderId": "lender_id",
      "active": true,
      "default": false,
      "status": "SUCCESS",
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z",
      "approvedLimit": 10000
    },
    "action": {
      "id": "user_lender_state_id",
      "lenderStateId": "lender_state_id",
      "lenderId": "lender_id",
      "userId": "user_id",
      "status": "SUCCESS",
      "userLenderId": "user_lender_id",
      "remark": "Action completed successfully",
      "active": true,
      "lenderState": {
        "id": "lender_state_id",
        "name": "Lender State",
        "lenderId": "lender_id",
        "index": 2,
        "workflowName": "Onboarding Workflow",
        "workflowUrl": "https://example.com/onboarding",
        "internal": true,
        "active": true,
        "createdAt": "2023-08-01T12:34:56Z",
        "updatedAt": "2023-08-02T10:20:30Z",
        "ttl": 86400
      },
      "data": {},
      "createdAt": "2023-08-01T12:34:56Z",
      "updatedAt": "2023-08-02T10:20:30Z"
    },
    "data": {
      "additionalInfo": "some_additional_info"
    }
  }
}
```
</details>

</details>









---


### getOnboardingStatus
Get onboarding status




```java
multikyc.getOnboardingStatus( lenderSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String? | no |  |  



This API endpoint allows authenticated users to retrieve the onboarding status for a specific lender or all lenders. The onboarding status includes information about various onboarding steps, such as KYC (Know Your Customer), lender onboarding, and the overall onboarding completion status.
1. OnboardingSteps: An enumeration representing the different onboarding steps (KYC, USER_LENDER_ONBAORD, DONE).
2. KycStatus: An enumeration representing the KYC status (SUCCESS, IN_PROGRESS, NOT_INITIATED, UNDER_MANUAL_PROGRESS, FAILED, EXPIRED).
3. LenderStatus: An enumeration representing the lender status (SUCCESS, IN_PROGRESS, NOT_INITIATED, UNDER_MANUAL_PROGRESS, FAILED, EXPIRED, REJECTED).
4. StepStatus: An enumeration representing the action status (NOT_AVAILABLE, IN_PROGRESS, SUCCESS, FAILED, USER_ACTION_NEEDED).

*Returned Response:*




[OnboardingStatusResponse](#OnboardingStatusResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "onboardStatuses": [
      {
        "onboardStep": "KYC",
        "onboardingId": "abc123",
        "status": "SUCCESS",
        "action": "Provide ID and Address",
        "actionStatus": "SUCCESS",
        "lender": {
          "id": "123456ywertyu7657890oiutyrdgfhgj",
          "slug": "piramal-finance",
          "active": false
        },
        "navigation": "/onboarding/kyc",
        "approvedLimit": 10000,
        "proposedLimit": 15000,
        "actionData": {
          "documentType": "Passport",
          "addressProof": "Utility Bill"
        }
      },
      {
        "onboardStep": "USER_LENDER_ONBAORD",
        "onboardingId": "xyz456",
        "status": "IN_PROGRESS",
        "action": "Review and Sign Agreement",
        "actionStatus": "USER_ACTION_NEEDED",
        "lender": {
          "id": "1234rtyu7657890oiutyrdgfhgj",
          "slug": "cashe",
          "active": true
        },
        "navigation": "/onboarding/lender",
        "approvedLimit": 0,
        "proposedLimit": 20000
      }
    ]
  }
}
```
</details>

</details>









---


### getOnboardingSteps
Get onboarding steps




```java
multikyc.getOnboardingSteps( entityMapId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| entityMapId | String | yes |  |  





*Returned Response:*




[OnboardStepsResponse](#OnboardStepsResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOnboardingStatusV1
Get onboarding status v 1




```java
multikyc.getOnboardingStatusV1( entityMapId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| entityMapId | String? | no |  |  



This API endpoint allows authenticated users to retrieve the onboarding status for a specific lender or all lenders. The onboarding status includes information about various onboarding steps, such as KYC (Know Your Customer), lender onboarding, and the overall onboarding completion status.
1. OnboardingSteps: An enumeration representing the different onboarding steps (KYC, USER_LENDER_ONBAORD, DONE).
2. KycStatus: An enumeration representing the KYC status (SUCCESS, IN_PROGRESS, NOT_INITIATED, UNDER_MANUAL_PROGRESS, FAILED, EXPIRED).
3. LenderStatus: An enumeration representing the lender status (SUCCESS, IN_PROGRESS, NOT_INITIATED, UNDER_MANUAL_PROGRESS, FAILED, EXPIRED, REJECTED).
4. StepStatus: An enumeration representing the action status (NOT_AVAILABLE, IN_PROGRESS, SUCCESS, FAILED, USER_ACTION_NEEDED).

*Returned Response:*




[OnboardingStatusResponse](#OnboardingStatusResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "onboardStatuses": [
      {
        "onboardStep": "KYC",
        "onboardingId": "abc123",
        "status": "SUCCESS",
        "action": "Provide ID and Address",
        "actionStatus": "SUCCESS",
        "lender": {
          "id": "123456ywertyu7657890oiutyrdgfhgj",
          "slug": "piramal-finance",
          "active": false
        },
        "navigation": "/onboarding/kyc",
        "approvedLimit": 10000,
        "proposedLimit": 15000,
        "actionData": {
          "documentType": "Passport",
          "addressProof": "Utility Bill"
        }
      },
      {
        "onboardStep": "USER_LENDER_ONBAORD",
        "onboardingId": "xyz456",
        "status": "IN_PROGRESS",
        "action": "Review and Sign Agreement",
        "actionStatus": "USER_ACTION_NEEDED",
        "lender": {
          "id": "1234rtyu7657890oiutyrdgfhgj",
          "slug": "cashe",
          "active": true
        },
        "navigation": "/onboarding/lender",
        "approvedLimit": 0,
        "proposedLimit": 20000
      }
    ]
  }
}
```
</details>

</details>









---


### getLenderCards
Get lender cards




```java
multikyc.getLenderCards( lenderSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lenderSlug | String? | no |  |  
| body | [LenderFilters](#LenderFilters) | yes | Request body |


API endpoint to get lender cards for display in the UI.

*Returned Response:*




[GetLenderCardsResponse](#GetLenderCardsResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "display": [
      {
        "display": {
          "primary": {
            "primary": {
              "text": "Complete KYC & get credit limit upto"
            },
            "secondary": {
              "text": "₹10,000"
            }
          },
          "secondary": {
            "primary": {
              "text": "Connect to"
            },
            "secondary": {
              "text": "Digilocker"
            },
            "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/media/aadhar_state.png"
          },
          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/piramal-icon.png",
          "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png",
          "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Chola_Background_min.png",
          "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Chola_Background.png"
        },
        "data": {
          "onboardStep": "KYC",
          "onboardingId": "8a2ff6f4-b0ee-4ff0-9df2-67fba6753471",
          "status": "IN_PROGRESS",
          "action": "AADHAAR_XML",
          "actionStatus": "NOT_AVAILABLE",
          "lender": {
            "id": "491e46af-d6f7-478a-bceb-187e62e2cf78",
            "name": "Piramal Finance",
            "imageUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png",
            "slug": "piramal-finance",
            "active": true,
            "b2b": false,
            "b2c": true,
            "theme": {
              "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Chola_Background_min.png",
              "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Chola_Background.png",
              "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/piramal-icon.png",
              "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png"
            },
            "createdAt": "2023-05-09T15:36:36.423Z",
            "updatedAt": "2023-05-09T15:36:36.423Z",
            "deletedAt": null,
            "merchantConfigSchema": null,
            "meta": null,
            "metaSchema": null
          },
          "navigation": "kyc/piramal-finance/access-digilocker",
          "proposedLimit": 10000,
          "approvedLimit": -1,
          "actionData": null
        }
      },
      {
        "display": {
          "primary": {
            "primary": {
              "text": "Available balance"
            },
            "secondary": {
              "text": ""
            }
          },
          "secondary": {
            "primary": {
              "text": "Dues"
            },
            "secondary": {
              "text": "Start using your limit"
            },
            "iconUrl": ""
          },
          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/cashe_icon.png",
          "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Cashe_logo.png",
          "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Cashe_Background_min.png",
          "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Cashe_Background.png"
        },
        "data": {
          "lender": {
            "id": "315f60f4-1238-462c-8108-cfff9fbc400f",
            "name": "CASHe",
            "imageUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Cashe_logo.png",
            "slug": "cashe",
            "active": true,
            "b2b": true,
            "b2c": true,
            "theme": {
              "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Cashe_Background_min.png",
              "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Cashe_Background.png",
              "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/cashe_icon.png",
              "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Cashe_logo.png"
            },
            "createdAt": "2023-05-09T15:36:36.423Z",
            "updatedAt": "2023-05-09T15:36:36.423Z",
            "deletedAt": null,
            "merchantConfigSchema": null,
            "meta": null,
            "metaSchema": null
          },
          "onboardStep": "DONE",
          "onboardingId": null,
          "status": "SUCCESS",
          "action": "DONE",
          "actionStatus": "SUCCESS",
          "navigation": "lender/cashe",
          "proposedLimit": 100000,
          "approvedLimit": 60000,
          "actionData": {}
        }
      }
    ]
  }
}
```
</details>

</details>









---


### getActiveOrganization
Get active organization




```java
multikyc.getActiveOrganization( sortOn,  orderBy) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| sortOn | String? | no |  |   
| orderBy | String? | no |  |  



API endpoint to get active merchants details to display in the UI.

*Returned Response:*




[OrganizationLogosResponse](#OrganizationLogosResponse)






<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getLenderCardsV1
Get lender cards v 1




```java
multikyc.getLenderCardsV1( entityMapId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| entityMapId | String? | no |  |  
| body | [LenderFilters](#LenderFilters) | yes | Request body |


API endpoint to get lender cards for display in the UI.

*Returned Response:*




[GetLenderCardsResponse](#GetLenderCardsResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "display": [
      {
        "display": {
          "primary": {
            "primary": {
              "text": "Complete KYC & get credit limit upto"
            },
            "secondary": {
              "text": "₹10,000"
            }
          },
          "secondary": {
            "primary": {
              "text": "Connect to"
            },
            "secondary": {
              "text": "Digilocker"
            },
            "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/media/aadhar_state.png"
          },
          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/piramal-icon.png",
          "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png",
          "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Chola_Background_min.png",
          "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Chola_Background.png"
        },
        "data": {
          "onboardStep": "KYC",
          "onboardingId": "8a2ff6f4-b0ee-4ff0-9df2-67fba6753471",
          "status": "IN_PROGRESS",
          "action": "AADHAAR_XML",
          "actionStatus": "NOT_AVAILABLE",
          "lender": {
            "id": "491e46af-d6f7-478a-bceb-187e62e2cf78",
            "name": "Piramal Finance",
            "imageUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png",
            "slug": "piramal-finance",
            "active": true,
            "b2b": false,
            "b2c": true,
            "theme": {
              "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Chola_Background_min.png",
              "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Chola_Background.png",
              "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/piramal-icon.png",
              "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Piramal_Logo.png"
            },
            "createdAt": "2023-05-09T15:36:36.423Z",
            "updatedAt": "2023-05-09T15:36:36.423Z",
            "deletedAt": null,
            "merchantConfigSchema": null,
            "meta": null,
            "metaSchema": null
          },
          "navigation": "kyc/piramal-finance/access-digilocker",
          "proposedLimit": 10000,
          "approvedLimit": -1,
          "actionData": null
        }
      },
      {
        "display": {
          "primary": {
            "primary": {
              "text": "Available balance"
            },
            "secondary": {
              "text": ""
            }
          },
          "secondary": {
            "primary": {
              "text": "Dues"
            },
            "secondary": {
              "text": "Start using your limit"
            },
            "iconUrl": ""
          },
          "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/cashe_icon.png",
          "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Cashe_logo.png",
          "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Cashe_Background_min.png",
          "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Cashe_Background.png"
        },
        "data": {
          "lender": {
            "id": "315f60f4-1238-462c-8108-cfff9fbc400f",
            "name": "CASHe",
            "imageUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Cashe_logo.png",
            "slug": "cashe",
            "active": true,
            "b2b": true,
            "b2c": true,
            "theme": {
              "portraitBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/portrait/Cashe_Background_min.png",
              "landscapeBgUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderBackground/landscape/Cashe_Background.png",
              "iconUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/lenders/lenderLogo/cashe_icon.png",
              "logoUrl": "https://cdn.pixelbin.io/v2/potlee/original/public/logos/Cashe_logo.png"
            },
            "createdAt": "2023-05-09T15:36:36.423Z",
            "updatedAt": "2023-05-09T15:36:36.423Z",
            "deletedAt": null,
            "merchantConfigSchema": null,
            "meta": null,
            "metaSchema": null
          },
          "onboardStep": "DONE",
          "onboardingId": null,
          "status": "SUCCESS",
          "action": "DONE",
          "actionStatus": "SUCCESS",
          "navigation": "lender/cashe",
          "proposedLimit": 100000,
          "approvedLimit": 60000,
          "actionData": {}
        }
      }
    ]
  }
}
```
</details>

</details>









---


### createPixelbinSignedUrl
Create pixelbin signed url




```java
multikyc.createPixelbinSignedUrl( documentName,  lenderSlug,  purpose,  extension) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| documentName | String | yes |  |   
| lenderSlug | String? | no |  |   
| purpose | String? | no |  |   
| extension | String? | no |  |  



API endpoint to create a signed URL for uploading documents to Pixelbin. The signed URL can be used to securely upload the document.

*Returned Response:*




[SignedUrlResponse](#SignedUrlResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "signedUrl": {
      "url": "https://example.com/upload/abc123",
      "fields": {
        "key": "uploads/abc123",
        "acl": "private",
        "x-amz-algorithm": "AWS4-HMAC-SHA256",
        "x-amz-credential": "AKIAYRABCDEFGHIJ/20230803/us-east-1/s3/aws4_request",
        "x-amz-date": "20230803T120000Z",
        "policy": "eyJleHBpcmF0aW9uIjoiMjAyNC0xMC0xOVQxMzo0NTozMC44MzlaIiwiY29uZGl0aW9ucyI6W3siYnVja2V0IjoiYXV0b3BlcmNhc2RpbmciLCJjb250ZW50LWxlbmd0aCI6InB1YmxpYyJ9LHsiYWNsIjoicHJpdmF0ZSJ9LHsieC1hbXotYWxnb3JpdGhtIjoiQVdTNC1ITUFDLVNIQTI1NiJ9LHsieC1hbXotY3JlZGVudGlhbCI6IkFLSUFZUkFGR0JCSUhKLzIwMjMwODAzL3VzLWVhc3QtMS9zMy9hd3M0X3JlcXVlc3QifV19",
        "x-amz-signature": "1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef",
        "x-amz-security-token": "FwoGZXIvYXdzEHkaDGXQFfabc1Wq8bc1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef=="
      }
    },
    "fileUrl": "https://example.com/uploads/abc123"
  }
}
```
</details>

</details>









---


### createPixelbinSignedUrlV2
Create pixelbin signed url v 2




```java
multikyc.createPixelbinSignedUrlV2( documentName,  lenderSlug,  purpose,  extention) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| documentName | String | yes |  |   
| lenderSlug | String? | no |  |   
| purpose | String? | no |  |   
| extention | String? | no |  |  



API endpoint to create a signed URL for uploading documents to Pixelbin. The signed URL can be used to securely upload the document with multipart support.

*Returned Response:*




[SignedUrlV2Response](#SignedUrlV2Response)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "signedUrl": {
      "url": "https://example.com/upload/abc123",
      "fields": {
        "key": "uploads/abc123",
        "acl": "private",
        "x-amz-algorithm": "AWS4-HMAC-SHA256",
        "x-amz-credential": "AKIAYRABCDEFGHIJ/20230803/us-east-1/s3/aws4_request",
        "x-amz-date": "20230803T120000Z",
        "policy": "eyJleHBpcmF0aW9uIjoiMjAyNC0xMC0xOVQxMzo0NTozMC44MzlaIiwiY29uZGl0aW9ucyI6W3siYnVja2V0IjoiYXV0b3BlcmNhc2RpbmciLCJjb250ZW50LWxlbmd0aCI6InB1YmxpYyJ9LHsiYWNsIjoicHJpdmF0ZSJ9LHsieC1hbXotYWxnb3JpdGhtIjoiQVdTNC1ITUFDLVNIQTI1NiJ9LHsieC1hbXotY3JlZGVudGlhbCI6IkFLSUFZUkFGR0JCSUhKLzIwMjMwODAzL3VzLWVhc3QtMS9zMy9hd3M0X3JlcXVlc3QifV19",
        "x-amz-signature": "1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef",
        "x-amz-security-token": "FwoGZXIvYXdzEHkaDGXQFfabc1Wq8bc1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef=="
      }
    },
    "fileUrl": "https://example.com/uploads/abc123"
  }
}
```
</details>

</details>









---


### createSignedUrlV3
Create signed url v 3




```java
multikyc.createSignedUrlV3( documentName,  lenderSlug,  purpose,  extension,  contentType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| documentName | String | yes |  |   
| lenderSlug | String? | no |  |   
| purpose | String? | no |  |   
| extension | String? | no |  |   
| contentType | String? | no |  |  



API endpoint to create a signed URL for uploading documents to and downloading documents from cloud storage.

*Returned Response:*




[SignedUrlV3Response](#SignedUrlV3Response)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Ok</i></summary>

```json
{
  "value": {
    "signedUrl": {
      "url": "https://example.com/upload/abc123",
      "fields": {
        "key": "uploads/abc123",
        "acl": "private",
        "x-amz-algorithm": "AWS4-HMAC-SHA256",
        "x-amz-credential": "AKIAYRABCDEFGHIJ/20230803/us-east-1/s3/aws4_request",
        "x-amz-date": "20230803T120000Z",
        "policy": "eyJleHBpcmF0aW9uIjoiMjAyNC0xMC0xOVQxMzo0NTozMC44MzlaIiwiY29uZGl0aW9ucyI6W3siYnVja2V0IjoiYXV0b3BlcmNhc2RpbmciLCJjb250ZW50LWxlbmd0aCI6InB1YmxpYyJ9LHsiYWNsIjoicHJpdmF0ZSJ9LHsieC1hbXotYWxnb3JpdGhtIjoiQVdTNC1ITUFDLVNIQTI1NiJ9LHsieC1hbXotY3JlZGVudGlhbCI6IkFLSUFZUkFGR0JCSUhKLzIwMjMwODAzL3VzLWVhc3QtMS9zMy9hd3M0X3JlcXVlc3QifV19",
        "x-amz-signature": "1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef",
        "x-amz-security-token": "FwoGZXIvYXdzEHkaDGXQFfabc1Wq8bc1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef=="
      }
    },
    "fileUrl": "https://example.com/uploads/abc123"
  }
}
```
</details>

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | merchantIds | ArrayList<Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | meta | Object? |  yes  |  |
 | display | Object? |  yes  |  |

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
 | baseUrl | String? |  yes  |  |
 | config | Object? |  yes  |  |
 | paymentOptions | ArrayList<Object>? |  yes  |  |
 | credentialsSchema | Object? |  yes  |  |

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
 | config | Object? |  yes  |  |
 | paymentOptions | ArrayList<Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [LenderOnboardResponse](#LenderOnboardResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | [UserLender](#UserLender) |  no  |  |
 | action | [UserLenderState](#UserLenderState) |  no  |  |
 | data | Object |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OnboardingStatusResponse](#OnboardingStatusResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onboardStatuses | ArrayList<[OnboardStatusDto](#OnboardStatusDto)> |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DigilockerLinkResponse](#DigilockerLinkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | authorizationUrl | String |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [GetDocumentsResponse](#GetDocumentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documents | ArrayList<[FindDocResponse](#FindDocResponse)> |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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

---


 
 
 #### [AddMetaSchema](#AddMetaSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lenderSlug | String |  no  |  |
 | merchantId | String |  no  |  |
 | schema | Object |  no  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ConfirmPanResonse](#ConfirmPanResonse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | statusCode | String |  no  |  |
 | message | String |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [RegisterGstResponse](#RegisterGstResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstDocDetails | [Document](#Document) |  no  |  |
 | status | String |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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
 | headers | HashMap<String,Object>? |  yes  |  |

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


 
 
 #### [Report](#Report)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | Object |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CreditReportRequest](#CreditReportRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | pan | String? |  yes  |  |
 | mobile | String? |  yes  |  |

---


 
 
 #### [MasterData](#MasterData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | displayName | String |  no  |  |
 | value | String |  no  |  |
 | type | String |  no  |  |
 | lenderId | String? |  yes  |  |
 | merchantId | String? |  yes  |  |
 | createdAt | String |  no  |  |
 | updatedAt | String |  no  |  |

---


 
 
 #### [Component](#Component)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logoUrl | String? |  yes  |  |
 | iconUrl | String? |  yes  |  |
 | portraitBgUrl | String? |  yes  |  |
 | landscapeBgUrl | String? |  yes  |  |
 | bgUrl | String? |  yes  |  |
 | primary | [Component](#Component)? |  yes  |  |
 | secondary | [Component](#Component)? |  yes  |  |
 | text | String? |  yes  |  |

---


 
 
 #### [UiResponse](#UiResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | [Component](#Component) |  no  |  |
 | data | Object? |  yes  |  |

---


 
 
 #### [GetLenderCardsResponse](#GetLenderCardsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | ArrayList<[UiResponse](#UiResponse)> |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OrganizationLogosResponse](#OrganizationLogosResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | organizations | ArrayList<[OrganizationLogosObject](#OrganizationLogosObject)> |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---



