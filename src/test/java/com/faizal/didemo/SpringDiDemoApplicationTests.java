package com.faizal.didemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.faizal.didemo.controller.ConstructorInjectedController;
import com.faizal.didemo.controller.MyController;
import com.faizal.didemo.controller.PropertyInjectedController;
import com.faizal.didemo.controller.SetterInjectedController;
import com.faizal.didemo.service.GreetingServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDiDemoApplicationTests {

	private ApplicationContext apct;

	@Before
	public void setUp() {
		apct = new AnnotationConfigApplicationContext("com.faizal.didemo.*");

	}

	@Test
	public void testMyControllerAutoDI() {
		MyController controller = (MyController) apct.getBean("myController");
		assertNotEquals(GreetingServiceImpl.HELLO, controller.hello());

	}

	@Test
	public void testPropertyInjectedControllerAutoDI() {
		PropertyInjectedController controller2 = (PropertyInjectedController) apct
				.getBean(PropertyInjectedController.class);
		assertEquals(GreetingServiceImpl.HELLO, controller2.sayHello());

	}

	@Test
	public void testSetterInjectedControllerAutoDI() {
		SetterInjectedController controller3 = (SetterInjectedController) apct.getBean(SetterInjectedController.class);
		assertEquals(GreetingServiceImpl.HELLO, controller3.sayHello());

	}

	@Test
	public void testConstructorInjectedControllerAutoDI() {
		ConstructorInjectedController controller4 = (ConstructorInjectedController) apct
				.getBean(ConstructorInjectedController.class);
		assertEquals(GreetingServiceImpl.HELLO, controller4.sayHello());
	}

}
