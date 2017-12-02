package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
 @Component("pmAdvice") 
@Order(3)
public class PerformanceMonitoringAdvice {
	private long start, end;

	@Around("execution(* com.nt.service.IntrAmountCalculator.*(..))")
	public Object monitor(ProceedingJoinPoint pjp) throws Throwable {
		Object retVal = null;
		start = System.currentTimeMillis();
		retVal = pjp.proceed();
		end = System.currentTimeMillis();
		System.out.println(" Method "+pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs())+" has taken "+(end-start)+" ms");
		return retVal;
	}// monitor
}// class