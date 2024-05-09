# Settle Java


Settle client for Java language


## Getting Started
Get started with the Java Development SDK for Potlee


# Usage

1. Create Maven project and add the dependency in the pom.xml 
```xml
<dependency>
    <groupId>com.github.gofynd</groupId>
    <artifactId>settle-client-java</artifactId>
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

            AccessTokenDto token = platformConfig.getPlatformOauthClient().getAccessTokenObj("authorization_code");
            platformConfig.getPlatformOauthClient().setToken(token);
            platformClient = new PlatformClient(platformConfig);

            List<PlatformModels.Items> items = new ArrayList<>();
            items.add(new PlatformModels.Items("1", "1", 0.0, 0.0));
            PlatformModels.Location geoLocation = new PlatformModels.Location(111.0, 111.0);

            PlatformModels.OrderAddress shippingAddress = new PlatformModels.OrderAddress("123 Shipping Street", "Apt 1", "Shipping City",
                    "Shipping State", "Shipping Country", "400076", "Home", geoLocation);


            PlatformModels.CustomerObject customer = PlatformModels.CustomerObject.builder().countryCode("91")
                    .mobile("8898518242")
                    .uid("1").build();

            PlatformModels.Device device = PlatformModels.Device.builder().ipAddress("127.0.0.1").userAgent("moz").build();

           PlatformModels.Order order = new PlatformModels.Order(
                    10000,
                    "1",
                    3.0,
                    items,
                    shippingAddress,
                    shippingAddress);


                    PlatformModels.VerifyCustomerSuccess verifyCustomerSuccess = platformClient.customer.verify(
                   platformConfig.getOrganizationId(),
                   new PlatformModels.VerifyCustomer(
                           customer,
                           order,
                           device,
                           new PlatformModels.MetaSchema(),
                           true,
                           true
                   )
           );
          PlatformModels.CreateTransactionSuccess createTransactionSuccess = platformClient.customer.createOrder(
                   platformConfig.getOrganizationId(),
                   PlatformModels.CreateTransaction.builder().redirectUrl("https://www.google.com").customer(customer).order(order).build()
           );

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

### Documentation
* [Platform](documentation/platform/README.md)
