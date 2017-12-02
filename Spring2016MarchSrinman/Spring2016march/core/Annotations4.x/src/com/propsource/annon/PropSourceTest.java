package com.propsource.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropSourceTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				PropSourceAppConfig.class);
		Book book = context.getBean("book", Book.class);
		System.out.println(book);
	}
}
