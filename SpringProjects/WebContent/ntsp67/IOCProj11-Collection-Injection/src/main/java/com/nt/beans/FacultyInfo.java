package com.nt.beans;

import java.util.Map;

public class FacultyInfo {
	private Map<String,String> facultySubjects;
	private Map<?,?> data;
	public void setFacultySubjects(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}
	public void setData(Map<?, ?> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "FacultyInfo [facultySubjects=" + facultySubjects + ", data=" + data + "]";
	}
	

}
