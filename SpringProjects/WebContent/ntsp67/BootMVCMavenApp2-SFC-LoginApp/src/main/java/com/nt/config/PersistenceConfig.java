package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	@Autowired
	private DataSource ds;
	
	
	@Bean
	public LocalSessionFactoryBean createLocalSessionFactoryBean(){
		LocalSessionFactoryBean lsfb=null;
		lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(ds);
		lsfb.setAnnotatedClasses(com.nt.domain.User.class);
		lsfb.setAnnotatedPackages("com.nt.domain");
		return lsfb;
	}//method
	
	@Bean
	public  HibernateTemplate  createHibernateTemplate(){
		HibernateTemplate ht=null;
		ht=new HibernateTemplate(createLocalSessionFactoryBean().getObject());
		return ht;
	}//method

}//class
