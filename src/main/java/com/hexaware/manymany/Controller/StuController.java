package com.hexaware.manymany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.manymany.Entity.Student;
import com.hexaware.manymany.Service.StuService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/student")
public class StuController {
	@Autowired
	private StuService sser;
	
	@PostMapping("/add")
	public Student add(@RequestBody Student s) {
		return sser.add(s);
	}

}
