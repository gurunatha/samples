package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class LMInjectionSolution2Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null;
		//create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		container=ctx.getBean("container",MyServletContainer.class);
		System.out.println("Target bean class name"+container.getClass());
		//invoke methods
		container.processRequest("Ind Vs Pak match");
		System.out.println("--------------------------------------");
		container.processRequest("Eng VsAus match");
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
