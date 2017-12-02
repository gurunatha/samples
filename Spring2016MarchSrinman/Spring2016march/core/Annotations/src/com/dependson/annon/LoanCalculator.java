package com.dependson.annon;

import org.springframework.stereotype.Component;

@Component("loan-calculator")
public class LoanCalculator {

	public LoanCalculator() {
		System.out.println("loan-calculator created..");
	}

	public double calculate(long principle, int tenure, String city) {
		return 398.3f;
	}
}
