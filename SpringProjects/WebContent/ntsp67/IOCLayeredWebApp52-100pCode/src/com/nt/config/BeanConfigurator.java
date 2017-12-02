package com.nt.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.nt.dao","com.nt.service"})
@PropertySource(value="classpath:com/nt/commons/jdbc.properties")
public class BeanConfigurator {
	@Resource
	private Environment env;

	@Bean
	public DataSource createDataSource(){
		DriverManagerDataSource ds=null;
		ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		ds.setUrl(env.getRequiredProperty("jdbc.url"));
		ds.setUsername(env.getRequiredProperty("jdbc.user"));
		ds.setPassword(env.getRequiredProperty("jdbc.pwd"));
	   return ds;
	}

}
