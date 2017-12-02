package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware {
	private IEngine engine;
	private String beanId;
	private BeanFactory factory;

	public void drive() {
		engine = factory.getBean(beanId, IEngine.class);
		engine.start();
		System.out.println("driving..");
	}

	public void setBeanId(String beanId) {
		System.out.println("setBeanId()");
		this.beanId = beanId;
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("setBeanFactory()");
		this.factory = factory;
	}

}
