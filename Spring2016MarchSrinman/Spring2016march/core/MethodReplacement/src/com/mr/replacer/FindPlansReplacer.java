package com.mr.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args)
			throws Throwable {
		if (method.getName().equals("findPlans") == false) {
			throw new Exception("Method : " + method.getName()
					+ " is not supported by this replacer to replace...");
		}

		return new String[] { "basic acheiver", "basic ensure" };
	}

}
