package com.pgm.util;

public class StringUtils {
	public static boolean isEmpty(String s) {
		return (s == null || s.trim().length() == 0) ? true : false;
	}
}
