package com.lmi.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

abstract public class Car {

	public void drive() {
		IEngine engine = null;

		engine = lookupEngine();
		engine.start();
		System.out.println("driving with engine : " + engine.hashCode());
	}

	abstract public IEngine lookupEngine();

}
