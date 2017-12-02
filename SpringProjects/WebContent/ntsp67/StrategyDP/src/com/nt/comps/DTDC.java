package com.nt.comps;

public class DTDC implements Courier {

	@Override
	public final void deliver(int orderId) {
	 System.out.println("DTDC: delivering orderId:"+orderId+" order items");

	}

}
