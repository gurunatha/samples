package com.prof.annon;

public class DataSourceConnectionProvider implements ConnectionProvider {
	private String dataSourceName;

	public DataSourceConnectionProvider(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}

	@Override
	public String getConnectionParameters() {
		return "Parameters [dataSourceName=" + dataSourceName + "]";
	}

}
