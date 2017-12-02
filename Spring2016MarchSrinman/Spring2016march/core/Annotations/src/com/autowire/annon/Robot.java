package com.autowire.annon;

import javax.annotation.Resource;

public class Robot {
	@Resource(name = "sensor1")
	private Sensor sensor;

	@Override
	public String toString() {
		return "Robot [sensor=" + sensor + "]";
	}

}
