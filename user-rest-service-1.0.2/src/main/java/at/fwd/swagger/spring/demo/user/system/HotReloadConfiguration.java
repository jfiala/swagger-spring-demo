package at.fwd.swagger.spring.demo.user.system;

import io.github.jhipster.loaded.JHipsterReloaderAutoConfiguration;
import io.github.jhipster.loaded.reloader.SpringReloader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * JHipster Hot reload of Spring-Beans demo
 * 
 * see also: http://tux2323.blogspot.co.at/2014/06/hot-reload-support-with-spring-loaded.html
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@Configuration
@Conditional(HotReloadConfiguration.HotReloadCondition.class)
public class HotReloadConfiguration {

	public static class HotReloadCondition implements Condition {
		@Override
		public boolean matches(ConditionContext context,
				AnnotatedTypeMetadata metadata) {
			String hotReloadEnabledProperty = context.getEnvironment()
					.getProperty("hotReload.enabled");
			return hotReloadEnabledProperty.equals("true");
		}
	}

	@Bean
	public JHipsterReloaderAutoConfiguration reloaderAutoConfiguration() {
		
		// set Package path to monitor
		System.setProperty("hotReload.package.project", "at.fwd.swagger.spring.demo.user");
		
		JHipsterReloaderAutoConfiguration config = new JHipsterReloaderAutoConfiguration();
		return config;
	}

	@Bean
	public SpringReloader springReloader() {
		return new SpringReloader();
	}
}