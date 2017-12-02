package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
	   ApplicationContext ctx=null;
	   StudentService service=null;
	   StudentDTO dto=null;
		//create IOC contaner
	   ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
	   service=ctx.getBean("stService",StudentService.class);
	   // invoke methods
	   dto=service.searchStudentByNo(1002);
	   System.out.println(dto);
	   //close container
	   ((AbstractApplicationContext) ctx).close();
	}//main
}//class
