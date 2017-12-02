package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("viechle")
public class Viechle {
	//@Inject
	private Engine engine;

/*	@Inject
	public Viechle(Engine engine) {
		System.out.println("Viechle:1-param constructor");
		this.engine = engine;
	}
*/
	
	@Inject
	@Named("engg2")
	public void assign(Engine engine){
		this.engine=engine;
	}


	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	
	
/*	@Inject
	public void setEngine(Engine engine) {
		System.out.println("Viechle:setEgine(-)");
		this.engine = engine;
	}
	*/
	
	public void move(){
		engine.start();
		System.out.println("Viechle moved");
	}

	@Override
	public String toString() {
		return "Viechle [engine=" + engine + "]";
	}
}//class
