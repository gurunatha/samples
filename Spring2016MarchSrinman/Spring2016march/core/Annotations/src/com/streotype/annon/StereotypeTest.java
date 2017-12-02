package com.streotype.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereotypeTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/streotype/annon/stereotype-context.xml");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.streotype.annon");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		/*
		 * ScoreBoard sboard1 = context.getBean("scoreBoard", ScoreBoard.class);
		 * ScoreBoard sboard2 = context.getBean("scoreBoard", ScoreBoard.class);
		 * 
		 * System.out.println("sboard1 == sboard2 : ? " + (sboard1 == sboard2));
		 */
	}
}
