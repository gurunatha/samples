package com.q.bo;

public class SpecificationBo {
	private int id;
	private String name;
	private String descr;

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

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Override
	public String toString() {
		return "SpecificationBo [id=" + id + ", name=" + name + ", descr="
				+ descr + "]";
	}

}
