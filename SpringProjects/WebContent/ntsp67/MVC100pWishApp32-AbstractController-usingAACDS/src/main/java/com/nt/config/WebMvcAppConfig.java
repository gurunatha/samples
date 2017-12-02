package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.nt.controller")
public class WebMvcAppConfig {
	
	@Bean
	public HandlerMapping createHandlerMapping(){
		 SimpleUrlHandlerMapping mapping=null;
		 Properties  mappingProps=null;
		 
		 mapping=new SimpleUrlHandlerMapping();
		 mappingProps=new Properties();
		 mappingProps.put("/home.htm","pvc");
		 mapping.setMappings(mappingProps);
		 return mapping;
	}
	
	@Bean(name="pvc")
	public  ParameterizableViewController createPVC(){
		ParameterizableViewController controller=null;
		controller=new ParameterizableViewController();
		controller.setViewName("welcome");
		return controller;
	}

	@Bean(name="ivr")
	public  ViewResolver  createInteranlResourceViewResolver(){
		 InternalResourceViewResolver ivr=null;
		 
		 ivr=new InternalResourceViewResolver();
		 ivr.setPrefix("/WEB-INF/pages/");
		 ivr.setSuffix(".jsp");
		 return ivr;
		
	}

}
