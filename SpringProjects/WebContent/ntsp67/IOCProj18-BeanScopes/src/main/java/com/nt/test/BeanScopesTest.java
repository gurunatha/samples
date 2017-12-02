package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Company;

public class BeanScopesTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Company company=null,company1=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//getBean
		company=factory.getBean("comp",Company.class);
		company1=factory.getBean("comp",Company.class);
		System.out.println("ISO Rating:::"+company.getISORating("POLARIS"));
		
		System.out.println(company.hashCode()+"     "+company1.hashCode());
		System.out.println("same?"+(company==company1));
	

	}

}
