package com.faizal.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.faizal.didemo.controller.ConstructorInjectedController;
import com.faizal.didemo.controller.MyController;
import com.faizal.didemo.controller.PropertyInjectedController;

import anothercontroller.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages= {"anothercontroller","com.faizal.didemo"})
public class SpringDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
