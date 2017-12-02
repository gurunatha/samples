package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.FlipKart;

public class FlipKartFactory {
	
	public static FlipKart createFlipKartWithCourier(String courierName){
		FlipKart flipKart=null;
	    Courier courier=null;
		if(courierName.equals("dtdc")){
			flipKart=new FlipKart();
			courier=new DTDC();
			flipKart.setCourier(courier);
		}
		else if(courierName.equals("blueDart")){
			flipKart=new FlipKart();
			courier=new BlueDart();
			flipKart.setCourier(courier);
		}
		else{
			throw new IllegalArgumentException("UnAvailable courier");
		}
		return flipKart;
	}
}//class
