package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.FlipKart;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
        FlipKart  kart=null;		
	   // create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get TargetBean 
		kart=factory.getBean("flipkart",FlipKart.class);
		//invoke B.method
         System.out.println(kart.shopping(new String[]{"shirt","pant","shoe","goggle"}));
	}//main
}//clas
