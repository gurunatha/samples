package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmployeeDTO;
import com.nt.service.ListEmpService;

public class ListEmployeeController extends AbstractController {
	private ListEmpService service;

	public void setService(ListEmpService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
         List<EmployeeDTO> listEmpDTO=null;
		//use Service class
         listEmpDTO=service.getAllEmps();
		//create and return MAV
		return new ModelAndView("list_emps","listEmps",listEmpDTO);
	}

}
