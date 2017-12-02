package com.nt.command;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;



public class UserCommand {
    @NotEmpty(message="username is required")
    @Size(min=1,max=4)
	private String user;
    @NotEmpty
	private String pwd;
    private String domain;
    private Date dob;
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "UserCommand [user=" + user + ", pwd=" + pwd + ", domain=" + domain + ", dob=" + dob + "]";
	}
	
	
	
}
