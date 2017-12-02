package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Component("cacheAdvice")
@Order(1)
public class CacheAdvice {
	private HashMap<String,Object> cache=new HashMap();
	
	@Around("execution(* com.nt.service.IntrAmountCalculator.*(..))")
	public Object caching(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		String key=null;
		//prepare methodname with args as key
		key=pjp.getSignature()+Arrays.toString(pjp.getArgs());
		if(!cache.containsKey(key)){
			retVal=pjp.proceed();
			System.out.println("From target method....");
			cache.put(key,retVal);
		}
		else{
			retVal=cache.get(key);
			System.out.println("from cache...");
		}
		return retVal;
	}//method
}//class
