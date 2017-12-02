package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmountCalculator;

public class AspectJAroundAdviceTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 IntrAmountCalculator proxy=null;
		
		//create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //get Prxoy object
		proxy=ctx.getBean("iac",IntrAmountCalculator.class);
		System.out.println("proxy object class name:"+proxy.getClass());
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
