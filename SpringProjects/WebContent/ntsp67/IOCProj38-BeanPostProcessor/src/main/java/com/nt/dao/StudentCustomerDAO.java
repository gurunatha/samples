package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public class StudentCustomerDAO {
	
	public StudentCustomerDAO() {
		System.out.println("StudentCustomerDAO:0-paaram constuctor");
	}
	
	public  void insertStudent(StudentBO bo){
		System.out.println("Inserting Student record:::"+bo.getId()+"  "+bo.getName()+"  "+bo.getCourse()+" "+bo.getDoj());
	}
	
	public  void insertCustomer(CustomerBO bo){
		System.out.println("Inserting customer record:::"+bo.getId()+"    "+bo.getName()+"    "+bo.getBillAmt()+"   "+bo.getDoj());
	}
}
