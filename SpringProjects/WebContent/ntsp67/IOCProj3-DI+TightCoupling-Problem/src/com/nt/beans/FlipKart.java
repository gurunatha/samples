package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	//private DTDC dtdc;
	private BlueDart blueDart;
	
	public void setBlueDart(BlueDart blueDart) {
		System.out.println("BlueDart:setBlueDart");
		this.blueDart = blueDart;
	}


	public FlipKart() {
		System.out.println("FlipKart::0-param constructor");
	}
	

	/*public void setDtdc(DTDC dtdc) {
		System.out.println("FlipKart:setDtdc(-)");
		this.dtdc = dtdc;
	}*/
	
	public String shopping(String[] items){
		Random random=null;
		int orderId=0;
		System.out.println("Shopping with FlipKart the items are "+Arrays.toString(items));
		random=new Random();
		orderId=random.nextInt(10000);
		//deliver products
		//dtdc.deliver(orderId);
		blueDart.deliver(orderId);
		return "orderId Bill Amt :::"+items.length*1000;
	}//method

}//class
