
## user-rest-service-1.0.2 / Swagger 1.2
This uses the stable version 1.0.2 of Swagger-Spring Integration

Features of Model-Classes
---------------------------------------
* enum (user.state)
* java.lang.Byte[] (user.photo)
* java.lang.Double (user.longitude)
* java.util.List (user.category, user.ocation)
* java.math.BigDecimal (location.langitude)

Features of Controller-Classes
---------------------------------------
* HTTP GET/POST (UserController)
* Handling Error-codes using Exceptions (UserController)
* Handling Error-codes using ResponseEntity (UserControllerResponseEntity)
* Multiple Paths for the same HTTP verb (UserControllerForCodegenWithTwoGetPaths)
>>> currently commented second verb because of errors during CodeGen





