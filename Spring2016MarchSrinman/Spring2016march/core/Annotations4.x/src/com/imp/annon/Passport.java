package com.imp.annon;

public class Passport {
	private int passportNo;
	private String name;

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", name=" + name + "]";
	}

}
