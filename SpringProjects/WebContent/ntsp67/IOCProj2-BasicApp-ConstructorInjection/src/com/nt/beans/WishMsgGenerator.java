package com.nt.beans;

import java.util.Date;

public class WishMsgGenerator {
	//bean property
	private Date date;
	

	public WishMsgGenerator(Date date1) {
		System.out.println("WishMsgGenerator:1- param constructor");
		this.date = date1;
	}

	//B.method 
	public String  generateWishMsg(String uname){
		System.out.println("WishMsgGenerator:generateWishMsg(-)"+date);
		int hour=0;
		//get current hour of the day
		hour=date.getHours();
		//generate Wish Msg
		if(hour<=12)
			return "GM:"+uname;
		else if(hour<=16)
			return "GA:"+uname;
		else if(hour<=20)
			return "GE:"+uname;
		else 
			return "GN:"+uname;
	}//method
}//class
