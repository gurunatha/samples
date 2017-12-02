package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.SecheduleRemainder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 SecheduleRemainder remainder=null;
		 //create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		remainder=ctx.getBean("remainder",SecheduleRemainder.class);
		//invoke method
		System.out.println("Result:::::"+remainder.remaind());
		//close container
	((AbstractApplicationContext) ctx).close();
	}//main
}//class
