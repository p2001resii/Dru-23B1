package com.college.education.collegedemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.education.collegedemo.entity.College;
import com.college.education.collegedemo.entity.Course;
import com.college.education.collegedemo.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService cr;
	
	@GetMapping("/college/{clName}/courses")
	public List<Course> getAllCourses(@PathVariable String clName){
		return cr.getAllCourses(clName);
	}
		
	@GetMapping("/college/{clName}/Courses/{id}")
	public Course getCourses(@PathVariable String id) {
		return cr.getCourse(id); 
	}
	
	@PostMapping("/college/{clName}/Courses")
	public void AddCourses(@RequestBody Course Cour,@PathVariable String clName) {
		Cour.setCollege(new College(clName,"","",""));
		cr.addCourse(Cour);
	}
	@PutMapping("/college/{clName}/Courses/{id}")
	public void updateCourse(@RequestBody Course Cour,@PathVariable String clName) {
		Cour.setCollege(new College(clName,"","",""));
		cr.updateCourse(Cour);
	}
	@DeleteMapping("college/{clName}/Courses/{id}")
	public void deleteCourse(@PathVariable String id) {
	
		cr.deleteCourse(id);
	}
	
	}
	
	



