package at.fwd.swagger.spring.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Root Configuration
 * 
 * @author johannes.fiala@fwd.at
 *
 */
//replaces: @ComponentScan @EnableAutoConfiguration @Configuration
@SpringBootApplication
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }  

}