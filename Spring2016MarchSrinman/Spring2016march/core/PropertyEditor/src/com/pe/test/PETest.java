package com.pe.test;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pe.beans.Team;

public class PETest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/pe/common/application-context.xml"));
		Team team = factory.getBean("team", Team.class);
		System.out.println(team);
	}
}




