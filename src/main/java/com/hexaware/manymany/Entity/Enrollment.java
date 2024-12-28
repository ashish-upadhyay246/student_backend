package com.hexaware.manymany.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Enrollment {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private Course course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Enrollment(int id, Student student, Course course) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", student=" + student + ", course=" + course + "]";
	}
	
	public Enrollment() {}

}
