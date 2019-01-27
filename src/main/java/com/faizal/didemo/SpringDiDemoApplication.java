package com.faizal.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.faizal.didemo.controller.ConstructorInjectedController;
import com.faizal.didemo.controller.SetterInjectedController;
import com.faizal.didemo.controller.MyController;
import com.faizal.didemo.controller.PropertyInjectedController;

@SpringBootApplication
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
