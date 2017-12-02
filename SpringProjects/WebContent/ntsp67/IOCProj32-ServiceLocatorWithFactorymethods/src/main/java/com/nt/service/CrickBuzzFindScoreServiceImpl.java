package com.nt.service;

import com.nt.ext.icc.ExternalICCScoreCompService;

public class CrickBuzzFindScoreServiceImpl implements CrickBuzzFindScoreService {
    private ExternalICCScoreCompService extComp;
	
    public void setExtComp(ExternalICCScoreCompService extComp) {
		this.extComp = extComp;
	}
    
	@Override
	public String findScore(int matchId) {
		//use extenal service
		System.out.println("LocalService:findScore(-)"+extComp.getScore(matchId));
		return extComp.getScore(matchId);
	}

}
