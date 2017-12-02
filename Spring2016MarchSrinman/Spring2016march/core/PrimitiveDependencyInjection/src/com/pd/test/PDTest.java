package com.pd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pd.beans.Person;

public class PDTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/pd/common/application-context.xml"));
		Person person = factory.getBean("person", Person.class);
		System.out.println(person);
	}
}
