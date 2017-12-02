package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.domain.User;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
   private  static final String   HQL_VALIDATE_QUERY="select count(*) from User where uname=:un and pwd=:pass";
   
   @Autowired
	private HibernateTemplate ht;
   
   @Override
	public long validate(User user) {
	     long count=0;
	     List<Long> list=null;
	     list=(List<Long>) ht.findByNamedParam(HQL_VALIDATE_QUERY, new String[]{"un","pass"},new String[]{user.getUname(),user.getPwd()});
	     count=(Long)list.get(0);
		return count;
	}

}
