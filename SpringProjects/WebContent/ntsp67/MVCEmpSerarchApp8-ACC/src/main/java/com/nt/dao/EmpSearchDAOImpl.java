package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

public class EmpSearchDAOImpl implements EmpSearchDAO {
 private static final String EMP_SEARCH_DETAILS=" SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE (EMPNO IS NOT NULL AND EMPNO=?) OR (ENAME IS NOT NULL  AND ENAME=?) OR  (JOB IS NOT NULL AND JOB=?) OR (SAL IS NOT NULL AND SAL=?)";
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public List<SearchResultBO> search(SearchBO bo) {
		List<SearchResultBO> listRBO=null;
		listRBO=jt.query(EMP_SEARCH_DETAILS, new SearchResultExtractor(),bo.getEno(),bo.getName(),bo.getDesg(),bo.getSalary());
		return listRBO;
	}//method
	
	private static class SearchResultExtractor implements ResultSetExtractor<List<SearchResultBO>>{
	
		@Override
		public List<SearchResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<SearchResultBO> listRBO=null;
			SearchResultBO bo=null;
			//copy ResultSet obj records to ListRBO
			listRBO=new ArrayList<>();
			while(rs.next()){
				//copy each record of ReusltSet to BO
				bo=new SearchResultBO();
				bo.setEno(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				bo.setDeptNo(rs.getInt(5));
				bo.setMgrNo(rs.getInt(6));
				//add each BO to List collection
				listRBO.add(bo);
			}
			return listRBO;
		}//method
	}//inner class

}//class
