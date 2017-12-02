package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmountCalculator;

public class AOPTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmountCalculator proxy=null;
		//create IOC container
		ctx=new  FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
        //get Proxy class object
		proxy=ctx.getBean("pfb",IntrAmountCalculator.class);
		//invoke methods
		System.out.println("Intr Amount:::"+proxy.calcIntrAmount(10000, 2,12));
		System.out.println("-------------------------------------------------------------");
		System.out.println("Intr Amount:::"+proxy.calcIntrAmount(10000, 2,12));
		System.out.println("-------------------------------------------------------------");
		System.out.println("Intr Amount(Compound):::"+proxy.calcCompoundIntrAmount(10000, 2,12));
		System.out.println("-------------------------------------------------------------");
	}//main
}//class
