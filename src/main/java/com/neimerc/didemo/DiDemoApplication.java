package com.neimerc.didemo;

import com.neimerc.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = ctx.getBean("myController", MyController.class);

		String greeting = myController.hello();

		System.out.println(greeting);
	}

}
