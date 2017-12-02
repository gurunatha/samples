package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Calculator;
import com.bl.beans.ShutdownHookup;

public class BLTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bl/common/application-context.xml"));
		ShutdownHookup sh = factory.getBean("shutdownHookup",
				ShutdownHookup.class);
		Runtime.getRuntime().addShutdownHook(new Thread(sh));

		Calculator calc = factory.getBean("calculator", Calculator.class);
		//System.exit(0);
		System.out.println(calc);
	}
}
