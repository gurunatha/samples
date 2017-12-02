package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ATMPinGenerator;


public class AOPAfterAdviceTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ATMPinGenerator generator=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		generator=ctx.getBean("pfb",ATMPinGenerator.class);
		//invoke method
		System.out.println("Pin::"+generator.generatePin());
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
