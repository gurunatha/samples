package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Person;

public class BATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ba/common/application-context.xml"));
		// Person person = factory.getBean("person", Person.class);
		Person p1 = factory.getBean("john,blake", Person.class);
		System.out.println(p1);
	}
}
