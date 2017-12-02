package com.nt.config;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.nt.bo.UserBO;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {

	@Bean(name="smds")
	public static DataSource  createDataSource(){
		JndiDataSourceLookup jdsl=null;
		DataSource ds=null;
		//use server managed jdbc con pool
		jdsl=new JndiDataSourceLookup();
		ds=jdsl.getDataSource("java:/comp/env/DsJndi");
		return ds;
	}
	
	@Bean(name="sesfact")
	public  static SessionFactory   createSessionFactory(){
		LocalSessionFactoryBuilder builder=null;
		builder=new LocalSessionFactoryBuilder(createDataSource());
		builder.addAnnotatedClass(UserBO.class);
		builder.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		builder.setProperty("hibernate.show_sql","true");
		return builder.buildSessionFactory();
	}
	
	@Bean(name="template")
	public  HibernateTemplate  createHibenrateTemplate(){
		  HibernateTemplate ht=null;
		  ht=new HibernateTemplate(createSessionFactory());
		  return ht;
	}
	
}//class
