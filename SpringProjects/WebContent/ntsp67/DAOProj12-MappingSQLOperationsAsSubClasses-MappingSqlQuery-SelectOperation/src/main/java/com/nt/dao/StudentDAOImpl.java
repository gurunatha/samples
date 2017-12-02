package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import com.nt.bo.StudentBO;

@Named("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private  static final String GET_STUDS_BY_ADDRS="SELECT * FROM STUDENT WHERE SADD=?";
	private StudentSelector stSelector;
	@Inject
	public StudentDAOImpl(DataSource ds){
		System.out.println("DAO :constructor");
		stSelector=new StudentSelector(ds,GET_STUDS_BY_ADDRS);
	}
	
	public List<StudentBO> searchStudentsByAddrs(String addrs) {
		System.out.println("DAO: method");
		List<StudentBO> listBO=null;
		//use inner class method
		listBO=stSelector.findStudsByAddrs(addrs);
		return listBO;
	}
	
	//>>>>>>>>>>>>>>>>> inner classes >>>>>>>>>>>>>>>>>
	 private static class StudentSelector extends MappingSqlQuery<StudentBO>{

		 public  StudentSelector(DataSource ds,String query){
			   super(ds,query);
			   System.out.println("Subclass: cosntructor");
			   super.declareParameter(new SqlParameter(Types.VARCHAR));
			   super.compile();
		 }
		@Override
		public  StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			System.out.println("Subclass: mapRow(-,-)");
			 StudentBO bo=null;
		  //copy ResultSet record to StudentBO object
			 bo=new StudentBO();
			 bo.setSno(rs.getInt(1));
			 bo.setSname(rs.getString(2));
			 bo.setSadd(rs.getString(3));
			return bo;
		}
		
		public List<StudentBO>  findStudsByAddrs(String addrs){
			System.out.println("Sub class: method");
			List<StudentBO> listBO=null;
			  listBO=super.execute(addrs);
			  return listBO;
		}//method
	 }//inner class
}//outer class
