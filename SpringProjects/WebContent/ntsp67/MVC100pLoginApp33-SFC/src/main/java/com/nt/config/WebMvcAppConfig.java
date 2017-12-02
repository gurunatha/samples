package com.nt.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.nt.controller")
//@PropertySource(value="classpath:com/nt/commons/validation.properties")
public class WebMvcAppConfig {

	@Bean
	public ViewResolver  createViewResolver(){
		  InternalResourceViewResolver resolver=null;
		  resolver=new InternalResourceViewResolver();
		  resolver.setPrefix("/WEB-INF/pages/");
		  resolver.setSuffix(".jsp");
		  return resolver;
	}
	
	
	@Bean(name="messageSource")
	public  MessageSource  createResourceBundleMessageSource(){
		   ResourceBundleMessageSource rbms=null;
		   rbms=new ResourceBundleMessageSource();
		   rbms.setBasename("com.nt.commons.validation");
		   return rbms;
	}
	
}
