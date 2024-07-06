package com.example.demo.Wrapper;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.example.demo.Entities.Courses;
import com.example.demo.Entities.Student;

public final class WrappingStudent {
	public final static StudentWrapper StudentWrap(Optional<Student> student) {
		StudentWrapper studentWrapper = new StudentWrapper();
		studentWrapper.setsId(student.get().getsId());
		studentWrapper.setsEmail(student.get().getsEmail());
		studentWrapper.setsPhone(student.get().getsPhone());
		studentWrapper.setsName(student.get().getsName());
		List<Courses> c = student.get().getCourse();
		for(Courses course : c) {
			studentWrapper.setcName(course.getcName());
            studentWrapper.setcType(course.getcType());
            studentWrapper.setcFee(course.getcFee());
            studentWrapper.setcDuration(course.getcDuration());;
		}
		System.err.println(studentWrapper+" ");
		return studentWrapper;
	}
	
	public final static List<StudentWrapper> GetAllStudentsWrapper(List<Student> students) {
		List<StudentWrapper> studentWrapper = new LinkedList<>();
		for(Student s : students) {
			StudentWrapper student = new StudentWrapper();
			student.setsId(s.getsId());
			student.setsName(s.getsName());
			student.setsEmail(s.getsEmail());
			student.setsPhone(s.getsPhone());
			List<Courses> c = s.getCourse();
			for(Courses course : c) {
				student.setcName(course.getcName());
				student.setcDuration(course.getcDuration());
				student.setcFee(course.getcFee());
				student.setcType(course.getcType());
			}
			studentWrapper.add(student);
		}
		
		return studentWrapper;
	}
}
