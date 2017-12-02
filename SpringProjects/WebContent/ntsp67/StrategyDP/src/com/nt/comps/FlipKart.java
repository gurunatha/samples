package com.nt.comps;

import java.util.Random;

public class FlipKart {

	private Courier courier;
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String shopping(String []items){
		int orderId=0;
		// generate OrderId
		orderId=new Random().nextInt(1000);
		courier.deliver(orderId);
		return "OrderId"+orderId+" billAmt::"+items.length*1000;
	}

	

}
