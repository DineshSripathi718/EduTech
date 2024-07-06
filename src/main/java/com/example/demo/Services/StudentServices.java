package com.example.demo.Services;


import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.DAOLayer.CourseDAO;
import com.example.demo.DAOLayer.StudentDAO;
import com.example.demo.Entities.Courses;
import com.example.demo.Entities.Student;
import com.example.demo.Regex.RegexChecker;
import com.example.demo.RequestClass.StudentRequest;
import com.example.demo.Wrapper.StudentWrapper;
import com.example.demo.Wrapper.WrappingStudent;

@Service
public class StudentServices {
	//DAO Service
	@Autowired
	CourseDAO cDAO;
	@Autowired
	StudentDAO sDAO;
	
	Student student;
	
	Courses course;
	
	
	
	//will save the student details into database by taking the course details and will be added to student
	public ResponseEntity<Student> saveStudent(StudentRequest student) {
		System.err.println(student);
		if(RegexChecker.isEmailValid(student.getStudent()) && RegexChecker.isPasswordValid(student.getStudent())) {
			this.course = cDAO.findBycNameAndcType(student.getcName(), student.getcType());
			this.student = student.getStudent();
			this.student.getCourse().add(this.course);
			System.err.println(this.student);
			sDAO.save(this.student);
			return new ResponseEntity<>(this.student, HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>(this.student, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	//Service which will wrap the required data into wrapper class
	public ResponseEntity<StudentWrapper> getStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student = null;
		try {
			student = sDAO.findById(id);
			return new ResponseEntity<>(WrappingStudent.StudentWrap(student), HttpStatus.ACCEPTED);
		}catch(Exception e) {
			return new ResponseEntity<>(WrappingStudent.StudentWrap(student), HttpStatus.BAD_REQUEST);
		}
	}
	
	//will send all the student details 
	public ResponseEntity<List<StudentWrapper>> getAllStudents(){
		List<Student> students = null;
		try {
			students = sDAO.findAll();
			return new ResponseEntity<>(WrappingStudent.GetAllStudentsWrapper(students), HttpStatus.ACCEPTED);
		}catch(Exception e) {
			return new ResponseEntity<>(WrappingStudent.GetAllStudentsWrapper(students), HttpStatus.BAD_REQUEST);
		}
	}
}
