package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import com.nt.bo.StudentBO;
@Named("stDAO")
public class StudentDAOImpl  implements StudentDAO{
  private static final String  GET_STUDENT_BY_NO="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SNO=?";
  private static final String  INSERT_STUDENT="INSERT INTO STUDENT VALUES(:sno,:sname,:sadd)";
	 private StudentSelector stSelector;
	 private StudentUpdator stUpdator;
	 
	 //constructor
	 @Inject
  public StudentDAOImpl(DataSource ds){
	  stSelector=new StudentSelector(ds, GET_STUDENT_BY_NO);
	  stUpdator=new StudentUpdator(ds,INSERT_STUDENT);
  }
	
	@Override
	public StudentBO getStudentBySno(int sno) {
	   StudentBO bo=null;
	   bo=stSelector.findObject(sno);
		return bo;
	}
	@Override
	public int insert(StudentBO bo) {
		Map<String,Object> map=null;
		int count=0;
		//prepare params
		map=new HashMap<String,Object>();
		map.put("sno", bo.getSno());
		map.put("sname",bo.getSname());
		map.put("sadd", bo.getSadd());
		count=stUpdator.updateByNamedParam(map);
		return count;
	}
	//inner classes
	private static class StudentSelector extends MappingSqlQuery<StudentBO>{

		public StudentSelector(DataSource ds,String query){
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}
		
		@Override
		public StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			 StudentBO bo=null;
			//copy record from ResultSet obj to StudentBO object
			 bo=new StudentBO();
			 bo.setSno(rs.getInt(1));
			 bo.setSname(rs.getString(2));
			 bo.setSadd(rs.getString(3));
			return bo;
		}
	}//inner class
	
	private static class StudentUpdator extends SqlUpdate{
		
		public StudentUpdator(DataSource ds,String query){
			  super(ds,query);
			  super.declareParameter(new SqlParameter(Types.INTEGER));
			  super.declareParameter(new SqlParameter(Types.VARCHAR));
			  super.declareParameter(new SqlParameter(Types.VARCHAR));
			  super.compile();
		}
		
	}
	
}//outer class
