package com.fma.startup;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.fma.config.RootConfig;
import com.fma.config.WebConfig;

public class AnnotationApplicationInitializer implements
		WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext context) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = null;
		AnnotationConfigWebApplicationContext webContext = null;

		rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		context.addListener(new ContextLoaderListener(rootContext));

		webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(WebConfig.class);

		ServletRegistration.Dynamic sconfig = context.addServlet("dispatcher",
				new DispatcherServlet(webContext));
		sconfig.setLoadOnStartup(2);
		sconfig.addMapping("*.htm");
	}
}
