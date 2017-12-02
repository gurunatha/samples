package com.nt.beans;

import java.util.Date;

public class Dept {
	private int deptNo;
	private String deptName;
	private Date startDate;
	public Dept(int deptNo, String deptName, Date startDate) {
		System.out.println("Dept:3-param constructor");
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.startDate = startDate;
	}
	
	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptName=" + deptName + ", startDate=" + startDate + "]";
	}

}
