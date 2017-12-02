package com.ib.beans;

public class BiCycle {
	private int id;
	private String manufacturer;
	private Chain chain;

	public BiCycle(int id, String manufacturer) {
		this.id = id;
		this.manufacturer = manufacturer;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "BiCycle [id=" + id + ", manufacturer=" + manufacturer
				+ ", chain=" + chain + "]";
	}

}
