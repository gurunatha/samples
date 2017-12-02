package com.pgm.bo;

public class ProductBo {
	protected int productId;
	protected String name;
	protected String description;
	protected String manufacturer;
	protected float price;

	public ProductBo() {
		// no-op
	}

	public ProductBo(int productId, String name, String description,
			String manufacturer, float price) {
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
