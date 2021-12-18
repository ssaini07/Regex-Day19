package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user password rule with 1 upper case letter with regex
 */

public class UserRegistration {

	public boolean regexCheck(String upperCase) {

		String regex = "^(?=.*[A-Z])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(upperCase);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Driver class.
	public static void main(String[] args) {
		UserRegistration passwordCheck = new UserRegistration();
		System.out.println(passwordCheck.regexCheck("aBv890456"));
		System.out.println(passwordCheck.regexCheck("AAAbbbccc@123"));
		System.out.println(passwordCheck.regexCheck("A~$^+=<>a1"));
		System.out.println(passwordCheck.regexCheck("A!@#&()–a1"));

	}

}
