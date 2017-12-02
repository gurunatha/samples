package com.nt.dao;

import java.sql.Types;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

@Named("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private  static final String UPDATE_STUDENT_ADDRS_BY_NO="UPDATE STUDENT SET SADD=? WHERE SNO=?";
	private StudentUpdator stUpdator;
	
	@Inject
	public StudentDAOImpl(DataSource ds){
		stUpdator=new StudentUpdator(ds,UPDATE_STUDENT_ADDRS_BY_NO);
	}

	public int updateStudentAddrsByNo(int no,String newAddrs) {
		int count=0;
		count=stUpdator.updateStudentAddrs(no, newAddrs);
		return count;
	}
private static class StudentUpdator extends SqlUpdate{
		
		public StudentUpdator(DataSource ds,String query){
			 super(ds,query);
			 super.declareParameter(new SqlParameter(Types.VARCHAR));
			 super.declareParameter(new SqlParameter(Types.INTEGER));
			 super.compile();
		}
		
		public  int updateStudentAddrs(int no,String newAddrs){
			   int count=0;
			   count=super.update(newAddrs,no);
			   return count;
		}
		
	}//inner class
}//outer class
