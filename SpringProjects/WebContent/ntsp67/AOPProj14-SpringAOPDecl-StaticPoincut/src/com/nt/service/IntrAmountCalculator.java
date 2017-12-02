package com.nt.service;

public  class IntrAmountCalculator {
	public  float calcIntrAmount(float pAmt,float rate,float time){
		System.out.println("target method-->Simple Intrest");
		return (pAmt*rate*time)/100.0f;
	}//method
	
	public  float calcCompoundIntrAmount(float pAmt,float rate,float time){
		System.out.println("target method-->compound Intrest");
		return  (float) ((pAmt*Math.pow((1+rate/100), time))-pAmt);
	}
	
}//class
