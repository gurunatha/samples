package com.pac.beans;

public class Sim {
	private String simNo;
	private String storageCapacity;

	public Sim(String simNo, String storageCapacity) {
		this.simNo = simNo;
		this.storageCapacity = storageCapacity;
	}

	@Override
	public String toString() {
		return "Sim [simNo=" + simNo + ", storageCapacity=" + storageCapacity
				+ "]";
	}

}
