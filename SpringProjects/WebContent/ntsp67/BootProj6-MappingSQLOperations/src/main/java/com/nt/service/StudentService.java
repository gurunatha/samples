package com.nt.service;

import com.nt.dto.StudentDTO;

public interface StudentService {
	public StudentDTO findStudentBySno(int sno);
	public String registerStudent(StudentDTO dto);

}
