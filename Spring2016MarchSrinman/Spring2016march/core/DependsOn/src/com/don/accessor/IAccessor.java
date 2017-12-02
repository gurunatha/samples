package com.don.accessor;

import java.io.IOException;

public interface IAccessor {
	void setKey(String key);

	String getKey();

	Object getData() throws IOException;
}
