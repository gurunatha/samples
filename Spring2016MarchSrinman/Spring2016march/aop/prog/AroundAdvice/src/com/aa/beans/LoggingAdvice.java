package com.aa.beans;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Object ret = null;

		methodName = methodInvocation.getMethod().getName();
		System.out.println("invoke called for : " + methodName);

		args = methodInvocation.getArguments();
		System.out.println("entered into "
				+ getMethodAsString(methodInvocation.getMethod(), args));
		args[0] = (Integer) args[0] + 1;
		args[1] = (Integer) args[1] + 1;

		ret = methodInvocation.proceed();
		System.out.println("exiting from "
				+ getMethodAsString(methodInvocation.getMethod(), args)
				+ " with ret : " + ret);
		ret = (Integer) ret + 1;
		return ret;
	}

	private String getMethodAsString(Method method, Object[] args) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		buffer.append(method.getName()).append("(");

		for (int i = 0; i < args.length; i++) {
			if (i != 0) {
				buffer.append(",");
			}
			buffer.append(args[i]);
		}
		buffer.append(")");
		return buffer.toString();
	}
}
