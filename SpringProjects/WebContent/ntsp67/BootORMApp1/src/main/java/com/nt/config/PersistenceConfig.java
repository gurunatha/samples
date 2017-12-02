package com.nt.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	@Autowired
	private DataSource ds;
	
	@Bean
	public  LocalSessionFactoryBean createLocalSessionFactoryBean(){
		LocalSessionFactoryBean lsfb=null;
		Properties props=null;
		
		lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(ds);
		lsfb.setAnnotatedClasses(com.nt.domain.Employee.class);
		lsfb.setAnnotatedPackages("com.nt.domain");
		props=new Properties();
		props.setProperty("hibernate.show_sql","true");
		props.setProperty("hibenrate.dialect","org.hibernate.dialect.Oracle10gDialect");
		lsfb.setHibernateProperties(props);
		return lsfb;
	}
	
	@Bean
	public HibernateTemplate  createHibernateTemplate(){
		HibernateTemplate ht=null;
		
		ht=new HibernateTemplate(createLocalSessionFactoryBean().getObject());
		return ht;
	}
	

}
