package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class MappingSQLOperationsTest {

	public static void main(String[] args) {
	   ApplicationContext ctx=null;
	   StudentService service=null;
	   List<StudentDTO> listDTO=null;
		//create IOC contaner
	   ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
	   service=ctx.getBean("stService",StudentService.class);
	   // invoke methods
	   listDTO=service.getDetailsByAddrs("hyd");
	   System.out.println("Student Details are::::");
	   System.out.println(listDTO);
	   //close container
	   ((AbstractApplicationContext) ctx).close();
	}//main
}//class
