package com.nt.aspect;

import java.lang.reflect.Method;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.aop.MethodBeforeAdvice;

import com.nt.service.AuthenticationManager;

@Named("securityAdvice")
public class SecurityCheckAdvice implements MethodBeforeAdvice {
  @Resource
	private AuthenticationManager manager;

    
	public void before(Method method, Object[] args, Object target) throws Throwable {
		boolean flag=false;
		//perform  Security check
		flag=manager.validate();
		if(flag==false)
			throw new IllegalAccessException("Invalid username/password");
	}
}
