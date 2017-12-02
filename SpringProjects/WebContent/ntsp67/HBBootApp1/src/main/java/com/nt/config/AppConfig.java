package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
@Configuration
public class AppConfig {
	@Autowired
	private DataSource ds;
	@Bean
	public LocalSessionFactoryBean createLocalSessionFactoryBean(){
		LocalSessionFactoryBean factory=null;
		factory=new  LocalSessionFactoryBean();
		factory.setDataSource(ds);
		factory.setPackagesToScan("com.nt.domain");
		return factory;
				
	}
	
	@Bean
	public HibernateTemplate createHBTemplate(){
		return new HibernateTemplate(createLocalSessionFactoryBean().getObject());
	}

}
