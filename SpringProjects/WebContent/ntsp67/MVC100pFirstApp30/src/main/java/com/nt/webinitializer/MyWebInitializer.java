package com.nt.webinitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

public class MyWebInitializer implements WebApplicationInitializer {
	
	 public   void  onStartup(ServletContext sc){
	     AnnotationConfigWebApplicationContext  rootCtx=null,webCtx=null;
	     ContextLoaderListener listener=null;
	     DispatcherServlet servlet=null;
	     //create RootAppContext Container for Businer tier comps
	     rootCtx=new AnnotationConfigWebApplicationContext();
	     rootCtx.register(RootAppConfig.class);
	     //create webAppContext Container for presentation tier comps
	     webCtx=new AnnotationConfigWebApplicationContext();
	     webCtx.register(WebMvcAppConfig.class);

	     //Create ContextLoaderListener having RootAppContext container
	    listener=new ContextLoaderListener(rootCtx);
	    // add/register Listener
	     sc.addListener(listener);

	     //Create DispatcherSerlvet having WebAppContext container
	    servlet=new DispatcherServlet(webCtx);
	    //register Servlet
	     ServletRegistration.Dynamic registration=sc.addServlet("dispatcher",servlet);
	     registration.setLoadOnStartup(1);
	     registration.addMapping("*.htm");
	     }
	  }
