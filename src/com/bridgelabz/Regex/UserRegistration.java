package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user password rule with atleast one numeric with regex
 */

public class UserRegistration {

	public boolean regexCheck(String atleastOneNumeric) {

		String regex = "^(?=.*[A-Z])(?=.*[0-9]{1})[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(atleastOneNumeric);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Driver class.
	public static void main(String[] args) {
		UserRegistration passwordCheck = new UserRegistration();
		System.out.println(passwordCheck.regexCheck("aBvfkefnejn"));
		System.out.println(passwordCheck.regexCheck("AAAbbbccc@123"));
		System.out.println(passwordCheck.regexCheck("A~$^+=<>a1"));
		System.out.println(passwordCheck.regexCheck("A!@#&()–a1"));

	}

}
