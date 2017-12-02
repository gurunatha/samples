package com.sfm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfm.beans.Alarm;

public class SFMTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/sfm/common/application-context.xml"));
		Alarm alarm = factory.getBean("alarm", Alarm.class);
		alarm.sayTime();
	}
}
