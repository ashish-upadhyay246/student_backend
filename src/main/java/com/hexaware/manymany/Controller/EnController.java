package com.hexaware.manymany.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.manymany.Entity.Course;
import com.hexaware.manymany.Entity.Enrollment;
import com.hexaware.manymany.Entity.Student;
import com.hexaware.manymany.Service.CoService;
import com.hexaware.manymany.Service.EnService;
import com.hexaware.manymany.Service.StuService;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/enrollment")
public class EnController {
	
	@Autowired
	private EnService eser;
	@Autowired CoService coService;
	@Autowired StuService stuService;
	
	//add an enrollment
	@GetMapping("/add/{sid}/{cid}")
	public Enrollment add(@PathVariable int sid, @PathVariable int cid) {
		Course course=coService.getCourseById(cid);
		Student student=stuService.getStudentById(sid);
		Enrollment e=new Enrollment();
		e.setCourse(course);
		e.setStudent(student);
		return eser.add(e);
	}
	
	//get all enrollments
	@GetMapping("/get")
	public List<Enrollment> get(){
		return eser.get();
	}
	
	//get enrollment by course id
	@GetMapping("/get/{eid}")
	public Enrollment getCourse(@PathVariable int eid){
		return eser.getCourse(eid);
	}
	
	//delete an enrollment by eId
	@DeleteMapping("/delet/{eId}")
	public String delete(@PathVariable int eId) {
		String s=eser.delete(eId);
		return s;
	}
	
	@PutMapping("/update/{eid}/{sid}")
	public Enrollment update(@PathVariable int eid, @PathVariable int sid) {
		return eser.update(eid,sid);
		
	}
	

}
