package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.nt.controller")
@EnableWebMvc
public class WebMvcAppConfig {
	

	@Bean
	 public  ViewResolver createViewResolver(){
		  InternalResourceViewResolver viewResolver=null;
		  //create and return ViewResolver
		  viewResolver=new InternalResourceViewResolver();
		  viewResolver.setPrefix("/WEB-INF/pages/");
		  viewResolver.setSuffix(".jsp");
		  return viewResolver;
	 }//method
}//class
