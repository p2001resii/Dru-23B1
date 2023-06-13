package com.college.education.collegedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.education.collegedemo.entity.College;
import com.college.education.collegedemo.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService cs;
	
	@RequestMapping("/College")
	public List<College> getAllCollege(){
		return cs.getAllCollege();
	}
	
	
	@RequestMapping("/College/{data}")
	public College getCollege(@PathVariable("data") String clName) {
		return cs.getCollege(clName);
	}
	@PostMapping("/College")
	public void addCollege(@RequestBody College t) {
		cs.addCollege(t);
	}
	
	@PutMapping("/College/{clName}")
	public void updateCollge(@RequestBody College t , @PathVariable String  clName){
		cs.updateCollege(t,clName); 
	}
	@DeleteMapping("/College/{clName}")
	public void DeleteCollege(@PathVariable("clName") String clName) {
		cs.deleteCollege(clName);
	}
		
}
	
		
	
	


