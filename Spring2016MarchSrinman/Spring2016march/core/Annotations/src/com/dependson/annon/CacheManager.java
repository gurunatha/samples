package com.dependson.annon;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("cache-manager")
@DependsOn("loan-calculator")
public class CacheManager {

	public CacheManager() {
		System.out.println("loading cache...");
	}

}
