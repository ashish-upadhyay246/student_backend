package com.hexaware.manymany.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.manymany.Entity.Enrollment;

@Repository
public interface EnRepo extends JpaRepository <Enrollment, Integer>{

	@Query("select c from Enrollment c where c.course.id=:cid")
	List<Enrollment> getByCourseId(int cid);

}
