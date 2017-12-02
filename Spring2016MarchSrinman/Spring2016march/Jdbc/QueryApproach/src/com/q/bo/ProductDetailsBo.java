package com.q.bo;

import java.util.List;

public class ProductDetailsBo {
	private int id;
	private String name;
	private String type;
	private float price;
	private List<SpecificationBo> specifications;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<SpecificationBo> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(List<SpecificationBo> specifications) {
		this.specifications = specifications;
	}

	@Override
	public String toString() {
		return "ProductDetailsBo [id=" + id + ", name=" + name + ", type="
				+ type + ", price=" + price + ", specifications="
				+ specifications + "]";
	}

}
