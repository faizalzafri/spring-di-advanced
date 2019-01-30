package com.faizal.diadvnc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.faizal.diadvnc.controller.MyController;
import com.faizal.diadvnc.examplebeans.TempDataSource;

@SpringBootApplication
@ComponentScan(basePackages = { "anothercontroller", "com.faizal.diadvnc" })
public class SpringDiAdvncApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiAdvncApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		TempDataSource tempDataSource = ctx.getBean(TempDataSource.class);

		System.out.println(tempDataSource.getUsername());

	}
}
