package com.mba.security.core;

import com.mba.security.beans.User;

public class AuthenticationManager {
	private static AuthenticationManager instance;
	private ThreadLocal<User> userStore;

	private AuthenticationManager() {
		userStore = new ThreadLocal<User>();
	}

	public static synchronized AuthenticationManager getInstance() {
		if (instance == null) {
			instance = new AuthenticationManager();
		}
		return instance;
	}

	public void login(String username, String password) {
		User user = null;

		user = new User(username, password);
		userStore.set(user);
	}

	public void logout() {
		userStore.set(null);
	}

	public boolean doAuthentication() {
		User user = null;

		user = userStore.get();
		if (user != null) {
			if (user.getUser().equals("john")
					&& user.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		if (userStore.get() != null) {
			return userStore.get().getUser();
		}
		return null;
	}
}
