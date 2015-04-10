package at.fwd.swagger.spring.demo.user.controller;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

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
@Api(value = "search-services", position = 1, description = "Search")
public class SearchController {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(SearchController.class);

	@Autowired
	private UserController userController;

	public SearchController() {
	}

	@RequestMapping(method = RequestMethod.GET, value = "/search")
	@ResponseBody
	@ApiOperation(value = "search for users by name-part", notes = "search for users")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful retrieval of user list", response = User.class),
			@ApiResponse(code = 404, message = "User not found") })
	public List<User> searchUsers(@RequestParam(value = "query", required = true) String query) {
		log.debug("searchUsers12");
		List<User> resultList = new ArrayList<User>();

		for (User user : userController.getUserMap().values()) {
			if (user.getName().indexOf(query) >= 0) {
				resultList.add(user);
			}
		}

		return resultList;
	}

}
