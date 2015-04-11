# Demo of Springfox Swagger-Spring Integration and Swagger-Codegen

Shows usage of the Springfox Swagger-Spring REST API and client code generation using Swagger-Codegen.

## Projects
* Springfox Swagger-Spring Integration:
https://github.com/springfox/springfox

* Swagger-Codegen:
https://github.com/swagger-api/swagger-codegen

## Open issues
for open issues regarding springfox/swagger-codegen see TODO Task list

## IDE
Currently maven configuration files are supplied for all projects.

* Run Spring Boot Application: mvn spring-boot:run
* Generate Eclipse configuration: mvn eclipse:eclipse

## user-rest-service-1.0.2 / Swagger 1.2
This uses the stable version 1.0.2 of Swagger-Spring Integration

* user-rest-service-1.0.2:
  Spring Boot Application
 
* user-rest-service-1.0.2-client-java-codegen-2.1.2-M1:
  Generated Java code using Swagger-Codegen 

* user-rest-service-1.0.2-client-java-codegen-develop-2.0:
  Generated Java code using Swagger-Codegen using latest update 

* user-rest-service-1.0.2-client-php-codegen-2.1.2-M1:
  Generated PHP code using Swagger-Codegen 

* user-rest-service-1.0.2-client-php-codegen-develop-2.0:
  Generated PHP code using Swagger-Codegen using latest update

* user-rest-service-1.0.2-codegen-maven:
  Shows usage of the Swagger Codegen maven integration to generate PHP/Java code


## user-rest-service-2.0.0 / Swagger 2.0.0 (SNAPSHOT)
Swagger 2.0.0 is currently under development, will always update to head

*   user-rest-service-2.0.0:
    Spring Boot Application

*   user-rest-service-2.0.0-client-java-codegen-2.1.2-M1:
    Generated Java code using Swagger-Codegen 

*   user-rest-service-2.0.0-client-java-codegen-develop-2.0:
    Generated Java code using Swagger-Codegen using latest update 

## Hot deployment

* Hot deployment using Spring-Loaded + JHipster-Core:
-javaagent:C:/tools/spring-loaded/springloaded-1.2.3.RELEASE.jar -noverify-DhotReload.enabled=true

JHipster activation: HotReloadConfiguration.java
* sets target package
* default watchdir target/classes should be fine

* Refresh Swagger API changes (working for method-level refresh):
http://localhost:8080/refresh (SpringSwaggerController)

The Refresh of the Swagger API changes is currently only provided for 1.0.2!




