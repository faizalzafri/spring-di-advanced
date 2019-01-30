package com.faizal.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.faizal.didemo.service.GreetingRepository;
import com.faizal.didemo.service.GreetingService;
import com.faizal.didemo.service.GreetingServiceFactory;

@Configuration
public class GreetingConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}

	@Bean
	@Primary
	@Profile({ "default", "en" })
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}

	@Bean
	@Primary
	@Profile("es")
	GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}

	@Bean
	@Primary
	@Profile("de")
	GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}
}
