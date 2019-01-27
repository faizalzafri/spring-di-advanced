package com.faizal.didemo.qualifier;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.faizal.didemo.controller.SetterInjectedController;
import com.faizal.didemo.service.GreetingServiceImpl;

public class SetterInjectionQualifierTest {
	private ApplicationContext apct;

	@Before
	public void setUp() {
		apct = new AnnotationConfigApplicationContext("com.faizal.didemo");

	}

	@Test
	public void testSetterInjectedControllerAutoDI() {
		SetterInjectedController controller3 = (SetterInjectedController) apct.getBean(SetterInjectedController.class);
		assertEquals("Injected by the setter", controller3.sayHello());

	}
}
