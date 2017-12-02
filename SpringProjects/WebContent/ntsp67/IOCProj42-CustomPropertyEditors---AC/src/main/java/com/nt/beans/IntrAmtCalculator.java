package com.nt.beans;

public class IntrAmtCalculator {
	private IntrAmtDetails details;
	
	public void setDetails(IntrAmtDetails details) {
		this.details = details;
	}
	
	public float calculateIntrAmount(){
		return (details.getpAmt()*details.getTime()*details.getRate())/100.0f;
	}

}
