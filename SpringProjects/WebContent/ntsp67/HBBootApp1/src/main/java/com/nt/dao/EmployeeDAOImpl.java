package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.domain.Employee;
@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private HibernateTemplate ht;
  private static final String HB_EMP="from Employee";
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=null;
		list=(List<Employee>) ht.find(HB_EMP, null);
		return list;
	}

}
