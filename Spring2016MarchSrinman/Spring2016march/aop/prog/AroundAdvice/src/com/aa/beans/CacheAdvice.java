package com.aa.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.util.Cache;

public class CacheAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String key = null;
		Cache cache = null;
		Object[] args = null;
		String methodName = null;

		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();
		key = getMethodAsString(methodName, args);
		cache = Cache.getInstance();

		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		Object ret = methodInvocation.proceed();
		cache.put(key, ret);

		return ret;
	}

	private String getMethodAsString(String methodName, Object[] args) {
		StringBuffer buffer = new StringBuffer();

		buffer.append(methodName).append("(");
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
