package com.example.springboot;

import com.example.springboot.service.TestTableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void contextLoads() {
		TestTableService service = (TestTableService) context.getBean("TestTableService");
		Assert.notNull(service,"application not null");
	}

}
