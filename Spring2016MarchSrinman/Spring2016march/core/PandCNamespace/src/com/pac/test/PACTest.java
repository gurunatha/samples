package com.pac.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pac.beans.Mobile;

public class PACTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/pac/common/application-context.xml"));
		Mobile mobile = factory.getBean("mobile", Mobile.class);
		System.out.println(mobile);
	}
}
