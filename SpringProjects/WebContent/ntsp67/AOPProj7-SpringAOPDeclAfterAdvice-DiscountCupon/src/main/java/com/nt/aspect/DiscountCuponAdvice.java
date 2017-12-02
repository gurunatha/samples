package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCuponAdvice implements AfterReturningAdvice {

	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		String cuponMsg=null;
		FileWriter fw=null;
		Random rad=null;
		int cuponId=0;
		System.out.println("target method::"+method.getName());
		System.out.println("target class ::"+target.getClass());
		System.out.println("target method args::"+Arrays.toString(((String[])args[0])));
		System.out.println("target method return value::"+retVal);
		
		if( ((Float)retVal)<1000){
			cuponMsg="Avail 5% discount on next purchase";
		}
		else if(((Float)retVal)<2000){
			cuponMsg="Avail 10% discount on next purchase";
		}
		else if(((Float)retVal)<3000){
			cuponMsg="Avail 20% discount on next purchase";
		}
		else{
			cuponMsg="Avail 25% discount on next purchase";
		}
		//generate Random number as cupon number
		rad=new Random();
		cuponId=rad.nextInt(100000);
		//Generate Cupons 
		fw=new FileWriter("E:/cupon.txt");
		fw.write(cuponId+"--->"+cuponMsg);
		fw.flush();
		fw.close();
		}//method
}//class
