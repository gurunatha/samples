package com.sma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebConfig {
	@Bean(name = "/auto-initialization.htm")
	public Controller newNoteViewController() {
		ParameterizableViewController controller = null;

		controller = new ParameterizableViewController();
		controller.setViewName("default-init-listener-dispatcher");
		return controller;
	}

	@Bean
	public ViewResolver newInternalResourceViewResolver() {
		InternalResourceViewResolver viewResolver = null;

		viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
