package com.nt.beans;

public class Address {
	private String houseNo;
	private String street;
	private String area;
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", area=" + area + "]";
	}
	

}
