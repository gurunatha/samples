package com.nbf.beans;

public class School {
	private Kid kid;

	public void setKid(Kid kid) {
		this.kid = kid;
	}

	@Override
	public String toString() {
		return "School [kid=" + kid + "]";
	}

}
