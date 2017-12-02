package com.lmi.beans;

public class SuzkiEngineImpl implements IEngine {

	@Override
	public int start() {
		System.out.println("Suzki engine started...");
		return 2;
	}

}
