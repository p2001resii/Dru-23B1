package com.college.education.collegedemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.college.education.collegedemo.entity.Course;

public interface CourseRepository extends CrudRepository<Course,String>{
	
	List<Course> findByCollegeClName(String clName);
}
