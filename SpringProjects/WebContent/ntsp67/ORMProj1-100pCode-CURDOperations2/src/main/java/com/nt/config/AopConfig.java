package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AopConfig {

	@Bean(name="hbTxMgmr")
	public  HibernateTransactionManager  createHBTxManager(){
		return new HibernateTransactionManager(PersistenceConfig.createSessionFactory());
	}
}
