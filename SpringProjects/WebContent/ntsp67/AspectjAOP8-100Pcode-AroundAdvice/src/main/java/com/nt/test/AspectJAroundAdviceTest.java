package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.service.IntrAmountCalculator;

public class AspectJAroundAdviceTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 IntrAmountCalculator proxy=null;
		
		//create IOC container
		 ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		 //get Prxoy object
		proxy=ctx.getBean("iac",IntrAmountCalculator.class);
		
		  //invoke method
		System.out.println("simple Intrest Amount:::"+proxy.calcIntrAmount(10000, 2, 10));
		System.out.println("---------------------------------------------");
		System.out.println("compound Intrest Amount:::"+proxy.calcCompoundIntrAmount(10000, 2, 10));
		System.out.println("---------------------------------------------");
		System.out.println("compound Intrest Amount:::"+proxy.calcCompoundIntrAmount(10000, 2, 10));
		
		
		//close IOC
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
