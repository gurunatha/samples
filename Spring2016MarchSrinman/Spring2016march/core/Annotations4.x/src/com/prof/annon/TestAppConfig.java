package com.prof.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Profile("test")
@Configuration
@PropertySource("classpath:com/prof/annon/db-test.properties")
public class TestAppConfig {
	@Autowired
	private Environment env;

	@Bean(name = "connectionProvider")
	public ConnectionProvider connectionProvider() {
		DataSourceConnectionProvider provider = null;
		String dataSourceName = null;

		dataSourceName = env.getProperty("dataSourcename");
		provider = new DataSourceConnectionProvider(dataSourceName);
		return provider;
	}
}
