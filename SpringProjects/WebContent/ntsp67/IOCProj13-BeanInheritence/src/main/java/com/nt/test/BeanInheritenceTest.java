package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Bike;

public class BeanInheritenceTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Bike bike1=null,bike2=null,bike3=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		bike1=factory.getBean("pulsor1",Bike.class);
		System.out.println(bike1);
		
		bike2=factory.getBean("pulsor2",Bike.class);
		System.out.println(bike2);
		
		bike3=factory.getBean("basePulsor",Bike.class);
		
	}
}
