package at.fwd.swagger.spring.demo.user;


import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudApi;
import io.swagger.client.model.Category;
import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.omg.PortableServer.POAManagerPackage.State;

public class GetUserTest extends TestCase {
	
	
	public void testSuccess() {
		
		try {
			UsercrudApi api = new UsercrudApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			User user = api.getUserUsingGET(new Long(1));
			assertNotNull(user);
			System.out.println ("response: " + user.toString());
			
			assertEquals("Test", user.getName());
			
			assertEquals(User.StateEnum.ACTIVE, user.getState());
			
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
			UsercrudApi api = new UsercrudApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			api.getUserUsingGET(new Long(2));
			fail("should fail");
			
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
		}
		
	}
	

}
