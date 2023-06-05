package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	List<Student> StudentList =Arrays.asList(new Student("103","prasanna","9346596869","kvdc"),new Student("234","bhavani","9704267248","BN Reddy"),new Student("456","bhagya","8179994274","BJPSY"));
	
	
	public List<Student> getAllStudents() {
		
		return StudentList;
	}


	public Student getStudent(String id) {
//		
//		for(int i=0;i<StudentList.size();i++) {
//			Student res =Student.get(i);
//			if(res.getId()=="103") {
//				return res;
//			}
		
	 Student Student2= StudentList.stream().filter(a->a.getId().equals(id)).findFirst().get();
			return Student2;
	}


	public void addStudent(Student t) {
		StudentList.add(t);         		
	}
	public void updateStudent(Student t, String aid) {
		for(int i=0;i<StudentList.size();i++) {
			 Student res=StudentList.get(i);
		if(res.getId().equals(aid)) {
			StudentList.set(i, t);
		}
		}
		
	}


	public void deleteStudent(String eid) {
		StudentList.removeIf(a->a.getId().equals(eid));
                          		
	}
	
	}
	
		 
	 

	

