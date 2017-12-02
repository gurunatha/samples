package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class RACListController {
	
	
	@RequestMapping("/home.htm")
	public String showHomePage(){
		return "home";
	}

	@RequestMapping("/racList.htm")
	public ModelAndView handleRequestInternal() {
		List<String> racList=null;
		//prepare model data
		racList=new ArrayList<String>();
		racList.add("S1-20,S1-23,S1-45,S1-67");
		racList.add("S2-21,S2-45,S2-78,S2-78");
		//add to model attribute
		return new ModelAndView("rac_list","racList",racList); 
	}//method

}//class
