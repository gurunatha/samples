package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO dao=null;
	
	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}


	public List<StudentDTO> retriveStudents(float startAvg, float endAvg)throws Exception {
		int startAggragate=0, endAggragate=0;
		List<StudentBO> listBO=null;
		List<StudentDTO> listDTO=null;
		StudentDTO dto=null;
		//convert avgs to numeric values.
		startAggragate=(int) Math.floor(startAvg);
		endAggragate=(int)Math.ceil(endAvg);
		//use DAO
		listBO=dao.fetchStudentsByAvg(startAggragate, endAggragate);
		//copy ListBO to ListDTO
		listDTO=new ArrayList<StudentDTO>();
		for(StudentBO bo:listBO){
			dto=new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}
		System.out.println("listDTO size:"+listDTO.size());
		return listDTO;
	}

}
