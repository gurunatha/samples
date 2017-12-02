package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("listEmpDAO")
public class ListEmployeeDAOImpl implements ListEmployeeDAO {
	private static final String GET_EMP_DETAILS_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	@Autowired
	private JdbcTemplate jt;

	public EmployeeBO getEmpDetailsByNo(int no) {
		EmployeeBO bo = null;
		bo = jt.queryForObject(GET_EMP_DETAILS_BY_NO, (ResultSet rs, int index) -> {
			EmployeeBO b = null;
			// Copy the ResultSet record to BO class object
			b = new EmployeeBO();
			b.setEno(rs.getInt(1));
			b.setEname(rs.getString(2));
			b.setJob(rs.getString(3));
			b.setSalary(rs.getInt(4));
			return b;
		}, no);
		return bo;
	}// method

	public List<EmployeeBO> getEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listBO = null;
		listBO = jt.query(GET_EMP_DETAILS_BY_DESG, new ResultSetExtractor<List<EmployeeBO>>() {
			public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<EmployeeBO> listBO = null;
				EmployeeBO bo = null;
				// copy ResultSet records to List<EmployeeBO> collection
				listBO = new ArrayList<EmployeeBO>();
				while (rs.next()) {
					bo = new EmployeeBO();
					bo.setEno(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setJob(rs.getString(3));
					bo.setSalary(rs.getInt(4));
					listBO.add(bo);
				} // while(-)
				return listBO;
			}// method
		}, desg);
		return listBO;
	}// method
}// outer class

/*
 * @Repository("listEmpDAO") public class ListEmployeeDAOImpl implements
 * ListEmployeeDAO { private static final String
 * GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
 * private static final String
 * GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
 * 
 * @Autowired private JdbcTemplate jt;
 * 
 * public EmployeeBO getEmpDetailsByNo(int no) { EmployeeBO bo=null;
 * bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO,
 * 
 * new RowMapper<EmployeeBO>(){ public EmployeeBO mapRow(ResultSet rs, int
 * index) throws SQLException { EmployeeBO bo=null; // Copy the ResultSet record
 * to BO class object bo=new EmployeeBO(); bo.setEno(rs.getInt(1));
 * bo.setEname(rs.getString(2)); bo.setJob(rs.getString(3));
 * bo.setSalary(rs.getInt(4));
 * 
 * return bo; } }, no); return bo; }//method
 * 
 * public List<EmployeeBO> getEmpDetailsByDesg(String desg) { List<EmployeeBO>
 * listBO=null; listBO=jt.query(GET_EMP_DETAILS_BY_DESG, new
 * ResultSetExtractor<List<EmployeeBO>>(){ public List<EmployeeBO>
 * extractData(ResultSet rs) throws SQLException, DataAccessException {
 * List<EmployeeBO> listBO=null; EmployeeBO bo=null; //copy ResultSet records to
 * List<EmployeeBO> collection listBO=new ArrayList<EmployeeBO>();
 * while(rs.next()){ bo=new EmployeeBO(); bo.setEno(rs.getInt(1));
 * bo.setEname(rs.getString(2)); bo.setJob(rs.getString(3));
 * bo.setSalary(rs.getInt(4)); listBO.add(bo); }//while(-) return listBO;
 * }//method }, desg); return listBO; }//method }//outer class
 */
/*
 * @Repository("listEmpDAO") public class ListEmployeeDAOImpl implements
 * ListEmployeeDAO { private static final String
 * GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
 * private static final String
 * GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
 * 
 * @Autowired private JdbcTemplate jt;
 * 
 * public EmployeeBO getEmpDetailsByNo(int no) { EmployeeBO bo=null;
 * bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO, new EmpRowMapper(), no); return
 * bo; }
 * 
 * public List<EmployeeBO> getEmpDetailsByDesg(String desg) { List<EmployeeBO>
 * listBO=null; listBO=jt.query(GET_EMP_DETAILS_BY_DESG, new EmpExtractor(),
 * desg); return listBO; }
 * 
 * private static class EmpRowMapper implements RowMapper<EmployeeBO>{
 * 
 * public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
 * EmployeeBO bo=null; // Copy the ResultSet record to BO class object bo=new
 * EmployeeBO(); bo.setEno(rs.getInt(1)); bo.setEname(rs.getString(2));
 * bo.setJob(rs.getString(3)); bo.setSalary(rs.getInt(4));
 * 
 * return bo; }//mapRow(-,-) }//inner class
 * 
 * private static class EmpExtractor implements
 * ResultSetExtractor<List<EmployeeBO>>{
 * 
 * public List<EmployeeBO> extractData(ResultSet rs) throws SQLException,
 * DataAccessException { List<EmployeeBO> listBO=null; EmployeeBO bo=null;
 * //copy ResultSet records to List<EmployeeBO> collection listBO=new
 * ArrayList<EmployeeBO>(); while(rs.next()){ bo=new EmployeeBO();
 * bo.setEno(rs.getInt(1)); bo.setEname(rs.getString(2));
 * bo.setJob(rs.getString(3)); bo.setSalary(rs.getInt(4)); listBO.add(bo);
 * }//while(-)
 * 
 * return listBO; }//method }//inner class }//outer class
 */