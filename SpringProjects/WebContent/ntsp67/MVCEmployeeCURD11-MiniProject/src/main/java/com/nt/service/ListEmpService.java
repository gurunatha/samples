package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface ListEmpService {
	public List<EmployeeDTO> getAllEmps();
	public EmployeeDTO  searchEmployeeByNo(int no);
	public String  modifyEmployeeByNo(EmployeeDTO dto);
	public String  registerEmployee(EmployeeDTO dto );

}
