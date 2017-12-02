package com.nt.service;

import java.sql.SQLException;

public class PriceCalculator {
	
	public float calculatePrice(float rate,float qty)throws SQLException{
		if(rate<=0 || qty<=0)
			  throw new SQLException("Invalid inputs");
		else
			return rate*qty;
	}

}
