package com.nt.beans;

public class Bike {
	 private String bikeId;
	 private String make;
	 private String engineCC;
	 private String color;
	 //setters & getters
	public void setBikeId(String bikeId) {
		this.bikeId = bikeId;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", make=" + make + ", engineCC=" + engineCC + ", color=" + color + "]";
	}
	
}
