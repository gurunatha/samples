package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
	@RequestMapping("/wish.htm")
	public String  generateWishMessage(Map<String,Object> model){
		String msg=null;
		//use Service class
		msg=service.generateWishMsg();
		//put result in model attribute
		model.put("wishMsg",msg);
		return "result";
	}
}
