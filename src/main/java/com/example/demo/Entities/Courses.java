package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private String cType;
	private int cDuration;
	private double cFee;
	
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public int getcDuration() {
		return cDuration;
	}

	public void setcDuration(int cDuration) {
		this.cDuration = cDuration;
	}

	public double getcFee() {
		return cFee;
	}

	public void setcFee(double cFee) {
		this.cFee = cFee;
	}

	@Override
	public String toString() {
		return "Courses [cId=" + cId + ", cName=" + cName + ", cType=" + cType + ", cDuration=" + cDuration + ", cFee="
				+ cFee + "]";
	}
	
}
