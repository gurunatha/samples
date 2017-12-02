package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AnnoJavaConfigTest {
	public static void main(String[] args) {
		 ApplicationContext ctx=null;
         Viechle viechle=null; 
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //getBean
		 viechle=ctx.getBean("viechle",Viechle.class);
		 viechle.move();
		 System.out.println(viechle);
	}//main
}//class
