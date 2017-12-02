package com.nt.beans;

public class LoanApprover {
	private LoanDetails details;

	public void setDetails(LoanDetails details) {
		this.details = details;
	}
	
	public String approveLoan(){
		if(details.getLoanType().equals("agriculture"))
			return details.getLoanId()+"   loan of type"+details.getLoanType()+" is approved for the amount"+details.getAmount();
			else
				return details.getLoanId()+"loan of type"+details.getLoanType()+" is not approved ";
		}
	}
