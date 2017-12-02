package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.BiCycle;

public class BSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bs/common/application-context.xml"));
		BiCycle biCycle1 = factory.getBean("biCycle", BiCycle.class);
		BiCycle biCycle2 = factory.getBean("biCycle", BiCycle.class);
		System.out.println("BiCycle Hashcode : " + biCycle1.hashCode());
		System.out.println("BiCycle Hashcode : " + biCycle2.hashCode());
	}
}






