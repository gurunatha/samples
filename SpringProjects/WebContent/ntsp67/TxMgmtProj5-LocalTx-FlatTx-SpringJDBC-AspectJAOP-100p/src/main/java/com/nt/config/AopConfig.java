package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AopConfig {

	@Bean(name="dsTxMgmr")
	public  DataSourceTransactionManager createTxManager(){
		return new  DataSourceTransactionManager(PersistenceConfig.createDataSource());
	}
}
