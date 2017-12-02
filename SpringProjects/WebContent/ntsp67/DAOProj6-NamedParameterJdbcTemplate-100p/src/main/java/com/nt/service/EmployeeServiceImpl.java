package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Named("empService")
public class EmployeeServiceImpl implements EmployeeService {
	 @Resource
	private  EmployeeDAO dao;

	@Override
	public String searchEmpNameByNo(int no) {
		String name=null;
		//use dao
		name=dao.findEmpNameByNo(no);
		return name;
	}

	@Override
	public EmployeeDTO searchEmpDetailsByNo(int no) {
		EmployeeDTO dto=null;
		EmployeeBO bo=null;
		//use DAO
		bo=dao.findEmpDetailsByNo(no);
		//copy BO to DTO
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) {
		String result=null;
		int count=0;
		EmployeeBO bo=null;
		//Convert dto to BO
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
      count=dao.insert(bo);		
       if(count==0)
		 return "Registration failed";
       else
    	   return "Registration succeded";
	}//method
}//class
