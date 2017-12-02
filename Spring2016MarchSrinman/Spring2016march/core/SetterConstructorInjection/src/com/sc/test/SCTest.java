package com.sc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sc.beans.Car;

public class SCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/sc/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.drive();
	}
}
