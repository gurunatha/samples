package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

 @Repository("withdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO {
	 private static final String  WITHDRAW_QUERY="UPDATE DTX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";

	 @Autowired
	 @Qualifier("oraJt")
	private JdbcTemplate jt;
  
	public int withdraw(int accno, float amt) {
        int count=0;
        count=jt.update(WITHDRAW_QUERY,amt,accno);
		return count;
	}//method
}//class
