package com.faizal.didemo.controller;

import org.springframework.stereotype.Controller;

import com.faizal.didemo.service.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello!!! ");

		return greetingService.sayGreeting();
	}
}
