package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.beans.AuditAdvice;
import com.mba.beans.LoanApprover;
import com.mba.beans.SecurityAdvice;
import com.mba.helper.AuthenticationHelper;

public class MBATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanApprover());

		pf.addAdvice(new SecurityAdvice());
		pf.addAdvice(new AuditAdvice());

		AuthenticationHelper helper = AuthenticationHelper.getInstance();
		helper.login("john", "welcome1");
		LoanApprover proxy = (LoanApprover) pf.getProxy();
		boolean flag = proxy.approveLoan(28L);
		helper.logout();
		System.out.println("approved ? : " + flag);

	}
}
