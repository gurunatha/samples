package com.nt.beans;

public class RequestHandler {
	private static int count;
	
	public RequestHandler() {
		System.out.println("RequestHandler:0-param constructor");
		count++;
	}
	
	public  String handleRequest(String data){
		return "Processing request number "+count+" with Data:"+data;
	}
}//class
