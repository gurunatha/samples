package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.TestBean;

public class TestClient {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 TestBean tb=null;
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
        //get Bean
		 tb=ctx.getBean("tb",TestBean.class);
		 //stop container
		 ((AbstractApplicationContext) ctx).close();
	}

}
