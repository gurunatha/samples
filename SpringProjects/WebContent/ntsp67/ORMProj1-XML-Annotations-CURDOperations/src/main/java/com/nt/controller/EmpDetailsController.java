package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.EmpDetailsDTO;
import com.nt.service.EmpDetailsService;

@Component("empController")
public class EmpDetailsController {
 	 @Autowired
  private  EmpDetailsService service;
  
	public void setService(EmpDetailsService service) {
	this.service = service;
}

	public String  takeEmpDetails(int eno,String ename,String job){
		 EmpDetailsDTO dto=null;
		 String result=null;
		//create DTO class obj having inputs
		 dto=new EmpDetailsDTO();
		 dto.setEno(eno);
		 dto.setEname(ename);
		 dto.setJob(job);
		 //use Service class
		 result=service.register(dto);
		 return result;
	}//method
	
	public EmpDetailsDTO  getEmpDetails(int eno){
		//Use service
		return service.findEmpDetails(eno);
	}
	public  List<EmpDetailsDTO> getEmpDetailsByDesg(String desg){
		return service.findEmpDetailsByDesg(desg);
	}
	public String   fireEmployeesByDesg(String desg){
		return service.removeEmloyeesByDesg(desg);
	}
	
}//class

