package at.fwd.swagger.spring.demo.user;


import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudApi;
import io.swagger.client.model.User;
import junit.framework.TestCase;

public class GetUserTest extends TestCase {
	
	
	public void testSuccess() {
		
		try {
			UsercrudApi api = new UsercrudApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			User user = api.getUser(new Long(1));
			assertNotNull(user);
			System.out.println ("response: " + user.toString());

		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	public void testNotFound() {
		
		try {
			UsercrudApi api = new UsercrudApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			api.getUser(new Long(2));
			fail("should fail");
			
		} catch (ApiException e) {
			e.printStackTrace();
			assertEquals(404, e.getCode());
		}
		
	}
	

}
