package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.ListEmpsDAO;

public class ListEmpsServiceImpl implements ListEmpsService {
	private ListEmpsDAO dao;

	public void setDao(ListEmpsDAO dao) {
		this.dao = dao;
	}

	public List<Map<String, Object>> searchEmpsByDesg(String[] desg) {
		String condition=null;
		List<Map<String,Object>> listEmps=null;
		//Convert the given String[] into String condition as required SQL Query
		condition="(";
		for(int i=0;i<desg.length;++i){
		   if(i==desg.length-1)
			   condition=condition+"'"+desg[i]+"')";
		   else
			   condition=condition+"'"+desg[i]+"',";
		}
        //use DAO
		listEmps=dao.getEmployeeDetailsByDesg(condition);
		
		return listEmps;
	}//method
}//class
