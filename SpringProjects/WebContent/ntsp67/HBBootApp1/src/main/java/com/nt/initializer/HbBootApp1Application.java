package com.nt.initializer;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.dao.EmployeeDAO;
import com.nt.domain.Employee;

@SpringBootApplication
@Import(value = { AppConfig.class})
@ComponentScan(basePackages="com.nt.dao") 
public class HbBootApp1Application {
    
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=SpringApplication.run(HbBootApp1Application.class, args);
	
	//get DAO
	EmployeeDAO dao=ctx.getBean("empDAO",EmployeeDAO.class);
	List<Employee> list=dao.getAllEmployees();
	System.out.println(list);
	
	}
}
