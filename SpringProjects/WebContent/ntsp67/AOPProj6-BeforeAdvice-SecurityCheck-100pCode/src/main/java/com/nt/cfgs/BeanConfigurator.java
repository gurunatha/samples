package com.nt.cfgs;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.aspect.SecurityCheckAdvice;
import com.nt.dao.AuthenticateDAO;
import com.nt.dao.AuthenticateDAOImpl;
import com.nt.service.AuthenticationManager;
import com.nt.service.IntrAmountCalculator;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class BeanConfigurator {
	
	@Bean(name="bds")
	public DataSource   createDataSource(){
		BasicDataSource bds=null;
		//create and return BasicDataSource
		bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("manager");
		bds.setInitialSize(10);
		bds.setMaxTotal(30);
		return bds;
	}
	@Bean(name="jt")
	public JdbcTemplate  createJdbcTemplate(){
		JdbcTemplate jt=null;
		//create and return JdbcTemplate class objecct
		jt=new JdbcTemplate(createDataSource());
		return jt;
	}
	
	@Bean(name="authDAO")
	public  AuthenticateDAO createDAO(){
		AuthenticateDAOImpl dao=null;
		dao=new AuthenticateDAOImpl();
		dao.setTemplate(createJdbcTemplate());
		return dao;
	}
	
	@Bean(name="iac")
	public  IntrAmountCalculator createService(){
		return new IntrAmountCalculator();
	}
	
	@Bean(name="authManager")
	public  AuthenticationManager createManager(){
		 AuthenticationManager manager=null;
		 
		 manager=new AuthenticationManager();
		 manager.setDao(createDAO());
		 return manager;
	}
	
	@Bean(name="securityAdvice")
	public SecurityCheckAdvice  createAdvice(){
		 SecurityCheckAdvice advice=null;
		 advice=new SecurityCheckAdvice();
		 advice.setManager(createManager());
		 return advice;
	}

	@Bean(name="pfb")
	public IntrAmountCalculator createProxy(){
		ProxyFactory pf=null;
		pf=new ProxyFactory();
		pf.addAdvice(createAdvice());
		pf.setTarget(createService());
		return  (IntrAmountCalculator) pf.getProxy();
	}
}//class
