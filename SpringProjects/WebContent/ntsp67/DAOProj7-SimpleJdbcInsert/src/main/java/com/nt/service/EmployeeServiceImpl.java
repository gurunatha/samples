package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	
	 public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}


	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		 //Convert DTO to BO
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto,bo);
		 //use DAO
		count=dao.insert(bo);
		if(count==1)
			return "Registration Successful";
		else
			return "Registration failed";
	}//method
}//class
