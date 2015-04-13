package at.fwd.swagger.spring.demo.user;



import static org.junit.Assert.*;
import io.swagger.client.ApiException;
import io.swagger.client.api.UserApi;
import io.swagger.client.api.UsercompletepostcompleteApi;
import io.swagger.client.model.ShowcaseDatatypePrimitives;
import io.swagger.client.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

public class UserCompletePostApi_post_Test extends AbstractTestCase {
	
	@Test
	public void testSuccess() throws ParseException {
		
//		try {
			UsercompletepostcompleteApi api = new UsercompletepostcompleteApi();
			api.setBasePath("http://localhost:8080/");
			
			User user = new User();
			user.setName("Test Post");
			// TODO: 
			//api.saveUserComplete(new Long(2), user);
			
//		} catch (ApiException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
		
	}
	
	

}
