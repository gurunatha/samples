package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class FactoryMethodTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Class clazz=null;
		Calendar calendar=null;
		String o1=null,o2=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Beans
		clazz=factory.getBean("c1",Class.class);
		System.out.println(clazz.getClass()+"----->Data:::"+clazz);
		System.out.println("...................................................");
		calendar=factory.getBean("cal",Calendar.class);
		System.out.println(calendar.getClass()+"----->Data::"+calendar);
		System.out.println("......................................................");
		o1=factory.getBean("s2",String.class);
		System.out.println(o1.getClass()+"----->Data::"+o1);
		System.out.println("......................................................");
		o2=factory.getBean("s3",String.class);
		System.out.println(o2.getClass()+"----->Data::"+o2);
	}//main
}//class
