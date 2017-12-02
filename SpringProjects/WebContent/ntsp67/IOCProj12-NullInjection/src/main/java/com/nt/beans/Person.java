package com.nt.beans;

import java.util.Date;

public class Person {
	private int sno;
	  private String sname;
	  private String addrs;
	  private Date   dob;

	 public Person(int sno,String sname,String addrs,Date dob){
	    this.sno=sno;
	    this.sname=sname;
	    this.addrs=addrs;
	    this.dob=dob;
	   }

	@Override
	public String toString() {
		return "Person [sno=" + sno + ", sname=" + sname + ", addrs=" + addrs + ", dob=" + dob + "]";
	}
	 
	 
}
