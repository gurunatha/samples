package com.prof.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobDao {
	@Autowired
	private ConnectionProvider provider;

	public void newJob(int jobId, String description) {
		System.out.println("getting connection with : "
				+ provider.getConnectionParameters());
	}

	public void setProvider(ConnectionProvider provider) {
		this.provider = provider;
	}

}
