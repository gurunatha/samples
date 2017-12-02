package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class LoggingDynamicPointcut extends DynamicMethodMatcherPointcut {
	@Override
	public boolean matches(Method method, Class<?> classType, Object[] args) {
		System.out.println("method : "  + method.getName());
		if (method.getName().equals("add")
				&& classType.isAssignableFrom(Calculator.class)
				&& (Integer) args[0] > 99) {
			return true;
		}
		return false;
	}
}
