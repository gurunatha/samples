package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class ListEmpsDAOImpl implements ListEmpsDAO {
  /*SQL>create sequence eno_seq1 start with 1 increment by 1;"*/
	private static final String GET_ALL_EMPS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	private static final String  GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM  EMP WHERE EMPNO=?";
	private static final String UPDATE_EMP_BY_NO="UPDATE EMP SET ENAME=?,JOB=?,SAL=? WHERE EMPNO=?";
	private static final String INSERT_EMP="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(?,?,?,?)";
	private static final String GET_EMP_NO_FROM_SEQ="SELECT ENO_SEQ1.NEXTVAL FROM DUAL";
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
	
	@Override
	public EmployeeBO getEmployeeByNo(int no) {
	       EmployeeBO empBO=null;
	       empBO=jt.queryForObject(GET_EMP_BY_NO,
	    		                                      (ResultSet rs, int index)->{
	    		                                    	  EmployeeBO bo=null;
	    		                              			//copy ResultSet record BO class object
	    		                              			 bo=new EmployeeBO();
	    		                              			 bo.setEno(rs.getInt(1));
	    		                              			 bo.setEname(rs.getString(2));
	    		                              			 bo.setJob(rs.getString(3));
	    		                              			 bo.setSalary(rs.getInt(4));
	    		                              			return bo;
	    		                                      },
	    		                                      no);
	       
	    
		return empBO;
	}
	
	@Override
	public int update(EmployeeBO bo) {
		int count=0;
		count=jt.update(UPDATE_EMP_BY_NO,bo.getEname(),bo.getJob(),bo.getSalary(),bo.getEno());
		return count;
	}
	
	@Override
	public int insert(EmployeeBO bo) {
		int no=0;
		int count=0;
		//get Employee numer dynamically by calling sequence
		no=jt.queryForObject(GET_EMP_NO_FROM_SEQ, Integer.class);
		//set no to bo object
		bo.setEno(no);
		//insert BO
		count=jt.update(INSERT_EMP,bo.getEno(),bo.getEname(),bo.getJob(),bo.getSalary());
		return count;
	}
	
	
	

}
