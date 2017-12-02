package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.LoanCalculator;

public class DONTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/don/common/application-context.xml"));
		LoanCalculator lc = factory.getBean("loanCalculator",
				LoanCalculator.class);
		double amt = lc.calInterest(1000, 10, "hyd");
		System.out.println("Interest : " + amt);
	}
}
