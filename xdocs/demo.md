
### Live Demo of Swagger-Spring-Integration

## Questions to audience
   * Who uses Swagger as consumer?
   * Who uses Swagger as provider?
   * Who uses Spring Boot for REST API dev?
   * Who uses Spring Loaded?
   * Who uses JHipster?


## Swagger visualization
Why should I use Swagger for my services.

Answer:
* Swagger-UI
* Show Swagger.ed

## Main facts
   * Swagger provides various solutions for integrations as community projects:
   	  * https://github.com/swagger-api/swagger-spec#additional-libraries
   	  e.g. Jersey, Spring, Grails, .Net. Node.js, PHP, Python, Ruby, Scala, ... 
   	  
   * Swagger provides fancy UI for testing
      * Demo: http://petstore.swagger.io/
   
   * Swagger allows to generate client code stubs
      
   
## Helpful links
http://swagger.io

Swagger-UI:   
https://github.com/swagger-api/swagger-ui

Spring-Swagger-Integration:
https://github.com/springfox/springfox

Sample Swagger oauth2 integration (PHP):
https://github.com/Luracast/Restler

Swagger-Codegen:   
https://github.com/swagger-api/swagger-codegen

Spring-Loaded:
https://github.com/nithril/spring-loaded-spring-plugin
-> cannot reload Spring beans ...

JHipster Loaded:
https://github.com/jhipster/jhipster-loaded
-> can reload spring beans

# Demos

## Demo 1: How to enable Swagger in a Spring-REST app 

### Show App
1. Show Spring-Rest app
2. Launch Spring-Rest app
3. http://localhost:8080/user?id=1

### Enable Swagger:
1. Add swagger to maven dependencies
2. Add @EnableSwagger (1.0.2)/ @EnableSwagger2 (2.0.0)

3. Show api-docs:
http://localhost:8080/v2/api-docs

4. Show Swapper UI
http://localhost:8080/swagger/index.html

5. View in Chrome:
http://localhost:8080/v2/api-docs

6. Generate Java code
+ show supported languages

7. Run GetUserTest


## Demo #2: Modify an existing API (1.0.2)

### Show Api*-annotations

* Controller: 
@Api

* Operations:
@ApiOperation – describe your service
@ApiResponse – Define error codes

* Model:
@ApiModel(„description“)
@ApiModelProperty: description + required-flag, 	position
@JsonIgnore


### Add new fields / methods
1. new field
2. new method

### Integrate with other APIs
1. Show Facebook API docs
https://developers.facebook.com/docs/graph-api/using-graph-api/v2.3

2. Sample query of Facebook Graph API 
http://graph.facebook.com/pivotalsoftware?metadata=1

3. Show Wrapper for calling Facebook

### Generate PHP code
1. Generate PHP

2. Fix bug in Swagger-Codegen (double/boolean)

ask for support: https://github.com/jfiala/swagger-spring-demo/issues/5

3. Explain Languages, templates, add custom languages


## Demo #3: Spring HATEOAS
1. Show how to add links

2. Short demo


## Demo #4: Wrap an existing API (Facebook)

### Load data from other API's dynamically
1. Read Metadata from Facebook

2. Add to Codegen

3. Show generated code

4. Copy back to service

5. Demo
 
 
## Demo #5: Show new landscape with Swagger API










