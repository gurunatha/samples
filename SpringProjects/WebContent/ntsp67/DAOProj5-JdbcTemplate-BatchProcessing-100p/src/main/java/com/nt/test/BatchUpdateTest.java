package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.BeanConfigurator;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

import oracle.net.aso.p;

public class BatchUpdateTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		List<StudentDTO> listDTO=null;
		StudentDTO st1=null,st2=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		//get bean
		service=ctx.getBean("stService",StudentService.class);
		//prepare ListDTO
		listDTO=new ArrayList();
		st1=new StudentDTO();
		st1.setSno(1005);st1.setSname("raja");st1.setSadd("hyd");
		st2=new StudentDTO();
		st2.setSno(1006);st2.setSname("ravi");st2.setSadd("vizag");
		listDTO.add(st1); listDTO.add(st2);
		//perform bulk registraion
		System.out.println(service.groupRegistration(listDTO));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}

}
