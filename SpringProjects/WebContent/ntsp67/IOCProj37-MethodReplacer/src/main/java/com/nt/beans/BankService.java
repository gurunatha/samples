package com.nt.beans;

public class BankService {
	
	public  float calcIntrAmount(float pAmt,float time){
		System.out.println("BankService:calcIntrAmount(-,-)");
		return  (pAmt*time*2.0f)/100;
	}//method
}//class
