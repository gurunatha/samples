package com.bl.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Calculator implements InitializingBean, DisposableBean {
	private int a;
	private int b;
	private int sum;

	public Calculator(int a) {
		System.out.println("Calculator(int a)");
		this.a = a;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroyed...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.sum = a + b;
	}

	/*
	 * public void init() { System.out.println("init()"); this.sum = this.a +
	 * this.b; }
	 */
	/*
	 * public void release() { System.out.println("releasing..."); }
	 */
	public void setB(int b) {
		System.out.println("setB(int b)");
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}

}
