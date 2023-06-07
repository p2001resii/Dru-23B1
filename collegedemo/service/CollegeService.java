package com.college.education.collegedemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.college.education.collegedemo.entity.College;

@Service
public class CollegeService {
	List<College> collegelist = new ArrayList<> (Arrays.asList(new College("kvdc","mpcs","nrt","987654321"),new College("svdc","bipc","MTM","876543213")));

	public List<College> getAllCollege() {
		return collegelist;
	}

	public College getCollege(String clName) {

		College college = collegelist.stream().filter(a->a.getClName().equals(clName)).findFirst().get();
		return college;
	}

	public void addCollege(College t) {
		collegelist.add(t);		
	}
	public void updateCollege(College t, String clName) {
		for(int i=0;i<collegelist.size();i++) {
			College res=collegelist.get(i);
			if(res.getClName().equals(clName));
			collegelist.set(i, t);
		}
	}
	public void deleteCollege(String clName) {
		collegelist.removeIf(a->a.getClName().equals(clName));		
	}			
}
















