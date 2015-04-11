# Demo of Springfox Swagger-Spring Integration and Swagger-Codegen

## IDE
Currently maven configuration files are supplied.

* Run: mvn spring-boot:run
* Generate Eclipse configuration: mvn eclipse:eclipse

## Swagger 1.2
This uses the stable version 1.0.2 of Swagger-Spring Integration

* Spring Boot Application: user-rest-service-1.0.2
* Generated Java code using Swagger-Codegen: user-rest-service-swagger-client-1.0.2

## Swagger 2.0.0 (SNAPSHOT)
Swagger 2.0.0 is currently under development, will always update to head

* Spring Boot Application: user-rest-service-2.0.0
* Generated Java code using Swagger-Codegen: user-rest-service-swagger-client-2.0.0


Features of Model-Classes
---------------------------------------
* Enum
* Byte

Features of Controller-Classes
---------------------------------------
* HTTP GET/POST
* Handling Error-codes using Exceptions
* Handling Error-codes using ResponseEntity
(* Multiple Paths for the same HTTP verb (e.g. GET))
>>> currently causing errors during CodeGen



