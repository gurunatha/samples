package com.tma.startup;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ApplicationInitializer extends
		AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext webContext = null;

		webContext = new XmlWebApplicationContext();
		webContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		return webContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.htm" };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext rootContext = null;

		rootContext = new XmlWebApplicationContext();
		rootContext.setConfigLocation("/WEB-INF/application-context.xml");
		return rootContext;
	}

}
