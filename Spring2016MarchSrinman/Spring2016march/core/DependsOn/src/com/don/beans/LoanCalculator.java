package com.don.beans;

import java.util.Properties;

import com.don.common.Cache;

public class LoanCalculator {
	private Cache cache;

	public double calInterest(double principle, int n, String city) {
		float rateOfInterest = 0.0f;
		double interestAmount = 0;

		if (cache.containsKey("cityRI") == false) {
			throw new IllegalArgumentException("cities are not loaded");
		}
		Properties props = (Properties) cache.get("cityRI");
		if (props.containsKey(city) == false) {
			throw new IllegalArgumentException(
					"load is not offered in the city : " + city);
		}
		rateOfInterest = Float.parseFloat(props.getProperty(city));
		interestAmount = (principle * n * rateOfInterest) / 100;

		return interestAmount;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
