package com.bs.beans;

public class BiCycle {
	private int serialno;
	private String manufacturer;

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "BiCycle [serialno=" + serialno + ", manufacturer="
				+ manufacturer + "]";
	}

}
