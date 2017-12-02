package com.fma.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		DispatcherServlet dispatcherServlet = null;

		dispatcherServlet = new DispatcherServlet();
		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", dispatcherServlet);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("*.htm");
	}
}
