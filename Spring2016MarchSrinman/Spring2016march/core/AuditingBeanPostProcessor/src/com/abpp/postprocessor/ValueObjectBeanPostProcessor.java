package com.abpp.postprocessor;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.abpp.beans.GenericVO;

public class ValueObjectBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String beanId)
			throws BeansException {
		if (obj instanceof GenericVO) {
			Date d = new Date();
			((GenericVO) obj).setCreatedDt(d);
			((GenericVO) obj).setLastModifiedDt(d);
		}
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String beanId)
			throws BeansException {
		return obj;
	}

}
