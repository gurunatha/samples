package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.BeanUtils;

import com.nt.dao.StudentDAO;

@Named("stService")
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDAO stDAO;

	public String modifyStudentAddrsByNo(int no, String newAddrs) {
		int count=0;
     //use DAO
		count=stDAO.updateStudentAddrsByNo(no, newAddrs);
		if(count==0)
		  return  "Record not updated";
		else
			return "Record updated";
	}//method
}//class
