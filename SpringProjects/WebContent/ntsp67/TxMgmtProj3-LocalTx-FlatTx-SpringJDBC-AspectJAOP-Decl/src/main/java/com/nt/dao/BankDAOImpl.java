package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
  private static final String WITHDRAW_QUERY="UPDATE  TX_ACCOUNT SET BALANCE=BALANCE-?  WHERE ACCNO=?";
  private static final String DEPOSITE_QUERY="UPDATE  TX_ACCOUNT SET BALANCE=BALANCE+?  WHERE ACCNO=?";

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


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
