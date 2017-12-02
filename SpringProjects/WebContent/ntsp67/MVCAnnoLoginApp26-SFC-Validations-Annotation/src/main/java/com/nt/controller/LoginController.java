package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public  String processForm(Model model,@Valid @ModelAttribute("userCmd")UserCommand cmd,BindingResult errors){
		UserDTO dto=null;
		String result=null;
		if(errors.hasErrors()){
			return "login";
		}
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
	
	@ModelAttribute("dmns")
	public List<String>  listDomain(){
		List<String> domains;
		domains=new ArrayList<String>();
		domains.add("gmail.com");
		domains.add("yahoo.com");
		domains.add("hotmail.com");
		return domains;
	}
	
	@InitBinder
	public  void myInitBinder(WebDataBinder  binder){
		SimpleDateFormat sdf=null;
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
	}
}//class
