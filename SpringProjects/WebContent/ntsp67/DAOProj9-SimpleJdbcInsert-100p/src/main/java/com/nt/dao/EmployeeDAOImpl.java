package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SimpleJdbcInsert sji;

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
