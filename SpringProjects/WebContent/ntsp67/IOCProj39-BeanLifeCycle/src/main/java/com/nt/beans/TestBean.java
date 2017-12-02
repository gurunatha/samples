package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestBean implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {
private String name;

public TestBean() {
	System.out.println("TestBean:0-param constructor");
}

public void setName(String name) {
	System.out.println("TestBean:setName(-)/setter injection");
	this.name = name;
}
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("TestBean:setApplicationContext(-)");
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("TestBean:setBeanFactory(-)");
		
	}

	public void setBeanName(String arg0) {
		System.out.println("TestBean:setBeanName(-)");
		
	}

	public void destroy() throws Exception {
		System.out.println("TestBean:destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("TestBean:afterPropertiesSet()");
	}
	
	public void myInit(){
		System.out.println("TestBean:custom init() method");
	}
	public void myDestroy(){
		System.out.println("TestBean:custom destroy() method");
	}
	
}//class
