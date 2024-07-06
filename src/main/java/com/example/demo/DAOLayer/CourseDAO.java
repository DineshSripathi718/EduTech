package com.example.demo.DAOLayer;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entities.Courses;

public interface CourseDAO extends JpaRepository<Courses, Integer>{
	
	@Query("SELECT c FROM Courses c WHERE cName=:cName AND cType=:cType")
	Courses findBycNameAndcType(String cName, String cType);

	List<Courses> findBycName(String course);

	List<Courses> findBycType(String cType);

}
