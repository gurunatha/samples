package com.ara.beans;

public class KeyGenerator {
	public int generate(int len) {
		if (len <= 8) {
			return 0;
		}
		return 1;
	}
}
