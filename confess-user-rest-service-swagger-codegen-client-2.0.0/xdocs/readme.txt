

generate with latest sources:
https://github.com/swagger-api/swagger-codegen (tag v2.1.2-M1)

with custom language templates javaFWD:

java  -jar modules/swagger-codegen-distribution/target/swagger-codegen-distribution-2.1.2-M1.jar -i input/api-docs/user-rest.json -l java -t modules\swagger-codegen\src\main\resources\JavaFwd -o tryout/client/confess-user-rest/java 
