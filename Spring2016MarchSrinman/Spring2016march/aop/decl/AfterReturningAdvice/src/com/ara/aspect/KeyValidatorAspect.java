package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

public class KeyValidatorAspect {
	public void validate(JoinPoint jp, Object ret) {
		System.out.println("validate() called for : "
				+ jp.getSignature().getName());
		if (ret == null || ((String) ret).length() <= 8) {
			throw new IllegalArgumentException("Weak key generated");
		}
	}
}
