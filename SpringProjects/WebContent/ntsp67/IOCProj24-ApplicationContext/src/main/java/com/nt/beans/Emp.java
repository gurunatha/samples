package com.nt.beans;

public class Emp {
	private int empNo;
	private String empName;
	private Dept dept;
	public Emp() {
		System.out.println("Emp:0-param constructor");
	}
	public void setEmpNo(int empNo) {
		System.out.println("Emp:setEmpNo(-)");
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		System.out.println("Emp:setEmpName(-)");
		this.empName = empName;
	}
	public void setDept(Dept dept) {
		System.out.println("Emp:setDept(-)");
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + "]";
	}
}//class
