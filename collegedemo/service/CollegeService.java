package com.college.education.collegedemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.education.collegedemo.entity.College;
import com.college.education.collegedemo.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	CollegeRepository cr;
	
	public List<College> getAllCollege() {		
	List<College> sList =new ArrayList();
	cr.findAll().forEach(sList::add);
		return sList;
	
	}

	public College getCollege(String clName) {

		return cr.findById(clName).get();
		
	}

	public void addCollege(College clName) {
		cr.save(clName);		
	}
	public void updateCollege(College t, String clName) {
		cr.save(t);
		
	}
	public void deleteCollege(String clName) {
		cr.deleteById(clName);
  		
}

}















