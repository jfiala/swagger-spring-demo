package at.fwd.swagger.spring.demo.user;

import org.apache.log4j.Logger;


import junit.framework.TestCase;

import com.wordnik.client.api.UserApi;
import com.wordnik.client.common.ApiException;
import com.wordnik.client.model.User;

public class GetUserTest extends TestCase {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(GetUserTest.class);
	
	
	public void testSuccess() {
		
		try {
			UserApi api = new UserApi();
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
