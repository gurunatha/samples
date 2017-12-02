package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
   public String searchEmpNameByNo(int no);
   public EmployeeDTO searchEmpDetailsByNo(int no);
   public String registerEmployee(EmployeeDTO dto);
}
