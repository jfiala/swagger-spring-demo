
## user-rest-service-1.0.2 / Swagger 1.2
This uses the stable version 1.0.2 of Swagger-Spring Integration

Features of Model-Classes
---------------------------------------
* enum (user.state)
* java.util.List (user.category, user.ocation)
* Byte[] (user.photo)
* java.math.BigDecimal (location.langitude/longitude)

Features of Controller-Classes
---------------------------------------
* HTTP GET/POST
* Handling Error-codes using Exceptions
* Handling Error-codes using ResponseEntity
(* Multiple Paths for the same HTTP verb (e.g. GET))
>>> currently causing errors during CodeGen



