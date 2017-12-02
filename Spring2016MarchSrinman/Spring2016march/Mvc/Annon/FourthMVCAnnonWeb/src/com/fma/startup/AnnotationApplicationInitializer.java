package com.fma.startup;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.fma.config.WebMvcConfiguration;

public class AnnotationApplicationInitializer implements
		WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext context) throws ServletException {
		AnnotationConfigWebApplicationContext webContext = null;

		webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(WebMvcConfiguration.class);

		ServletRegistration.Dynamic sconfig = context.addServlet("dispatcher",
				new DispatcherServlet(webContext));
		sconfig.setLoadOnStartup(1);
		sconfig.addMapping("*.htm");
	}

}
