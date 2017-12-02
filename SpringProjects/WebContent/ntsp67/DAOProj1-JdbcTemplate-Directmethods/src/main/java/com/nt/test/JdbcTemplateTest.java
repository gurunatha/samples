package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.DBOperationService;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DBOperationService service=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
       // get Bean
		service=ctx.getBean("operationsService",DBOperationService.class);
		//System.out.println(service.register(1001, "raja","clerk",9000));
		System.out.println("----------------------------------------------------------");
		System.out.println("7499 Emp Salary:::"+service.fetchSalary(7499));
		System.out.println("----------------------------------------------------------");
		System.out.println("Emp Details :::"+service.fetchEmpDetailsByNo(7499));
		System.out.println("-------------------------------------------------------------");
		System.out.println("Emp Details having CLERK Desg"+service.listEmpDetailsByDesg("CLERK"));
		System.out.println("---------------------------------------------------------------");
		System.out.println(service.hikeSalary(7499,10));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
