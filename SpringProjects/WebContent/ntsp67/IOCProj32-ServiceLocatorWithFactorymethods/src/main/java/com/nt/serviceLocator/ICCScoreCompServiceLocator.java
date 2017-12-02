package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import com.nt.ext.icc.ExernalICCScoreCompServiceImpl;
import com.nt.ext.icc.ExternalICCScoreCompService;

public class ICCScoreCompServiceLocator {
	//private static Map<String,ExternalICCScoreCompService> cache=new HashMap();
	private  Map<String,ExternalICCScoreCompService> cache=new HashMap();
	

/*   public static  ExternalICCScoreCompService   getService(String jndi){
	   System.out.println("getService(-,-)");
		ExternalICCScoreCompService extComp=null;
		   if(!cache.containsKey(jndi)){
			   //write jndi lookup code /web service consumer code to get External ref and place in cache
			   extComp=new ExernalICCScoreCompServiceImpl();
			   cache.put(jndi, extComp);
		   }
		return cache.get(jndi);
	}//method
*/
	
	   public   ExternalICCScoreCompService   getService(String jndi){
			ExternalICCScoreCompService extComp=null;
			   if(!cache.containsKey(jndi)){
				   //write jndi lookup code /web service consumer code to get External ref and place in cache
				   extComp=new ExernalICCScoreCompServiceImpl();
				   cache.put(jndi, extComp);
			   }
			return cache.get(jndi);
		}//method
}//class
