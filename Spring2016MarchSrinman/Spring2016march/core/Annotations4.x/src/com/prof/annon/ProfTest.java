package com.prof.annon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;

public class ProfTest {
	public static void main(String[] args) {
		/*
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext();
		 * context.getEnvironment().setActiveProfiles("test");
		 * context.register(AppConfig.class); context.refresh();
		 */

		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,
				"dev");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		JobDao jDao = context.getBean("jobDao", JobDao.class);
		jDao.newJob(1, "Address Filter Job");
	}
}
