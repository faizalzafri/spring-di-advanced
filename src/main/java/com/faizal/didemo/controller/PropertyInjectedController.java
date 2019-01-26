package com.faizal.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.faizal.didemo.service.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
	@Autowired
	public GreetingServiceImpl greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
