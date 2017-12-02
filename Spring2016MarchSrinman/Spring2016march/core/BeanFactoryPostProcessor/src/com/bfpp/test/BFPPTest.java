package com.bfpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bfpp.beans.ConnectionFactory;

public class BFPPTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bfpp/common/application-context.xml"));
		BeanFactoryPostProcessor bfpp = factory.getBean("ppc",
				BeanFactoryPostProcessor.class);
		// now the metadata has been modified
		bfpp.postProcessBeanFactory((ConfigurableListableBeanFactory) factory);
		ConnectionFactory cfactory = factory.getBean("cfactory",
				ConnectionFactory.class);
		System.out.println(cfactory);
	}
}
