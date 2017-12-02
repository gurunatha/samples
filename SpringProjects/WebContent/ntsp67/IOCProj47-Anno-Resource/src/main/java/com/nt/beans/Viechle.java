package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;


@Scope("prototype")
@Named("viechle")
public class Viechle {
	//@Resource(name="engg2")
	@Resource
	private Engine engine;

	
	
/*	@Resource
	public void assign(Engine engine){
		this.engine=engine;
	}
*/

	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	
	
	/*@Resource
	public void setEngine(Engine engine) {
		System.out.println("Viechle:setEgine(-)");
		this.engine = engine;
	}*/
	
	
	public void move(){
		engine.start();
		System.out.println("Viechle moved");
	}

	@Override
	public String toString() {
		return "Viechle [engine=" + engine + "]";
	}
}//class
