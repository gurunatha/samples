package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Named("stService")
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDAO stDAO;

	public List<StudentDTO> getDetailsByAddrs(String addrs) {
		List<StudentDTO> listDTO=null;
		List<StudentBO> listBO=null;
		StudentDTO dto=null;
		//use dAO
		listBO=stDAO.searchStudentsByAddrs(addrs);
		//convert ListBO to ListDTO
		listDTO=new ArrayList();
		for(StudentBO bo:listBO){
			dto=new StudentDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		}
		return listDTO;
	}//method
}//class
