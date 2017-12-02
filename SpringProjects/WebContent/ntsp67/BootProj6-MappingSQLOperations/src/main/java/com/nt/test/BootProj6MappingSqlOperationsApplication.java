package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

@SpringBootApplication
@ComponentScan(basePackages={"com.nt.dao","com.nt.service"})
public class BootProj6MappingSqlOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService service=null;
		StudentDTO dto=null;
		ctx=SpringApplication.run(BootProj6MappingSqlOperationsApplication.class, args);
		//get Bean
		service=ctx.getBean("stService",StudentService.class);
		//invoke Method
		System.out.println(service.findStudentBySno(9988));
		
		//prepare DTO class object
		dto=new StudentDTO();
		dto.setSno(9986); dto.setSname("Rajesh"); dto.setSadd("hyd");
		System.out.println(service.registerStudent(dto));
		//close IOC container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
