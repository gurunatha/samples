package com.nt.beans;

public class DTDC {
	
	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}
	
	public void deliver(int orderId){
		System.out.println("DTDC is delivering orderId::"+orderId+" products");
	}

}
