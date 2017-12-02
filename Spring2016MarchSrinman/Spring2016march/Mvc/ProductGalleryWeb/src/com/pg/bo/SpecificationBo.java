package com.pg.bo;

public class SpecificationBo {
	protected int specificationId;
	protected String specificationName;
	protected String description;

	public SpecificationBo(int specificationId, String specificationName,
			String description) {
		this.specificationId = specificationId;
		this.specificationName = specificationName;
		this.description = description;
	}

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

}
