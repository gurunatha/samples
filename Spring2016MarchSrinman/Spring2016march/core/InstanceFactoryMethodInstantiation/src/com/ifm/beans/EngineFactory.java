package com.ifm.beans;

public class EngineFactory {
	public IEngine createEngine(String manufacturer) {
		IEngine engine = null;

		if (manufacturer.equals("yamaha")) {
			engine = new YamahaEngineImpl();
		} else if (manufacturer.equals("suzki")) {
			engine = new SuzkiEngineImpl();
		}
		return engine;
	}
}
