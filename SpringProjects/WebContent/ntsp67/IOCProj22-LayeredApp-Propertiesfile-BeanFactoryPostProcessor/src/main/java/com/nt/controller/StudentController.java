package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

public class StudentController {
	
	private StudentService service=null;
	
	public void setService(StudentService service) {
		this.service = service;
	}

	
	public List<StudentVO>  getStudentDetailsByAvg(float startAvg,float endAvg)throws Exception{
		List<StudentDTO> listDTO=null;
		List<StudentVO> listVO=null;
		StudentVO vo=null;
		//use Service
		listDTO=service.retriveStudents(startAvg, endAvg);
		//copy ListDTO to ListVO
		listVO=new ArrayList<StudentVO>();
		for(StudentDTO dto:listDTO){
			vo=new StudentVO();
             vo.setSno(String.valueOf(dto.getSno()));
             vo.setSname(dto.getSname());
             vo.setTotal(String.valueOf(dto.getTotal()));
             vo.setAvg(String.valueOf(dto.getAvg()));
             vo.setResult(dto.getResult());
			listVO.add(vo);
		}

		System.out.println("listVO size:"+listVO.size());
		return listVO;
	}//method
}//class
