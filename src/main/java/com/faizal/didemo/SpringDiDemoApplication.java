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

		ApplicationContext apct = SpringApplication.run(SpringDiDemoApplication.class, args);

		MyController controller = (MyController) apct.getBean("myController");
		System.out.println(controller.hello());

		PropertyInjectedController controller2 = (PropertyInjectedController) apct
				.getBean(PropertyInjectedController.class);
		System.out.println(controller2.sayHello());

		SetterInjectedController controller3 = (SetterInjectedController) apct.getBean(SetterInjectedController.class);
		System.out.println(controller3.sayHello());

		ConstructorInjectedController controller4 = (ConstructorInjectedController) apct
				.getBean(ConstructorInjectedController.class);
		System.out.println(controller4.sayHello());

	}

}
