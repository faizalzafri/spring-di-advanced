package com.faizal.didemo.service;

public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository2) {
		// TODO Auto-generated constructor stub
		this.greetingRepository = greetingRepository2;
	}

	@Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
