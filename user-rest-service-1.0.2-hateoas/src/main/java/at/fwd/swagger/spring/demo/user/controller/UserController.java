package at.fwd.swagger.spring.demo.user.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.exception.ObjectNotFoundException;
import at.fwd.swagger.spring.demo.user.model.User;


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
    		// add link to user details
    		Link link = linkTo(methodOn(UserController.class).getUser(id)).withSelfRel();
    		user.setLink(link);
    		return user;
    	} else {
    		throw new ObjectNotFoundException();
    	}
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/user")
    public User saveUser(@RequestParam(required=true) Long id, 
    		@RequestParam(required=true) String name) {
    	User user = userMap.get(id);

    	if (user==null) {
    		user = new User();
    		user.setId(id);
    		user.setName(name);
        	userMap.put(id,  user);

        	// add link to user details
        	Link link = linkTo(methodOn(UserController.class).getUser(id)).withSelfRel();
        	user.setLink(link);
        	return user;
        	
    	} else {
    		user.setName(name);
    
        	// add link to user details
        	Link link = linkTo(methodOn(UserController.class).getUser(id)).withSelfRel();
        	user.setLink(link);
        	
        	return user;
    	}
    	
    		
    	
    	
    }

	public ConcurrentMap<Long, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(ConcurrentMap<Long, User> userMap) {
		this.userMap = userMap;
	}
    
}
