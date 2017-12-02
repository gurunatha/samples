package com.ca.bo;

import java.util.Date;

public class ManufacturerBo {
	private int manufacturerId;
	private String name;
	private String brandName;
	private Date establishedDate;

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	@Override
	public String toString() {
		return "ManufacturerBo [manufacturerId=" + manufacturerId + ", name="
				+ name + ", brandName=" + brandName + ", establishedDate="
				+ establishedDate + "]";
	}

}
