package com.mba.aspect;

import org.aspectj.lang.JoinPoint;

import com.mba.security.core.AuthenticationManager;

public class SecurityAspect {
	private AuthenticationManager authenticationManager;

	public SecurityAspect(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	public void audit(JoinPoint jp) {
		System.out.println("called " + jp.getSignature().getName() + " by "
				+ authenticationManager.getLoggedInUser());
	}

	public void authenticate() throws Throwable {
		if (authenticationManager.doAuthentication() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}
}
