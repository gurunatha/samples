package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService service=null;
		float intrAmt=0;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("service",BankService.class);
		System.out.println("class name of the object"+service.getClass());
		//call b.methods
		intrAmt=service.calcIntrAmount(3000,10);
		System.out.println("Intrest Amount :::"+intrAmt);
         //close stream
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
