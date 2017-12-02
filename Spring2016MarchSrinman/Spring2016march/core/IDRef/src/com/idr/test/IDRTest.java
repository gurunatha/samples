package com.idr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.idr.beans.Radio;

public class IDRTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/idr/common/application-context.xml"));
		Radio radio = factory.getBean("radio", Radio.class);
		radio.play(99);
	}
}
