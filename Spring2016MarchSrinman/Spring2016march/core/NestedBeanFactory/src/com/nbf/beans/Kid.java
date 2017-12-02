package com.nbf.beans;

public class Kid {
	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Kid [id=" + id + ", name=" + name + "]";
	}

}
