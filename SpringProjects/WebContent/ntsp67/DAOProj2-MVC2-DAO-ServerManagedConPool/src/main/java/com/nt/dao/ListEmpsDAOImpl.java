package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class ListEmpsDAOImpl implements ListEmpsDAO {
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<Map<String, Object>> getEmployeeDetailsByDesg(String desgs) {
		List<Map<String,Object>> listEmps=null;
		//execute the static Query
		listEmps=jt.queryForList("SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN"+desgs+"  ORDER BY JOB");
		return listEmps;
	}

}
