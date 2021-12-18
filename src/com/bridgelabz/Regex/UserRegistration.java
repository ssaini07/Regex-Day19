package com.bridgelabz.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user last name with regex
 */
public class UserRegistration {
	public boolean regexCheck() {

		String lastName = "Saini";
		String pattern = "^[A-Z][a-z]{3,}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);
		// Now create a matcher object
		Matcher m = r.matcher(lastName);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Driver class.
	public static void main(String[] args) {
		UserRegistration lastName = new UserRegistration();
		System.out.println(lastName.regexCheck());
	}

}
