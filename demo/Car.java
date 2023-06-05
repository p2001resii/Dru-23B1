package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Car {
	private String owner;
	private String NumberPlate;
	
	@Autowired
	InternetConnection In;
	
	
	public String getowner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getNumberPlate() {
		return NumberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		NumberPlate = numberPlate;
	}
	
	public void connect() {
		
		InternetConnection In =new  InternetConnection();
		In.SwitchOFF();
		System.out.println("connect to internet");
	}

}
