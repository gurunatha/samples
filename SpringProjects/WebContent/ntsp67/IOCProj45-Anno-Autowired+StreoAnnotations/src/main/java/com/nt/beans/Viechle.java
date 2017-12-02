package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("viechle")
public class Viechle {
	private Engine engine;

	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	@Autowired(required=true)
	@Qualifier("engg2")
	public void setEngine(Engine engine) {
		System.out.println("Viechle:setEgine(-)");
		this.engine = engine;
	}
	
	
	public void move(){
		engine.start();
		System.out.println("Viechle moved");
	}

	@Override
	public String toString() {
		return "Viechle [engine=" + engine + "]";
	}
}//class
