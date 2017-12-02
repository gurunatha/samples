package com.nt.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	
   @Autowired
  private LoginService service;	

	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String  showFormPage(Map<String,Object> map){
		map.put("userCmd",new UserCommand());
		return "login";
	}
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public  String processFormPage(Map<String,Object> map,
			                                                  @Valid  @ModelAttribute("userCmd") UserCommand cmd,
			                                                    BindingResult errors){
		
	   UserDTO dto=null;
	   dto=new UserDTO();
	   String result=null;
	   if(errors.hasErrors()){
		   return "login";
	   }
	  //Convert Command obj to DTO
		BeanUtils.copyProperties(cmd,dto);
		//use service
		result=service.authenticate(dto);
		map.put("result", result);
		return "login";
   }//method
}//class