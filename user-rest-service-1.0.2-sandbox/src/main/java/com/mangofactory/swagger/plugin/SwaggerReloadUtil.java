package com.mangofactory.swagger.plugin;

import java.util.Map;

import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;

/**
 * Utility-Class for reload 
 * (has to reside in com.mangofactory.swagger.plugin as new SwaggerSpringMvcPlugin(springSwaggerConfig).build().initialize() is protected)
 * 
 * @author johannes.fiala@fwd.at
 *
 */
public class SwaggerReloadUtil {

	public static Map<String, SwaggerSpringMvcPlugin> reload(
			ApplicationContext applicationContext,
			SpringSwaggerConfig springSwaggerConfig) {
		new SwaggerSpringMvcPlugin(springSwaggerConfig).build().initialize();

		Map<String, SwaggerSpringMvcPlugin> plugins = BeanFactoryUtils
				.beansOfTypeIncludingAncestors(applicationContext,
						SwaggerSpringMvcPlugin.class);
		
		return plugins;
	}
}
