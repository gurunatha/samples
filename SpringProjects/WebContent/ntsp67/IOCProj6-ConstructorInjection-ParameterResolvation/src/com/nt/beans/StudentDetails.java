package com.nt.beans;

import java.beans.ConstructorProperties;

public class StudentDetails {
	private int sno;
	private String sname;
	private float avg;
	
	//@ConstructorProperties(value={"sno","stname","avg"})  only in spring 3.x
	public StudentDetails(int sno, String stname, float avg) {
		System.out.println("StudentDetails:3-param cosntructor");
		this.sno = sno;
		this.sname = stname;
		this.avg = avg;
	}
	
	
	public String toString() {
		return "StudentDetails [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}


}
