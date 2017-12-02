package com.nt.dao;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nt.bo.EmployeeBO;

@Named("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String FIND_EMP_NAME = "SELECT ENAME FROM EMP WHERE EMPNO=:id";
	private static final String FIND_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=:id";
	private static final String INSERT_EMP = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(:eno,:ename,:job,:salary)";
	@Resource
	private NamedParameterJdbcTemplate npjt;

	public String findEmpNameByNo(int no) {
		String name = null;
		Map map = new HashMap<String, Object>();
		// set value to named param
		map.put("id", no);
		// execute the Query
		name = npjt.queryForObject(FIND_EMP_NAME, map, String.class);
		return name;
	}

	public EmployeeBO findEmpDetailsByNo(int no) {
		EmployeeBO domain = null;
		MapSqlParameterSource source = null;
		// set named param values
		source = new MapSqlParameterSource();
		source.addValue("id", no);
		// execute Query
		domain = npjt.queryForObject(FIND_EMP_DETAILS, source, (ResultSet rs, int index) -> {
			EmployeeBO bo = null;
			// copy ResultSet object record Bo object
			bo = new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			return bo;
		});

		return domain;
	}// method

	public int insert(EmployeeBO bo) {
		BeanPropertySqlParameterSource source = null;
		int count = 0;
		// set values to Named Params
		source = new BeanPropertySqlParameterSource(bo);
		// execute Query
		count = npjt.update(INSERT_EMP, source);

		return count;
	}

}// class
