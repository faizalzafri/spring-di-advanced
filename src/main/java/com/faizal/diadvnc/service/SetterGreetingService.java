package com.faizal.diadvnc.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - I was injected by the getter";
	}
}