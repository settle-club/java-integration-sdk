# Settle Java


Settle client for Java language
[![](https://jitpack.io/v/settle-finance/java-integration-sdk.svg)](https://jitpack.io/#settle-finance/java-integration-sdk)



## Getting Started
Get started with the Java Development SDK for Potlee, Compatible with Java 8


# Usage

1. Create Maven project and add the dependency in the pom.xml 
```xml
    <dependency>
        <groupId>com.github.settle-finance</groupId>
        <artifactId>java-integration-sdk</artifactId>
        <version>1.0.0</version>
    </dependency>
```

2. Add it in your root pom.xml at the end of repositories:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

3. Start integrating

### Exampe Usage 
```java
public class Example {
    static PlatformConfig platformConfig;
    static PlatformClient platformClient;

    public static void main(String[] args) {
        try {
            platformConfig = new PlatformConfig(
                    "COMPANY_ID",
                    "API_KEY",
                    "API_SECRET",
                    "API_TOKEN",
                    "https://api.potleez5.de",
                    false
            );

            platformClient = new PlatformClient(platformConfig);

            PlatformModels.CustomerObject customer = PlatformModels.CustomerObject.builder().countryCode("91").mobile("8898518242").uid("1").build();

            PlatformModels.Device device = PlatformModels.Device.builder().ipAddress("127.0.0.1").userAgent("moz").build();

            PlatformModels.Order order =  PlatformModels.Order.builder().valueInPaise(100000).uid("123").build();

            PlatformModels.ValidateCustomer validateCustomer = PlatformModels.ValidateCustomer.builder().customer(customer).order(order).device(device).build();

            // Use this API to verify the customer.
            PlatformModels.VerifyCustomerSuccess verifyCustomerSuccess = platformClient.customer.validate(
                    platformConfig.getOrganizationId(),
                    verifyCustomer
            );

            PlatformModels.CreateTransaction createTransaction = PlatformModels.CreateTransaction.builder().customer(customer).order(order).redirectUrl("https://www.google.com").build();

            // Use this API to create transaction for user.
            PlatformModels.CreateTransactionSuccess createTransactionSuccess = platformClient.customer.createTransaction(
                    "",
                    platformConfig.getOrganizationId(),
                    createTransaction
            );
   
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

### Documentation
* [Platform](documentation/platform/README.md)
