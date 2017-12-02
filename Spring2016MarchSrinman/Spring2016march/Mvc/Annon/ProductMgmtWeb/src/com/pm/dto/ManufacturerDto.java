package com.pm.dto;

public class ManufacturerDto {
	private int manufacturerId;
	private String name;

	public ManufacturerDto(int manufacturerId, String name) {
		this.manufacturerId = manufacturerId;
		this.name = name;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
