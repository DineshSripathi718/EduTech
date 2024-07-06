package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Student;
import com.example.demo.RequestClass.StudentRequest;
import com.example.demo.Services.StudentServices;
import com.example.demo.Wrapper.StudentWrapper;

@RestController
@RequestMapping(path="/achieversIt/student")
public class EduStudentController {
	
	
	//Service class
	@Autowired
    StudentServices sService;
	
	//intro page
	@GetMapping(path="")
	public String Home() {
		return "Welcome to Student Portal";
	}
	
	//fetch student details using the id with the help of student wrapper class
	@GetMapping(path="/getStudent/{id}")
	public ResponseEntity<StudentWrapper> getStudent(@PathVariable int id) {
        return sService.getStudent(id);
    }
	
	//fetch all the students details that are available in database
	@GetMapping(path="/getStudent/all")
	public ResponseEntity<List<StudentWrapper>> getAllStudents() {
        return sService.getAllStudents();
    }
	
	//will save the student details into the database
	@PostMapping(path="saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody StudentRequest student) {
		return sService.saveStudent(student);
	}
}
