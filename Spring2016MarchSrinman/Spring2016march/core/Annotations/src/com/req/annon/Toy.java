package com.req.annon;

import org.springframework.beans.factory.annotation.Required;

public class Toy {
	private int id;
	private String description;

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Toy [id=" + id + ", description=" + description + "]";
	}

}
