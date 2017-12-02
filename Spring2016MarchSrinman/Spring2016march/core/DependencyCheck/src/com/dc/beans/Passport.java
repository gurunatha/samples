package com.dc.beans;

public class Passport {
	private int passportNo;
	private String firstName;
	private String lastName;

	public Passport() {
		System.out.println("Passport created...");
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public void setFirstName(String firstName) {
		System.out.println("setFirstName()");
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}

}
