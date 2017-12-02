package com.abpp.beans;

public class EmployeeVO extends GenericVO {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", salary=" + salary
				+ ", lastModifiedDt=" + lastModifiedDt + ", createdDt="
				+ createdDt + "]";
	}

}