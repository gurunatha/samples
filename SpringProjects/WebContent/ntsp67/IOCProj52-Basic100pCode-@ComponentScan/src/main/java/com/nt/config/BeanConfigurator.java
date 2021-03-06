package com.nt.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class BeanConfigurator {
	static{
		System.out.println("BeanConfigurator:static block");
	}
	
	public BeanConfigurator() {
		System.out.println("BeanConfigurator:0-param constructor");
	}
	

	
	@Bean(name="cal")
	@Scope("singleton")
	@DependsOn("wish")
	public Calendar createCalendar(){
		System.out.println("BeanConfigurator:createCalendar()");
	  return Calendar.getInstance();	
	}
	

}//class
