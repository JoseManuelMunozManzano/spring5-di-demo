package com.neimerc.didemo;

import com.neimerc.didemo.controllers.ConstructorInjectedController;
import com.neimerc.didemo.controllers.MyController;
import com.neimerc.didemo.controllers.PropertyInjectedController;
import com.neimerc.didemo.controllers.SetterInjectedController;
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

		System.out.println("---------- Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean("propertyInjectedController", PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter");
		SetterInjectedController setterInjectedController = ctx.getBean("setterInjectedController", SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------- Constructor");
		ConstructorInjectedController constructorInjectedController = ctx.getBean("constructorInjectedController", ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
