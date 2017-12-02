package com.mr.beans;

public class PlanFinder {
	public String[] findPlans(int coverageType, int networkType, int copay) {
		return new String[] { "basic coverage", "basic ensure" };
	}
}
