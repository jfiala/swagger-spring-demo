

start:
- Maven: mvn spring-boot:run
- Java Application: Run as Application -> pick at.fwd.swagger.spring.demo.user.Application

Spring REST API:
http://localhost:8080/user?id=1

Swagger Testing frontend:
http://localhost:8080/swagger/index.html

Swagger API-Docs:
http://localhost:8080/api-docs/


Swagger Version 1.0.2 on Github:
 * https://github.com/springfox/springfox/tree/pre-2.0



=============================
Use with Spring Loaded:
=============================
rem JVM commandline 
 -javaagent:C:/tools/spring-loaded/springloaded-1.2.3.RELEASE.jar -noverify
 
 rem + jhipster:
 -DhotReload.enabled=true -DhotReload.watchdir[0]=${project_loc:confess-user-rest-service-swagger}/target/classes -DhotReload.package.project=at.fwd.confess.user
 
=============================
Spring Actuator
=============================
http://localhost:8080/health
http://localhost:8080/metrics

more info:
https://spring.io/guides/gs/actuator-service/
 
=============================
jhipster
=============================
http://jhipster.github.io/

http://tux2323.blogspot.co.at/2014/06/hot-reload-support-with-spring-loaded.html

-javaagent:${project_loc:simpleweb-springboot}/build/springloaded/springloaded-1.2.1.RELEASE.jar -noverify 
-DhotReload.enabled=true
-DhotReload.watchdir[0]=${project_loc:simpleweb-springboot}/bin
-DhotReload.package.project=simpleblog
-DhotReload.package.domain=simpleblog.domain
-DhotReload.package.restdto=simpleblog.rest

-XX:MaxPermSize=128M -javaagent:C:/tools/spring-loaded/springloaded-1.2.3.RELEASE.jar -noverify
-DhotReload.enabled=true -DhotReload.watchdir[0]=${project_loc:simpleweb-springboot}/bin -DhotReload.package.project=simpleblog -DhotReload.package.domain=simpleblog.domain

more info:
https://github.com/j-clark/hipster-boot/blob/master/src/main/java/com/jclark/hipster/config/reload/JHipsterPluginManagerReloadPlugin.java

https://github.com/nithril/spring-loaded-spring-plugin
https://github.com/tux2323/simpleweb-springboot

=============================
spring mvc
=============================
http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html
