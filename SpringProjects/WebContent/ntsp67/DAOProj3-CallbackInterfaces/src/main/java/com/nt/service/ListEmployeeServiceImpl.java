package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.ListEmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("listEmpService")
public class ListEmployeeServiceImpl implements ListEmployeeService {
	@Autowired
  private ListEmployeeDAO dao;
	
	public EmployeeDTO listEmployeeByNo(int no) {
		EmployeeDTO dto=null;
		EmployeeBO bo=null;
		//use DAO
		bo=dao.getEmpDetailsByNo(no);
		//copy BO to DTO
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		
		return dto;
	}

	public List<EmployeeDTO> listEmployeeByDesg(String desg) {
	    List<EmployeeDTO> listDTO=null;
	    List<EmployeeBO> listBO=null;
	    EmployeeDTO dto=null;
		//use DAO
	    listBO=dao.getEmpDetailsByDesg(desg);
	    // convert ListBO to ListDTO
	    listDTO=new ArrayList<EmployeeDTO>();
	    for(EmployeeBO bo:listBO){
	    	dto=new EmployeeDTO();
	    	BeanUtils.copyProperties(bo,dto);
	    	listDTO.add(dto);
	    }//for
	    
		return listDTO;
	}//method

}//class
