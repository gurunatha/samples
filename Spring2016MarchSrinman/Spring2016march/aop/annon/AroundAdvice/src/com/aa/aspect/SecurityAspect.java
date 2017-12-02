package com.aa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import com.mba.security.core.AuthenticationManager;

@Aspect
@Order(2)
public class SecurityAspect extends GlobalPointcuts {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Order(2)
	@Before("commonPointcut()")
	public void audit(JoinPoint jp) {
		System.out.println("called " + jp.getSignature().getName() + "  by "
				+ authenticationManager.getLoggedInUser());
	}

	@Order(1)
	@Before("commonPointcut()")
	public void authenticate(JoinPoint jp) throws Throwable {
		if (authenticationManager.doAuthentication() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}

}
