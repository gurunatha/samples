package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeSalaryServiceImpl implements EmployeeSalaryService {
	private EmployeeDAO dao=null;
	
    public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

     
	@Override
	public String generatePaySlip(EmployeeDTO dto) throws Exception {
	    float gSalary=0.0f, netSalary=0.0f;
	    EmployeeBO bo=null;
	    int count=0;
		//write b.logic to calculate  gross,net salaries
	    gSalary=dto.getbSalary()+ dto.getbSalary()*0.4f;
	    netSalary=gSalary-(gSalary*0.1f);
	    //prepare BO class obj having pesistable data
	    bo=new EmployeeBO();
	    bo.setEno(dto.getEno());
	    bo.setEname(dto.getEname());
	    bo.setEadd(dto.getEadd());
	    bo.setbSalary(dto.getbSalary());
	    bo.setgSalary(gSalary);
	    bo.setNetSalary(netSalary);
       //use DAO
	    count=dao.insert(bo);
	    
	    if(count==0){
	    	return dto.getEno()+" Salary Details\n basicSalary: "+dto.getbSalary()+" NetSalary::"+netSalary+"\n Registration failed";
	    }
	    else{
	    	return dto.getEno()+" Salary Details\n basicSalary: "+dto.getbSalary()+" NetSalary::"+netSalary+"\n Registration succeeded";
	    }
	}//method

}//class
