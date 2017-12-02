package com.nt.beans;

import java.util.Date;

public class Person {
	private int pid;
	private String pname;
	private Address address;
	private Date dob;
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setDob(Date dob) {
		this.dob=dob;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + ", DOB=" + dob + "]";
	}
	
	

}
