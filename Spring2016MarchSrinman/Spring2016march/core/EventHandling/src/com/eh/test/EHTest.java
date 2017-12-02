package com.eh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eh.beans.EditCityAgent;

public class EHTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/eh/common/application-context.xml");
		EditCityAgent agent = context.getBean("editCityAgent",
				EditCityAgent.class);
		agent.editCity(1, "chennai");
	}
}
