package com.nt.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private SimpleJdbcInsert sji;

	public void setSji(SimpleJdbcInsert sji) {
		this.sji = sji;
	}

	/*public int insert(EmployeeBO bo) {
		//Using Map object
		Map<String,Object> map=null;
		int count=0;
		//prepare Col names and col values as Map object
	   map=new HashMap<String,Object>();
	   map.put("empno", bo.getEmpno());
	   map.put("ename",bo.getEname());
	   map.put("job",bo.getJob());
	   map.put("sal", bo.getSal());
	   //set Table name
	   sji.setTableName("emp");
	   //execute Logic giving col names and values
	   count=sji.execute(map);
		return count;
	}//insert(-) */
	
	public int insert(EmployeeBO bo) {
		//Using BeanPropertySqlParmaeterSource  object
		BeanPropertySqlParameterSource source=null;
		int count=0;
		//prepare Col names and col values.
		source=new BeanPropertySqlParameterSource(bo);
	   //set Table name
	   sji.setTableName("emp");
	   //execute Logic giving col names and values
	   count=sji.execute(source);
		return count;
	}//insert(-)
	
}//class
