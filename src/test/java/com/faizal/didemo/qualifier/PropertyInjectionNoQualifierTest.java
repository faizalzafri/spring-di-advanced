package com.faizal.didemo.qualifier;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.faizal.didemo.controller.PropertyInjectedController;

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
		System.out.println(controller2.sayHello());

	}
}
