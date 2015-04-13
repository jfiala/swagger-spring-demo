package at.fwd.swagger.spring.demo.user;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudcompletepostApi;
import io.swagger.client.model.User;

import java.text.ParseException;

import org.junit.Test;

public class UserCRUDCompleteApi_post_Test extends AbstractTestCase {
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			UsercrudcompletepostApi api = new UsercrudcompletepostApi();
			api.setBasePath("http://localhost:8080/");
			
			Long id = new Long(2);
			String newName =  "Test Post";
			User user = new User();
			user.setId(id);
			user.setName(newName);
			
			User response = api.user_complete_post_completePost(user);
			
			assertEquals(id, response.getId());
			assertEquals(newName, response.getName());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	

}
