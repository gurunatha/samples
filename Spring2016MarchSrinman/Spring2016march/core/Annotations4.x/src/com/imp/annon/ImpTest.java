package com.imp.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImpTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				RootAppConfig.class);
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}
}
