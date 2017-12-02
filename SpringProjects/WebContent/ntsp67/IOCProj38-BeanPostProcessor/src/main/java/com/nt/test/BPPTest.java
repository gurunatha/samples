package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.bpp.BOPostProcessor;
import com.nt.service.StudentCustomerService;

public class BPPTest {

	public static void main(String[] args) {
/*		ApplicationContext ctx=null;
		StudentCustomerService service=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean (Service)
		service=ctx.getBean("stCustService",StudentCustomerService.class);
		service.processCustomer(1001,"raja",9000);
		System.out.println("-------------------------------");
		service.processStudent(1002,"ravi","java");
		System.out.println("-------------------------------");
		
		
		//stop container
		((AbstractApplicationContext) ctx).close();
*/
		StudentCustomerService service=null;
		BeanFactory factory=null;
		BOPostProcessor bpp=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//register BeanPostProcessor
		bpp=new BOPostProcessor();
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bpp);	
	
		//get Bean (Service)
			service=factory.getBean("stCustService",StudentCustomerService.class);
			service.processCustomer(1001,"raja",9000);
			System.out.println("-------------------------------");
			service.processStudent(1002,"ravi","java");
			System.out.println("-------------------------------");
		
		}//main
}//class
