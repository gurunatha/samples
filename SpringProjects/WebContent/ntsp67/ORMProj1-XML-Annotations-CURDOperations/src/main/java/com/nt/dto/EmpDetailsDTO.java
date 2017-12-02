package com.nt.dto;

import java.io.Serializable;

public class EmpDetailsDTO implements Serializable {
	private int eno;
	private String ename;
	private String job;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [eno=" + eno + ", ename=" + ename + ", job=" + job + "]";
	}
  

}
