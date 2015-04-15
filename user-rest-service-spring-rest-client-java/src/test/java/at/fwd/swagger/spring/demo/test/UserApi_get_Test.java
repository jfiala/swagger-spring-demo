package at.fwd.swagger.spring.demo.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UserApi;
import io.swagger.client.model.User;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class UserApi_get_Test   {
	
	UserApi api;
	
	@Before
	public void setup() {
		api = new UserApi();
		api.setBasePath("http://localhost:8080/");
		
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			User user = api.getUser(new Long(1));
			assertNotNull(user);
			System.out.println ("response: " + user.toString());
			
			assertEquals("Test", user.getName());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
		

}
