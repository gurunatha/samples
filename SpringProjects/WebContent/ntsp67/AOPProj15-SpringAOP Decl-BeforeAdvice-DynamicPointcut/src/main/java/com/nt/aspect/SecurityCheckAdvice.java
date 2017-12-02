package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.nt.service.AuthenticationManager;

public class SecurityCheckAdvice implements MethodBeforeAdvice {
  
	private AuthenticationManager manager;
	
	public void setManager(AuthenticationManager manager) {
		this.manager = manager;
	}

    
	public void before(Method method, Object[] args, Object target) throws Throwable {
		boolean flag=false;
		//perform  Security check
		flag=manager.validate();
		if(flag==false)
			throw new IllegalAccessException("Invalid username/password");
	}
}
