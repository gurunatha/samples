package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class GenerateReportController extends AbstractController {
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<String> list=null;
		String report=null;
		//construct data /get Data
		list=new ArrayList();
		list.add("raja"); list.add("rani"); list.add("jani"); list.add("begum");
		//read request param value
		report=req.getParameter("report");
		if(report.equals("pdf")){
			return new ModelAndView("pdfView","namesList",list);
		}
		else{
			return new ModelAndView("excelView","namesList",list);
		}
	}//handleRequestInternal(-,-,-)
}//class
