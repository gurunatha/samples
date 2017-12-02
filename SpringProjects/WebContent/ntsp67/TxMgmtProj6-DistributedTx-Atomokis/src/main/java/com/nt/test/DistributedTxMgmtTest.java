package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.BankService;

public class DistributedTxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create IOC container
      ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
      //get Bean
      proxy=ctx.getBean("bankService",BankService.class);
      try{
      //perform Transfermoney operation
      System.out.println(proxy.transferMoney(1001,10023,500));
      }
      catch(Exception e){
    	  System.out.println("Money not transfered");
      }
	}//main
}//class
