package com.nt.comps;

public class BlueDart implements Courier {

	@Override
	public final void deliver(int orderId) {
	 System.out.println("BlueDart: delivering orderId:"+orderId+" order items");

	}

}
