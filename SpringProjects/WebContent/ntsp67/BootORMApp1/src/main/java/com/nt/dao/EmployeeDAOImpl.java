package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.domain.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String HQL_GET_ALL_EMPs=" from Employee";
	@Autowired
    private HibernateTemplate ht;
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> listEmps=null;
		//execute HQL
		listEmps=(List<Employee>) ht.find(HQL_GET_ALL_EMPs,null);
		return listEmps;
	}

}
