package com.ifm.beans;

public class Car {
	private IEngine engine;

	public void drive() {
		engine.start();
		System.out.println("driving...");
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

}
