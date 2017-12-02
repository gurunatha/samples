package com.nt.service;

import java.sql.SQLException;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	private BankDAO dao;

	public void setDao(BankDAO dao) {
		this.dao = dao;
	}

	public boolean transferMoney(int srcAcno, int destAcno, float amt)throws SQLException{
		int count1=0,count2=0;
		//write b.logic
		count1=dao.withdraw(srcAcno, amt);
		count2=dao.deposite(destAcno, amt);
		if(count1==0 || count2==0){
			throw new NullPointerException();
		}
		else{
			return true;
		}
	}//method
}//class
