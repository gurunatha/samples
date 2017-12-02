package com.nt.service;

public interface IntrAmountCalculator {
	
	public float calcIntrAmount(float pAmt,float rate,float time);
	public float calcCompoundIntrAmount(float pAmt,float rate,float time);
}
