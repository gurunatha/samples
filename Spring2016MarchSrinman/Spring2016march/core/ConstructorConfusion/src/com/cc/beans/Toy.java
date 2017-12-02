package com.cc.beans;

import java.beans.ConstructorProperties;

public class Toy {
	private int id;
	private String description;
	private int price;

	@ConstructorProperties({ "description", "price" })
	public Toy(String description, int price) {
		this.description = description;
		this.price = price;
	}

	@ConstructorProperties({ "id", "description" })
	public Toy(int id, String description) {
		this.id = id;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Toy [id=" + id + ", description=" + description + ", price="
				+ price + "]";
	}

}
