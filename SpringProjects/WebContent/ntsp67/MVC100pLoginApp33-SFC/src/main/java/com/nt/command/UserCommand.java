package com.nt.command;

import org.hibernate.validator.constraints.NotEmpty;

public class UserCommand {
	@NotEmpty(message="user name must not be empty")
	private String uname;
	@NotEmpty(message="password must not be empty")
	private String pwd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
