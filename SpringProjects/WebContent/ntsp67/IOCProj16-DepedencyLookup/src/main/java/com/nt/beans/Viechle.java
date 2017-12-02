package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Viechle {
	private String beanId;
	

	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	public void setBeanId(String beanId) {
		System.out.println("Viechle:setBeanId(-)");
		this.beanId = beanId;
	}

	
	public void  move(){
		System.out.println("Viechle:move(-)");
		BeanFactory factory=null;
		Engine engg=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Dependent Bean class obj
		engg=factory.getBean(beanId,Engine.class);
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
