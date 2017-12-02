package com.nt.beans;

import java.util.Arrays;

public class Student {
	private String marks[];
	
	public void setMarks(String[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + "]";
	}
	
	
	

}
