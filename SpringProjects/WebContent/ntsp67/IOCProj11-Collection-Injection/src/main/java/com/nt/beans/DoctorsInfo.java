package com.nt.beans;

import java.util.Properties;

public class DoctorsInfo {
	private Properties  doctors;
	
	public void setDoctors(Properties doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "DoctorInfo [doctorsInfo=" + doctors + "]";
	}
	

}
