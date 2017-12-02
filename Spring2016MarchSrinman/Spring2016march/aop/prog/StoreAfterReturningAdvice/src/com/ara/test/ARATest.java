package com.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ara.beans.BillGenerator;
import com.ara.beans.MemberCard;

public class ARATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ara/common/application-context.xml");
		BillGenerator generator = context.getBean("offerBillGenerator",
				BillGenerator.class);
		float amount = generator.generate(null, new MemberCard("228733",
				"platinum"));
		System.out.println("bill : " + amount);
	}
}
