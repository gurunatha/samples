package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.UserDetails;

public class AuthenticateDAOImpl implements AuthenticateDAO {
	private static final String AUTHENTICATE_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int authenticate(UserDetails details) {
	  int count=0;
	  //execute Query
	 count=template.queryForObject(AUTHENTICATE_QUERY,Integer.class,details.getUsername(),details.getPassword());
	  return count;
	}
}
