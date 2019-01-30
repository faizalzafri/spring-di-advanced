package com.faizal.diadvnc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDiDemoApplicationTests {

	private ApplicationContext apct;

	@Before
	public void setUp() {
		apct = new AnnotationConfigApplicationContext("com.faizal.didemo.*");

	}

	@Test
	public void test() {

	}

}
