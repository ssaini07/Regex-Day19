package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user password rule with regex
 */

public class UserRegistration {

	public boolean regexCheck(String password) {

		String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(password);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Driver class.
	public static void main(String[] args) {
		UserRegistration passwordCheck = new UserRegistration();
		System.out.println(passwordCheck.regexCheck("abv890456"));
		System.out.println(passwordCheck.regexCheck("AAAbbbccc@123"));
		System.out.println(passwordCheck.regexCheck("A~$^+=<>a1"));
		System.out.println(passwordCheck.regexCheck("A!@#&()–a1"));

	}

}
