package at.fwd.swagger.spring.demo.user.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.fwd.swagger.spring.demo.user.model.User;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


@RestController
public class SearchController {

	@Autowired
	private UserController userController;
	
	public SearchController() {
	}
	
	
    @RequestMapping(method=RequestMethod.GET, value="/search")
    @ResponseBody
    @ApiOperation(value="search for users by name-part", notes="search for users")
    @ApiResponses(value = {
    	    @ApiResponse(code = 200, message = "Successful retrieval of user list", response = User.class),
    	    @ApiResponse(code = 404, message = "User not found") })
    public List<User> searchUsers(@RequestParam(value="query", required=true) String query) {
		System.out.println("searchUsers");
		List<User> resultList = new ArrayList<User>();
		
		for (User user : userController.getUserMap().values()) {
			if (user.getName().indexOf(query)>=0) {
				
				Link link = linkTo(methodOn(UserController.class).getUser(user.getId())).withSelfRel();
	    		user.setLink(link);
				
				resultList.add(user);
			}
		}

		return resultList;
    }
}
