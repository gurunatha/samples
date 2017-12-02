package com.nt.beans;

public class LoanDetails {
	private int loanId;
	private String loanType;
	private float Amount;
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
	public int getLoanId() {
		return loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public float getAmount() {
		return Amount;
	}
	@Override
	public String toString() {
		return "LoanDetails [loanId=" + loanId + ", loanType=" + loanType + ", Amount=" + Amount + "]";
	}
   
}
