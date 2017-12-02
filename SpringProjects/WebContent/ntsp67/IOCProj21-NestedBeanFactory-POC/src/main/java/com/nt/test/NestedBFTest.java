package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.LoanApprover;

public class NestedBFTest {

	public static void main(String[] args) {
		BeanFactory pFactory=null,cFactory;
		LoanApprover approver=null;
		//create Parent IOC container
		pFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/loanDetails-beans.xml"));
		//create Child IOC container
		cFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/loanApprover-beans.xml"),pFactory);
		//getBean
		approver=cFactory.getBean("approver",LoanApprover.class);
		System.out.println(approver.approveLoan());
	}//main
}//class
