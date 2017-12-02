package com.nt.service;

public class IntrAmountCalculator {
	
	public float calcIntrAmount(float pAmt , float rate, float time){
		return  (pAmt*rate*time)/100.0f;
	}

}
