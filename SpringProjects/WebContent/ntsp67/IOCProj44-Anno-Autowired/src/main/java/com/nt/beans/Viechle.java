package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Viechle {
	//@Autowired
	private Engine engine;

	
	
	
/*	@Autowired(required=false)
	public Viechle(Engine engine) {
		System.out.println("Viechle:1-param constructor");
		this.engine = engine;
	}*/
	
	

	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	@Autowired(required=true)
	@Qualifier(value="e1")
	public void setEngine(Engine engine) {
		System.out.println("Viechle:setEgine(-)");
		this.engine = engine;
	}
	
	
	/*@Autowired
	public void assign(Engine engine){
		System.out.println("Viechle:assign(-)");
		this.engine=engine;
	}*/
	
	public void move(){
		engine.start();
		System.out.println("Viechle moved");
	}

	@Override
	public String toString() {
		return "Viechle [engine=" + engine + "]";
	}
	

}
