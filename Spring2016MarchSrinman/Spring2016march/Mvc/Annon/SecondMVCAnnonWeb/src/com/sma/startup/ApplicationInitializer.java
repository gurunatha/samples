package com.sma.startup;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		ContextLoaderListener contextLoaderListener = null;
		DispatcherServlet dispatcherServlet = null;
		XmlWebApplicationContext rootContext = null;
		XmlWebApplicationContext webContext = null;

		rootContext = new XmlWebApplicationContext();
		rootContext.setConfigLocation("/WEB-INF/application-context.xml");

		contextLoaderListener = new ContextLoaderListener(rootContext);
		container.addListener(contextLoaderListener);

		webContext = new XmlWebApplicationContext();
		webContext.setConfigLocation("/WEB-INF/web-beans.xml");
		dispatcherServlet = new DispatcherServlet(webContext);

		ServletRegistration.Dynamic servletConfig = container.addServlet(
				"dispatcher", dispatcherServlet);
		servletConfig.setLoadOnStartup(2);
		servletConfig.addMapping("*.htm");

	}
}
