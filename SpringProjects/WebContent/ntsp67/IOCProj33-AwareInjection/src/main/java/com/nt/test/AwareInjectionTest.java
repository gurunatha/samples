package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AwareInjectionTest {
 
	public static void main(String[] args) {
		ApplicationContext ctx=null;
	   Viechle viechle=null;
		//create IOC container
		ctx=new  FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Beans
		viechle=ctx.getBean("viechle",Viechle.class);
		viechle.move();
		viechle.entertaiment();
		viechle.soundHorn();
	}//main
}//class
