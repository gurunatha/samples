package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("voter")
public class VoterChecking {
	@Value("raja")
	private String name;
	@Value("30")
	private int age;
	
	public VoterChecking() {
		System.out.println("VoterChecking::0-param constructor");
	}
	
	@PostConstruct
	public void myInit()throws Exception{
		System.out.println("VoterChecking::myInit()");
		if(age<0 || name==null)
			throw new Exception("Please inject valid values to bean properties");
	}
	
	@PreDestroy
	public void myDestroy()throws Exception{
		System.out.println("VoterChecking::myDestroy()");
		name=null;
		age=0;
	}
	
	public String checkElgibility(){
		if(age>=18)
			return  name+"  u r elgible to vote";
		else
			return name+" u need to wait "+(18-age)+" years to vote";
	}
	
}//class
