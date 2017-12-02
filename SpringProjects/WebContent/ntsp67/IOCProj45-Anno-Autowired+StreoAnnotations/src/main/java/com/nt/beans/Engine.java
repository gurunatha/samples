package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engg1")
public class Engine {
	@Value("1001")
	private int engineId;
	@Value("petrol")
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
}//class
