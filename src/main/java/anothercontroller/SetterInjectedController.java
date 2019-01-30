package anothercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.faizal.didemo.service.GreetingService;

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}