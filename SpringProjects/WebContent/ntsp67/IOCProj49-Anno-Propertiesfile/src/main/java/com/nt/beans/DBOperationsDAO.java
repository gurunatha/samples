package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
@Named("dao")
public class DBOperationsDAO {
	@Value("${jdbc.driver}")
   private String driver;
	@Value("${jdbc.url}")
   private String url;
	@Value("${jdbc.user}")
   private String user;
	@Value("${jdbc.pwd}")
   private String pwd;
	
	
	@Override
	public String toString() {
		return "DBOperationsDAO [driver=" + driver + ", url=" + url + ", user=" + user + ", pwd=" + pwd + "]";
	}
}//class
