package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeSalaryService;
import com.nt.vo.EmployeeVO;

public class EmployeeControllerServlet extends HttpServlet {
	BeanFactory factory=null;
	@Override
	public void init() throws ServletException {
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       String eno=null,ename=null,eadd=null,bsalary=null;
       EmployeeVO vo=null;
       EmployeeDTO dto=null;
       EmployeeSalaryService service=null;
       String paySlipMsg=null;
       RequestDispatcher rd=null;
		//read form data
       eno=req.getParameter("teno");
       ename=req.getParameter("tename");
       eadd=req.getParameter("teadd");
       bsalary=req.getParameter("tesalary");
    
       //prepare VO class obj having form data
       vo=new EmployeeVO();
       vo.setEno(eno);
       vo.setEname(ename);
       vo.setEadd(eadd);
       vo.setBSalary(bsalary);
       //Convert VO class obj to DTO class obj 
      dto=new EmployeeDTO();
      dto.setEno(Integer.parseInt(vo.getEno()));
      dto.setEname(vo.getEname());
      dto.setEadd(vo.getEadd());
      dto.setbSalary(Float.parseFloat(vo.getBSalary()));
      //get SErvice class obj
      service=factory.getBean("empService",EmployeeSalaryService.class);
      //use Serivce
      try{
    	  paySlipMsg=service.generatePaySlip(dto);
      }
      catch(Exception e){
    	  rd=req.getRequestDispatcher("/error_page.jsp");
    	  rd.forward(req,res);
    	  return;
      }
      //keee result in request scope
      req.setAttribute("salaryDetails",paySlipMsg);
      //forward to salary_details.jsp
      rd=req.getRequestDispatcher("/salary_details.jsp");
      rd.forward(req,res);
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   doGet(req,res);
	}//doPost(-,-)
	
	@Override
	public void destroy() {
		factory=null;
	}

}//class
