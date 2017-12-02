package com.pg.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsDto {
	protected int productId;
	protected String name;
	protected float price;

	protected List<String> specifications;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<String> getSpecifications() {
		if (specifications == null) {
			specifications = new ArrayList<String>();
		}
		return specifications;
	}

}
