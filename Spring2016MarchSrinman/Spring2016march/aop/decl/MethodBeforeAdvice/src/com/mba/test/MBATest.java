package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanApprover;
import com.mba.security.core.AuthenticationManager;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mba/common/application-context.xml");
		AuthenticationManager manager = AuthenticationManager.getInstance();
		manager.login("john", "welcome1");
		LoanApprover la = context.getBean("loanApprover", LoanApprover.class);
		System.out.println("approve loan ? : " + la.approveLoan(23));
		manager.logout();
	}
}
