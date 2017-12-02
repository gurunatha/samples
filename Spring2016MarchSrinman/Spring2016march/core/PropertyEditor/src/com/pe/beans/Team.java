package com.pe.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class Team {
	private String name;
	private Date estDt;
	private File readMeFile;
	private URL website;
	private String[] members;

	public void setName(String name) {
		this.name = name;
	}

	public void setEstDt(Date estDt) {
		this.estDt = estDt;
	}

	public void setReadMeFile(File readMeFile) {
		this.readMeFile = readMeFile;
	}

	public void setWebsite(URL website) {
		this.website = website;
	}

	public void setMembers(String[] members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", estDt=" + estDt + ", readMeFile="
				+ readMeFile + ", website=" + website + ", members="
				+ Arrays.toString(members) + "]";
	}

	

}
