package com.nt.service;

import java.util.List;

import com.nt.dto.EmpDetailsDTO;

public interface EmpDetailsService {
	
	public String register(EmpDetailsDTO dto);
	public  EmpDetailsDTO findEmpDetails(int eno);
	public  List<EmpDetailsDTO> findEmpDetailsByDesg(String desg);
	public String removeEmloyeesByDesg(String desg);
}
