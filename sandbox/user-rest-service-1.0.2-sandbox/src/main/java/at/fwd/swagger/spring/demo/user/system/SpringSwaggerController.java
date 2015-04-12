package at.fwd.swagger.spring.demo.user.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mangofactory.swagger.annotations.ApiIgnore;
import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.SwaggerReloadUtil;

@RestController
@ApiIgnore
public class SpringSwaggerController {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private SpringSwaggerConfig springSwaggerConfig;

	@RequestMapping(method = RequestMethod.GET, value = "/refresh")
	@ResponseBody
	public String refresh() {
		SwaggerReloadUtil.reload(applicationContext, springSwaggerConfig);
		return "Swagger config refreshed";
	}
}
