package com.wwn.beans;

public class Person {
	private String ssn;
	private String name;

	public Person(String ssn) {
		super();
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + "]";
	}

}
