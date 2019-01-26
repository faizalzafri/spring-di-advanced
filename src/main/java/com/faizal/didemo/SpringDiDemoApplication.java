package com.faizal.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.faizal.didemo.controller.MyController;

@SpringBootApplication
public class SpringDiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext apct = SpringApplication.run(SpringDiDemoApplication.class, args);
		MyController controller = (MyController) apct.getBean("myController");
		controller.hello();
	}

}
