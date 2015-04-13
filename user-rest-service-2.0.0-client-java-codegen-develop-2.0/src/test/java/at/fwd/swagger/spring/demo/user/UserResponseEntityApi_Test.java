package at.fwd.swagger.spring.demo.user;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudresponseentityApi;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class UserResponseEntityApi_Test  extends AbstractTestCase {
	
	UsercrudresponseentityApi api; 
	
	@Before
	public void setup() {
		api = new UsercrudresponseentityApi();
		api.setBasePath("http://localhost:8080/");
	}
	
	@Test
	public void testSuccess() {
		
		try {
			Map<String, Object> user = (Map<String, Object>) api.user_with_responseentityGet(new Long(1));
			System.out.println("map: " + user);

			assertEquals("Test", (String)user.get("name"));

		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void testNotFound() {
		
		try {
			api.user_with_responseentityGet(new Long(3));
			fail("should fail");
			
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
			assertEquals( "User has not been found", e.getMessage());
		}
		
	}

}
