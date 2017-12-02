package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware {
	 private String beanId;
	 private ApplicationContext ctx;
	 
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx)  {
     this.ctx=ctx;
	}
	
	
	public void  processRequest(String data){
		RequestHandler handler=null;
		System.out.println("ServletContainer is processing the request");
		//hanlde request (Dependecny lookp)
		handler=(RequestHandler)ctx.getBean("rh",RequestHandler.class);
		System.out.println(handler.handleRequest(data));
	}//method

}//class
