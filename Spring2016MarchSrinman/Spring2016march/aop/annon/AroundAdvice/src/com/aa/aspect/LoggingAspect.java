package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class LoggingAspect extends GlobalPointcuts{
	@Around("commonPointcut()")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		System.out
				.print("entered into " + pjp.getSignature().getName() + "(");
		for (int i = 0; i < pjp.getArgs().length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(pjp.getArgs()[i]);
		}
		System.out.println(")");
		Object ret = pjp.proceed();
		System.out.println("exiting from " + pjp.getSignature().getName()
				+ "  with ret : " + ret);
		return ret;
	}
}
