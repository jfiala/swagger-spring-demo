package at.fwd.confess.user.test;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import at.fwd.confess.user.Application;
import at.fwd.confess.user.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:0")
public class UserControllerIntegrationTest {

	@Value("${local.server.port}")
    int port;
	
	@Test
	public void test() {
		RestTemplate restTemplate = new TestRestTemplate();
		Long id = new Long(1);
		User user = restTemplate.getForObject("http://localhost:" + port + "/user?id=" + id, User.class);
		MatcherAssert.assertThat("Test", equalTo(user.getName()));
	}

}
