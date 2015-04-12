package at.fwd.swagger.spring.demo.user;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import io.swagger.client.ApiException;
import io.swagger.client.api.UserApi;
import io.swagger.client.model.ShowcaseDatatypePrimitives;
import io.swagger.client.model.User;
import junit.framework.TestCase;

public class GetUserTest extends TestCase {
	
	
	public void testSuccess() throws ParseException {
		
		try {
			UserApi api = new UserApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			User user = api.getUser(new Long(1));
			assertNotNull(user);
			System.out.println ("response: " + user.toString());
			
			assertEquals("Test", user.getName());
			
			// TODO Swagger-Springfox (develop-2.0 + 2.1.2-M2 + 2.1.2-M1) with Swagger-1.2: Enum seems not yet supported (https://github.com/springfox/springfox/issues/668)
			//assertEquals(User.StateEnum.ACTIVE, user.getState());
			
			assertEquals(2, user.getCategories().size());
			assertEquals("Category 1", user.getCategories().get(0).getName());
			assertEquals("Category 2", user.getCategories().get(1).getName());

			assertEquals(1, user.getLocations().size());
			assertEquals(-122.40406, user.getLocations().get(0).getLongitude());
			assertEquals(37.78199, user.getLocations().get(0).getLatitude());

			// Primitives
			ShowcaseDatatypePrimitives primitives = user.getPrimitives();
			assertEquals(Byte.valueOf(Byte.MAX_VALUE).toString(), primitives.getSingleByte());
			assertEquals(Integer.valueOf((int)Short.MAX_VALUE), primitives.getTinyNumber());
			assertEquals(Integer.valueOf(Integer.MAX_VALUE), primitives.getCounter());
			assertEquals(Long.valueOf(Long.MAX_VALUE), primitives.getId());
			
			// TODO Swagger-Springfox-1.0.2: primitive type float not working yet here
			// TODO: assertEquals(Float.MAX_VALUE, primitives.getBudgetFloat());
			
			assertEquals(Double.MAX_VALUE, primitives.getBudget());
			assertEquals('\uffff', (char)primitives.getSingleCharacter().charAt(0));
			assertEquals(Boolean.FALSE, primitives.getDeleted());
			
			// Math
			assertEquals(Long.MAX_VALUE, user.getMath().getBigInteger().longValue());
			assertEquals(Double.MAX_VALUE, user.getMath().getBigDecimal().doubleValue());
			
			// Date
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			assertEquals(format.parse("2015-04-12 16:47:12.123"), user.getDate().getDate());
			// TODO Swagger-Springfox-1.0.2: Calendar not working here
			//user.getDate().getCalendar();
			
		} catch (ApiException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
	public void testNotFound() {
		
		try {
			UserApi api = new UserApi();
			api.setBasePath("http://localhost:8080/");
			
			System.out.println("basepath: " + api.getBasePath());
			
			api.getUser(new Long(2));
			fail("should fail");
			
		} catch (ApiException e) {
			assertEquals(404, e.getCode());
		}
		
	}
	

}
