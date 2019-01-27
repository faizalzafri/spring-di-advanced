package com.faizal.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.faizal.didemo.service.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	//@Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl;

	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
}
