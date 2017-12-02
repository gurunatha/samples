package com.nt.beans;

public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}
	
	public final void deliver(int orderId){
		System.out.println("BlueDart is delivering orderId::"+orderId+" products");
	}

}
