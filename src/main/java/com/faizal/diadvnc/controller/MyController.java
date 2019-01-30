package com.faizal.diadvnc.controller;

import org.springframework.stereotype.Controller;

import com.faizal.diadvnc.service.GreetingService;

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
