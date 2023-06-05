package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {
	
	private String ipAddress;
	private String Speed;
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getSpeed() {
		return Speed;
	}
	public void setSpeed(String speed) {
		Speed = speed;
	}
	
	public void SwitchOFF() {
		System.out.println("SwitchOff the connection");
		
	}

}
