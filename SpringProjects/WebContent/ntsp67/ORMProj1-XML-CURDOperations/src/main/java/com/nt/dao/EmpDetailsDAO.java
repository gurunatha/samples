package com.nt.dao;

import java.util.List;

import com.nt.hlo.EmpDetailsHLO;

public interface EmpDetailsDAO {
	public  int insert(EmpDetailsHLO  hlo);
	public  EmpDetailsHLO get(int eno);
	public  List<EmpDetailsHLO> getEmpDetailsByDesg(String desg);
    public int  deleteEmployeesByDesg(String desg);
}
