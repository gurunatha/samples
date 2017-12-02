package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
  public String findEmpNameByNo(int no);
  public EmployeeBO findEmpDetailsByNo(int no);
  public int insert(EmployeeBO bo);
}
