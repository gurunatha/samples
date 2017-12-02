package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface ListEmployeeDAO {
	
	public EmployeeBO  getEmpDetailsByNo(int no);
	public List<EmployeeBO>  getEmpDetailsByDesg(String desg);

}
