



##### [Back to Application docs](./README.md)

## Rewards Methods
Rewards Service
* [addUserReferral](#adduserreferral)
* [getUserReferrals](#getuserreferrals)
* [getReferralCode](#getreferralcode)



## Methods with example and description


### addUserReferral
Add user referral




```java
rewards.addUserReferral(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [AddUserReferralRequest](#AddUserReferralRequest) | yes | Request body |




*Returned Response:*




[AddUserReferralResponse](#AddUserReferralResponse)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true
}
```
</details>









---


### getUserReferrals
Get user referrals




```java
rewards.getUserReferrals() {
  //use response
}
```






*Returned Response:*




[UserReferralsResponse](#UserReferralsResponse)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "referrals": [
    {
      "name": "John Doe",
      "mobile": "86******35",
      "registeredOn": "2022-11-03T13:22:22.561Z",
      "isVerified": false
    }
  ],
  "totalCount": 1,
  "verifiedCount": 0
}
```
</details>









---


### getReferralCode
Get user referral code




```java
rewards.getReferralCode() {
  //use response
}
```






*Returned Response:*




[UserReferralCodeResponse](#UserReferralCodeResponse)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "referralCode": "4WW40IW",
  "referralLink": "https://www.potlee.co.in/r/4WW40IW",
  "referralMessage": "Join Potlee using my referral link https://www.potlee.co.in/r/4WW40IW",
  "isEligible": true,
  "hasBeenReferred": false
}
```
</details>









---



### Schemas

 
 
 #### [UserReferralsResponse](#UserReferralsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalCount | Integer |  no  |  |
 | verifiedCount | Integer |  no  |  |
 | referrals | ArrayList<[UserReferrals](#UserReferrals)> |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [UserReferrals](#UserReferrals)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | registeredOn | String |  no  |  |
 | isVerified | Boolean |  no  |  |

---


 
 
 #### [UserReferralCodeResponse](#UserReferralCodeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | referralCode | String |  no  |  |
 | referralLink | String |  no  |  |
 | isEligible | Boolean |  no  |  |
 | hasBeenReferred | Boolean |  no  |  |
 | referralMessage | String |  no  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AddUserReferralRequest](#AddUserReferralRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | referralCode | String |  no  |  |

---


 
 
 #### [AddUserReferralResponse](#AddUserReferralResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---



