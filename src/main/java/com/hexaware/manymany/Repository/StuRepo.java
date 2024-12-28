package com.hexaware.manymany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.manymany.Entity.Student;

@Repository
public interface StuRepo extends JpaRepository <Student, Integer>{

}
