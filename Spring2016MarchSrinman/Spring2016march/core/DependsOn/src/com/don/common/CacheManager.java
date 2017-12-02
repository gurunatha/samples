package com.don.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.don.accessor.IAccessor;

public class CacheManager {
	private Cache cache;
	private List<IAccessor> accessors;

	public CacheManager(Cache cache, List<IAccessor> accessors)
			throws IOException {
		this.cache = cache;
		this.accessors = accessors;
		init();
	}

	public void init() throws IOException {
		Map<String, Object> dataMap = null;

		dataMap = new HashMap<String, Object>();

		// accumulate all the data from accessors
		for (IAccessor accessor : accessors) {
			String key = accessor.getKey();
			Object val = accessor.getData();
			dataMap.put(key, val);
		}
		// load all the data into cache
		cache.load(dataMap);
	}
}
