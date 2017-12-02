package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String  GET_STUDENTS_BY_AVG="SELECT SNO,SNAME,TOTAL,AVG,RESULT FROM SP_STUDENT WHERE AVG>=? and AVG<=?"; 
	private DataSource  ds; 

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public List<StudentBO> fetchStudentsByAvg(int start, int end)throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<StudentBO> listBO=null;
		StudentBO bo=null;
		//get con object from jdbc con pool
		con=ds.getConnection();
		//create PreparedStatement object
        ps=con.prepareStatement(GET_STUDENTS_BY_AVG);
        //set values to Params
        ps.setInt(1,start);
        ps.setInt(2,end);
        //execute Query
        rs=ps.executeQuery();
        //copy ResultSet records to ListBO
        listBO=new ArrayList<StudentBO>();
        while(rs.next()){
        	bo=new StudentBO();
        	
        	bo.setSno(rs.getInt(1));
        	bo.setSname(rs.getString(2));
        	bo.setTotal(rs.getInt(3));
        	bo.setAvg(rs.getFloat(4));
        	bo.setResult(rs.getString(5));
        	
        	listBO.add(bo);
        
        }//while
    	System.out.println("listBO size:"+listBO.size());
		return listBO;
	}//method

}//class
