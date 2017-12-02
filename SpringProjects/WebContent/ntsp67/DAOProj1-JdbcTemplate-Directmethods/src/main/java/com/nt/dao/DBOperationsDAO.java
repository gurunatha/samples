package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DBOperationsDAO {
	public int insert(int no,String name,String job,int salary);
	public int getSalary(int no);
	public Map<String,Object> getEmpDetailsByNo(int no);
	public List<Map<String,Object>> getEmpDetailsByDesg(String desg);
	public int  updateSalary(int no,int newSalary);

}
