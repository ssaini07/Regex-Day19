package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user mobile Format  with regex
 */

public class UserRegistration {

	public boolean regexCheck(String mobileFormat) {

		String regex = "^[0-9]{2}+[ ][0-9]{10}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(mobileFormat);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Driver class.
	public static void main(String[] args) {
		UserRegistration mobileFormat = new UserRegistration();
		System.out.println(mobileFormat.regexCheck("91 7474237474"));
		System.out.println(mobileFormat.regexCheck("91 337474237474"));
		System.out.println(mobileFormat.regexCheck("91237474237474"));
		System.out.println(mobileFormat.regexCheck("91 999990000"));

	}

}
