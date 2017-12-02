package com.nt.cfgs;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceBeanConfigurator {
	
	@Bean
	public DataSource  createDataSource(){
		 BasicDataSource bds=null;
		 bds=new BasicDataSource();
		 bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		 bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		 bds.setUsername("system");
		 bds.setPassword("manager");
		 return bds;
	}
	
	@Bean
	public  SimpleJdbcInsert  createSimpleJdbcInsert(){
		SimpleJdbcInsert sji=null;
		sji=new SimpleJdbcInsert(createDataSource());
		return sji;
	}
	

}//class
