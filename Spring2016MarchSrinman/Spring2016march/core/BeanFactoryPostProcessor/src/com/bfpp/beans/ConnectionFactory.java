package com.bfpp.beans;

public class ConnectionFactory {
	private String driverClassname;
	private String url;
	private String username;
	private String password;

	public ConnectionFactory(String driverClassname, String url,
			String username, String password) {
		this.driverClassname = driverClassname;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ConnectionFactory [driverClassname=" + driverClassname
				+ ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}

}
