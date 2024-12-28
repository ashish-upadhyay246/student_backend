package com.hexaware.manymany.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.manymany.Entity.Enrollment;
import com.hexaware.manymany.Entity.Student;
import com.hexaware.manymany.Repository.CoRepo;
import com.hexaware.manymany.Repository.EnRepo;
import com.hexaware.manymany.Repository.StuRepo;

@Service
public class EnService {

	@Autowired
	private EnRepo erep;
	
	@Autowired CoRepo crep;
	@Autowired StuRepo srep;
	
	public Enrollment add(Enrollment e) {
		return erep.save(e);
	}

	//get all enrollments
	public List<Enrollment> get() {
		return erep.findAll();
	}

	//get enrollments by course id
	public Enrollment getCourse(int eid) {
		return erep.findById(eid).orElse(null);
	}
	
	//delete an enrollment
	public String delete(int eId) {
		Enrollment e=erep.findById(eId).orElse(null);
		if(e!=null)
		{
			erep.delete(e);
			return "Enrollment Deleted.";
		}
		else {
			return "Enrollment not found.";
		}
	}
	
	//update student id for a given course id
	public Enrollment update(int eid, int sid) {
		Enrollment e=erep.findById(eid).orElse(null);
		Student s=srep.findById(sid).orElse(null);
		if(e!=null) {
			e.setStudent(s);
			return erep.save(e);
			
		}
		return e;
	}

}
