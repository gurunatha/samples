package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.ChittiRobot;

public class AnnoRequiredTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 ChittiRobot  robot=null; 
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //getBean
		 robot=ctx.getBean("chitti",ChittiRobot.class);
		 System.out.println(robot);
	}//main
}//class
