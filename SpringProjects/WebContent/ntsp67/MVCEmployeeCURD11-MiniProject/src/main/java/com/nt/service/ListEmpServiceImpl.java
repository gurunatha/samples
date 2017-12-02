package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.ListEmpsDAO;
import com.nt.dto.EmployeeDTO;

public class ListEmpServiceImpl implements ListEmpService {

	private ListEmpsDAO dao;
	
	 public void setDao(ListEmpsDAO dao) {
		this.dao = dao;
	}
	 
	@Override
	public List<EmployeeDTO> getAllEmps() {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=null;
		EmployeeDTO dto=null;
		//use DAO
		listBO=dao.retriveEmployees();
		//covert listBO to listDTO
		listDTO=new ArrayList<>();
		for(EmployeeBO bo:listBO){
			//copy each BO to each DTO
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		}//for
		return listDTO;
	}//method

	@Override
	public EmployeeDTO searchEmployeeByNo(int no) {
		EmployeeBO bo=null;
		EmployeeDTO dto=null;
		  //use DAO
		bo=dao.getEmployeeByNo(no);
		//convert BO to DTO
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}
	
	@Override
	public String modifyEmployeeByNo(EmployeeDTO dto) {
		  EmployeeBO  bo=null;
		  int count=0;
		  //convert EmployeeDTO to EmployeeBO
		  bo=new EmployeeBO();
		  BeanUtils.copyProperties(dto,bo);
	       //use DAO
		  count=dao.update(bo);
		  if(count==0)
		      return "Employee Updation failed";
		  else
			  return "Employee Updation succeded";
	}//method
	
	@Override
	public String registerEmployee(EmployeeDTO dto) {
		 EmployeeBO bo=null;
		 int count=0;
		//convert DTO to BO
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
