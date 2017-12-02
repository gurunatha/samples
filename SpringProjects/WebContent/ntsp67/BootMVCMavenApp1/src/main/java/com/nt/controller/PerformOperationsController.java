package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.service.WishService;

@Controller
public class PerformOperationsController {
	@Autowired
	private WishService service;
	@RequestMapping(value="/home.htm")
	public String showHomePage(){
		return "welcome";
	}
	
	@RequestMapping(value="/wish.htm")
	public  String  handleWish(Map<String,Object> map){
		String result=null;
		//use service
		result=service.geneateWishMsg();
		map.put("result",result);
		return "result_page";
	}

}
