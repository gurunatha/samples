package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Viechle implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx=null; 

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}

	
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	public void setBeanId(String beanId) {
		System.out.println("Viechle:setBeanId(-)");
		this.beanId = beanId;
	}

	
	public void  move(){
		System.out.println("Viechle:move(-)");
		Engine engg=null;
          //use underlying IOC container
		 engg=ctx.getBean(beanId,Engine.class);
		//use use Engine
		engg.start();
		System.out.println("Vieche is moving");
	}
	public void entertaiment(){
		System.out.println("Viechle entertainment: DVD player");
	}
	public void soundHorn(){
		System.out.println("Viechle horn system : double sound horn");
	}

	
	
	
}
