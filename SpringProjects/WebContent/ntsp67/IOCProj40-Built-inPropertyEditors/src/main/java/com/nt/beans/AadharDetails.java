package com.nt.beans;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class AadharDetails {
	private int  uid;
	private String name;
	private float age;
	private Date dob;
	private String[] verifiers;
	private File  photo;
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "AadharDetails [uid=" + uid + ", name=" + name + ", age=" + age + ", dob=" + dob + ", verifiers="
				+ Arrays.toString(verifiers) + ", photo=" + photo + "]";
	}
	

}
