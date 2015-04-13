package at.fwd.swagger.spring.demo.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsercompletepostcompleteApi;
import io.swagger.client.model.User;

import java.text.ParseException;
import java.util.logging.Logger;

import org.junit.Test;

public class UserCompletePostApi_post_Test extends AbstractTestCase {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(UserCompletePostApi_post_Test.class.getName());
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			UsercompletepostcompleteApi api = new UsercompletepostcompleteApi();
			api.setBasePath("http://localhost:8080/");
			
			Long id = new Long(2);
			String name = "Test Post";
			
			User user = new User();
			user.setId(id);
			user.setName(name);
			
			User response = api.saveUserComplete(user);
			
			log.info("user response: " + response);
			
			assertEquals(id, response.getId());
			assertEquals(name, response.getName());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
