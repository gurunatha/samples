package com.ifm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifm.beans.Car;

public class IFMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/ifm/common/application-context.xml"));

		Car car = factory.getBean("car", Car.class);
		car.drive();
	}
}
