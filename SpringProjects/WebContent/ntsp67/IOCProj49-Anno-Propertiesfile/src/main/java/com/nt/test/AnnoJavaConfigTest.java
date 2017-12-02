package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.DBOperationsDAO;

public class AnnoJavaConfigTest {
	public static void main(String[] args) {
		 ApplicationContext ctx=null;
         DBOperationsDAO dao=null; 
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //getBean
		 dao=ctx.getBean("dao",DBOperationsDAO.class);
		 System.out.println(dao);
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
