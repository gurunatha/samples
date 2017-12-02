package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.nt.service.IntrAmountCalculator;

public class CommonStaticPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> target) {
		if(target==IntrAmountCalculator.class && method.getName().equals("calcCompoundIntrAmount")){
		  return true;	
		}
		else{
		  return false;
		}
	}//method
}//class
