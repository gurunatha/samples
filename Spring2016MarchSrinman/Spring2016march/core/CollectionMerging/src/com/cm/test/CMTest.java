package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.Product;

public class CMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/cm/common/application-context.xml"));
		Product iphone6s = factory.getBean("iphone6s", Product.class);
		System.out.println(iphone6s);

	}
}
