package at.fwd.confess.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.mangofactory.swagger.plugin.EnableSwagger;

@ComponentScan
@EnableAutoConfiguration

@EnableSwagger
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}