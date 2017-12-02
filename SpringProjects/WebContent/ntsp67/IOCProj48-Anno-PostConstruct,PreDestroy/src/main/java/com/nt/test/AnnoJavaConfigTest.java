package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.beans.VoterChecking;

public class AnnoJavaConfigTest {
	public static void main(String[] args) {
		 ApplicationContext ctx=null;
         VoterChecking checking; 
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //getBean
		 checking=ctx.getBean("voter",VoterChecking.class);
		 System.out.println(checking.checkElgibility());
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
