package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EnggCourse eceEngg=null,csEngg=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Beans
		eceEngg=factory.getBean("eceIstYear",EnggCourse.class);
		System.out.println(eceEngg);
		
		csEngg=factory.getBean("csIstYear",EnggCourse.class);
		System.out.println(csEngg);
	}
}
