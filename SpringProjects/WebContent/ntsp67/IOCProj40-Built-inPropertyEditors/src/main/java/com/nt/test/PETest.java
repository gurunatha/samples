package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.AadharDetails;

public class PETest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AadharDetails details=null;
		//create IOCContainer
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		details=ctx.getBean("aadhar",AadharDetails.class);
		System.out.println(details);
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
