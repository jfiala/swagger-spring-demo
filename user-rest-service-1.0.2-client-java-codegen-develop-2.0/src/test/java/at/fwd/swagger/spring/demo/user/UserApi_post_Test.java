package at.fwd.swagger.spring.demo.user;



import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UserApi;

import java.text.ParseException;

import org.junit.Test;

public class UserApi_post_Test extends AbstractTestCase {
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			UserApi api = new UserApi();
			api.setBasePath("http://localhost:8080/");
			
			api.saveUser(new Long(2), "Test Post");
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
