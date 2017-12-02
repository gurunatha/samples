package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("stService")
public class StudentServiceImpl implements StudentService {
@Autowired	
private StudentDAO dao; 	
	

	public String groupRegistration(List<StudentDTO> listDTO) {
		List<StudentBO> listBO=null;
		StudentBO bo=null;
		int count[]=null;
		//convert listDTO to listBO
		listBO=new ArrayList<StudentBO>();
		for(StudentDTO dto:listDTO){
			bo=new StudentBO();
			BeanUtils.copyProperties(dto, bo);
			listBO.add(bo);
		}
		//use DAO
		count=dao.bulkinsert(listBO);
		if(count!=null)
	   	  return  "Bulk Insertion is successful";
		else
			return  "Bulk Insertion is failed";	
	}//mehtod
}//class
