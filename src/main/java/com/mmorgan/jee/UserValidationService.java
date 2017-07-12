package com.mmorgan.jee;

import java.util.HashMap;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		HashMap<String, String> userdata = new HashMap<String, String>();
		userdata.put("mmorgan", "timewarp");
		userdata.put("morganma", "password");
		try {
			String testPassword = userdata.get(user);
			if (!testPassword.equals(password)) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
	}
}