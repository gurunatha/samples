package com.nt.service;

import java.util.Calendar;

public class WishMessageServiceImpl implements WishMessageService {

	@Override
	public String generateWishMessage() {
		 Calendar calendar=null;
		 int hours=0;
		 //get system date
		 calendar=Calendar.getInstance();
		 //get current of the day
		 hours=calendar.get(Calendar.HOUR_OF_DAY);
		 //generate Wish Message
		 if(hours<=12)
			 return "Good Morning";
		 else if(hours<=16)
			 return "Good AfterNoon";
		 else if(hours<=20)
			 return "Good Evening";
		 else
			 return "Good Night";
	}//method
}//class
