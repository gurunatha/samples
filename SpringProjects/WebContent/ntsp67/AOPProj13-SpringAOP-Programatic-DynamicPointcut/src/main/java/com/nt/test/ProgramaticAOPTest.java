package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.pointcut.CommonDynamicPointcut;
import com.nt.service.ArithmeticOperations;

public class ProgramaticAOPTest {

	public static void main(String[] args) {
		ArithmeticOperations operations=null,proxy=null;
		PerformanceMonitoringAdvice advice=null;
		DefaultPointcutAdvisor pmAdvisor=null;
		ProxyFactory factory=null;
		//create Target class object
		operations=new ArithmeticOperations();
		//create Advice class object
		advice=new PerformanceMonitoringAdvice();
		//prepare Advisor
		pmAdvisor=new DefaultPointcutAdvisor(new CommonDynamicPointcut(),advice);
		//create ProxyFactory 
		factory=new ProxyFactory();
		//set target,advice
		factory.setTarget(operations);
		//set advisor
		factory.addAdvisor(pmAdvisor);
		//get Proxy object
		proxy=(ArithmeticOperations) factory.getProxy();
		//invoke methods
		System.out.println("sum:::"+proxy.sum(10,20));
		System.out.println("------------------------------------");
		System.out.println("sub:::"+proxy.sub(20,20));
		System.out.println("------------------------------------");
		System.out.println("mul:::"+proxy.mul(30,20));
		System.out.println("------------------------------------");
		System.out.println("sub1:::"+proxy.sub(1200,1001));
		System.out.println("------------------------------------");
		System.out.println("mul1:::"+proxy.mul(1001,2000));
		System.out.println("------------------------------------");
		System.out.println("sum1:::"+proxy.sum(1000,2000));
		System.out.println("------------------------------------");

	
	}//main
}//class
