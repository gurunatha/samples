package com.lmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lmi.beans.Car;

public class LMITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/lmi/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.drive();
		car.drive();
	}
}
