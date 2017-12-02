package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.AuthenticationManager;
import com.nt.service.IntrAmountCalculator;

public class SecurityCheckBeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager manager=null;
		IntrAmountCalculator proxy=null;
		float amount=0;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		manager=ctx.getBean("authManager",AuthenticationManager.class);
		//perform signIn
		manager.signIn("raja","rani");
		//get Proxy object
		proxy=ctx.getBean("pfb",IntrAmountCalculator.class);
		 //invoke method
		amount=proxy.calcIntrAmount(200000,2,10);
		System.out.println("Amount:::"+amount);
		
		//perform signOut
		manager.signOut();
		
	}//main
}//class
