package at.fwd.confess.user.controller;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.confess.user.model.User;


@RestController
public class UserController {

	private ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<Long, User>();
	
	public UserController() {
		User firstUser = new User();
		firstUser.setName("Test");
		firstUser.setId(new Long(1));
		userMap.put(firstUser.getId(), firstUser);
	}
	
    @RequestMapping(method=RequestMethod.GET, value="/user")
    @ResponseBody
    public User getUser(@RequestParam(value="id", required=true) Long id) {
		
		User user = userMap.get(id);
		
    	if (user!=null) {
    	
    		return user;	
    	} else {
    		throw new ObjectNotFoundException("Object not found");	
    	}
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/user")
    public ResponseEntity<User> saveUser(@RequestParam(required=true) Long id, 
    		@RequestParam(required=true) String name) {
    	User user = userMap.get(id);

    	if (user==null) {
    		user = new User();
    		user.setId(id);
    		user.setName(name);
        	userMap.put(id,  user);

        	return new ResponseEntity<User>(user, HttpStatus.CREATED);
        	
    	} else {
    		user.setName(name);
        	return new ResponseEntity<User>(user, HttpStatus.OK);
    	}
    	
    		
    	
    	
    }
    
}
