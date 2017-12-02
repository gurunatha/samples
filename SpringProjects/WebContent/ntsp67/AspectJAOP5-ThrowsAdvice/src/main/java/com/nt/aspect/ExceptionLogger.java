package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class ExceptionLogger {
	
	/*public  void  logException(JoinPoint jp,Exception e)throws Throwable{
		System.out.println("exception is raised in "+jp.getSignature()+" with args"+Arrays.toString(jp.getArgs())+"The exception is"+e);
       throw new WrongBillInfoException(e.getMessage());	
	}
*/
	public  void  logException(Exception e)throws Throwable{
		System.out.println("The exception is"+e);
       throw new WrongBillInfoException(e.getMessage());	
	}
	
}
