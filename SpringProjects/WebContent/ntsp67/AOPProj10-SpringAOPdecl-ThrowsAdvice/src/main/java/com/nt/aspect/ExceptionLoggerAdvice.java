package com.nt.aspect;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionLoggerAdvice implements ThrowsAdvice {
	
	public void afterThrowing(SQLException se){
		System.out.println(se+"4 exception is raised ");
		throw new IllegalArgumentException(se.getMessage());
	}//method
	
	public void afterThrowing(Exception se){
		System.out.println(se+"5 exception is raised ");
		throw new IllegalArgumentException(se.getMessage());
	}//method
	
	public void afterThrowing(Method method,Object args[],Object target,SQLException se){
		System.out.println(se+"1 exception is raised in method "+method.getName()+" of "+target.getClass()+" having args "+Arrays.toString(args));
		throw new IllegalArgumentException(se.getMessage());
	}//method
	
	
	public void afterThrowing(Method method,Object args[],Object target,Exception se){
		System.out.println(se+"2 exception is raised in method "+method.getName()+" of "+target.getClass()+" having args "+Arrays.toString(args));
		throw new IllegalArgumentException(se.getMessage());
	}//method
	
	public void afterThrowing(Method method,Object args[],Object target,Throwable se){
		System.out.println(se+"3 exception is raised in method "+method.getName()+" of "+target.getClass()+" having args "+Arrays.toString(args));
		throw new IllegalArgumentException(se.getMessage());
	}//method



}//class
