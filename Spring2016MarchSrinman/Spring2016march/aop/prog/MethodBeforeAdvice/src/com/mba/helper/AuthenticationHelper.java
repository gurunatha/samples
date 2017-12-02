package com.mba.helper;

import com.mba.beans.Credentials;

public class AuthenticationHelper {
	private static AuthenticationHelper instance;
	private ThreadLocal<Credentials> credentialStore;

	public AuthenticationHelper() {
		credentialStore = new ThreadLocal<Credentials>();
	}

	public static synchronized AuthenticationHelper getInstance() {
		if (instance == null) {
			instance = new AuthenticationHelper();
		}
		return instance;
	}

	public void login(String user, String password) {
		Credentials cred = new Credentials(user, password);
		credentialStore.set(cred);
	}

	public void logout() {
		credentialStore.set(null);
	}

	public boolean authentication() {
		Credentials cred = null;

		cred = credentialStore.get();
		if (cred != null) {
			if (cred.getUser().equals("john")
					&& cred.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		Credentials cred = null;

		cred = credentialStore.get();
		if (cred != null) {
			return cred.getUser();
		}
		return null;
	}
}
