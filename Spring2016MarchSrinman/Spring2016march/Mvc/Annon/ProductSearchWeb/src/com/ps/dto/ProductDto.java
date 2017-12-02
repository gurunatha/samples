package com.ps.dto;

public class ProductDto {
	private int productId;
	private String productName;
	private String manufacturer;
	private float price;

	public ProductDto(int productId, String productName, String manufacturer,
			float price) {
		this.productId = productId;
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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
