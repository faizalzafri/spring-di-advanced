package com.faizal.didemo.controller;

import com.faizal.didemo.service.GreetingService;

public class ConstructorInjectedController {
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
