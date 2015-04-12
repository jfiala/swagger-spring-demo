package at.fwd.swagger.spring.demo.user;

import io.swagger.client.ApiException;
import io.swagger.client.api.UserApi;
import io.swagger.client.model.User;

import java.util.logging.Logger;

import junit.framework.TestCase;

public class GetUserTest extends TestCase {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(GetUserTest.class.getName());
		
	public void testSuccess() {
		
		try {
			UserApi api = new UserApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			User user = api.getUser(new Long(1));
			assertNotNull(user);
			System.out.println ("response: " + user.toString());
			
			assertEquals("Test", user.getName());
			
			// TODO Swagger-Springfox (develop-2.0 + 2.1.2-M2 + 2.1.2-M1) with Swagger-1.2: Enum seems not yet supported (https://github.com/springfox/springfox/issues/668)
			//assertEquals(User.StateEnum.ACTIVE, user.getState());
			
			assertEquals(2, user.getCategories().size());
			assertEquals("Category 1", user.getCategories().get(0).getName());
			assertEquals("Category 2", user.getCategories().get(1).getName());

			assertEquals(1, user.getLocations().size());
			assertEquals(-122.40406, user.getLocations().get(0).getLongitude());
			assertEquals(37.78199, user.getLocations().get(0).getLatitude());

			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	public void testNotFound() {
		
		try {
			UserApi api = new UserApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			User user = api.getUser(new Long(2));
			assertNull(user);
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	


}
