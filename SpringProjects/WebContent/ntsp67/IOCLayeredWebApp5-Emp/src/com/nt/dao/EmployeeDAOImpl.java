package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String EMP_INSERT_QUERY = "INSERT INTO EMPLOYEE_TAB(ENO,ENAME,EADD,BSALARY,GSALARY,NETSALARY) VALUES(?,?,?,?,?,?)";
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		// get Pooled Connection
		con = ds.getConnection();
		// create PreparedStatement obj
		ps = con.prepareStatement(EMP_INSERT_QUERY);
		// set param values
		ps.setInt(1, bo.getEno());
		ps.setString(2, bo.getEname());
		ps.setString(3, bo.getEadd());
		ps.setFloat(4, bo.getbSalary());
		ps.setFloat(5, bo.getgSalary());
		ps.setFloat(6, bo.getNetSalary());
		// execute the query
		count = ps.executeUpdate();
		return count;
	}// method
}// class
