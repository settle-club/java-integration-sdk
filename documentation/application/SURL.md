



##### [Back to Application docs](./README.md)

## Surl Methods
Short URL Service
* [getOriginal](#getoriginal)



## Methods with example and description


### getOriginal
Get original URL




```java
surl.getOriginal( hash) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| hash | String | yes | This is the hash |  



Use this API to get original URL.

*Returned Response:*




[OriginalUrlSchema](#OriginalUrlSchema)

Success. Returns a success message as shown below. Refer `OriginalUrlSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>





[Object](#Object)

Success. Returns a success message as shown below. Refer `OriginalUrlSchema` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [OriginalUrlSchema](#OriginalUrlSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | originalLink | String |  no  |  |
 | hash | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

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



