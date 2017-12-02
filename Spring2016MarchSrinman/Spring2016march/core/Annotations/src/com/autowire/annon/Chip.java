package com.autowire.annon;

public class Chip {
	private int id;
	private String family;

	public void setId(int id) {
		this.id = id;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	@Override
	public String toString() {
		return "Chip [id=" + id + ", family=" + family + "]";
	}

}
