package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.LICAgent;
import com.nt.beans.LICCompany;

public class InnerBeanTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		LICCompany company=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Main Bean obj
		company=factory.getBean("lic",LICCompany.class);
		System.out.println(company.sellInsurancePolicy("Jeevan Anand"));
		
	}//main
}//class
