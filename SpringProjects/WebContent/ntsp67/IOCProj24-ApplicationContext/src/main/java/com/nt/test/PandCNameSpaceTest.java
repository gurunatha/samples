package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Emp;

public class PandCNameSpaceTest {

	public static void main(String[] args) {
	  ApplicationContext ctx=null;
	   Emp  emp=null;
		//create IOC container
	   ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	   
	   ctx.getBean("dept");
	   System.out.println("...................");
	   ctx.getBean("emp");
       //get Bean
		//emp=factory.getBean("emp",Emp.class);
		//System.out.println(emp);
	}//main
}//class
