package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface EmployeeSalaryService {
		public String generatePaySlip(EmployeeDTO dto)throws Exception;
}
