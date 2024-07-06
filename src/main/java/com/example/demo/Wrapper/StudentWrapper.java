package com.example.demo.Wrapper;


public class StudentWrapper {
	private int sId;
	private String sName;
	private String sEmail;
	private long sPhone;
	private String cName;
	private String cType;
	private int cDuration;
	private double cFee;
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
	public long getsPhone() {
		return sPhone;
	}
	public void setsPhone(long sPhone) {
		this.sPhone = sPhone;
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
		return "StudentWrapper [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sPhone=" + sPhone
				+ ", cName=" + cName + ", cType=" + cType + ", cDuration=" + cDuration + ", cFee=" + cFee + "]";
	}
	
	
	
	
}
