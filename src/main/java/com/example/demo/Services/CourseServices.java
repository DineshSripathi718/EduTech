package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAOLayer.CourseDAO;
import com.example.demo.Entities.Courses;

@Service
public class CourseServices {
	
	//DAO
	@Autowired
	CourseDAO cDAO;
	
	public List<Courses> getAllCourses() {
		return cDAO.findAll();
	}
	
	public Courses saveCourse(Courses course) {
		System.err.println(course);
		cDAO.save(course);
		return course;
	}

	public List<Courses> getByCName(String course) {
		// TODO Auto-generated method stub
		System.err.println(course);
		return cDAO.findBycName(course);
	}

	public List<Courses> getBycourseType(String cType) {
		// TODO Auto-generated method stub
		System.err.println(cType);
		return cDAO.findBycType(cType);
	}

	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method student
		cDAO.save(course);
		return course;
	}

	public String deleteCourse(Courses course) {
		// TODO Auto-generated method stub
		cDAO.delete(course);
		return "Deleted !";
	}
}
