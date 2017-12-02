package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	private  static final  String HQL_AUTH_QUERY="SELECT count(*) from UserBO where uname=? and pwd=?";
	@Autowired
	private HibernateTemplate ht;
	@Override
	public long validate(UserBO bo) {
	    long count=0;
	    List<?> list=null;
		//execute query
		list=ht.find(HQL_AUTH_QUERY, bo.getUname(),bo.getPwd());
		count=(Long)list.get(0);
		return count;
	}

}
