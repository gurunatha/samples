package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	private  Courier courier;
	
		private FlipKart() {
		System.out.println("FlipKart::0-param constructor");
	}

	public  void setCourier(Courier courier) {
		System.out.println("FlipKart::setCourier(-)");
		this.courier = courier;
	}
	
	public String shopping(String[] items){
		Random random=null;
		int orderId=0;
		System.out.println("Shopping with FlipKart the items are "+Arrays.toString(items));
		random=new Random();
		orderId=random.nextInt(10000);
		//deliver products
		//dtdc.deliver(orderId);
		courier.deliver(orderId);
		return "orderId Bill Amt :::"+items.length*1000;
	}//method

}//class
