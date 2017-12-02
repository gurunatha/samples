package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationsDAOImpl implements DBOperationsDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(?,?,?,?)";
	private static final String EMP_GET_SALARY = "SELECT SAL FROM EMP WHERE EMPNO=?";
	private static final String EMP_DETAILS_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String EMP_DETAILS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private static final String UPDATE_EMP_SALARY = "UPDATE EMP SET SAL=? WHERE EMPNO=?";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(int no, String name, String job, int salary) {
		int count = 0;
		count = jt.update(EMP_INSERT_QUERY, no, name, job, salary);
		return count;
	}

	@Override
	public int getSalary(int no) {
		int salary = 0;
		salary = (Integer) jt.queryForObject(EMP_GET_SALARY, Integer.class, no);
		return salary;
	}

	@Override
	public Map<String, Object> getEmpDetailsByNo(int no) {
		Map<String, Object> map = null;
		map = jt.queryForMap(EMP_DETAILS_BY_NO, no);
		return map;
	}

	@Override
	public List<Map<String, Object>> getEmpDetailsByDesg(String desg) {
		List<Map<String, Object>> list = null;
		list = jt.queryForList(EMP_DETAILS_BY_DESG, desg);
		return list;
	}

	@Override
	public int updateSalary(int no, int newSalary) {
		int result = 0;
		result = jt.update(UPDATE_EMP_SALARY, newSalary, no);
		return result;

	}

}
