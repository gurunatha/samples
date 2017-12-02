package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		 Calendar calendar=null;
		 int hour=0;
		 String msg=null;
		 ModelAndView mav=null;
		 //get System Date
		 calendar=Calendar.getInstance();
		 //get current hour of the day
		 hour=calendar.get(Calendar.HOUR_OF_DAY);
		 if(hour<=12)
			 msg="Good Morning";
		 else if(hour<=16)
			 msg="Good AfterNoon";
		 else if(hour<=20)
			 msg="Good Evening";
		 else
			 msg="Good Night";
         //create and return MAV
		 //mav=new ModelAndView("result","wishMsg",msg);
		 mav=new ModelAndView();
		 mav.setViewName("result");
		 mav.addObject("wishMsg",msg);
		return mav;
	}//handleRequest(-,-)
}//class
