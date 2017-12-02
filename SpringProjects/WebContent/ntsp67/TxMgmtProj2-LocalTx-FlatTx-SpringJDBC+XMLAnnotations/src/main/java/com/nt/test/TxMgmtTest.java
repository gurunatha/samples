package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.BankService;

public class TxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("tx_pfb",BankService.class);
		try{
		//invoke methods
		System.out.println("Money Transffered??"+proxy.transferMoney(1001,10056,500));
		}
		catch(Exception e){
			System.out.println("Money not Transffered");
			e.printStackTrace();
		}
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
