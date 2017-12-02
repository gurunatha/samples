package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ListEmployeeService;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ListEmployeeService service=null;
	 //create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("listEmpService",ListEmployeeService.class);
		//call methods
		System.out.println("7499 Emp details"+service.listEmployeeByNo(7499));
		System.out.println("-----------------------------------------------------------");
		System.out.println("CLERK emp details"+service.listEmployeeByDesg("CLERK"));
		
		//close IOC
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
