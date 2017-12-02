package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.EmployeeCmd;
import com.nt.dto.EmployeeDTO;
import com.nt.service.ListEmpService;

public class InsertEmployeeController extends SimpleFormController {
	
	private ListEmpService service;
	
	 public void setService(ListEmpService service) {
			this.service = service;
		}

	
	@Override
	public  ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		EmployeeDTO dto=null;
		EmployeeCmd cmd=null;
		String insertMsg=null;
		List<EmployeeDTO> listDTO;
		ModelAndView  mav=null;
		//convert Command  to DTO
		cmd=(EmployeeCmd)command;
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use service
		insertMsg=service.registerEmployee(dto);
		listDTO=service.getAllEmps();
		//create and return MAV
		mav=new ModelAndView();
		mav.addObject("listEmps",listDTO);
		mav.addObject("msg",insertMsg);
		mav.setViewName("list_emps");
		return mav;
	}
	
}//class
