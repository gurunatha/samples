package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.cmd.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;

	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public  String showForm(Map<String,Object> map){
		//create Command class obj and make it as model attribute
		map.put("userCmd",new UserCommand());
		return "login";
	}
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String  processForm(Map<String,Object> map ,
			                                             @ModelAttribute("userCmd") UserCommand cmd) {
		 UserDTO dto=null;
		 String result=null;
		// Convert Command object to DTO object
		 dto=new UserDTO();
		 BeanUtils.copyProperties(cmd,dto);
		 //use service
		 result=service.authenticate(dto);
		 map.put("resultMsg",result);
		 return "login";
	}
}
