package com.lm.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LMTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.lm.annon");
		/*
		 * Container container = context.getBean(Container.class);
		 * container.receive("data1");
		 */
		
	}
}
