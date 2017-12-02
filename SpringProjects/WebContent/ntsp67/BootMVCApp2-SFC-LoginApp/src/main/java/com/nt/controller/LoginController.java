package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.cmd.UserCommand;

@Controller
public class LoginController {

	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public  String showForm(Map<String,Object> map){
		//create Command class obj and make it as model attribute
		map.put("userCmd",new UserCommand());
		return "login";
	}
}
