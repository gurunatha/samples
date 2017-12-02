package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Person;

public class NullInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Person person=null;
		//create IOC conainer
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		person=factory.getBean("person",Person.class);
		System.out.println(person);

	}

}
