package com.pac.beans;

public class Mobile {
	private String imei;
	private String model;
	private Sim sim;

	public void setImei(String imei) {
		this.imei = imei;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile [imei=" + imei + ", model=" + model + ", sim=" + sim
				+ "]";
	}

}
