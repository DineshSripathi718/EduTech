package com.example.demo.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.example.demo.Entities.Student;

public class RegexChecker {
	public static String EmailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
	public static String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_@#$%^&+=]).{8,}$";
	
	public final static boolean isEmailValid(Student student) {
		Pattern patternEmail = Pattern.compile(EmailPattern);
		Matcher matcherEmail = patternEmail.matcher(student.getsEmail());
		System.out.println(matcherEmail.matches());
		 System.out.println("Email result "+matcherEmail.matches());
		return matcherEmail.matches();
    }
	
	public final static boolean isPasswordValid(Student student) {
		Pattern patternPassword = Pattern.compile(PasswordPattern);
        Matcher matcherPassword = patternPassword.matcher(student.getsPassword());
        System.out.println("Password result "+matcherPassword.matches());
        return matcherPassword.matches();
    
	}
}
