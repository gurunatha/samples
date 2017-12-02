package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.EmployeeCmd;
import com.nt.dto.EmployeeDTO;
import com.nt.service.ListEmpService;

public class EditEmployeeController extends SimpleFormController {
	
	private ListEmpService service;
	
	 public void setService(ListEmpService service) {
			this.service = service;
		}

	
	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
            int no=0;
            EmployeeDTO dto=null;
            EmployeeCmd cmd=null;
		// read employee no given by edit hyperlink
            no=Integer.parseInt(request.getParameter("eno"));
          //use service
            dto=service.searchEmployeeByNo(no);
            //convert DTO object Command object
            cmd=new EmployeeCmd();
            BeanUtils.copyProperties(dto,cmd);
            return cmd;
	}//method
	
	@Override
	public  ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		 EmployeeCmd cmd=null;
		 EmployeeDTO dto=null;
		 String editMsg=null;
		 ModelAndView mav=null;
		 List<EmployeeDTO> listDTO=null;
		//Convert Command obj to DTO object
		cmd=(EmployeeCmd)command;
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use Service class
		editMsg=service.modifyEmployeeByNo(dto);
		listDTO=service.getAllEmps();
		//create and return ModelAndView object
		mav=new ModelAndView();
		mav.addObject("msg",editMsg);
		mav.addObject("listEmps",listDTO);
		mav.setViewName("list_emps");
		return mav; 
	}
	
}//class
