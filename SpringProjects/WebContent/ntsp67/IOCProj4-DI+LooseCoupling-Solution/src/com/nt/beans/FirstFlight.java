package com.nt.beans;

public class FirstFlight implements Courier{
	
	public FirstFlight() {
		System.out.println("FirstFlight:0-param constructor");
	}
	
	public final void deliver(int orderId){
		System.out.println("FirstFlight is delivering orderId::"+orderId+" products");
	}

}
