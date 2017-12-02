package com.nt.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.EmployeeDTO;
import com.nt.service.ListEmpService;

@Controller
public class ListEmployeeController{
	@Resource
	private ListEmpService service;

   @RequestMapping("/listEmps.htm")
	public String handle(Map<String,Object> map) {
         List<EmployeeDTO> listEmpDTO=null;
		//use Service class
         listEmpDTO=service.getAllEmps();
		//create Model Attribute
         map.put("listEmps", listEmpDTO);
		return "list_emps";
	}//method

}//class
