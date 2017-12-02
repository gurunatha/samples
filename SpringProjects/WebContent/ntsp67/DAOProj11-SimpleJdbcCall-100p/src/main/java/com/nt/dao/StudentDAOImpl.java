package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.nt.bo.StudentBO;

@Named("stDAO")
public class StudentDAOImpl implements StudentDAO {
	@Resource
    private SimpleJdbcCall sjc;
	
	public StudentBO getStudentDetailsByNo(int no) {
		Map<String,Object> inParams=null;
		Map<String,Object> outParams=null;
		StudentBO bo=null;
		//set Procedure name
		sjc.setProcedureName("GET_STUDENT_DETAILS");
		//prepar Map object having IN params
		inParams=new HashMap<String,Object>();
		inParams.put("no",no);
		//execute Pl/sql procedure
		 outParams=sjc.execute(inParams);
		 //Copy InParam,outParam values to BO class object
		 bo=new StudentBO();
		 bo.setSno(no);
		 bo.setSname((String)outParams.get("NAME"));
		 bo.setSadd((String)outParams.get("ADDRS"));
		return bo;
	}//method
}//class
