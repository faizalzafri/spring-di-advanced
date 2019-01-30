package com.faizal.diadvnc.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.faizal.diadvnc.service.GreetingServiceImpl;

import anothercontroller.SetterInjectedController;

public class SetterInjectedControllerTest {

	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals("Hello - I was injected by the getter", setterInjectedController.sayHello());
	}
}
