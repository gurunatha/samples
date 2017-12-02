package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class TxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		proxy=ctx.getBean("bankService",BankService.class);
		try{
		//invoke methods
		System.out.println("Money Transffered??"+proxy.transferMoney(10012,1002,500));
		}
		catch(Exception e){
			System.out.println("Money not Transffered");
			e.printStackTrace();
		}
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
