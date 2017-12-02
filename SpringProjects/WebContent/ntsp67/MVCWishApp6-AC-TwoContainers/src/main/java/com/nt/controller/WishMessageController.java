package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishMessageService;

public class WishMessageController  extends AbstractController {
	private WishMessageService service;
	
	public void setService(WishMessageService service) {
		this.service = service;
	}

	@Override
	public  ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String msg=null;
		//Use Service
		msg=service.generateWishMessage();
		//add result to model attribute
		return new ModelAndView("result","wMsg",msg);
	}//method
}//class
