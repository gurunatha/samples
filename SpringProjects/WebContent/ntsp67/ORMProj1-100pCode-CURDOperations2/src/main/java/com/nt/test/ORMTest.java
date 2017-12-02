package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.controller.EmpDetailsController;

public class ORMTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmpDetailsController controller=null;
		//create IOC container
         ctx=new AnnotationConfigApplicationContext(AppConfig.class);
         //get Controller
         controller=ctx.getBean("empController",EmpDetailsController.class);
         System.out.println(controller.takeEmpDetails(105,"ramesh","airforce"));
         
         //System.out.println("1 emp detials"+controller.getEmpDetails(1));
        //System.out.println("manager emp Details::"+controller.getEmpDetailsByDesg("airforce"));
         //System.out.println(controller.fireEmployeesByDesg("clerk"));
         
         //close container
         ((AbstractApplicationContext) ctx).close();
	}

}
