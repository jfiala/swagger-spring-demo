package at.fwd.swagger.spring.demo.user;



import static org.junit.Assert.*;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudApi;
import io.swagger.client.api.UsercrudcompletepostApi;
import io.swagger.client.model.User;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

public class UserApi_post_Test extends AbstractTestCase {
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			UsercrudApi api = new UsercrudApi();
			api.setBasePath("http://localhost:8080/");
			
			String newName =  "Test Post";
			User user = api.userPost(new Long(4), newName);
			
			assertEquals(newName, user.getName());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
