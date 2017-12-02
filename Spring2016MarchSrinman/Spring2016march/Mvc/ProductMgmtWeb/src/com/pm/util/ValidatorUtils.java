package com.pm.util;

public class ValidatorUtils {
	public static boolean isEmpty(String in) {
		if (in == null || in.trim().length() == 0) {
			return true;
		}
		return false;
	}
}
