package com.college.education.collegedemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.education.collegedemo.entity.Course;
import com.college.education.collegedemo.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	 private CourseRepository crs;
	
	public List<Course> getAllCourses(String clName) {
		List<Course> CourseList =new ArrayList<>();
		crs.findByCollegeClName(clName).forEach(CourseList::add);
		return CourseList;
	}

	public Course getCourse(String id) {
		return crs.findById(id).get();
	}

	public void addCourse(Course course) {
		crs.save(course);
		
	}

	public void updateCourse(Course course) {
		crs.save(course);	
	}

	public void deleteCourse(String id) {
		crs.deleteById(id);
	}

	

}
