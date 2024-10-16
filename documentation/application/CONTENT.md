



##### [Back to Application docs](./README.md)

## Content Methods
Content Service
* [checkForUpdates](#checkforupdates)



## Methods with example and description


### checkForUpdates
Check for app updates




```java
content.checkForUpdates() {
  //use response
}
```






*Returned Response:*




[AppUpdateResponse](#AppUpdateResponse)

Successful operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "available": true,
  "type": "HARD",
  "version": "1.0.3",
  "title": "A new update is available",
  "description": "Please update your app",
  "releasedOn": "2022-11-14",
  "appLink": "https://apps.apple.com/us/app/potlee/id6444611798"
}
```
</details>









---



### Schemas

 
 
 #### [AppUpdateResponse](#AppUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | available | Boolean |  no  |  |
 | type | String? |  yes  |  |
 | version | String? |  yes  |  |
 | title | String |  no  |  |
 | description | String |  no  |  |
 | releasedOn | String? |  yes  |  |
 | appLink | String? |  yes  |  |

---


 
 
 #### [CreateVersionRequest](#CreateVersionRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | version | String |  no  |  |
 | additionalNotes | String? |  yes  |  |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |
 | releasedOn | String? |  yes  |  |

---


 
 
 #### [UpdateVersionRequest](#UpdateVersionRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | additionalNotes | String? |  yes  |  |
 | status | String |  no  |  |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |
 | releasedOn | String? |  yes  |  |

---


 
 
 #### [CreateVersionResponse](#CreateVersionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | additionalNotes | String? |  yes  |  |
 | status | String |  no  |  |
 | version | String |  no  |  |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |
 | releasedOn | String |  no  |  |
 | updatedAt | String |  no  |  |
 | createdAt | String |  no  |  |

---


 
 
 #### [VersionResponse](#VersionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | additionalNotes | String? |  yes  |  |
 | status | String |  no  |  |
 | version | String |  no  |  |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |
 | releasedOn | String |  no  |  |
 | updatedAt | String |  no  |  |
 | createdAt | String |  no  |  |

---


 
 
 #### [GetVersionsResponseExample](#GetVersionsResponseExample)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | versions | ArrayList<[VersionResponse](#VersionResponse)>? |  yes  |  |

---


 
 
 #### [GenerateSignedUrlRequest](#GenerateSignedUrlRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | provider | String? |  yes  | The name of the storage provider (e.g., 'gcp') to be used. |
 | fileName | String? |  yes  | The name of the file for which the signed URL is generated. File name will be auto generated if not provided. |
 | filePath | String? |  yes  | The path within the storage where the file is located or will be stored. File will be uploaded in root of bucket if path is not provided. |
 | fileUrl | String? |  yes  | The URL of the file to be downloaded. This is only allowed if the action is 'download'. |
 | action | String |  no  | The action that the signed URL will allow, such as 'upload' or 'download'. |
 | access | String? |  yes  | The access level for the file (e.g., 'publicRead', 'private'). |
 | expires | Double? |  yes  | The expiration time for the signed URL in milliseconds. If not provided, a default value is used. |

---


 
 
 #### [SignedDetails](#SignedDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | provider | String |  no  | The cloud provider where the file is stored. |
 | signedUrl | String |  no  | The signed URL that allows access or actions on the specified file. |

---


 
 
 #### [GenerateSignedUrlResponse](#GenerateSignedUrlResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fileUrl | String? |  yes  | The URL of the uploaded file. |
 | signedDetails | [SignedDetails](#SignedDetails) |  no  |  |

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



