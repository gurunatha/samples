package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;
import com.nt.dao.EmpSearchDAO;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

public class EmpSearchServiceImpl implements EmpSearchService {
 
private EmpSearchDAO dao;

public void setDao(EmpSearchDAO dao) {
	this.dao = dao;
}
	@Override
	public List<SearchResultDTO> find(SearchDTO dto) {
		List<SearchResultBO> listRBO=null;
		List<SearchResultDTO> listRDTO=null;
		SearchBO bo=null;
		SearchResultDTO rDTO=null;
		 //convert DTO to BO
		 bo=new SearchBO();
		 BeanUtils.copyProperties(dto, bo);
	   //use service class
		listRBO=dao.search(bo);
		//Convert ListRBO to ListRDTO
		listRDTO=new ArrayList();
		for(SearchResultBO rBO:listRBO){
			rDTO=new SearchResultDTO();
			BeanUtils.copyProperties(rBO,rDTO);
			listRDTO.add(rDTO);
		}//for
		return listRDTO;
	}//method
}//class
