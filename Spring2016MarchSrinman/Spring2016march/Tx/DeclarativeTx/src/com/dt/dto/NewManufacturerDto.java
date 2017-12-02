package com.dt.dto;

import java.io.Serializable;
import java.util.Date;

public class NewManufacturerDto implements Serializable {
	protected int manufacturerId;
	protected String manufacturerName;
	protected String brandName;
	protected Date estDate;
	protected int productId;
	protected String productName;
	protected String type;
	protected float price;
	protected int productManufacturerId;

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Date getEstDate() {
		return estDate;
	}

	public void setEstDate(Date estDate) {
		this.estDate = estDate;
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

	public int getProductManufacturerId() {
		return productManufacturerId;
	}

	public void setProductManufacturerId(int productManufacturerId) {
		this.productManufacturerId = productManufacturerId;
	}

}
