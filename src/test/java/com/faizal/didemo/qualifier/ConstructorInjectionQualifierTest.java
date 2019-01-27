package com.faizal.didemo.qualifier;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.faizal.didemo.controller.ConstructorInjectedController;
import com.faizal.didemo.service.GreetingServiceImpl;

public class ConstructorInjectionQualifierTest {
	private ApplicationContext apct;

	@Before
	public void setUp() {
		apct = new AnnotationConfigApplicationContext("com.faizal.didemo");

	}

	@Test
	public void testConstructorInjectedControllerAutoDI() {
		ConstructorInjectedController controller4 = (ConstructorInjectedController) apct
				.getBean(ConstructorInjectedController.class);
		assertEquals("Injected by the constructor", controller4.sayHello());
	}

}
