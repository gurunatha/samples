package com.lmi.beans;

public class YamahaEngineImpl implements IEngine {

	@Override
	public int start() {
		System.out.println("starting yamaha engine...");
		return 1;
	}

}
