package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class GlobalExceptionLoggingAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception iae) {
		System.out.println("exception : "+ iae.getMessage());
	}
	
	public void afterThrowing(Method method, Object[] args, Object target,
			IllegalArgumentException iae) {
		System.out.println("exception : " + method.getName() + "(" + args[0]
				+ ") with message : " + iae.getMessage());
	}
	
	public void afterThrowing(IllegalArgumentException iae) {
		System.out.println("illegal exception : "+ iae.getMessage());
	}
	


	
}







