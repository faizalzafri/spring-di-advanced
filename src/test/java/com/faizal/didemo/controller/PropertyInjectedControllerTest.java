package com.faizal.didemo.controller;

import org.junit.Before;
import org.junit.Test;

import com.faizal.didemo.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		System.out.println(propertyInjectedController.sayHello());
	}
}
