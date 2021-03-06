package at.fwd.swagger.spring.demo.user;


import io.swagger.client.api.SearchservicesApi;
import io.swagger.client.model.User;

import java.util.List;

import junit.framework.TestCase;

public class SearchApiTest extends TestCase {
	
	
	public void testSuccess() {
		
		try {
			SearchservicesApi api = new SearchservicesApi();
			api.setBasePath("http://localhost:8080/");
			
			List<User> users = api.searchUsersUsingGET("T");
			System.out.println ("response: " + users.toString());
			
			assertTrue(users.size()>0);
			
			for (User user : users) {
				System.out.println ("user: " + user.toString());	
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	

}
