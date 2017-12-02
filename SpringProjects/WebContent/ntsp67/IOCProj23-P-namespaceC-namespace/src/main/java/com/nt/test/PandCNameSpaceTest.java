package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Emp;

public class PandCNameSpaceTest {

	public static void main(String[] args) {
	  BeanFactory  factory=null;
	   Emp  emp=null;
		//create IOC container
	   factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
       //get Bean
		//emp=factory.getBean("emp",Emp.class);
		//System.out.println(emp);
	}//main
}//class
