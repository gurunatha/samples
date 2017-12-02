package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import com.nt.aspect.CacheAdvice;
import com.nt.aspect.LogAroundAdvice;
import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.poincut.CommonStaticPointcut;
import com.nt.service.ArithmeticOperations;

public class ProgramaticAOPTest {

	public static void main(String[] args) {
		ArithmeticOperations operations=null,proxy=null;
		PerformanceMonitoringAdvice pmAdvice=null;
		CacheAdvice cacheAdvice=null;
		LogAroundAdvice logAdvice=null;
		ProxyFactory factory=null;
		DefaultPointcutAdvisor  pmAdvisor=null,loggingAdvisor=null;
		NameMatchMethodPointcutAdvisor cacheAdvisor=null;
		NameMatchMethodPointcut ptc=null;
		//create Target class object
		operations=new ArithmeticOperations();
		//create Advice class object
		pmAdvice=new PerformanceMonitoringAdvice();
		cacheAdvice=new CacheAdvice();
		logAdvice=new LogAroundAdvice();
		//create ProxyFactory 
		factory=new ProxyFactory();
		//set target
		factory.setTarget(operations);
		//prepare Advisors
		   //advisor with user-defined pointcut
		pmAdvisor=new DefaultPointcutAdvisor(new CommonStaticPointcut(),pmAdvice);
		    //advisor with bulit-in static pointcut
		cacheAdvisor=new NameMatchMethodPointcutAdvisor();
		cacheAdvisor.setAdvice(cacheAdvice);
		cacheAdvisor.addMethodName("sum");
		cacheAdvisor.addMethodName("mul");
		   //advisor with readymade static pointcut
		    ptc=new NameMatchMethodPointcut();
		    ptc.addMethodName("mul");
		   loggingAdvisor=new DefaultPointcutAdvisor(ptc,logAdvice);
		//set Advisor
	
		 factory.addAdvisor( cacheAdvisor);
		factory.addAdvisor(loggingAdvisor);
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
		System.out.println("sum:::"+proxy.sum(10,20));
		System.out.println("------------------------------------");
		System.out.println("sub:::"+proxy.sub(20,20));
		System.out.println("------------------------------------");
		System.out.println("mul:::"+proxy.mul(30,20));
		System.out.println("------------------------------------");
	
	}//main
}//class
