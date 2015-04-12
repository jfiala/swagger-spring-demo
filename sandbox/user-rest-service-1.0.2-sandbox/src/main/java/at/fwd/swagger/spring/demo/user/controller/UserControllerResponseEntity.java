package at.fwd.swagger.spring.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.model.User;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * This controller shows how to return an ResponseEntity with a custom return object / custom message in case of an error
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="user-get-responseentity", position=2, description="User GET with ResponseEntity")
public class UserControllerResponseEntity {

	private static final String PATH = "/user_with_responseentity";
	
	private static final String MESSAGE_SUCCESS = "User has been updated";
	
	private static final String MESSAGE_ERROR_NOT_FOUND = "User has not been found";
	
	private static final String MESSAGE_ERROR_UNEXPECTED = "Unexpected Error";
	
	@Autowired
	private UserController userController;
	
    @RequestMapping(method=RequestMethod.GET, value=PATH)
    @ResponseBody
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = MESSAGE_SUCCESS, response = User.class),
    	    @ApiResponse(code = 404, message = MESSAGE_ERROR_NOT_FOUND),
    	    @ApiResponse(code = 500, message = MESSAGE_ERROR_UNEXPECTED)})
    public ResponseEntity<?> getUserResponseEntity(@RequestParam(value="id", required=true) Long id) {
		
		User user = userController.getUserMap().get(id);
		
    	if (user!=null) {
    	
    		return new ResponseEntity<User>(user, HttpStatus.OK);	
    	} else {
    		return new ResponseEntity<String>(MESSAGE_ERROR_NOT_FOUND, HttpStatus.NOT_FOUND);	
    	}
    }
    
    
    
}
