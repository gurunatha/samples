package com.nt.beans;

public class MyServletContainer {
	private RequestHandler  handler;
	
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}
	
	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}
	
	public void  processRequest(String data){
		System.out.println("ServletContainer is processing the request");
		//hanlde request
		System.out.println(handler.handleRequest(data));
	}
}//class
