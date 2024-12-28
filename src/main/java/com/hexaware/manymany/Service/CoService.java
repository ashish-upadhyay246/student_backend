package com.hexaware.manymany.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.manymany.Entity.Course;
import com.hexaware.manymany.Repository.CoRepo;

@Service
public class CoService {
	
	@Autowired
	private CoRepo crep;

	public Course add(Course c) {
		return crep.save(c);
	}

	public Course getCourseById(int cid) {
		return crep.findById(cid).get();
		}

}
