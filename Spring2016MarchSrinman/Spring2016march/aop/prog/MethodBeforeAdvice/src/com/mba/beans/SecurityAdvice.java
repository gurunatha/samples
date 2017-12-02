package com.mba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.helper.AuthenticationHelper;

public class SecurityAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		AuthenticationHelper helper = null;

		helper = AuthenticationHelper.getInstance();
		if (helper.authentication() == false) {
			throw new IllegalAccessException("In-Correct un/pwd");
		}
	}

}
