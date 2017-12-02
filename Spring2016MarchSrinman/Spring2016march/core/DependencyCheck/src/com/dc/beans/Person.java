package com.dc.beans;

public class Person {
	private String ssn;
	private Passport passport;

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", passport=" + passport + "]";
	}

}
