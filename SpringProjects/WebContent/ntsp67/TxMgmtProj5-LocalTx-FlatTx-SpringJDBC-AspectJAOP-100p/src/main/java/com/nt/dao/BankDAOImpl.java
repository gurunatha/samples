package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bankDAO")
public class BankDAOImpl implements BankDAO {
  private static final String WITHDRAW_QUERY="UPDATE  TX_ACCOUNT SET BALANCE=BALANCE-?  WHERE ACCNO=?";
  private static final String DEPOSITE_QUERY="UPDATE  TX_ACCOUNT SET BALANCE=BALANCE+?  WHERE ACCNO=?";
   @Autowired
	private JdbcTemplate jt;
	
	

	public int withdraw(int srcAcno, float amt) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY, amt,srcAcno);
		return count;
	}

	public int deposite(int destAcno, float amt) {
		int count=0;
		count=jt.update(DEPOSITE_QUERY, amt,destAcno);
		return count;
	}

}
