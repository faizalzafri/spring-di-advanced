package com.faizal.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.faizal.didemo.service.GreetingService;

@Controller
public class SetterInjectedController {

	@Autowired
	@Qualifier("setterGreetingService")
	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
