package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.service.ArithmeticOperations;

public class ProgramaticAOPTest {

	public static void main(String[] args) {
		ArithmeticOperations operations=null,proxy=null;
		PerformanceMonitoringAdvice advice=null;
		ProxyFactory factory=null;
		//create Target class object
		operations=new ArithmeticOperations();
		//create Advice class object
		advice=new PerformanceMonitoringAdvice();
		//create ProxyFactory 
		factory=new ProxyFactory();
		//set target,advice
		factory.setTarget(operations);
		factory.addAdvice(advice);
		//get Proxy object
		proxy=(ArithmeticOperations) factory.getProxy();
		//invoke methods
		System.out.println("sum:::"+proxy.sum(10,20));
		System.out.println("------------------------------------");
		System.out.println("sub:::"+proxy.sub(20,20));
		System.out.println("------------------------------------");
		System.out.println("mul:::"+proxy.mul(30,20));
		System.out.println("------------------------------------");
	
	}//main
}//class
