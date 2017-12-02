package com.idr.beans;

public class Receiver100HZ implements Receiver {
	@Override
	public void tune(int band) {
		System.out.println("100hz receiver is tunning to : " + band);
	}
}
