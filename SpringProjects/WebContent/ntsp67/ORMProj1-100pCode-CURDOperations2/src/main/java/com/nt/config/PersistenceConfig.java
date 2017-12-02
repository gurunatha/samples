package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import com.nt.hlo.EmpDetailsHLO;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	@Bean
	public static DataSource createDataSource(){
		BasicDataSource bds=null;
		bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("manager");
		return bds;
	}
	
	@Bean
	public  static SessionFactory createSessionFactory(){
		return  new LocalSessionFactoryBuilder(createDataSource()).addAnnotatedClass(EmpDetailsHLO.class).buildSessionFactory();
	}
	
	@Bean
	public  static  HibernateTemplate createHibernateTemplate(){
		return new HibernateTemplate(createSessionFactory());
	}

}
