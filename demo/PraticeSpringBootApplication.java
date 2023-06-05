package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PraticeSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PraticeSpringBootApplication.class, args);
		Car ca=context.getBean(Car.class);
		ca.connect();
		Car ca2=context.getBean(Car.class);
		ca2.connect();
	}

}
