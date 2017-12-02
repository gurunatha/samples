package com.nt.service;

import java.util.Calendar;

public class OrderApprover {
	
	public String  approveOrder(int orderId){
		Calendar calendar =null;
		int month=0;
		//get system date
		calendar=Calendar.getInstance();
		//get current month
		month=calendar.get(Calendar.MONTH);
		if(month>=7 && month<=10)
			return orderId+" order is Rejected";
		else
			return orderId+" order is Approved";
	}//method
}//class
