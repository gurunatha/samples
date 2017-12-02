package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Component("logAdvice")
@Order(2)
public class LogAroundAdvice {
	@Around("execution(* com.nt.service.IntrAmountCalculator.*(..))")
	public Object  logging(ProceedingJoinPoint pjp)throws Throwable{
	  Object retVal=null;
	  Object args[]=null;
		System.out.println("Entering into"+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
	
		//Access & modify argument values		
		args=pjp.getArgs();
		if(((Float)args[0])<50000)
			args[1]=((Float)args[1])-0.5f;
		
		//call target method
	  retVal=pjp.proceed(args);
	  System.out.println("Leaving from"+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
		retVal=((Float)retVal)+(((Float)retVal)*0.01f);
	  return retVal;
		
	}//method
}//class
