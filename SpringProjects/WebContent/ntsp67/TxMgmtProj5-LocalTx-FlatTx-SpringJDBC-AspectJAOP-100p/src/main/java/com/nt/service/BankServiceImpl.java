package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;

@Service("bankService")
@Transactional(transactionManager="dsTxMgmr",readOnly=false,
propagation=Propagation.REQUIRED,noRollbackFor=NullPointerException.class,
                            rollbackFor=SQLException.class,timeout=20)
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDAO dao;

	
	public boolean transferMoney(int srcAcno, int destAcno, float amt){
		int count1=0,count2=0;
		//write b.logic
	/*	try{
		Thread.sleep(30000);
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
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
