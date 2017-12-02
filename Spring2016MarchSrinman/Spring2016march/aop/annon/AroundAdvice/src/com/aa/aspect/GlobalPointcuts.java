package com.aa.aspect;

import org.aspectj.lang.annotation.Pointcut;

abstract public class GlobalPointcuts {
	@Pointcut("execution(* com.aa.beans.*.*(..))")
	public void commonPointcut() {
	}

}
