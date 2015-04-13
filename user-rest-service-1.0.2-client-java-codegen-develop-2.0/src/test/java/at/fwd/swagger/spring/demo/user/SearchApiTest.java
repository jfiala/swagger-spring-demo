package at.fwd.swagger.spring.demo.user;


import static org.junit.Assert.*;
import io.swagger.client.api.SearchApi;
import io.swagger.client.model.User;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

public class SearchApiTest extends AbstractTestCase {
	
	@Test
	public void testSuccess() {
		
		try {
			SearchApi api = new SearchApi();
			api.setBasePath("http://localhost:8080/");		
			
			List<User> users = api.searchUsers("T");
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
