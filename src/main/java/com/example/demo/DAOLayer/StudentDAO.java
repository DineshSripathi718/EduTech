package com.example.demo.DAOLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Student;

public interface StudentDAO extends JpaRepository<Student, Integer> {
	
}
