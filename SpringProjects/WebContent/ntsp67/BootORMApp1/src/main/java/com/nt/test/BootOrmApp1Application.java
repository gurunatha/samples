package com.nt.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@SpringBootApplication
 @Import(value={ServiceConfig.class,PersistenceConfig.class})
public class BootOrmApp1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		List<EmployeeDTO> listDTO=null;
		ctx=SpringApplication.run(BootOrmApp1Application.class, args);
		//get Beanm
		service=ctx.getBean("empService",EmployeeService.class);
		//execute the logics
		listDTO=service.findAllEmployees();
		System.out.println(listDTO);
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}//main
}//class
