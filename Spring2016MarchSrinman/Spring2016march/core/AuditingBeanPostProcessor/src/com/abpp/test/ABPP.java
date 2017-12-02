package com.abpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.abpp.beans.EmployeeAgent;

public class ABPP {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/abpp/common/application-context.xml"));
		BeanPostProcessor bpp = factory.getBean("valueObjectBeanPostProcessor",
				BeanPostProcessor.class);
		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(bpp);
		EmployeeAgent agent = factory.getBean("employeeAgent",
				EmployeeAgent.class);
		agent.editEmployee(1, "John", "M", 3938);
	}
}
