package at.fwd.swagger.spring.demo.user;

import io.swagger.client.ApiException;
import io.swagger.client.model.User;
import junit.framework.TestCase;

import org.apache.log4j.Logger;

public class GetUserTest extends TestCase {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(GetUserTest.class);
	
	
	public void testSuccess() {
		
		try {
			Userc api = new UserApi();
			api.setBasePath("http://localhost:8080/");
			
			User user = api.getUser(new Long(1));
			assertNotNull(user);
			log.info("user: " + user.toString());
			
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	public void testError() {
		
		try {
			UserApi api = new UserApi();
			api.setBasePath("http://localhost:8080/");
			
			User user = api.getUser(new Long(2));
			assertNull(user);
			
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}

}
