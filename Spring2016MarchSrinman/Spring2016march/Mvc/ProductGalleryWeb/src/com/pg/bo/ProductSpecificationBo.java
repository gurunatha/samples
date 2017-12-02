package com.pg.bo;

import java.util.ArrayList;
import java.util.List;

public class ProductSpecificationBo {
	protected int productId;
	protected String name;
	protected String type;
	protected float price;
	protected String offerType;
	protected int manufacturerId;
	protected List<SpecificationBo> specifications;

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

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public List<SpecificationBo> getSpecifications() {
		if(specifications == null) {
			specifications = new ArrayList<SpecificationBo>();
		}
		return specifications;
	}

}
