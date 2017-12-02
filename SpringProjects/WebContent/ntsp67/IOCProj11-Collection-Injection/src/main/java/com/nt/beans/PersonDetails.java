package com.nt.beans;

import java.util.List;

public class PersonDetails {
	private List<String> names;

	private List<?> data;

   public void setData(List<?> data) {
		this.data = data;
	}

	//write setXxx(-) method for setter injection	
	public void setNames(List<String> names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "PersonDetails [names=" + names + ", data=" + data + "]"+names.getClass();
	}

	
	

}
