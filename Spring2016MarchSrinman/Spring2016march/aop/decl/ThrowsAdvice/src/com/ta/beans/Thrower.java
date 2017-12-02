package com.ta.beans;

public class Thrower {
	public int withThrow(int i) {
		if (i <= 0) {
			throw new IllegalArgumentException("invalid i");
		}
		return i;
	}
}
