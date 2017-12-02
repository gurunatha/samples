package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int eno;
	private String ename;
	private String eadd;
	private float bSalary;
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
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public float getbSalary() {
		return bSalary;
	}
	public void setbSalary(float bSalary) {
		this.bSalary = bSalary;
	}

}
