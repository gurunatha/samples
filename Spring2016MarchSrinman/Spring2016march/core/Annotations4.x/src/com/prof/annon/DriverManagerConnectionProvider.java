package com.prof.annon;

public class DriverManagerConnectionProvider implements ConnectionProvider {
	private String driverClassname;
	private String url;
	private String username;
	private String password;

	@Override
	public String getConnectionParameters() {
		return "Parameters [driverClassname=" + driverClassname + ", url="
				+ url + ", username=" + username + ", password=" + password
				+ "]";
	}

	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
