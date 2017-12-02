package com.nt.beans;

import java.util.Set;

public class CompanyPhonesInfo {

	private Set<Long> phones;
	private Set<?>  data;
	
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public void setData(Set<?> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CompanyPhonesInfo [phones=" + phones + ", data=" + data + "]"+phones.getClass();
	}
	

}
