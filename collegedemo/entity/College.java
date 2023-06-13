package com.college.education.collegedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	
	@Id
	private String clName;
	private String clGroups;
    private String clCity;
    private String clPhoneNo;
    
	public College() {
		super();
	}
	public College(String clName, String clGroups, String clCity, String clPhoneNo) {
		super();
		this.clName = clName;
		this.clGroups = clGroups;
		this.clCity = clCity;
		this.clPhoneNo = clPhoneNo;
	}
	public String getClName() {
		return clName;
	}
	public void setClName(String clName) {
		this.clName = clName;
	}
	public String getClGroups() {
		return clGroups;
	}
	public void setClGroups(String clGroups) {
		this.clGroups = clGroups;
	}
	public String getClCity() {
		return clCity;
	}
	public void setClCity(String clCity) {
		this.clCity = clCity;
	}
	public String getClPhoneNo() {
		return clPhoneNo;
	}
	public void setClPhoneNo(String clPhoneNo) {
		this.clPhoneNo = clPhoneNo;
	}
	
  
    

	
    
    
   
    
    
    
     
    
	

}
