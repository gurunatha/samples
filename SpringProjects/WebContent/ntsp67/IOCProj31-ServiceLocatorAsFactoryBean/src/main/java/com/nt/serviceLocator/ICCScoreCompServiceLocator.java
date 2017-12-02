package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.ext.icc.ExernalICCScoreCompServiceImpl;
import com.nt.ext.icc.ExternalICCScoreCompService;

public class ICCScoreCompServiceLocator implements FactoryBean<ExternalICCScoreCompService>{
	private Map<String,ExternalICCScoreCompService> cache=new HashMap();
	private String jndi;
	

	public ICCScoreCompServiceLocator(String jndi) {
		this.jndi = jndi;
	}

	@Override
	public ExternalICCScoreCompService getObject() throws Exception {
		ExternalICCScoreCompService extComp=null;
		   if(!cache.containsKey(jndi)){
			   //write jndi lookup code /web service consumer code to get External ref and place in cache
			   extComp=new ExernalICCScoreCompServiceImpl();
			   cache.put(jndi, extComp);
		   }
		return cache.get(jndi);
	}//method

	@Override
	public Class getObjectType() {
		return ExternalICCScoreCompService.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	

}
