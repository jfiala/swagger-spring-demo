package at.fwd.swagger.spring.demo.user;


import io.swagger.client.ApiException;
import io.swagger.client.api.UsercrudresponseentityApi;

import java.util.Map;

import junit.framework.TestCase;

public class GetUserResponseEntityTest extends TestCase {
	
	
	public void testSuccess() {
		
		UsercrudresponseentityApi api = new UsercrudresponseentityApi();
		api.setBasePath("http://localhost:8080/");

		try {
			Map<String, Object> user = (Map<String, Object>) api.user_with_responseentityGet(new Long(1));
			System.out.println("map: " + user);

			assertEquals("Test", user.get("name"));

		} catch (ApiException e) {
			System.out.println("code: " + e.getCode() + ", text: " + e.getMessage());
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	

}
