package com.ba.beans;

public class Chip {
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
		return "Chip [id=" + id + ", type=" + type + "]";
	}

}
