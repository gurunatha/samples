package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract  class MyServletContainer {
	 
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}
	
	public void  processRequest(String data){
		RequestHandler handler=null;
		System.out.println("ServletContainer is processing the request");
		// get Request Hanlder
		handler=getRequestHandler();
		System.out.println(handler.handleRequest(data));
	}//method
	
	//mandatory method in Lookmethod injection
	public abstract RequestHandler  getRequestHandler();

}//class
