package at.fwd.swagger.spring.demo.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.model.User;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * Simple search demo (also shows injecting another controller)
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="search-services", position=2, description="Search")
public class SearchController {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(SearchController.class);

	private static final String PATH = "/search";
	
	private static final String MESSAGE_SUCCESS = "Successful retrieval of user list";
	

	private static final String MESSAGE_POST_SUCCESS = "User has been updated";
	
	@Autowired
	private UserController userController;
	
    @RequestMapping(method=RequestMethod.GET, value=PATH)
    @ResponseBody  
    @ApiOperation(value="search for users by name-part", notes="search for users")
    @ApiResponses(value = { 
    	    @ApiResponse(code = 200, message = MESSAGE_SUCCESS, response = User.class) })
    public List<User> searchUsers(@RequestParam(value="query", required=true) String query) {
		log.debug("searchUsers"); 
		List<User> resultList = new ArrayList<User>();
		
		for (User user : userController.getUserMap().values()) {
			if (user.getName().indexOf(query)>=0) {
				resultList.add(user);
			}  
		}

		return resultList;
    }
    
    @RequestMapping(method=RequestMethod.POST, value=PATH)
    @ApiOperation(value="create or update a user name by id", position = 1)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = MESSAGE_POST_SUCCESS, response = User.class) })
    public User saveUser(@RequestParam(required=true) Long id, 
    		@RequestParam(required=true) String name) {
    	User user = userController.getUserMap().get(id);

    	if (user==null) {
    		user = new User();
    		user.setId(id);
    		user.setName(name);
    		userController.getUserMap().put(id,  user);

    	} else {
    		user.setName(name);
    	}
    	
    	return user;
    }

    
    
}
