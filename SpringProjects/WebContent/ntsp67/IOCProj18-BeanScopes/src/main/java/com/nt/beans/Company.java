package com.nt.beans;

public class Company {
	
	public Company() {
		System.out.println("Company:0-param constructor");
	}
	
	public String getISORating(String name){
		if(name.equals("POLARIS"))
			return "ISO-9002";
		else if(name.equals("CTS"))
			return "ISO-9003";
		else
			return "No Rating found";
	}//method
}//class
