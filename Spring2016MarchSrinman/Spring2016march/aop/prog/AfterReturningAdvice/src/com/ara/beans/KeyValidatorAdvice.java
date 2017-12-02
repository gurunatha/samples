package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class KeyValidatorAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		// weak key
		if ((Integer) ret == 0) {
			// stop returning the return value
			throw new IllegalArgumentException("Key Length not supported");
		}
	}
}
