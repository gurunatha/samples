package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.MessageWriter;

public class FSTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/fs/common/application-context.xml"));
		MessageWriter writer = (MessageWriter) factory.getBean("messageWriter");
		/*IMessageProducer messageProducer = (IMessageProducer) factory
				.getBean("htmlMessageProducer");
		writer.setMessageProducer(messageProducer);*/
		writer.write("Welcome to Spring!");
	}
}
