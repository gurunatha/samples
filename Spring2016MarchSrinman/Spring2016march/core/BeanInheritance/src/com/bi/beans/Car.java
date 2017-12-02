package com.bi.beans;

import java.beans.ConstructorProperties;

public class Car {
	private int id;
	private String manufacturer;
	private String model;
	private String color;
	private String fuelType;

	@ConstructorProperties({ "id", "manufacturer", "model", "color", "fuelType" })
	public Car(int id, String manufacturer, String model, String color,
			String fuelType) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", manufacturer=" + manufacturer + ", model="
				+ model + ", color=" + color + ", fuelType=" + fuelType + "]";
	}

}
