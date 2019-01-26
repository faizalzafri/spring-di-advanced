package com.faizal.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO = "Hello World";

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return HELLO;
	}

}
