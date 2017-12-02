package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ListEmpsService;

public class MainServlet extends HttpServlet {
	ApplicationContext ctx=null;
	public void init(){
		//create IOCContainer
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String desg[]=null;
		ListEmpsService service=null;
		List<Map<String,Object>> listEmps=null;
		RequestDispatcher rd=null;
		//read form data
		desg=req.getParameterValues("desg");
	   //get Service bean
		service=ctx.getBean("empService",ListEmpsService.class);
		//use Service Bean
		listEmps=service.searchEmpsByDesg(desg);
		//keep data in request scope
		req.setAttribute("listEmps",listEmps);
		//Dispath request to result.jsp
		rd=req.getRequestDispatcher("/result.jsp");
		rd.forward(req,res);
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  doGet(req,res);
	}
	
	@Override
	public void destroy() {
		 ctx=null;
	}
}//class
