package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class NamedJdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
		//create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		 service=ctx.getBean("empService",EmployeeService.class);
		 //use Service
		 System.out.println("7499 name:"+service.searchEmpNameByNo(7499));
		 System.out.println("7499 Details"+service.searchEmpDetailsByNo(7499));
		 //register details
		 dto=new EmployeeDTO();
		 dto.setEno(456); dto.setEname("raja"); dto.setJob("clerk"); dto.setSalary(9000);
		System.out.println(service.registerEmployee(dto));
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
