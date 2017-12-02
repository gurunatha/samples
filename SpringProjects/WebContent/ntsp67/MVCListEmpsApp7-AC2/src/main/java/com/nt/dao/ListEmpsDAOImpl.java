package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBO;

public class ListEmpsDAOImpl implements ListEmpsDAO {
	private static final String GET_ALL_EMPS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> retriveEmployees() {
		List<EmployeeBO> listEmpBO=null;
		listEmpBO=jt.query(GET_ALL_EMPS, new EmpResultSetExtractor());
		return listEmpBO;
	}
	
	private static  class EmpResultSetExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
		            List<EmployeeBO> listEmpBO=null;
		            EmployeeBO bo=null;
		            //copy ResultSet records to List<EmployeeBO>
		            listEmpBO=new ArrayList();
		            while(rs.next()){
		            	//copy each record of ResultSet to EmployeeBO object
		            	bo=new EmployeeBO();
		            	bo.setEno(rs.getInt(1));
		            	bo.setEname(rs.getString(2));
		            	bo.setJob(rs.getString(3));
		            	bo.setSalary(rs.getInt(4));
		            	//add BO obj to List collection
		            	listEmpBO.add(bo);
		            }//while
			
			return listEmpBO;
		}
		
		
	}

}
