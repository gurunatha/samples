package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface ListEmployeeService {
	public EmployeeDTO listEmployeeByNo(int no);
	public List<EmployeeDTO> listEmployeeByDesg(String desg);
}
