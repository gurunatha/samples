package com.bi.beans;

public class Bus {
	private int id;
	private String manufacturer;
	private String model;
	private String color;
	private String fuelType;

	public void setId(int id) {
		this.id = id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", manufacturer=" + manufacturer + ", model="
				+ model + ", color=" + color + ", fuelType=" + fuelType + "]";
	}

}
