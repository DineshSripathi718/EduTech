package com.example.demo.Entities;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sId;
	private String sName;
	private String sEmail;
	private String sPassword;
	private long sPhone;
	
	@ManyToMany
	private List<Courses> course = new LinkedList<Courses>();

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public long getsPhone() {
		return sPhone;
	}

	public void setsPhone(long sPhone) {
		this.sPhone = sPhone;
	}

	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sPassword=" + sPassword
				+ ", sPhone=" + sPhone + ", course=" + course + "]";
	}
	
}
