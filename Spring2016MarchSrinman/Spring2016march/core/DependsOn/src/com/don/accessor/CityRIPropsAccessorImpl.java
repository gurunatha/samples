package com.don.accessor;

import java.io.IOException;
import java.util.Properties;

public class CityRIPropsAccessorImpl extends BaseAccessor {
	private final String CITY_RI_PROPS_FILE_NM = "city-ri.properties";

	@Override
	public Object getData() throws IOException {
		Properties props = null;

		props = new Properties();
		props.load(this.getClass().getClassLoader()
				.getResourceAsStream(CITY_RI_PROPS_FILE_NM));
		return props;
	}
}
