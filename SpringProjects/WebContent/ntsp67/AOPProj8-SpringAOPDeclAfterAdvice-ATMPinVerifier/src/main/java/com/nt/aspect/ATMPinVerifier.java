package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ATMPinVerifier implements AfterReturningAdvice{

	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		
		if((((Integer)retVal)<=999) || (((Integer)retVal)>9999)){
			throw new IllegalArgumentException("Invalid Pin");
		}
		else{
			System.out.println("Valied Pin Generated");
		}
		
	}//method
}//class
