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
	
	public StudentDTO searchStudentByNo(int no) {
	    StudentBO bo=null;
	    StudentDTO dto=null;
		//use DAO
		bo=dao.getStudentDetailsByNo(no);
		//convert StudentBO to StudentDTO object
		dto=new StudentDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}

}
