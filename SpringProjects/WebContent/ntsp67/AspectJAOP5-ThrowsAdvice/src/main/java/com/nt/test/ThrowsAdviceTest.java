package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.WrongBillInfoException;
import com.nt.service.BillAmountCalculator;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 BillAmountCalculator calculator=null; 
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //get Bean
		 calculator=ctx.getBean("bac",BillAmountCalculator.class);
		 try{
		 System.out.println("Bill Amount:"+calculator.calculateBill(10000,0));
		 }
		 catch(WrongBillInfoException we){
			we.printStackTrace();
		 }
		 //close IOC container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
