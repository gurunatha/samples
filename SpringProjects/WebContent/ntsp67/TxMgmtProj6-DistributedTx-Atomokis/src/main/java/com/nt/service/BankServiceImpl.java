package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAO;
import com.nt.dao.WithdrawDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private DepositeDAO depositeDao;
	@Autowired
	private WithdrawDAO withdrawDao;
	
	@Transactional(transactionManager="jtaTxMgmr",propagation=Propagation.REQUIRED,
			                        readOnly=false)
	@Override
	public String transferMoney(int srcAcno, int destAcno, float amt) {
		int count1=0,count2=0;
		//use DAOs
		count1=withdrawDao.withdraw(srcAcno, amt);
		count2=depositeDao.deposite(destAcno, amt);
		if(count1==0 || count2==0)
			throw new IllegalStateException();
		else
		  return "Money Transffered";
	}//method
}//class
