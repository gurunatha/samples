package com.abpp.beans;

abstract public class EmployeeAgent {
	private EmployeeDao employeeDao;

	public void editEmployee(int id, String firstName, String lastName,
			double salary) {
		EmployeeVO vo = null;

		vo = lookupEmployee();
		vo.setId(id);
		vo.setFirstName(firstName);
		vo.setLastName(lastName);
		vo.setSalary(salary);

		employeeDao.updateEmployee(vo);
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	abstract public EmployeeVO lookupEmployee();
}
