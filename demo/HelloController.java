package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String SayHello() {
		return "welcome prasanna";
	}
	@RequestMapping("/1234")
	public int number() {
		return 123;
	}
	

}
