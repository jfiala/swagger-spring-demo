package at.fwd.swagger.spring.demo.user;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import io.swagger.client.ApiException;
import io.swagger.client.api.UserwithresponseentityApi;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

public class UserResponseEntityApi_Test  extends AbstractTestCase {
	
	UserwithresponseentityApi api; 
	
	@Before
	public void setup() {
		api = new UserwithresponseentityApi();
		api.setBasePath("http://localhost:8080/");
	}
	
	@Test
	public void testSuccess() {
		
		UserwithresponseentityApi api = new UserwithresponseentityApi();
		api.setBasePath("http://localhost:8080/");

		try {
			Map<String, Object> user = (Map<String, Object>) api.getUserResponseEntity(new Long(1));
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
			api.getUserResponseEntity(new Long(3));
			fail("should fail");
			
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
			assertEquals( "User has not been found", e.getMessage());
		}
		
	}

}
