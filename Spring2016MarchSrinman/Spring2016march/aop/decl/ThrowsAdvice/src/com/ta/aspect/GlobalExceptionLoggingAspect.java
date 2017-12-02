package com.ta.aspect;

import org.aspectj.lang.JoinPoint;

public class GlobalExceptionLoggingAspect {
	public void logException(JoinPoint jp, IllegalArgumentException iae, int a) {
		System.out.println("exception thrown by " + jp.getSignature().getName()
				+ "(" + a + ") with message : " + iae.getMessage());
	}

	public void close(JoinPoint jp) {
		System.out.println("closing resource for method "
				+ jp.getSignature().getName());
	}
}
