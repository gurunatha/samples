package com.bp.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.bp.util.InstanceTracker;

public class InstanceTrackerBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanId)
			throws BeansException {
		InstanceTracker.increment();
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanId)
			throws BeansException {
		return bean;
	}

}
