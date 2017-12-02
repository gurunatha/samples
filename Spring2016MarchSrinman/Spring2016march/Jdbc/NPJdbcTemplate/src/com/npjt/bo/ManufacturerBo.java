package com.npjt.bo;

import java.util.Date;

public class ManufacturerBo {
	private int id;
	private String name;
	private String brandName;
	private Date estDate;

	public ManufacturerBo(int id, String name, String brandName, Date estDate) {
		this.id = id;
		this.name = name;
		this.brandName = brandName;
		this.estDate = estDate;
	}

	public ManufacturerBo() {
		super();
	}

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

	@Override
	public String toString() {
		return "ManufacturerBo [id=" + id + ", name=" + name + ", brandName="
				+ brandName + ", estDate=" + estDate + "]";
	}

}
