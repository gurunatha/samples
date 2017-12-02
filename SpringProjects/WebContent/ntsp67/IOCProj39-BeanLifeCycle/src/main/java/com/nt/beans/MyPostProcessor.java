package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanId) throws BeansException {
      System.out.println("MyPostProcessor:postProcessAfterInitialization");		
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("MyPostProcessor:postProcessBeforeInitialization");
		return bean;
	}

}
