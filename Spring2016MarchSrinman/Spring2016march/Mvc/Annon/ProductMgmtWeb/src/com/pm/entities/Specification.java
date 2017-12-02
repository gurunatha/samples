package com.pm.entities;

public class Specification {
	private int specificationId;
	private String specificationName;
	private String description;
	private Product product;

	public int getSpecificationId() {
		return specificationId;
	}

	public void setSpecificationId(int specificationId) {
		this.specificationId = specificationId;
	}

	public String getSpecificationName() {
		return specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
