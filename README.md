# JHeroku-keep-alive
This minimalistic java library brings a powerful annotation to your Java Spring Boot application and prevents your app from sleeping on the free Heroku plan!

## Where do I get this library
To use this library in your Web Application use it from our GitHub packages:
https://github.com/orgs/PickwickSoft/packages

## Usage
JHeroku-keep-alive provides the following annotation `@HerokuKeepAlive`

Use this annotation like that:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.pickwicksoft.jherokukeepalive.HerokuKeepAlive;

@HerokuKeepAlive
@SpringBootApplication
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
```

## How does it work?
The annotation adds a spring service to your application that starts a GET request to [https//:localhost:8080](https//:localhost:8080) every five minutes wich prevents the Heroku machine from shutting down.