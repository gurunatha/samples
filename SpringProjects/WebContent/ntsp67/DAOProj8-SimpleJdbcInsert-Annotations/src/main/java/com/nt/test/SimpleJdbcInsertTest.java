package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		//Create Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeService.class);
		//use Service class
		  dto=new EmployeeDTO();
		  dto.setEmpno(1034); dto.setEname("raja"); dto.setJob("clerk"); dto.setSal(9000);
    	 System.out.println(service.registerEmployee(dto));
    	 //close IOC container
    	 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
