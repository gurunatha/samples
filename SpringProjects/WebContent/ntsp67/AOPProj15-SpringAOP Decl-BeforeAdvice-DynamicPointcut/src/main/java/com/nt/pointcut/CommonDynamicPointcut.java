package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.service.IntrAmountCalculator;

public class CommonDynamicPointcut extends DynamicMethodMatcherPointcut {

	public boolean matches(Method method, Class<?> target, Object[] args) {
		if(target==IntrAmountCalculator.class && method.getName().equals("calcIntrAmount")
				             &&(((Float)args[0])>=100000 && ((Float)args[2])>=10))
		return true;
		else
			return false;
	}//method
}//class
