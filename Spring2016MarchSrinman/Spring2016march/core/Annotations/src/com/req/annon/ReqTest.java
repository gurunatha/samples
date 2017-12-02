package com.req.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/req/annon/req-context.xml");
		Toy toy = context.getBean("toy", Toy.class);
		System.out.println(toy);
	}
}
