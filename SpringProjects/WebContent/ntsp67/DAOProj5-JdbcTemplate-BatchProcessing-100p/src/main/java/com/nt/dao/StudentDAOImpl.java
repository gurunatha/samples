package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
 @Autowired	
 private JdbcTemplate jt;
 
	public int[] bulkinsert(List<StudentBO> listBO) {
		int count[]=null;
		count=jt.batchUpdate(INSERT_QUERY,new StudentBatchSetter(listBO));
		
		return count;
	}//method
  private static class StudentBatchSetter implements BatchPreparedStatementSetter{
     private List<StudentBO> listBO=null;
     
     public StudentBatchSetter(List<StudentBO> listBO) {
       this.listBO=listBO;
	}
     
	public int getBatchSize() {
		return listBO.size();
	}

	public void setValues(PreparedStatement ps, int index) throws SQLException {
		System.out.println("setValues(-,-)");
       ps.setInt(1,listBO.get(index).getSno());		
       ps.setString(2,listBO.get(index).getSname());
       ps.setString(3,listBO.get(index).getSadd());
       
	}
  }//inner class
	
}//outer class
