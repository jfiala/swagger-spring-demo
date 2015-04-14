package at.fwd.swagger.spring.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

/**
 * Swaggger-Spring MVC Configuration
 * 
 * @author johannes.fiala@fwd.at
 *
 */

@Configuration
//@EnableWebMvc // not necessary
@EnableSwagger
@ComponentScan(basePackages="at.fwd.swagger.spring.demo.user.controller")
public class CustomJavaPluginConfig {

	   private SpringSwaggerConfig springSwaggerConfig;
 
	   @Autowired
	   public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
	      this.springSwaggerConfig = springSwaggerConfig;
	   }

	   @Bean //Don't forget the @Bean annotation
	   public SwaggerSpringMvcPlugin customImplementation(){
	      return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
	            .apiInfo(apiInfo())
	            .includePatterns(".*").useDefaultResponseMessages(false)
	            .directModelSubstitute(java.util.Calendar.class, Long.class);
	            
	   }

	   private ApiInfo apiInfo() {
	      ApiInfo apiInfo = new ApiInfo(
	              "Spring SwaggerMvc demo application",
	              "based on 1.0.2, shows CRUD operations and datatype conversions",
	              "My Apps API terms of service",
	              "My Apps API Contact Email",
	              "My Apps API Licence Type",
	              "My Apps API License URL"
	        );
	      return apiInfo;
	    }
	}


