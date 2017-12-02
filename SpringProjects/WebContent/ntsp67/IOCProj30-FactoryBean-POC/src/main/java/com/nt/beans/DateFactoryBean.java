package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date> {
	private int year;
	private int month;
	private  int date;
	
	public DateFactoryBean(int year, int month, int date) {
        System.out.println("DateFactoryBean:3-param constructor");
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public Date getObject() throws Exception {
		System.out.println("getObject()");
         Date dt=null;
         dt=new Date(year-1900,month,date);
		return dt;
	}

	public Class<?> getObjectType() {
		System.out.println("getObjectType()");
		return Date.class;
	}

	public boolean isSingleton() {
		System.out.println("isSingleton()");
		return true;
	}

}
