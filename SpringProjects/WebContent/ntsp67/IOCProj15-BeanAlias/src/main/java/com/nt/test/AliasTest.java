package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Computer;

public class AliasTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
	   Computer comp1=null,comp2=null,comp3=null,comp4=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Beans
		comp1=factory.getBean("system",Computer.class);
		System.out.println(comp1);
		comp2=factory.getBean("pc",Computer.class);
		System.out.println(comp2);
		comp3=factory.getBean("sys",Computer.class);
		System.out.println(comp3);
		comp4=factory.getBean("desktop",Computer.class);
		System.out.println(comp4);
		
	}
}
