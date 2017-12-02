package com.compscan.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompScanTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				CompScanAppConfig.class);
		Alarm alarm = context.getBean("alarm", Alarm.class);
		System.out.println(alarm);
	}
}
