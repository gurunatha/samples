package com.don.accessor;

public abstract class BaseAccessor implements IAccessor {
	protected String key;

	@Override
	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String getKey() {
		return key;
	}

}
