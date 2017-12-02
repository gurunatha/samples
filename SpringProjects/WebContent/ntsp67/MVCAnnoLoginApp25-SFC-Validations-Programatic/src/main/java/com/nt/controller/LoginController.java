package com.nt.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;
import com.nt.validator.LoginValidator;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	@Autowired
	private LoginValidator validator;
	
	
	// for Initial phase request
	@RequestMapping(value="login.htm",method=RequestMethod.GET)
	public  String showForm(Model model){
		UserCommand cmd=null;
		//create Command class object
		cmd=new UserCommand();
		//add to Model Attribute
		model.addAttribute("userCmd",cmd);
		return "login";
	}
	
	// for postback request
	@RequestMapping(value="login.htm",method=RequestMethod.POST)
	public  String processForm(Model model,@ModelAttribute("userCmd")UserCommand cmd,
			 BindingResult errors){
		UserDTO dto=null;
		String result=null;
		//user validator
		if(validator.supports(UserCommand.class)){
			 validator.validate(cmd, errors);
		}
		
		if(errors.hasErrors())
			return "login";
		
		 //convert Cmd obj to DTO object
		dto=new UserDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use Service class
		result=service.authenticate(dto);
		//add result to Model Attribute
		model.addAttribute("result",result);
		//return LVN
		return "login";
	}//method
}//class
