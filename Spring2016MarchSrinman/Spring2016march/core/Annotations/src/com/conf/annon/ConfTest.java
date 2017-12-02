package com.conf.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		BiCycle biCycle1 = context.getBean("biCycle1", BiCycle.class);
		biCycle1.run();
		((ConfigurableApplicationContext) context).registerShutdownHook();
	}
}



