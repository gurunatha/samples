package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmpSearchService;

public class EmpSearchController extends AbstractCommandController {
	 private  EmpSearchService service;

	public void setService(EmpSearchService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd, BindException be)
			throws Exception {
		SearchCommand command=null;
		SearchDTO dto=null;
		List<SearchResultDTO> listRDTO;
		//typecasting
		command=(SearchCommand)cmd;
		//Convert Command obj to DTO object
		dto=new SearchDTO();
		BeanUtils.copyProperties(command,dto);
		//use Service
		  listRDTO=service.find(dto);
		 //return MAV object
		  return new ModelAndView("list_emps","empList",listRDTO);
	}
}
