package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dao.EmpDetailsDAO;
import com.nt.dto.EmpDetailsDTO;
import com.nt.hlo.EmpDetailsHLO;

public class EmpDetailsServiceImpl implements EmpDetailsService {
	private EmpDetailsDAO dao;

	public void setDao(EmpDetailsDAO dao) {
		this.dao = dao;
	}

	@Override
	public String register(EmpDetailsDTO dto) {
	    int idVal=0;
	    EmpDetailsHLO hlo=null;
	    //Convert DTO into HLO
	    hlo=new EmpDetailsHLO();
	    BeanUtils.copyProperties(dto,hlo);
		//use DAO
		idVal=dao.insert(hlo);
		if(idVal<=0)
			return "Emp Registration failed";
		else
			return "Emp Registration succedded";
	}//method

	@Override
	public EmpDetailsDTO findEmpDetails(int eno) {
		 EmpDetailsDTO dto=null;
		 EmpDetailsHLO hlo=null;
		 //use DAO
		 hlo=dao.get(eno);
		 //convert HLO to DTO
		 dto=new EmpDetailsDTO();
		 BeanUtils.copyProperties(hlo,dto);
		return dto;
	}
	
	@Override
	public List<EmpDetailsDTO> findEmpDetailsByDesg(String desg) {
		 List<EmpDetailsHLO> listHLO=null;
		 List<EmpDetailsDTO> listDTO=null;
		 EmpDetailsDTO dto=null;
		//use DAO class
		 listHLO=dao.getEmpDetailsByDesg(desg);
		 //convert  ListHLO into ListDTO
		 listDTO=new ArrayList();
		 for(EmpDetailsHLO hlo:listHLO){
			 dto=new EmpDetailsDTO();
			 BeanUtils.copyProperties(hlo, dto);
			 listDTO.add(dto);
		 }
		return listDTO;
	}//method
	
	@Override
	public String removeEmloyeesByDesg(String desg) {
		int count=0;
		count=dao.deleteEmployeesByDesg(desg);
		if(count==0)
		    return  "No Employees found with Desg-->"+desg;
		else
			return  " Employees found with Desg-->"+desg;
	}//method
}//class
