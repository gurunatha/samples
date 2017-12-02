package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.PriceCalculator;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PriceCalculator proxy=null;
		//createIOC container
        ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
        //get Bean
        proxy=ctx.getBean("pfb",PriceCalculator.class);
        //invoke target method
        try{
        System.out.println("Price:::"+proxy.calculatePrice(300, 0));
        }
        catch(IllegalArgumentException iae){
        	iae.printStackTrace();
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        //close IOC container
        ((AbstractApplicationContext) ctx).close();
	}

}
