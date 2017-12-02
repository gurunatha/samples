package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Marks;
import com.nt.beans.StudentDetails;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Marks mk=null;
		StudentDetails st=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		mk=factory.getBean("mks",Marks.class);
		System.out.println(mk);
		System.out.println("................................");
		//get Bean
		st=factory.getBean("stDetails",StudentDetails.class);
		System.out.println(st);
	}//main
}//class
