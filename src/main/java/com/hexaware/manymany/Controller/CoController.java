package com.hexaware.manymany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.manymany.Entity.Course;
import com.hexaware.manymany.Service.CoService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/course")
public class CoController {
	@Autowired
	private CoService cser;

	@PostMapping("/add")
	public Course add(@RequestBody Course c)
	{
		return cser.add(c);
	}
}
