package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import com.nt.bo.UserDetails;
import com.nt.dao.AuthenticateDAO;

@Named("authManager")
public class AuthenticationManager {
	private ThreadLocal<UserDetails> threadLocal=new ThreadLocal();
	@Resource
	private  AuthenticateDAO dao;
	
	
	
	public  void signIn(String user,String pwd){
	   UserDetails details=null;
	   details=new UserDetails();
	   
	   details.setUsername(user);
	   details.setPassword(pwd);
	   
	   threadLocal.set(details);
	}//method
	
	public void signOut(){
		threadLocal.remove();
	}
	
	public boolean validate(){
		int count=0;
		UserDetails details=null;
		details=threadLocal.get();
		count=dao.authenticate(details);
		if(count==0)
			return false;
		else
			return true;
	}//validate()
}//class
