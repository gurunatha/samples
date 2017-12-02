package com.val.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/val/annon/value-context.xml");
		Toy toy = context.getBean("toy", Toy.class);
		System.out.println(toy);
	}
}
