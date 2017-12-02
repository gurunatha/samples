package com.autowire.annon;

public class Sensor {
	private int id;
	private String type;

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Sensor [id=" + id + ", type=" + type + "]";
	}

}
