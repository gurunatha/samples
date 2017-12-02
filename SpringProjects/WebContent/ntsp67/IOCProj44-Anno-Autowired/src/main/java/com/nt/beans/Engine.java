package com.nt.beans;

public class Engine {
	private int engineId;
	private String type;
	
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void start(){
		System.out.println("engine started");
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", type=" + type + "]";
	}
	

}
