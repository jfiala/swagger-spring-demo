package at.fwd.swagger.spring.demo.user;


import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudresponseentityApi;
import io.swagger.client.model.User;
import junit.framework.TestCase;

public class GetUserResponseEntityTest extends TestCase {
	
	
	public void testSuccess() {
		
		try {
			UsercrudresponseentityApi api = new UsercrudresponseentityApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			try {
				User user = (User)api.getUserResponseEntityUsingGET(new Long(1));
			
			} catch (ApiException e) {
				System.out.println("code: " + e.getCode() + ", text: " + e.getMessage());
				e.printStackTrace();
			}
//			
//			User user = (User)response.getBody();
//			System.out.println ("user: " + user.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	

}
