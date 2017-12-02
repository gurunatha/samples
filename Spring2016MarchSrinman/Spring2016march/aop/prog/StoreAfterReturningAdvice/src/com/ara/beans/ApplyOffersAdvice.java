package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ApplyOffersAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		float amount = 0.0f;
		MemberCard card = null;

		amount = (Float) ret;
		card = (MemberCard) args[1];

		if (card.getType().equals("gold")) {
			if (amount > 5000) {
				System.out
						.println("congratulations! You have availed an 10% of discount on your bill amount, you can redeem in you next purchase coupon : CS10");
			}
		} else if (card.getType().equals("platinum")) {
			if (amount > 3000) {
				System.out
						.println("congratulations! You have availed an 15% of discount on your bill amount, you can redeem in you next purchase coupon : CS15");
			}
		}
	}
}
