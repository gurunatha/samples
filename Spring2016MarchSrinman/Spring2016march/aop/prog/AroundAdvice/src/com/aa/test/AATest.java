package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aa.beans.Calculator;
import com.aa.beans.LoggingAdvice;
import com.aa.beans.LoggingDynamicPointcut;

public class AATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvisor(new DefaultPointcutAdvisor(new LoggingDynamicPointcut(),
				new LoggingAdvice()));

		Calculator proxy = (Calculator) pf.getProxy();
		// Calculator proxy = new Calculator();
		int sum = proxy.add(100, 20);
		System.out.println("sum : " + sum);

		sum = proxy.multiply(10, 20);
		System.out.println("multiply : " + sum);
	}
}
