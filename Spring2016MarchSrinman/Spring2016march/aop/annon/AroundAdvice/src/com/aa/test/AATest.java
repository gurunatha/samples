package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aa.beans.Calculator;
import com.aa.common.AppConfig;
import com.mba.security.core.AuthenticationManager;

public class AATest {
	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/aa/common/application-context.xml");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Calculator calc = context.getBean("calculator", Calculator.class);
		AuthenticationManager manager = AuthenticationManager.getInstance();
		manager.login("john", "welcome1");
		System.out.println("sum  " + calc.add(10, -20));
		System.out.println("multiply " + calc.multiply(10, 20, 30));
		manager.logout();
	}
}








