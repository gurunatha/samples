package com.nt.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("wish")
public class WishGenerator {
	@Resource
	private Calendar calendar;
	
	public String generateWishMsg(String user){
		int hour=0;
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY); // 24 hrs format
		//generate wish  msg
		if(hour<=12)
			return " Good Morning:::"+user;
		else if(hour<=16)
			return "Good After noon::"+user;
		else if(hour<=20)
			return "Good Evening:::"+user;
		else
			return "Good night::"+user;
	}//method
}
