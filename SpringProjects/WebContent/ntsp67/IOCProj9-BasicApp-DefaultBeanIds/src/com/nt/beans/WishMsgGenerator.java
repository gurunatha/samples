package com.nt.beans;

import java.util.Date;

public class WishMsgGenerator {
	//bean property
	private Date date;
	
	static{
		System.out.println("WishMsgGenerator:static block");
	}

	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator:0-paaram constructor");
	}
	 //setter method for setter injection..
	public void setDate(Date date) {
		System.out.println("WishMsgGenerator:setDate(-)");
		this.date = date;
	}
	
	//B.method 
	public String  generateWishMsg(String uname){
		System.out.println("WishMsgGenerator:generateWishMsg(-):::"+date);
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
