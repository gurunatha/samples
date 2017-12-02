package com.aa.util;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	private Map<String, Object> dataMap;

	public Cache() {
		dataMap = new HashMap<String, Object>();
	}

	public void put(String key, Object value) {
		dataMap.put(key, value);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean containskey(String key) {
		return dataMap.containsKey(key);
	}
}
