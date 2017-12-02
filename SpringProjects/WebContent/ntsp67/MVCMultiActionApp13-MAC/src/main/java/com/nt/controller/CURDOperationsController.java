package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.UserCommand;

public class CURDOperationsController extends MultiActionController {
	
/*	public  Map<String,String>  insert(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		
      Map<String,String> map=null;
      map=new HashMap();
      map.put("operation","insert operation");
      return map;
		
	}*/
	
	public  ModelAndView  insert(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		
		return  new ModelAndView("user","operation","insert opeation");
		}
	
	public  ModelAndView  update(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		
		return  new ModelAndView("user","operation","update opeation");
		
	}
	
	public  ModelAndView  delete(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		
		return  new ModelAndView("user","operation","delete opeation");
		
	}
	
public  ModelAndView  view(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
		
		return  new ModelAndView("user","operation","view opeation");
		
	}

public  ModelAndView  invalid(HttpServletRequest req,HttpServletResponse res,UserCommand cmd){
	
	return  new ModelAndView("user","operation","invalid opeation");
	
}




}
