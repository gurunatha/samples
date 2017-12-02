package com.nt.poincut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.nt.service.ArithmeticOperations;

public class CommonStaticPointcut extends StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> target) {
		if(method.getName().equals("sum") && (target==ArithmeticOperations.class))
		   return true;
		else
			return false;
	}//method
}//class
