package com.nt.test;

 

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMsgGenerator generator=null;
		Object object=null;
		//locate SpringBean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC Container/Spring Container
		factory=new XmlBeanFactory(res);
		//get Main/Target Bean class obj
		object=factory.getBean("wish");
	
		//type casting
	generator=(WishMsgGenerator)object;
		// invoke b.method
		System.out.println("Wish Messages:::"+generator.generateWishMsg("Raja")); 
	}//main
}//class
