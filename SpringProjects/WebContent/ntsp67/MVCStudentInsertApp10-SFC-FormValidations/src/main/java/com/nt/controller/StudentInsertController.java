package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCmd;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;

public class StudentInsertController extends SimpleFormController {
	private StudentInsertService service;
	
	public void setService(StudentInsertService service) {
		this.service = service;
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		 StudentDTO dto=null;
		 String result=null;
		 StudentCmd cmd=null;
		 //typecasting
		 cmd=(StudentCmd)command;
		 //generate application logic errors
		 if(cmd.getSadd().equals("usa-trump")){
			 errors.rejectValue("sadd","sadd.reject");
			 return  showForm(request, errors, "student");
		 }
		//convert Command class obj to DTO class object 
		 dto=new StudentDTO();
		 BeanUtils.copyProperties(cmd, dto);
		 //use service class
		 result=service.register(dto);
	    	 return new ModelAndView(getSuccessView(),"resMsg",result);
		 //return new ModelAndView("result","resMsg",result);
	}//onSubmit(-,-,-,-)
	
	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	  return  new ModelAndView("dbl_post");
	}
	
	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
	    StudentCmd cmd=null;
	    System.out.println("StudentInsertController:formBacking(-)");
	    cmd=new StudentCmd();
	    cmd.setSadd("vizag");
	    cmd.setSno(111);
	    cmd.setSname("rajesh");
	    return cmd;
	}

}//class
