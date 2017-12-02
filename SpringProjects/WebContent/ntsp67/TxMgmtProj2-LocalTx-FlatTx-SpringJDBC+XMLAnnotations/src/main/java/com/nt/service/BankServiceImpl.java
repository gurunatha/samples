package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BankDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDAO dao;

	

	public boolean transferMoney(int srcAcno, int destAcno, float amt){
		int count1=0,count2=0;
		//write b.logic
		count1=dao.withdraw(srcAcno, amt);
		count2=dao.deposite(destAcno, amt);
		if(count1==0 || count2==0){
			throw new IllegalStateException();
		}
		else{
			return true;
		}
	}//method
}//class
