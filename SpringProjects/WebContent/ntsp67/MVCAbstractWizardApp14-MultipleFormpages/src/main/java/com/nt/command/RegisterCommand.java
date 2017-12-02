package com.nt.command;

public class RegisterCommand {
	private String name;
	private String fatherName;
	private String address;
	private String domain;
	private int experience;
	private  String prefferedLocation;
	private int expectedSalary;
	
	public RegisterCommand() {
		System.out.println("RegisterCommand:0-param constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPrefferedLocation() {
		return prefferedLocation;
	}
	public void setPrefferedLocation(String prefferedLocation) {
		this.prefferedLocation = prefferedLocation;
	}
	public int getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(int expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

}
