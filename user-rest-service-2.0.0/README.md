
## user-rest-service-2.0.0 / Swagger 2.0.0 (SNAPSHOT)
Swagger 2.0.0 is currently under development, will always update to head

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





