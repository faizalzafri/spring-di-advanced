package com.faizal.didemo.service;

import org.springframework.beans.factory.annotation.Autowired;

public class PrimaryGreetingService implements GreetingService {
	@Autowired
	private GreetingRepository greetingRepository;

	public PrimaryGreetingService(GreetingRepository greetingRepository2) {
		// TODO Auto-generated constructor stub
		this.greetingRepository = greetingRepository2;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}
}
