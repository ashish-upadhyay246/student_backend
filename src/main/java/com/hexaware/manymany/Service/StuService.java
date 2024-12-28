package com.hexaware.manymany.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.manymany.Entity.Student;
import com.hexaware.manymany.Repository.StuRepo;

@Service
public class StuService {

	@Autowired
	private StuRepo srep;
	
	//add student
	public Student add(Student s) {
		return srep.save(s);
	}

	public Student getStudentById(int sid) {
		return srep.findById(sid).get();
	}

}
