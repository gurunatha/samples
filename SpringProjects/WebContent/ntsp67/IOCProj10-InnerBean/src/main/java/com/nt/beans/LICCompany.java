package com.nt.beans;

public class LICCompany {
	private LICAgent agent;
	
	public void setAgent(LICAgent agent) {
		this.agent = agent;
	}
	
	public String sellInsurancePolicy(String policyName){
	  return "Selling "+policyName +"by "+agent;	
	}

}//class
