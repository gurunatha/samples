package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

@Configuration
public class AOPConfig {
	
	@Bean(name="hbTxMgmr")
	public  HibernateTransactionManager createHBTxMgmr(){
		HibernateTransactionManager hbTxMgmr=null;
		hbTxMgmr=new HibernateTransactionManager(PersistenceConfig.createSessionFactory());
		return hbTxMgmr;
	}

}
