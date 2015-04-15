package at.fwd.swagger.spring.demo.user.controller.connectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import at.fwd.swagger.spring.demo.user.model.User;
import at.fwd.swagger.spring.demo.user.model.facebook.FacebookUser;

import com.mangofactory.swagger.annotations.ApiIgnore;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * 
 * 
 * http://graph.facebook.com/pivotalsoftware?metadata=1
 * 
 * https://developers.facebook.com/docs/graph-api/using-graph-api/v2.3
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="connector-facebook", position=6, description="Facebook connector")
public class ConnectorUserFacebookController {

	private static final String SUCCESS = "SUCCESS"; 
	
	@RequestMapping(method=RequestMethod.GET, value="/connector-facebook-user")
    @ResponseBody  
    @ApiOperation(value="search for users by name-part", notes="search for users")
    @ApiResponses(value = { 
    	    @ApiResponse(code = 200, message = SUCCESS, response = User.class) })
    public FacebookUser findByName(@RequestParam(value="name", required=true) String name) {
		
		// TODO: make connector asynchronous
		RestTemplate restTemplate = new RestTemplate();
		FacebookUser user = restTemplate.getForObject("http://graph.facebook.com/" + name, FacebookUser.class);
		return user;
		 
	} 
	
}
