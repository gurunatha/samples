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
}//class
