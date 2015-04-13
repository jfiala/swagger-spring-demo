package at.fwd.swagger.spring.demo.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;
import at.fwd.swagger.spring.demo.user.model.User;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * Basic User Controller to demo troubles with Codegen
 * 
 * https://github.com/swagger-api/swagger-codegen/issues/613
 * 
 * with master 2.1.2-M2: StringIndexOutOfBoundsException (see https://github.com/swagger-api/swagger-codegen/issues/613#issue-67383467)
 * with develop-2.0: silently not generated
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@RestController
@Api(value="user-codegen-one-get-path", position=2, description ="User services with one get path")
public class UserControllerForCodegenWithOneGetPath {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(UserControllerForCodegenWithOneGetPath.class);

	private static final String PATH_USER = "/user_get_read1";
	
	private static final String MESSAGE_NOT_FOUND = "User not found";
	
	private static final String MESSAGE_GET_SUCCESS = "Successful retrieval of user detail";
	
	@Autowired
	private UserController userController;
	 
    @RequestMapping(method=RequestMethod.GET, value=PATH_USER)
    @ResponseBody
    @ApiOperation(value="read User by ID", notes="pass ID to read user", position = 2)
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = MESSAGE_GET_SUCCESS, response = User.class),
    	    @ApiResponse(code = 404, message = MESSAGE_NOT_FOUND) })
    public User getUser(@RequestParam(value="id", required=true) Long id) {
		log.debug("getUser"); 
		User user = userController.getUserMap().get(id); 
		
    	if (user!=null) {
    		return user;	
    	} else {
    		throw new ObjectNotFoundException(MESSAGE_NOT_FOUND + " (id=" + id + ")");
    	}
    }
    
    
}
