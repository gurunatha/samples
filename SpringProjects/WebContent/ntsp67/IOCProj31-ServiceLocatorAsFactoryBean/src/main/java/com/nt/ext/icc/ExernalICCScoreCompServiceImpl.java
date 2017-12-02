package com.nt.ext.icc;

public class ExernalICCScoreCompServiceImpl implements ExternalICCScoreCompService{

	@Override
	public String getScore(int matchId) {
		  if(matchId==3456)
		      return "456/9";
		  else if(matchId==1234)
			  return "345/10";
		  else
			  return "No Match found";
	}

}
