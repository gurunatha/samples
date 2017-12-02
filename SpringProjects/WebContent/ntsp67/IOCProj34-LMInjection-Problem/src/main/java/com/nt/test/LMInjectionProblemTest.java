package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class LMInjectionProblemTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null;
		//create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		container=ctx.getBean("container",MyServletContainer.class);
		//invoke methods
		container.processRequest("Ind Vs Pak match");
		container.processRequest("Eng VsAus match");
		
		MyServletContainer container1=ctx.getBean("container",MyServletContainer.class);
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
