package com.sc.beans;

public class Car {
	private IEngine engine;

	public Car(IEngine engine) {
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("driving car...");
	}

}
