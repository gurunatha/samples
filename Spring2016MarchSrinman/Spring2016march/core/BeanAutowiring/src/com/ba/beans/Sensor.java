package com.ba.beans;

public class Sensor {
	private int id;
	private String manufacturer;

	public void setId(int id) {
		this.id = id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Sensor [id=" + id + ", manufacturer=" + manufacturer + "]";
	}

}
