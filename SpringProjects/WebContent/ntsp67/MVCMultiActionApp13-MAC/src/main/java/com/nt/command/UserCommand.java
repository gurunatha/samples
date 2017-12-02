package com.nt.command;

public class UserCommand {
	private int uid;
	private String  name;
	private String addrs;
	private String email;
	
	
	public UserCommand() {
		System.out.println("UserCommand:0-param constructor");
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
