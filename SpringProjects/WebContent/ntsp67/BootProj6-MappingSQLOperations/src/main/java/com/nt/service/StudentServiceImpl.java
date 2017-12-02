package com.nt.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Named("stService")
public class StudentServiceImpl implements StudentService {
	@Resource
   private StudentDAO dao;

	@Override
	public StudentDTO findStudentBySno(int sno) {
		 StudentDTO dto=null;
		 StudentBO bo=null;
		//use DAO
		bo=dao.getStudentBySno(sno);
		//convert BO to DTO
		dto=new StudentDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}
	@Override
	public String registerStudent(StudentDTO dto) {
	     StudentBO bo=null;
	     int count=0;
		//copy DTO to BO
	     bo=new StudentBO();
	     BeanUtils.copyProperties(dto,bo);
	     //use DAO
	     count=dao.insert(bo);
	     if(count==0)
     		return "Registration failed";
	     else
	    	 return "Registration succeded";
	}//method
}//class
