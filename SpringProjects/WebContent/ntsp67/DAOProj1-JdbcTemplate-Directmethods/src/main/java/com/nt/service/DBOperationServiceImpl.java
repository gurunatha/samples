package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.DBOperationsDAO;

public class DBOperationServiceImpl implements DBOperationService {
    private DBOperationsDAO dao;
    
	public void setDao(DBOperationsDAO dao) {
		this.dao = dao;
	}

	@Override
	public String register(int no, String name, String job, int salary) {
		int count=0;
		//use DAO
		count=dao.insert(no, name, job, salary);
		if(count==0)
			return no+"-->Employee not registred";
		else
			return no+"-->Employee  registred";
	}//method

	@Override
	public int fetchSalary(int no) {
		int salary=0;
		//use DAO
		return dao.getSalary(no);
	}

	@Override
	public Map<String, Object> fetchEmpDetailsByNo(int no) {
		Map<String,Object> map=null;
		//use DAO
		map=dao.getEmpDetailsByNo(no);
		
		return map;
	}
	
	@Override
	public List<Map<String, Object>> listEmpDetailsByDesg(String desg) {
		List<Map<String ,Object>> list=null;
		//use DAO
		list=dao.getEmpDetailsByDesg(desg);
		return  list; 
	}
	
	@Override
	public String hikeSalary(int no, float percentage) {
		int salary=0,newSalary=0;
		int result=0;
		//use DAO
		   //get salary
		   salary=fetchSalary(no);
		 // hike salary
		   newSalary=Math.round(salary+(salary*(percentage/100)));
		   //update salary
		   result=dao.updateSalary(no,newSalary);
		   if(result!=0)
			   return  no+" emp salary hiked, new Salary is"+newSalary;
		   else
			   return  no+" emp salary not hiked";
		
	}
	
}//class
