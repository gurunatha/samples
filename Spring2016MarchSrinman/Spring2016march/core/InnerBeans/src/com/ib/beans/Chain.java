package com.ib.beans;

public class Chain {
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
		return "Chain [id=" + id + ", type=" + type + "]";
	}

}
