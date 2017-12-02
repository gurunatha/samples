package com.nt.beans;

import java.util.Date;

public class SecheduleRemainder {
   private Date  date;

public void setDate(Date date) {
	this.date = date;
}
public String remaind(){
	if(date.getMonth()==1 && date.getDate()==5)
		return "Plan Pongal Vacation";
	else
		return "Plan for Office";
  }//method
   
}
