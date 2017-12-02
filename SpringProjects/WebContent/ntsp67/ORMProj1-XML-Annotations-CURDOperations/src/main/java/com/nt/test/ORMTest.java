package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.EmpDetailsController;

public class ORMTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmpDetailsController controller=null;
		//create IOC container
         ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
         //get Controller
         controller=ctx.getBean("empController",EmpDetailsController.class);
         System.out.println(controller.takeEmpDetails(101,"ramesh","airforce"));
         //System.out.println("1 emp detials"+controller.getEmpDetails(1));
        //System.out.println("manager emp Details::"+controller.getEmpDetailsByDesg("airforce"));
         //System.out.println(controller.fireEmployeesByDesg("clerk"));
         
         //close container
         ((AbstractApplicationContext) ctx).close();
	}

}
