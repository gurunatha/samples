package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentInsertDAOImpl implements StudentInsertDAO {
	private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
	private static final String GET_SNO_FROM_SEQ="SELECT SNO_SEQ1.nextVal from dual";
   private JdbcTemplate jt;
	
   public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

@Override
	public int insert(StudentBO bo) {
	  int count=0;
	  int no;
	  no=jt.queryForObject(GET_SNO_FROM_SEQ, Integer.class);
	  count=jt.update(INSERT_STUDENT_QUERY,no,bo.getSname(),bo.getSadd());
		return count;
	}//insert(-)
}//class
