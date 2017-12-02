package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.service.ArithmeticOperations;

public class CommonDynamicPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> target, Object[] args) {
		if(target==ArithmeticOperations.class &&(method.getName().equals("mul") || method.getName().equals("sub"))
				                  &&(((Integer)args[0]>=1000) && ((Integer)args[1])>1000)){
			return true;
		}
		else{
			return false;
		}
	}//matches(-,-,-)
}//class
