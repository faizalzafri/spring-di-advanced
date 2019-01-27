package com.faizal.didemo.qualifier;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.faizal.didemo.controller.PropertyInjectedController;
import com.faizal.didemo.service.GreetingServiceImpl;

public class PropertyInjectionNoQualifierTest {
	private ApplicationContext apct;

	@Before
	public void setUp() {
		apct = new AnnotationConfigApplicationContext("com.faizal.didemo.*");

	}

	@Test
	public void testPropertyInjectedControllerAutoDI() {
		PropertyInjectedController controller2 = (PropertyInjectedController) apct
				.getBean(PropertyInjectedController.class);
		assertNotEquals(GreetingServiceImpl.HELLO, controller2.sayHello());

	}
}
