package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDAO;
import com.nt.domain.Employee;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
      private  EmployeeDAO dao;
	
	@Override
	public List<EmployeeDTO> findAllEmployees() {
		 List<Employee> listDmn=null;
		 List<EmployeeDTO> listDTO=null;
		 EmployeeDTO dto=null;
		 //use DAO
		 listDmn=dao.getAllEmployees();
		 //convert listDmn to listtDTO
		 listDTO=new ArrayList();
		 for(Employee dmn: listDmn){
			 dto=new EmployeeDTO();
			 BeanUtils.copyProperties(dmn,dto);
			 listDTO.add(dto);
		 }//for
		return listDTO;
	}

}
