package com.nt.dao;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	
	public StudentBO getStudentBySno(int sno);
	public int insert(StudentBO bo);

}
