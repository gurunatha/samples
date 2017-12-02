package com.aa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CheckRetAspect extends GlobalPointcuts {
	@AfterReturning(pointcut = "commonPointcut()", returning = "ret")
	public void check(JoinPoint jp, Object ret) throws Throwable {
		if ((Integer) ret <= 0) {
			throw new Exception("invalid outcome");
		}
	}

	@AfterThrowing(pointcut = "commonPointcut()", throwing = "iae")
	public void logException(JoinPoint jp, Exception iae) {
		System.out.println("exception : " + iae.getMessage());
	}

	@After("commonPointcut()")
	public void close(JoinPoint jp) {
		System.out.println("closing aop : " + jp.getSignature().getName());
	}
}
