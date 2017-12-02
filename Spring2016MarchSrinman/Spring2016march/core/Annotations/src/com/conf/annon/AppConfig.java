package com.conf.annon;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = { "biCycle", "biCycle1" }, autowire = Autowire.BY_TYPE, initMethod = "init", destroyMethod = "destroy")
	public BiCycle newBiCycle() {
		BiCycle biCycle = new BiCycle();
		return biCycle;
	}

	@Bean
	public Chain newChain() {
		return new Chain();
	}
}
