package at.fwd.swagger.spring.demo.user;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.ConnectorfacebookuserApi;
import io.swagger.client.model.FacebookUser;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;




public class FacebookApi_get_Test extends AbstractTestCase {
	
	ConnectorfacebookuserApi api;
	
	@Before
	public void setup() {
		api = new ConnectorfacebookuserApi();
		api.setBasePath("http://localhost:8080/");
		
	}
	
	@Test
	public void testSuccess() throws ParseException {
		
		try {
			
			FacebookUser user = api.findByName("pivotalsoftware");
			assertNotNull(user);
			System.out.println ("response: " + user.toString());
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
}
