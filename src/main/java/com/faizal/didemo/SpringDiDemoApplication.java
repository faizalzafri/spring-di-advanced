package com.faizal.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.faizal.didemo.controller.ConstructorInjectedController;
import com.faizal.didemo.controller.MyController;
import com.faizal.didemo.controller.PropertyInjectedController;
import com.faizal.didemo.controller.SetterInjectedController;

@SpringBootApplication
public class SpringDiDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDiDemoApplication.class, args);

	}

}
