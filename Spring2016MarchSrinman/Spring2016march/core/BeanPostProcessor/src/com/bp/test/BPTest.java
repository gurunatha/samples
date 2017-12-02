package com.bp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bp.util.InstanceTracker;

public class BPTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bp/common/application-context.xml"));
		BeanPostProcessor bpp = factory.getBean(
				"instanceTrackerBeanPostProcessor", BeanPostProcessor.class);
		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(bpp);

		factory.getBean("toy");
		System.out.println("Instances : " + InstanceTracker.getInstances());
		factory.getBean("toy");
		System.out.println("Instances : " + InstanceTracker.getInstances());
		factory.getBean("remote");
		System.out.println("Instances : " + InstanceTracker.getInstances());
	}
}
