package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface ListEmpsDAO {
  public List<EmployeeBO>  retriveEmployees();
  public  EmployeeBO   getEmployeeByNo(int no);
  public int  update(EmployeeBO bo);
  public int insert(EmployeeBO bo);
}
