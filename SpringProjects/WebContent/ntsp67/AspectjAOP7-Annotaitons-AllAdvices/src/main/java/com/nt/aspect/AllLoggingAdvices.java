package com.nt.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("allAdvices")
@Aspect
public class AllLoggingAdvices {
	
	
	@Pointcut("execution(* com.nt.service.IntrAmountCalculator.*(..))")
	public void myPointcut(){
		
	}
	
	@Around("myPointcut()")
	public Object around(ProceedingJoinPoint pjp)throws Throwable{
       Object retVal=null;
		System.out.println("arond:entering into "+pjp.getSignature());
       retVal=pjp.proceed();
       System.out.println("around:leaving from "+pjp.getSignature());
       return retVal;
	}
	
	@Before("myPointcut()")
	public void before(JoinPoint pjp)throws Throwable{
		System.out.println("before :entering into "+pjp.getSignature());
	}
	
	@AfterReturning(value="myPointcut()",returning="intrAmt")
	public void after(JoinPoint pjp,float intrAmt)throws Throwable{
		System.out.println("after :returning value "+intrAmt+" from "+pjp.getSignature());
	}
	
	@AfterThrowing(value="myPointcut()",throwing="e")
	public void throwing(JoinPoint pjp,Exception e)throws Throwable{
		System.out.println("throwing : the exception is"+e);
	}

}
