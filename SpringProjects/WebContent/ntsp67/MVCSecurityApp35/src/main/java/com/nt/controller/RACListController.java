package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class RACListController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<String> racList=null;
		//prepare model data
		racList=new ArrayList<String>();
		racList.add("S1-20,S1-23,S1-45,S1-67");
		racList.add("S2-21,S2-45,S2-78,S2-78");
		//add to model attribute
		return new ModelAndView("rac_list","racList",racList); 
	}//method

}//class
