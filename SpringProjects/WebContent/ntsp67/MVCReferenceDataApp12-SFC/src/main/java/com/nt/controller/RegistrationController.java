package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class RegistrationController extends SimpleFormController {
	
	
	@Override
	public  Map<String,List<String>> referenceData(HttpServletRequest request) throws Exception {
		 List<String> countriesList=null,hobbiesList=null,coursesList=null;
		 Map<String,List<String>> map=null;
		 //construct additional dynamically here(u can actually get from DB s/w)
		 countriesList=new ArrayList<String>();
		 countriesList.add("india");countriesList.add("USA"); 
		 countriesList.add("Srilanka"); countriesList.add("UK");
		 
		 hobbiesList=new ArrayList();
		 hobbiesList.add("stamp Collection"); hobbiesList.add("air force");
		 hobbiesList.add("meditation");  hobbiesList.add("gossiping");
		 
		 coursesList= new  ArrayList();
		 coursesList.add("java");coursesList.add(".net"); coursesList.add("php");
		 coursesList.add("hadoop");
		 
		 // Add multiple values of Additional DAta to Map Collection
		 map=new HashMap();
		 map.put("countriesList",countriesList);
		 map.put("coursesList",coursesList);
		 map.put("hobbiesList",hobbiesList);
		 
		 return map;
	}//method
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		 ModelAndView mav=null;
		//create MAV object
		 mav=new ModelAndView();
		 mav.addObject("cmdData",command);
		 mav.setViewName("result");
		 return mav;
	}

}//class
