package com.nt.event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCPerformanceMonitoringListener implements ApplicationListener {
  private long start,end;
	public void onApplicationEvent(ApplicationEvent ae) {
		if(ae.toString().indexOf("Refreshed")!=-1){
		    start=System.currentTimeMillis();
		    System.out.println("IOC container is created at::"+new Date());
		}
		else if(ae.toString().indexOf("Closed")!=-1){
			end=System.currentTimeMillis();
		System.out.println("IOC Container is in running mode for  "+(end-start)+" ms");
		System.out.println("IOC Contianer is stopped at::"+new Date());
		}
	}//onApplicationEvent(-)
}//class
