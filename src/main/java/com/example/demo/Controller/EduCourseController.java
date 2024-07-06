package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Courses;
import com.example.demo.Services.CourseServices;

@RestController
@RequestMapping(path="/achieversIt/course")	
public class EduCourseController {
	//service class
	@Autowired
	CourseServices cService;

	//Get Method
	@GetMapping("")
	public String achieversIt() {
        return "achieversIt";
    }
	@GetMapping("/allCourses")
	public List<Courses> allCourses() {
		return cService.getAllCourses();
	}
	
	@GetMapping(path="{course}")
	public List<Courses> getByCourseName(@PathVariable("course") String course){
		return cService.getByCName(course);
	}
	
	@GetMapping(path="type/{cType}")
	public List<Courses> getByCourseType(@PathVariable("cType") String cType){
		return cService.getBycourseType(cType);
	}
	//Post Method
	@PostMapping(path="/saveCourse")
	public Courses saveCourse(@RequestBody Courses course){
		return cService.saveCourse(course);
	}
	
	//Put method
	@PutMapping(path="/updateCourse")
	public Courses updateCourse(@RequestBody Courses course) {
		System.out.println(course);
		return cService.updateCourse(course);
	}
	
	//Delete Method
	@DeleteMapping("/deleteCourse")
	public String deleteCourse(@RequestBody Courses course) {
		System.out.println(course);
		return cService.deleteCourse(course);
	}
}
