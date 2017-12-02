package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OrderApprover;

public class BeforeAdviceTest {

	public static void main(String[] args) {
	    OrderApprover proxy=null;
		ApplicationContext ctx=null;
		//create IOC container
	   ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	   //get Bean
	   proxy=ctx.getBean("pfb",OrderApprover.class);
	   //invoke target method
	   System.out.println(proxy.approveOrder(-1001));
	   //close IOC container
	   ((AbstractApplicationContext) ctx).close();
	}

}
