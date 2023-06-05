package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	 @Autowired
	 StudentService sd;
	 @RequestMapping("/Student")
	public List<Student> getAllStudents(){
		
		//Student sd=new Student();
		return sd.getAllStudents();
	 }
	 @RequestMapping("/Student/{data}")
	 public Student getStudent(@PathVariable("data")String id) {
		 return sd.getStudent(id);
		 
	 }
	 @PostMapping("/topic")
	 public void addStudent(@RequestBody Student t) {
		 sd.addStudent(t);
		 
	 }
	 
	 @PutMapping("/Student/{id}")
	 public void updateStudent(@RequestBody Student t ,@PathVariable String id) {
		 sd.updateStudent(t,id);
	 }
	 @DeleteMapping("/Student/{id}")
	 public void deleteStudent(@PathVariable("id")String eid) {
		 sd.deleteStudent(eid);
	 }
	 
		
		
	}
	
	
	


