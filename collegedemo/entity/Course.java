package com.college.education.collegedemo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String desp;
	
	//Many courses to a single college
	
	@ManyToOne
	College college;

	public Course() {

	 super();
	
	}

	public Course(String id, String name, String desp, String clName) {
		super();
		this.id = id;
		this.name = name;
		this.desp = desp;
		this.college = new College(clName,"","","");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getName() {  
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
	
}
