package com.hexaware.manymany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.manymany.Entity.Course;

@Repository
public interface CoRepo extends JpaRepository <Course, Integer>{

}
