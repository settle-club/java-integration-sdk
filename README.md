# Settle Java


Settle client for Java language


## Getting Started
Get started with the Java Development SDK for Potlee


# Usage

1. Create Maven project and add the dependency in the pom.xml 
```
<dependency>
    <groupId>com.github.gofynd</groupId>
    <artifactId>settle-client-java</artifactId>
    <version>v1.0.0</version>
</dependency>
```

2. Add it in your root pom.xml at the end of repositories:
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

3. Start integrating

### Exampe Usage 
```
public class Example {
    static PlatformConfig platformConfig;
    static PlatformClient platformClient;

    public static void main(String[] args) {
        try {
            platformConfig = new PlatformConfig(
                    "e53a8067-aac2-46b7-9b95-84ddf035a374",
                    "e53a8067-aac2-46b7-9b95-84ddf035a374",
                    "e91d0f4d4238b2e01c008c214997df0aec117b2d",
                    "e80b403b7d69f00c82093d347182b87dda666a02",
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
```java 

### Documentation
* [Platform](documentation/platform/README.md)
