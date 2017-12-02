package com.nt.service;

import java.sql.SQLException;

public class BillAmountCalculator {
	
	public float calculateBill(float rate ,float qty)throws IllegalArgumentException{
		if(rate<=0 || qty<=0)
			throw new  IllegalArgumentException("Invalid inputs");
		
		return  rate*qty;
	}

}
