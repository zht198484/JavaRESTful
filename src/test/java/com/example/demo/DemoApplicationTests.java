package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testDemo(){
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8888/demo");
        List list = webTarget.request(MediaType.APPLICATION_JSON_TYPE).get(List.class);
        Assert.assertNotNull(list);
        Assert.assertEquals("a",list.get(0));
    }

}
