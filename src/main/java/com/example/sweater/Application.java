package com.example.sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    /*
    The Spring Initializr creates an application class for you. In this case, you need not further modify the class provided by the Spring Initializr. The following listing (from src/main/java/com/example/servingwebcontent/ServingWebContentApplication.java) shows the application class:
    @SpringBootApplication is a convenience annotation that adds all of the following:
        @Configuration: Tags the class as a source of bean definitions for the application context.
        @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.
        @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
    The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. Did you notice that there was not a single line of XML? There is no web.xml file, either. This web application is 100% pure Java and you did not have to deal with configuring any plumbing or infrastructure.
    */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
