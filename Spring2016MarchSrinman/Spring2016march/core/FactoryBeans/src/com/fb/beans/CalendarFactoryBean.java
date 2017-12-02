package com.fb.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {

	@Override
	public Calendar getObject() throws Exception {
		System.out.println("getObject()");
		return Calendar.getInstance();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("getObjecType()");
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("isSingleton()");
		return true;
	}

}
