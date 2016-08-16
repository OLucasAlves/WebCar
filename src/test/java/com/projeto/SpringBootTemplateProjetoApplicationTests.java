package com.projeto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.projeto.WebCarApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebCarApplication.class)
@WebAppConfiguration
public class SpringBootTemplateProjetoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
