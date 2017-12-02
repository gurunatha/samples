package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.TravelAgent;

public class AutowireTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		TravelAgent tagent=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//getBean
		tagent=factory.getBean("agent",TravelAgent.class);
		tagent.planTour();

	}

}
