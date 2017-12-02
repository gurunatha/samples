package com.prof.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Profile("dev")
@Configuration
@PropertySource("classpath:com/prof/annon/db-dev.properties")
public class DevAppConfig {
	@Autowired
	private Environment env;

	@Bean(name = "connectionProvider")
	public ConnectionProvider connectionProvider() {
		System.out.println("dev config");
		DriverManagerConnectionProvider provider = new DriverManagerConnectionProvider();
		provider.setDriverClassname(env.getProperty("db.driverClassname"));
		provider.setUrl(env.getProperty("db.url"));
		provider.setUsername(env.getProperty("db.username"));
		provider.setPassword(env.getProperty("db.password"));
		return provider;
	}
}
