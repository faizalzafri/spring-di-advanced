package com.faizal.didemo.controller;

import com.faizal.didemo.service.GreetingServiceImpl;

public class PropertyInjectedController {

	public GreetingServiceImpl greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}
}
