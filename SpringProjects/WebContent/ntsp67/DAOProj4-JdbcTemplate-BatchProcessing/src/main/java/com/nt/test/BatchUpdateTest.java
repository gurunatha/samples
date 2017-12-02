package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class BatchUpdateTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		List<StudentDTO> listDTO=null;
		StudentDTO st1=null,st2=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get bean
		service=ctx.getBean("stService",StudentService.class);
		//prepare ListDTO
		listDTO=new ArrayList();
		st1=new StudentDTO();
		st1.setSno(1003);st1.setSname("raja");st1.setSadd("hyd");
		st2=new StudentDTO();
		st2.setSno(1004);st2.setSname("ravi");st2.setSadd("vizag");
		listDTO.add(st1); listDTO.add(st2);
		//perform bulk registraion
		System.out.println(service.groupRegistration(listDTO));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}

}
