package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class ChittiRobot {
	private int id;
	private String name;
	private String type;
	private Date dom;
	public void setId(int id) {
		this.id = id;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Required
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "ChittiRobot [id=" + id + ", name=" + name + ", type=" + type + ", dom=" + dom + "]";
	}
	

}
