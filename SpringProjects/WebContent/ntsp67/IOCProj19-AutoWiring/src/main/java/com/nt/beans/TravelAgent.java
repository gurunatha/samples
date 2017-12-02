package com.nt.beans;

public class TravelAgent {
	private TourPlan tp;
	
	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent:1-param constructor");
		this.tp = tp;
	}

	public TravelAgent() {
		System.out.println("TravelAgent:0-param constructor");
	}

	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent:setTp(-) method");
		this.tp = tp;
	}
	
	public void planTour(){
		System.out.println("tour  is planed for "+tp+"  places");
	}

}
