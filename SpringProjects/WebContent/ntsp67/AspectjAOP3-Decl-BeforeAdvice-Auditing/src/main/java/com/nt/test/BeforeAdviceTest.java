package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.OrderApprover;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 OrderApprover approver=null;
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //get Bean
		 approver=ctx.getBean("approver",OrderApprover.class);
		 System.out.println(approver.approveOrder(1001));
		 //close IOC container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
