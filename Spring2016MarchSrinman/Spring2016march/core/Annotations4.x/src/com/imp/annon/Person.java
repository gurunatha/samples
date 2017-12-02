package com.imp.annon;

public class Person {
	private Passport passport;
	private Address address;

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [passport=" + passport + ", address=" + address + "]";
	}

}
