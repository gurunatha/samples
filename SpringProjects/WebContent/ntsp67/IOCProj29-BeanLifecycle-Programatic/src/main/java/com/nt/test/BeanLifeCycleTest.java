package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.CheckVotingElgibility;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 CheckVotingElgibility  bean=null; 
		 //create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		bean=ctx.getBean("cve",CheckVotingElgibility.class);
		//invoke method
		System.out.println("Result:::::"+bean.checkVotingEligibility());
		
		//close container
	((AbstractApplicationContext) ctx).close();
	}//main
}//class
