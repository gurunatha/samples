package com.mdm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppObjectFactory {
	public static Object getObject(String l_classname) throws Exception {
		Properties props = null;
		String classname = null;
		Object obj = null;

		props = new Properties();
		props.load(AppObjectFactory.class.getClassLoader().getResourceAsStream(
				"appClasses.properties"));
		if (props.containsKey(l_classname) == false) {
			throw new Exception("No class found for l_classname : "
					+ l_classname);
		}

		classname = props.getProperty(l_classname);
		obj = Class.forName(classname).newInstance();
		return obj;
	}
}
