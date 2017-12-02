package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmpSearchService;

@Controller
public class EmpSearchController{
	@Autowired
	 private  EmpSearchService service;

	
	@RequestMapping("/searchEmps.htm")
	public String search(Map<String,Object> map,@ModelAttribute("searchCmd") SearchCommand cmd){ 
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
		  //create model attributes
		  map.put("empList",listRDTO);
		 //return MAV object
		  return "list_emps";
	}
}
