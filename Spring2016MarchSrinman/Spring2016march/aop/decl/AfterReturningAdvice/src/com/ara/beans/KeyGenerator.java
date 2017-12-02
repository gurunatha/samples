package com.ara.beans;

import java.util.UUID;

public class KeyGenerator {
	public String generateRSA(int len) {
		System.out.println("generateRSA()");
		String key = "123456789";
		if (len <= 8) {
			return null;
		}
		return key;
	}

	public String generateUUID(int len) {
		System.out.println("generateUUID()");
		return UUID.randomUUID().toString();
	}
}
